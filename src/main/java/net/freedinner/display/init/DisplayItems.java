package net.freedinner.display.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.freedinner.display.item.DisplayItem;
import net.freedinner.display.DisplayMod;

public class DisplayItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DisplayMod.MODID);
	public static final RegistryObject<Item> DISPLAY = REGISTRY.register("item_display", () -> new DisplayItem(new Item.Properties()));
	
	public static final RegistryObject<Item> ANGLER_POTTERY_SHERD = block(DisplayBlocks.ANGLER_POTTERY_SHERD);
	public static final RegistryObject<Item> ARCHER_POTTERY_SHERD = block(DisplayBlocks.ARCHER_POTTERY_SHERD);
	public static final RegistryObject<Item> ARMS_UP_POTTERY_SHERD = block(DisplayBlocks.ARMS_UP_POTTERY_SHERD);
	public static final RegistryObject<Item> BLADE_POTTERY_SHERD = block(DisplayBlocks.BLADE_POTTERY_SHERD);
	public static final RegistryObject<Item> BREWER_POTTERY_SHERD = block(DisplayBlocks.BREWER_POTTERY_SHERD);
	public static final RegistryObject<Item> BURN_POTTERY_SHERD = block(DisplayBlocks.BURN_POTTERY_SHERD);
	public static final RegistryObject<Item> DANGER_POTTERY_SHERD = block(DisplayBlocks.DANGER_POTTERY_SHERD);
	public static final RegistryObject<Item> EXPLORER_POTTERY_SHERD = block(DisplayBlocks.EXPLORER_POTTERY_SHERD);
	public static final RegistryObject<Item> FRIEND_POTTERY_SHERD = block(DisplayBlocks.FRIEND_POTTERY_SHERD);
	public static final RegistryObject<Item> HEART_POTTERY_SHERD = block(DisplayBlocks.HEART_POTTERY_SHERD);
	public static final RegistryObject<Item> HEARTBREAK_POTTERY_SHERD = block(DisplayBlocks.HEARTBREAK_POTTERY_SHERD);
	public static final RegistryObject<Item> HOWL_POTTERY_SHERD = block(DisplayBlocks.HOWL_POTTERY_SHERD);
	public static final RegistryObject<Item> MINER_POTTERY_SHERD = block(DisplayBlocks.MINER_POTTERY_SHERD);
	public static final RegistryObject<Item> MOURNER_POTTERY_SHERD = block(DisplayBlocks.MOURNER_POTTERY_SHERD);
	public static final RegistryObject<Item> PLENTY_POTTERY_SHERD = block(DisplayBlocks.PLENTY_POTTERY_SHERD);
	public static final RegistryObject<Item> PRIZE_POTTERY_SHERD = block(DisplayBlocks.PRIZE_POTTERY_SHERD);
	public static final RegistryObject<Item> SHEAF_POTTERY_SHERD = block(DisplayBlocks.SHEAF_POTTERY_SHERD);
	public static final RegistryObject<Item> SHELTER_POTTERY_SHERD = block(DisplayBlocks.SHELTER_POTTERY_SHERD);
	public static final RegistryObject<Item> SKULL_POTTERY_SHERD = block(DisplayBlocks.SKULL_POTTERY_SHERD);
	public static final RegistryObject<Item> SNORT_POTTERY_SHERD = block(DisplayBlocks.SNORT_POTTERY_SHERD);
	public static final RegistryObject<Item> DINOSAUR_POTTERY_SHERD = block(DisplayBlocks.DINOSAUR_POTTERY_SHERD);
	public static final RegistryObject<Item> FOOTPRINT_POTTERY_SHERD = block(DisplayBlocks.FOOTPRINT_POTTERY_SHERD);
	public static final RegistryObject<Item> GUARDIAN_POTTERY_SHERD = block(DisplayBlocks.GUARDIAN_POTTERY_SHERD);
	public static final RegistryObject<Item> HERO_POTTERY_SHERD = block(DisplayBlocks.HERO_POTTERY_SHERD);

	public static final RegistryObject<Item> NETHERITE_UPGRADE = block(DisplayBlocks.NETHERITE_UPGRADE);
	public static final RegistryObject<Item> GOTHIC_UPGRADE = block(DisplayBlocks.GOTHIC_UPGRADE);
	
	public static final RegistryObject<Item> COAST_ARMOR_TRIM = block(DisplayBlocks.COAST_ARMOR_TRIM);
	public static final RegistryObject<Item> DUNE_ARMOR_TRIM = block(DisplayBlocks.DUNE_ARMOR_TRIM);
	public static final RegistryObject<Item> EYE_ARMOR_TRIM = block(DisplayBlocks.EYE_ARMOR_TRIM);
	public static final RegistryObject<Item> HOST_ARMOR_TRIM = block(DisplayBlocks.HOST_ARMOR_TRIM);
	public static final RegistryObject<Item> RAISER_ARMOR_TRIM = block(DisplayBlocks.RAISER_ARMOR_TRIM);
	public static final RegistryObject<Item> RIB_ARMOR_TRIM = block(DisplayBlocks.RIB_ARMOR_TRIM);
	public static final RegistryObject<Item> SENTRY_ARMOR_TRIM = block(DisplayBlocks.SENTRY_ARMOR_TRIM);
	public static final RegistryObject<Item> SHAPER_ARMOR_TRIM = block(DisplayBlocks.SHAPER_ARMOR_TRIM);
	public static final RegistryObject<Item> SILENCE_ARMOR_TRIM = block(DisplayBlocks.SILENCE_ARMOR_TRIM);
	public static final RegistryObject<Item> SNOUT_ARMOR_TRIM = block(DisplayBlocks.SNOUT_ARMOR_TRIM);
	public static final RegistryObject<Item> SPIRE_ARMOR_TRIM = block(DisplayBlocks.SPIRE_ARMOR_TRIM);
	public static final RegistryObject<Item> TIDE_ARMOR_TRIM = block(DisplayBlocks.TIDE_ARMOR_TRIM);
	public static final RegistryObject<Item> VEX_ARMOR_TRIM = block(DisplayBlocks.VEX_ARMOR_TRIM);
	public static final RegistryObject<Item> WARD_ARMOR_TRIM = block(DisplayBlocks.WARD_ARMOR_TRIM);
	public static final RegistryObject<Item> WAYFINDER_ARMOR_TRIM = block(DisplayBlocks.WAYFINDER_ARMOR_TRIM);
	public static final RegistryObject<Item> WILD_ARMOR_TRIM = block(DisplayBlocks.WILD_ARMOR_TRIM);
	public static final RegistryObject<Item> KOBOLD_ARMOR_TRIM = block(DisplayBlocks.KOBOLD_ARMOR_TRIM);
	public static final RegistryObject<Item> NECRO_ARMOR_TRIM = block(DisplayBlocks.NECRO_ARMOR_TRIM);

	public static final RegistryObject<Item> IRON_INGOT = block(DisplayBlocks.IRON_INGOT);
	public static final RegistryObject<Item> COPPER_INGOT = block(DisplayBlocks.COPPER_INGOT);
	public static final RegistryObject<Item> GOLD_INGOT = block(DisplayBlocks.GOLD_INGOT);
	public static final RegistryObject<Item> NETHERITE_INGOT = block(DisplayBlocks.NETHERITE_INGOT);
	public static final RegistryObject<Item> AZURE_INGOT = block(DisplayBlocks.AZURE_INGOT);
	public static final RegistryObject<Item> SCARLET_INGOT = block(DisplayBlocks.SCARLET_INGOT);
	public static final RegistryObject<Item> BRASS_INGOT = block(DisplayBlocks.BRASS_INGOT);
	public static final RegistryObject<Item> ZINC_INGOT = block(DisplayBlocks.ZINC_INGOT);
	public static final RegistryObject<Item> SILVER_INGOT = block(DisplayBlocks.SILVER_INGOT);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}