package net.freedinner.display.entity;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EntityType;
import net.freedinner.display.init.DisplayMobs;
import net.freedinner.display.init.DisplayItems;
import net.freedinner.display.block.IPillowBlock;
import java.util.Map;
import java.util.HashMap;

public class ItemPillow extends AbstractDisplayEntity {
	public ItemPillow(EntityType<ItemPillow> type, Level world) {
		super(type, world);
	}

	@Override
	public ItemStack getPickResult() {
		return new ItemStack(this.getItemMap().getOrDefault(this.getType(), DisplayItems.DISPLAY.get()));
	}

	@Override
	public boolean isCorrectBlock(Block target) {
		return target instanceof IPillowBlock;
	}

	public String getColor() {
		return this.getColorMap().getOrDefault(this.getType(), "red");
	}

	public Map<EntityType, String> getColorMap() {
		Map<EntityType, String> colorMap = new HashMap<>();
		colorMap.put(DisplayMobs.WHITE_PILLOW.get(), "white");
		colorMap.put(DisplayMobs.LG_PILLOW.get(), "light_gray");
		colorMap.put(DisplayMobs.GRAY_PILLOW.get(), "gray");
		colorMap.put(DisplayMobs.BLACK_PILLOW.get(), "black");
		colorMap.put(DisplayMobs.RED_PILLOW.get(), "red");
		colorMap.put(DisplayMobs.ORANGE_PILLOW.get(), "orange");
		colorMap.put(DisplayMobs.YELLOW_PILLOW.get(), "yellow");
		colorMap.put(DisplayMobs.LIME_PILLOW.get(), "lime");
		colorMap.put(DisplayMobs.GREEN_PILLOW.get(), "green");
		colorMap.put(DisplayMobs.LB_PILLOW.get(), "light_blue");
		colorMap.put(DisplayMobs.CYAN_PILLOW.get(), "cyan");
		colorMap.put(DisplayMobs.BLUE_PILLOW.get(), "blue");
		colorMap.put(DisplayMobs.PURPLE_PILLOW.get(), "purple");
		colorMap.put(DisplayMobs.MAGE_PILLOW.get(), "magenta");
		colorMap.put(DisplayMobs.PINK_PILLOW.get(), "pink");
		colorMap.put(DisplayMobs.BROWN_PILLOW.get(), "brown");
		return colorMap;
	}

	public Map<EntityType, Item> getItemMap() {
		Map<EntityType, Item> itemMap = new HashMap<>();
		itemMap.put(DisplayMobs.WHITE_PILLOW.get(), DisplayItems.WHITE_PILLOW.get());
		itemMap.put(DisplayMobs.LG_PILLOW.get(), DisplayItems.LG_PILLOW.get());
		itemMap.put(DisplayMobs.GRAY_PILLOW.get(), DisplayItems.GRAY_PILLOW.get());
		itemMap.put(DisplayMobs.BLACK_PILLOW.get(), DisplayItems.BLACK_PILLOW.get());
		itemMap.put(DisplayMobs.RED_PILLOW.get(), DisplayItems.RED_PILLOW.get());
		itemMap.put(DisplayMobs.ORANGE_PILLOW.get(), DisplayItems.ORANGE_PILLOW.get());
		itemMap.put(DisplayMobs.YELLOW_PILLOW.get(), DisplayItems.YELLOW_PILLOW.get());
		itemMap.put(DisplayMobs.LIME_PILLOW.get(), DisplayItems.LIME_PILLOW.get());
		itemMap.put(DisplayMobs.GREEN_PILLOW.get(), DisplayItems.GREEN_PILLOW.get());
		itemMap.put(DisplayMobs.LB_PILLOW.get(), DisplayItems.LB_PILLOW.get());
		itemMap.put(DisplayMobs.CYAN_PILLOW.get(), DisplayItems.CYAN_PILLOW.get());
		itemMap.put(DisplayMobs.BLUE_PILLOW.get(), DisplayItems.BLUE_PILLOW.get());
		itemMap.put(DisplayMobs.PURPLE_PILLOW.get(), DisplayItems.PURPLE_PILLOW.get());
		itemMap.put(DisplayMobs.MAGE_PILLOW.get(), DisplayItems.MAGE_PILLOW.get());
		itemMap.put(DisplayMobs.PINK_PILLOW.get(), DisplayItems.PINK_PILLOW.get());
		itemMap.put(DisplayMobs.BROWN_PILLOW.get(), DisplayItems.BROWN_PILLOW.get());
		return itemMap;
	}
}
