package net.freedinner.display.util;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import java.util.Map;
import java.util.HashMap;

public class BlockAssociations {
	private static Map<Item, Block> blockMap = new HashMap<>();
	private static Map<Block, Item> itemMap = new HashMap<>();

	public static Block getBlockFor(Item i) {
		return blockMap.getOrDefault(i, Blocks.AIR);
	}

	public static Item getItemFor(Block b) {
		return itemMap.getOrDefault(b, Items.AIR);
	}

	public static void addToMap(Item i, Block b) {
		blockMap.putIfAbsent(i, b);
		itemMap.putIfAbsent(b, i);
	}
}