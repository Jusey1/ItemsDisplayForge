
package net.freedinner.display.item;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.freedinner.display.init.DisplayConfig;

public abstract class AbstractEntityItem extends Item {
	public AbstractEntityItem(Item.Properties props) {
		super(props);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		if (context.getClickedFace() == Direction.DOWN) {
			return InteractionResult.FAIL;
		} else {
			Level world = context.getLevel();
			BlockPlaceContext place = new BlockPlaceContext(context);
			BlockPos pos = place.getClickedPos();
			ItemStack stack = context.getItemInHand();
			Vec3 v = Vec3.atBottomCenterOf(pos);
			AABB nums = this.getType().getDimensions().makeBoundingBox(v.x(), v.y(), v.z());
			if (world.noCollision((Entity) null, nums) && world.getEntities((Entity) null, nums).isEmpty()) {
				if (world instanceof ServerLevel server) {
					LivingEntity target = this.getType().create(server, stack.getTag(), EntityType.createDefaultStackConfig(server, stack, context.getPlayer()), pos, MobSpawnType.SPAWN_EGG, true, true);
					if (target == null) {
						return InteractionResult.FAIL;
					}
					target.moveTo(target.getX(), target.getY(), target.getZ());
					float r = ((float) DisplayConfig.ROTATION.get());
					float rot = (float) Mth.floor((Mth.wrapDegrees(context.getRotation() - 180.0F) + 22.5F) / r) * r;
					target.setYRot(rot);
					target.setYBodyRot(rot);
					target.setYHeadRot(rot);
					target.yRotO = rot;
					target.yBodyRotO = rot;
					target.yHeadRotO = rot;
					server.addFreshEntityWithPassengers(target);
					world.playSound((Player) null, target.getX(), target.getY(), target.getZ(), SoundEvents.ARMOR_STAND_PLACE, SoundSource.BLOCKS, 0.75F, 0.8F);
					target.gameEvent(GameEvent.ENTITY_PLACE, context.getPlayer());
				}
				stack.shrink(1);
				return InteractionResult.sidedSuccess(world.isClientSide);
			} else {
				return InteractionResult.FAIL;
			}
		}
	}

	public abstract EntityType<? extends LivingEntity> getType();
}