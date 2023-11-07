package net.freedinner.display.events;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.level.LevelEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.freedinner.display.util.BlockAssociations;
import net.freedinner.display.init.DisplayTags;
import net.freedinner.display.init.DisplayConfig;
import net.freedinner.display.block.AbstractItemBlock;

import java.util.List;

@Mod.EventBusSubscriber
public class DisplayEvents {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		Player player = event.getEntity();
		ItemStack stack = event.getItemStack();
		LevelAccessor world = event.getLevel();
		BlockPos pos = event.getPos();
		if (!DisplayConfig.SNEAK.get() || (DisplayConfig.SNEAK.get() && player.isCrouching())) {
			if (stack.is(DisplayTags.DISPLAYABLE) && event.getFace() == Direction.UP && world.getBlockState(pos).isFaceSturdy(world, pos, Direction.UP)
					&& world.getBlockState(pos.above()).canBeReplaced(new BlockPlaceContext(player, event.getHand(), stack, event.getHitVec()))) {
				player.swing(event.getHand());
				if (world instanceof ServerLevel lvl) {
					Block target = BlockAssociations.getBlockFor(stack.getItem());
					target.asItem().useOn(new UseOnContext(player, event.getHand(), event.getHitVec()));
					lvl.playSound(null, pos.above(), target.defaultBlockState().getSoundType(world, pos.above(), player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
				}
			}
		}
	}

	@SubscribeEvent
	public static void onWorldLoad(LevelEvent.Load event) {
		if (event.getLevel() instanceof ServerLevel lvl) {
			AbstractItemBlock[] array = findBlocks(AbstractItemBlock.class);
			for (AbstractItemBlock target : array) {
				List<ItemStack> drops = target.getDrops(target.defaultBlockState(), lvl, BlockPos.containing(0, 256, 0), null);
				if (!drops.isEmpty() && drops.get(0).is(DisplayTags.DISPLAYABLE)) {
					BlockAssociations.addToMap(drops.get(0).getItem(), target);
				}
			}
		}
	}

	private static AbstractItemBlock[] findBlocks(Class<?> targets) {
		return ForgeRegistries.BLOCKS.getValues().stream().filter(targets::isInstance).toArray(AbstractItemBlock[]::new);
	}
}
