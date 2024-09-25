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
import net.freedinner.display.init.DisplayItems;
import net.freedinner.display.init.DisplayConfig;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class PillowItem extends AbstractEntityItem {
	public PillowItem(Item.Properties props) {
		super(props);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(stack, world, list, flag);
		if (DisplayConfig.DISPLAY.get()) {
			list.add(Component.translatable("item.items_displayed.tooltip.item_display_1").withStyle(ChatFormatting.GRAY));
			list.add(Component.translatable("item.items_displayed.tooltip.item_display_2").withStyle(ChatFormatting.GRAY));
			list.add(Component.translatable("item.items_displayed.tooltip.jewelry_pillow_0").withStyle(ChatFormatting.GRAY));
			list.add(Component.translatable("item.items_displayed.tooltip.jewelry_pillow_1").withStyle(ChatFormatting.GRAY));
			list.add(Component.translatable("item.items_displayed.tooltip.item_display_0").withStyle(ChatFormatting.GRAY));
		}
	}

	@Override
	public int getBurnTime(ItemStack stack, RecipeType type) {
		return 150;
	}

	@Override
	public EntityType<? extends LivingEntity> getType() {
		return this.getEntityMap().getOrDefault(this, DisplayMobs.RED_PILLOW.get());
	}

	public Map<Item, EntityType<? extends LivingEntity>> getEntityMap() {
		Map<Item, EntityType<? extends LivingEntity>> entMap = new HashMap<>();
		entMap.put(DisplayItems.WHITE_PILLOW.get(), DisplayMobs.WHITE_PILLOW.get());
		entMap.put(DisplayItems.LG_PILLOW.get(), DisplayMobs.LG_PILLOW.get());
		entMap.put(DisplayItems.GRAY_PILLOW.get(), DisplayMobs.GRAY_PILLOW.get());
		entMap.put(DisplayItems.BLACK_PILLOW.get(), DisplayMobs.BLACK_PILLOW.get());
		entMap.put(DisplayItems.RED_PILLOW.get(), DisplayMobs.RED_PILLOW.get());
		entMap.put(DisplayItems.ORANGE_PILLOW.get(), DisplayMobs.ORANGE_PILLOW.get());
		entMap.put(DisplayItems.YELLOW_PILLOW.get(), DisplayMobs.YELLOW_PILLOW.get());
		entMap.put(DisplayItems.LIME_PILLOW.get(), DisplayMobs.LIME_PILLOW.get());
		entMap.put(DisplayItems.GREEN_PILLOW.get(), DisplayMobs.GREEN_PILLOW.get());
		entMap.put(DisplayItems.LB_PILLOW.get(), DisplayMobs.LB_PILLOW.get());
		entMap.put(DisplayItems.CYAN_PILLOW.get(), DisplayMobs.CYAN_PILLOW.get());
		entMap.put(DisplayItems.BLUE_PILLOW.get(), DisplayMobs.BLUE_PILLOW.get());
		entMap.put(DisplayItems.PURPLE_PILLOW.get(), DisplayMobs.PURPLE_PILLOW.get());
		entMap.put(DisplayItems.MAGE_PILLOW.get(), DisplayMobs.MAGE_PILLOW.get());
		entMap.put(DisplayItems.PINK_PILLOW.get(), DisplayMobs.PINK_PILLOW.get());
		entMap.put(DisplayItems.BROWN_PILLOW.get(), DisplayMobs.BROWN_PILLOW.get());
		return entMap;
	}
}