package net.freedinner.display.init;

import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class DisplayTags {
	public static final TagKey<Item> DISPLAYABLE = ItemTags.create(new ResourceLocation("items_displayed:displayable"));
}