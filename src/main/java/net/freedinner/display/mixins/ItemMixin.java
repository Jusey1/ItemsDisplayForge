package net.freedinner.display.mixins;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;

import net.freedinner.display.init.DisplayTags;
import net.freedinner.display.init.DisplayConfig;

import java.util.List;

@Mixin(Item.class)
public abstract class ItemMixin {
	@Inject(method = "appendHoverText", at = @At("TAIL"))
	private void applyTooltip(ItemStack stack, Level world, List<Component> list, TooltipFlag flag, CallbackInfo ci) {
		if (DisplayConfig.TOOLTIP.get() && stack.is(DisplayTags.DISPLAYABLE)) {
			if (DisplayConfig.SNEAK.get()) {
				list.add(Component.translatable("item.items_displayed.tooltip.shift_place").withStyle(ChatFormatting.GRAY));
			} else {
				list.add(Component.translatable("item.items_displayed.tooltip.place").withStyle(ChatFormatting.GRAY));
			}
		}
	}
}