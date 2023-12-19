package net.freedinner.display.events;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.level.LevelEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.freedinner.display.util.BlockAssociations;
import net.freedinner.display.network.DisplayPlace;
import net.freedinner.display.init.DisplayTags;
import net.freedinner.display.init.DisplayConfig;
import net.freedinner.display.block.AbstractItemBlock;
import net.freedinner.display.DisplayMod;

import java.util.List;

@Mod.EventBusSubscriber
public class DisplayEvents {
	@SubscribeEvent
	public static void onCheck(PlayerInteractEvent.RightClickBlock event) {
		if (!DisplayConfig.SNEAK.get() || (DisplayConfig.SNEAK.get() && event.getEntity().isCrouching())) {
			if (event.getItemStack().is(DisplayTags.DISPLAYABLE) && event.getLevel().isClientSide()) {
				if (event.getLevel().getBlockState(event.getHitVec().getBlockPos()).getBlock().use(event.getLevel().getBlockState(event.getHitVec().getBlockPos()), event.getLevel(), event.getHitVec().getBlockPos(), event.getEntity(), event.getHand(), event.getHitVec()) != InteractionResult.SUCCESS) {
					DisplayMod.PACKET.sendToServer(new DisplayPlace(event.getHitVec(), (event.getHand() == InteractionHand.MAIN_HAND)));
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