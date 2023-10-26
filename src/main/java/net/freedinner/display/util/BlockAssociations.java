package net.freedinner.display.util;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import java.util.Map;
import java.util.HashMap;

public class BlockAssociations {
	private static Map<Item, Block> blockMap = new HashMap<>();

	public static Block getBlockFor(ItemStack stack) {
		return blockMap.getOrDefault(stack.getItem(), Blocks.AIR);
	}

	public static void addToMap(Item i, Block b) {
		blockMap.putIfAbsent(i, b);
	}
}