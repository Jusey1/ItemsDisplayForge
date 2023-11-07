package net.freedinner.display.entity;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.NonNullList;
import net.minecraft.core.BlockPos;

import net.freedinner.display.util.BlockAssociations;
import net.freedinner.display.init.DisplayTags;
import net.freedinner.display.init.DisplayItems;

public class ItemDisplay extends LivingEntity {
	private final NonNullList<ItemStack> handItems = NonNullList.withSize(2, ItemStack.EMPTY);
	private final NonNullList<ItemStack> armorItems = NonNullList.withSize(4, ItemStack.EMPTY);

	public ItemDisplay(EntityType<ItemDisplay> type, Level world) {
		super(type, world);
		this.setMaxUpStep(0.0F);
	}

	@Override
	public void addAdditionalSaveData(CompoundTag tag) {
		super.addAdditionalSaveData(tag);
		ListTag armor = new ListTag();
		for (ItemStack stack : this.armorItems) {
			CompoundTag atag = new CompoundTag();
			if (!stack.isEmpty()) {
				stack.save(atag);
			}
			armor.add(atag);
		}
		tag.put("ArmorItems", armor);
		ListTag hands = new ListTag();
		for (ItemStack stack : this.handItems) {
			CompoundTag htag = new CompoundTag();
			if (!stack.isEmpty()) {
				stack.save(htag);
			}
			hands.add(htag);
		}
		tag.put("HandItems", hands);
	}

	@Override
	public void readAdditionalSaveData(CompoundTag tag) {
		super.readAdditionalSaveData(tag);
		if (tag.contains("ArmorItems", 9)) {
			ListTag armor = tag.getList("ArmorItems", 10);
			for (int i = 0; i < this.armorItems.size(); ++i) {
				this.armorItems.set(i, ItemStack.of(armor.getCompound(i)));
			}
		}
		if (tag.contains("HandItems", 9)) {
			ListTag hands = tag.getList("HandItems", 10);
			for (int j = 0; j < this.handItems.size(); ++j) {
				this.handItems.set(j, ItemStack.of(hands.getCompound(j)));
			}
		}
	}

	@Override
	public InteractionResult interactAt(Player player, Vec3 vec, InteractionHand hand) {
		ItemStack stack = player.getMainHandItem();
		ItemStack current = this.getMainHandItem();
		LevelAccessor world = this.level();
		BlockPos pos = BlockPos.containing(this.getX(), this.getY(), this.getZ());
		if (hand == InteractionHand.MAIN_HAND) {
			if (current.isEmpty()) {
				if (stack.is(DisplayTags.DISPLAYABLE) && !stack.is(DisplayTags.STACKABLE)) {
					Block target = BlockAssociations.getBlockFor(stack.getItem());
					ItemStack copy = stack.copy();
					copy.setCount(1);
					this.setItemInHand(InteractionHand.MAIN_HAND, copy);
					this.setItemInHand(InteractionHand.OFF_HAND, new ItemStack(target.asItem()));
					if (world instanceof ServerLevel lvl) {
						lvl.playSound(null, pos, target.defaultBlockState().getSoundType(world, pos, player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
					}
					if (!player.isCreative()) {
						stack.shrink(1);
					}
					return InteractionResult.SUCCESS;
				}
			} else if (stack.isEmpty()) {
				Block target = BlockAssociations.getBlockFor(current.getItem());
				player.addItem(current);
				current.shrink(1);
				this.getOffhandItem().shrink(1);
				if (world instanceof ServerLevel lvl) {
					lvl.playSound(null, pos, target.defaultBlockState().getSoundType(world, pos, player).getBreakSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
				}
				return InteractionResult.SUCCESS;
			}
		}
		return InteractionResult.FAIL;
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		this.showBreakingParticles();
		ItemEntity target = new ItemEntity(this.level(), this.getX(), this.getY(), this.getZ(), new ItemStack(DisplayItems.DISPLAY.get()));
		target.setPickUpDelay(10);
		this.level().addFreshEntity(target);
		if (!this.getMainHandItem().isEmpty()) {
			ItemEntity drop = new ItemEntity(this.level(), this.getX(), this.getY(), this.getZ(), this.getMainHandItem());
			drop.setPickUpDelay(10);
			this.level().addFreshEntity(drop);
		}
		this.discard();
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public ItemStack getPickResult() {
		return new ItemStack(DisplayItems.DISPLAY.get());
	}

	@Override
	public HumanoidArm getMainArm() {
		return HumanoidArm.RIGHT;
	}

	@Override
	public Iterable<ItemStack> getHandSlots() {
		return this.handItems;
	}

	@Override
	public Iterable<ItemStack> getArmorSlots() {
		return this.armorItems;
	}

	@Override
	public ItemStack getItemBySlot(EquipmentSlot slot) {
		switch (slot.getType()) {
			case HAND :
				return this.handItems.get(slot.getIndex());
			case ARMOR :
				return this.armorItems.get(slot.getIndex());
			default :
				return ItemStack.EMPTY;
		}
	}

	@Override
	public void setItemSlot(EquipmentSlot slot, ItemStack stack) {
		this.verifyEquippedItem(stack);
		switch (slot.getType()) {
			case HAND :
				this.onEquipItem(slot, this.handItems.set(slot.getIndex(), stack), stack);
				break;
			case ARMOR :
				this.onEquipItem(slot, this.armorItems.set(slot.getIndex(), stack), stack);
		}
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return SoundEvents.ARMOR_STAND_HIT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.ARMOR_STAND_BREAK;
	}

	@Override
	public boolean isAffectedByPotions() {
		return false;
	}

	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void doPush(Entity entityIn) {
	}

	@Override
	protected void pushEntities() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.0);
		builder = builder.add(Attributes.MAX_HEALTH, 1);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 0);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1);
		return builder;
	}

	private void showBreakingParticles() {
		if (this.level() instanceof ServerLevel lvl) {
			lvl.sendParticles(new BlockParticleOption(ParticleTypes.BLOCK, Blocks.OAK_PLANKS.defaultBlockState()), this.getX(), this.getY(0.35D), this.getZ(), 10, (double) (this.getBbWidth() / 4.0F), (double) (this.getBbHeight() / 4.0F),
					(double) (this.getBbWidth() / 4.0F), 0.05D);
		}
	}
}