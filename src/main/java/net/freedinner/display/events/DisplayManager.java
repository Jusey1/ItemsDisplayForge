package net.freedinner.display.events;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.freedinner.display.util.BlockAssociations;
import net.freedinner.display.init.DisplayTags;
import net.freedinner.display.init.DisplayConfig;
import net.freedinner.display.block.AbstractStackableBlock;

public class DisplayManager {
	public static void placeItem(Player player, Level world, BlockHitResult rez, boolean check) {
		InteractionHand handy = (check ? InteractionHand.MAIN_HAND : InteractionHand.OFF_HAND);
		ItemStack stack = player.getItemInHand(handy);
		if (player.isCrouching()) {
			if (stack.is(DisplayTags.DISPLAYABLE) && world instanceof ServerLevel lvl) {
				BlockPos pos = rez.getBlockPos();
				BlockState state = world.getBlockState(pos);
				if (state.getBlock() instanceof AbstractStackableBlock target) {
					if (stack.is(target.getStackFor().getItem()) && target.getStacks(state) < target.getMaxStackable()) {
						world.setBlock(pos, target.getState(state), 2);
						lvl.playSound(null, pos, state.getSoundType(world, pos, player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
						if (!player.isCreative()) {
							stack.shrink(1);
						}
						player.swing(handy, true);
					}
				} else {
					Block target = BlockAssociations.getBlockFor(stack.getItem());
					if (target.asItem().useOn(new UseOnContext(player, handy, rez)) != InteractionResult.FAIL) {
						lvl.playSound(null, pos.above(), target.defaultBlockState().getSoundType(world, pos.above(), player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
						player.swing(handy, true);
					}
				}
			}
		}
	}
}