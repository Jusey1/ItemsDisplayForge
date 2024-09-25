package net.freedinner.display.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.freedinner.display.init.DisplayMobs;
import net.freedinner.display.init.DisplayConfig;
import java.util.List;

public class DisplayItem extends AbstractEntityItem {
	public DisplayItem(Item.Properties props) {
		super(props);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(stack, world, list, flag);
		if (DisplayConfig.DISPLAY.get()) {
			list.add(Component.translatable("item.items_displayed.tooltip.item_display_1").withStyle(ChatFormatting.GRAY));
			list.add(Component.translatable("item.items_displayed.tooltip.item_display_2").withStyle(ChatFormatting.GRAY));
			list.add(Component.translatable("item.items_displayed.tooltip.item_display_0").withStyle(ChatFormatting.GRAY));
		}
	}

	@Override
	public int getBurnTime(ItemStack stack, RecipeType type) {
		return 100;
	}

	@Override
	public EntityType<? extends LivingEntity> getType() {
		return DisplayMobs.DISPLAY.get();
	}
}