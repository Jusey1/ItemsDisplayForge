package net.freedinner.display.init;

import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class DisplayTags {
	public static final TagKey<Item> DISPLAYABLE = ItemTags.create(new ResourceLocation("items_displayed:displayable"));
	public static final TagKey<Item> STACKABLE = ItemTags.create(new ResourceLocation("items_displayed:stackable"));
	public static final TagKey<Item> TEMPLATES = ItemTags.create(new ResourceLocation("items_displayed:smithing_templates"));
	public static final TagKey<Item> SHERDS = ItemTags.create(new ResourceLocation("items_displayed:sherds"));
}