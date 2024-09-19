package net.freedinner.display.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.freedinner.display.item.*;
import net.freedinner.display.DisplayMod;

public class DisplayItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DisplayMod.MODID);
	public static final RegistryObject<Item> DISPLAY = REGISTRY.register("item_display", () -> new DisplayItem(new Item.Properties()));
	public static final RegistryObject<Item> WHITE_PILLOW = REGISTRY.register("white_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> LG_PILLOW = REGISTRY.register("light_gray_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> GRAY_PILLOW = REGISTRY.register("gray_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> BLACK_PILLOW = REGISTRY.register("black_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> RED_PILLOW = REGISTRY.register("red_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> ORANGE_PILLOW = REGISTRY.register("orange_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> YELLOW_PILLOW = REGISTRY.register("yellow_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> LIME_PILLOW = REGISTRY.register("lime_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> GREEN_PILLOW = REGISTRY.register("green_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> LB_PILLOW = REGISTRY.register("light_blue_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> CYAN_PILLOW = REGISTRY.register("cyan_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> BLUE_PILLOW = REGISTRY.register("blue_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> PURPLE_PILLOW = REGISTRY.register("purple_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> MAGE_PILLOW = REGISTRY.register("magenta_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> PINK_PILLOW = REGISTRY.register("pink_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	public static final RegistryObject<Item> BROWN_PILLOW = REGISTRY.register("brown_jewelry_pillow", () -> new PillowItem(new Item.Properties()));
	
	public static final RegistryObject<Item> ANGLER_POTTERY_SHERD = block(DisplayBlocks.ANGLER_POTTERY_SHERD);
	public static final RegistryObject<Item> ARCHER_POTTERY_SHERD = block(DisplayBlocks.ARCHER_POTTERY_SHERD);
	public static final RegistryObject<Item> ARMS_UP_POTTERY_SHERD = block(DisplayBlocks.ARMS_UP_POTTERY_SHERD);
	public static final RegistryObject<Item> BLADE_POTTERY_SHERD = block(DisplayBlocks.BLADE_POTTERY_SHERD);
	public static final RegistryObject<Item> BREWER_POTTERY_SHERD = block(DisplayBlocks.BREWER_POTTERY_SHERD);
	public static final RegistryObject<Item> BURN_POTTERY_SHERD = block(DisplayBlocks.BURN_POTTERY_SHERD);
	public static final RegistryObject<Item> DANGER_POTTERY_SHERD = block(DisplayBlocks.DANGER_POTTERY_SHERD);
	public static final RegistryObject<Item> EXPLORER_POTTERY_SHERD = block(DisplayBlocks.EXPLORER_POTTERY_SHERD);
	public static final RegistryObject<Item> FLOW_POTTERY_SHERD = block(DisplayBlocks.FLOW_POTTERY_SHERD);
	public static final RegistryObject<Item> FRIEND_POTTERY_SHERD = block(DisplayBlocks.FRIEND_POTTERY_SHERD);
	public static final RegistryObject<Item> GUSTER_POTTERY_SHERD = block(DisplayBlocks.GUSTER_POTTERY_SHERD);
	public static final RegistryObject<Item> HEART_POTTERY_SHERD = block(DisplayBlocks.HEART_POTTERY_SHERD);
	public static final RegistryObject<Item> HEARTBREAK_POTTERY_SHERD = block(DisplayBlocks.HEARTBREAK_POTTERY_SHERD);
	public static final RegistryObject<Item> HOWL_POTTERY_SHERD = block(DisplayBlocks.HOWL_POTTERY_SHERD);
	public static final RegistryObject<Item> MINER_POTTERY_SHERD = block(DisplayBlocks.MINER_POTTERY_SHERD);
	public static final RegistryObject<Item> MOURNER_POTTERY_SHERD = block(DisplayBlocks.MOURNER_POTTERY_SHERD);
	public static final RegistryObject<Item> PLENTY_POTTERY_SHERD = block(DisplayBlocks.PLENTY_POTTERY_SHERD);
	public static final RegistryObject<Item> PRIZE_POTTERY_SHERD = block(DisplayBlocks.PRIZE_POTTERY_SHERD);
	public static final RegistryObject<Item> SCRAPE_POTTERY_SHERD = block(DisplayBlocks.SCRAPE_POTTERY_SHERD);
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
	
	public static final RegistryObject<Item> BOLT_ARMOR_TRIM = block(DisplayBlocks.BOLT_ARMOR_TRIM);
	public static final RegistryObject<Item> COAST_ARMOR_TRIM = block(DisplayBlocks.COAST_ARMOR_TRIM);
	public static final RegistryObject<Item> DUNE_ARMOR_TRIM = block(DisplayBlocks.DUNE_ARMOR_TRIM);
	public static final RegistryObject<Item> EYE_ARMOR_TRIM = block(DisplayBlocks.EYE_ARMOR_TRIM);
	public static final RegistryObject<Item> FLOW_ARMOR_TRIM = block(DisplayBlocks.FLOW_ARMOR_TRIM);
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

	public static final RegistryObject<Item> BRICK = block(DisplayBlocks.BRICK);
	public static final RegistryObject<Item> NETHER_BRICK = block(DisplayBlocks.NETHER_BRICK);
	public static final RegistryObject<Item> ASH_BRICK = block(DisplayBlocks.ASH_BRICK);
	public static final RegistryObject<Item> IRON_INGOT = block(DisplayBlocks.IRON_INGOT);
	public static final RegistryObject<Item> COPPER_INGOT = block(DisplayBlocks.COPPER_INGOT);
	public static final RegistryObject<Item> GOLD_INGOT = block(DisplayBlocks.GOLD_INGOT);
	public static final RegistryObject<Item> NETHERITE_INGOT = block(DisplayBlocks.NETHERITE_INGOT);
	public static final RegistryObject<Item> AZURE_INGOT = block(DisplayBlocks.AZURE_INGOT);
	public static final RegistryObject<Item> SCARLET_INGOT = block(DisplayBlocks.SCARLET_INGOT);
	public static final RegistryObject<Item> BRASS_INGOT = block(DisplayBlocks.BRASS_INGOT);
	public static final RegistryObject<Item> ZINC_INGOT = block(DisplayBlocks.ZINC_INGOT);
	public static final RegistryObject<Item> SILVER_INGOT = block(DisplayBlocks.SILVER_INGOT);

	public static final RegistryObject<Item> FRAGMENTS = block(DisplayBlocks.FRAGMENTS);
	public static final RegistryObject<Item> FUSIONS = block(DisplayBlocks.FUSIONS);
	public static final RegistryObject<Item> COAL = block(DisplayBlocks.COAL);
	public static final RegistryObject<Item> CHARCOAL = block(DisplayBlocks.CHARCOAL);
	public static final RegistryObject<Item> AMETHYST = block(DisplayBlocks.AMETHYST);
	public static final RegistryObject<Item> DIAMOND = block(DisplayBlocks.DIAMOND);
	public static final RegistryObject<Item> EMERALD = block(DisplayBlocks.EMERALD);
	public static final RegistryObject<Item> LAPIS = block(DisplayBlocks.LAPIS);
	public static final RegistryObject<Item> ECHO = block(DisplayBlocks.ECHO);
	public static final RegistryObject<Item> ALLURITE = block(DisplayBlocks.ALLURITE);
	public static final RegistryObject<Item> LUMIERE = block(DisplayBlocks.LUMIERE);

	public static final RegistryObject<Item> MUSIC_FIVE = block(DisplayBlocks.MUSIC_FIVE);
	public static final RegistryObject<Item> MUSIC_ELE = block(DisplayBlocks.MUSIC_ELE);
	public static final RegistryObject<Item> MUSIC_THREE = block(DisplayBlocks.MUSIC_THREE);
	public static final RegistryObject<Item> MUSIC_BLOCKS = block(DisplayBlocks.MUSIC_BLOCKS);
	public static final RegistryObject<Item> MUSIC_CAT = block(DisplayBlocks.MUSIC_CAT);
	public static final RegistryObject<Item> MUSIC_CHIRP = block(DisplayBlocks.MUSIC_CHIRP);
	public static final RegistryObject<Item> MUSIC_CREATOR = block(DisplayBlocks.MUSIC_CREATOR);
	public static final RegistryObject<Item> MUSIC_CREATOR_BOX = block(DisplayBlocks.MUSIC_CREATOR_BOX);
	public static final RegistryObject<Item> MUSIC_FAR = block(DisplayBlocks.MUSIC_FAR);
	public static final RegistryObject<Item> MUSIC_MALL = block(DisplayBlocks.MUSIC_MALL);
	public static final RegistryObject<Item> MUSIC_MELLO = block(DisplayBlocks.MUSIC_MELLO);
	public static final RegistryObject<Item> MUSIC_OTHERSIDE = block(DisplayBlocks.MUSIC_OTHERSIDE);
	public static final RegistryObject<Item> MUSIC_PIG = block(DisplayBlocks.MUSIC_PIG);
	public static final RegistryObject<Item> MUSIC_PRECIPICE = block(DisplayBlocks.MUSIC_PRECIPICE);
	public static final RegistryObject<Item> MUSIC_RELIC = block(DisplayBlocks.MUSIC_RELIC);
	public static final RegistryObject<Item> MUSIC_STAL = block(DisplayBlocks.MUSIC_STAL);
	public static final RegistryObject<Item> MUSIC_SRAD = block(DisplayBlocks.MUSIC_SRAD);
	public static final RegistryObject<Item> MUSIC_WAIT = block(DisplayBlocks.MUSIC_WAIT);
	public static final RegistryObject<Item> MUSIC_WARD = block(DisplayBlocks.MUSIC_WARD);
	public static final RegistryObject<Item> MUSIC_FUSION = block(DisplayBlocks.MUSIC_FUSION);
	public static final RegistryObject<Item> MUSIC_COCO = block(DisplayBlocks.MUSIC_COCO);
	public static final RegistryObject<Item> MUSIC_KOBOLD = block(DisplayBlocks.MUSIC_KOBOLD);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}