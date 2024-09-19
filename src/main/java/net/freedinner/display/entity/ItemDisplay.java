package net.freedinner.display.entity;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EntityType;
import net.freedinner.display.init.DisplayItems;
import net.freedinner.display.block.IDisplayBlock;

public class ItemDisplay extends AbstractDisplayEntity {
	public ItemDisplay(EntityType<ItemDisplay> type, Level world) {
		super(type, world);
	}

	@Override
	public ItemStack getPickResult() {
		return new ItemStack(DisplayItems.DISPLAY.get());
	}

	@Override
	public boolean isCorrectBlock(Block target) {
		return target instanceof IDisplayBlock;
	}
}