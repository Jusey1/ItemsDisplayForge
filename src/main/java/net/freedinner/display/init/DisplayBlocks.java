package net.freedinner.display.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

import net.freedinner.display.block.*;
import net.freedinner.display.DisplayMod;

public class DisplayBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DisplayMod.MODID);
	public static final RegistryObject<Block> ANGLER_POTTERY_SHERD = REGISTRY.register("angler_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> ARCHER_POTTERY_SHERD = REGISTRY.register("archer_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> ARMS_UP_POTTERY_SHERD = REGISTRY.register("arms_up_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> BLADE_POTTERY_SHERD = REGISTRY.register("blade_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> BREWER_POTTERY_SHERD = REGISTRY.register("brewer_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> BURN_POTTERY_SHERD = REGISTRY.register("burn_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> DANGER_POTTERY_SHERD = REGISTRY.register("danger_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> EXPLORER_POTTERY_SHERD = REGISTRY.register("explorer_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> FRIEND_POTTERY_SHERD = REGISTRY.register("friend_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> HEART_POTTERY_SHERD = REGISTRY.register("heart_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> HEARTBREAK_POTTERY_SHERD = REGISTRY.register("heartbreak_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> HOWL_POTTERY_SHERD = REGISTRY.register("howl_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> MINER_POTTERY_SHERD = REGISTRY.register("miner_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> MOURNER_POTTERY_SHERD = REGISTRY.register("mourner_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> PLENTY_POTTERY_SHERD = REGISTRY.register("plenty_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> PRIZE_POTTERY_SHERD = REGISTRY.register("prize_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> SHEAF_POTTERY_SHERD = REGISTRY.register("sheaf_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> SHELTER_POTTERY_SHERD = REGISTRY.register("shelter_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> SKULL_POTTERY_SHERD = REGISTRY.register("skull_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> SNORT_POTTERY_SHERD = REGISTRY.register("snort_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> DINOSAUR_POTTERY_SHERD = REGISTRY.register("dinosaur_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> FOOTPRINT_POTTERY_SHERD = REGISTRY.register("footprint_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> GUARDIAN_POTTERY_SHERD = REGISTRY.register("guardian_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> HERO_POTTERY_SHERD = REGISTRY.register("hero_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	
	public static final RegistryObject<Block> NETHERITE_UPGRADE = REGISTRY.register("netherite_upgrade", () -> new UpgradeBlock(getProps(SoundType.NETHERRACK)));
	public static final RegistryObject<Block> GOTHIC_UPGRADE = REGISTRY.register("gothic_upgrade", () -> new UpgradeBlock(getProps(SoundType.SOUL_SOIL)));
	
	public static final RegistryObject<Block> COAST_ARMOR_TRIM = REGISTRY.register("coast_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> DUNE_ARMOR_TRIM = REGISTRY.register("dune_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.DRIPSTONE_BLOCK)));
	public static final RegistryObject<Block> EYE_ARMOR_TRIM = REGISTRY.register("eye_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.CALCITE)));
	public static final RegistryObject<Block> HOST_ARMOR_TRIM = REGISTRY.register("host_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.GRAVEL)));
	public static final RegistryObject<Block> RAISER_ARMOR_TRIM = REGISTRY.register("raiser_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.GRAVEL)));
	public static final RegistryObject<Block> RIB_ARMOR_TRIM = REGISTRY.register("rib_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.NETHER_BRICKS)));
	public static final RegistryObject<Block> SENTRY_ARMOR_TRIM = REGISTRY.register("sentry_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> SHAPER_ARMOR_TRIM = REGISTRY.register("shaper_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.GRAVEL)));
	public static final RegistryObject<Block> SILENCE_ARMOR_TRIM = REGISTRY.register("silence_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.DEEPSLATE)));
	public static final RegistryObject<Block> SNOUT_ARMOR_TRIM = REGISTRY.register("snout_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.POLISHED_DEEPSLATE)));
	public static final RegistryObject<Block> SPIRE_ARMOR_TRIM = REGISTRY.register("spire_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.DEEPSLATE_BRICKS)));
	public static final RegistryObject<Block> TIDE_ARMOR_TRIM = REGISTRY.register("tide_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.DEEPSLATE_BRICKS)));
	public static final RegistryObject<Block> VEX_ARMOR_TRIM = REGISTRY.register("vex_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> WARD_ARMOR_TRIM = REGISTRY.register("ward_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.DEEPSLATE)));
	public static final RegistryObject<Block> WAYFINDER_ARMOR_TRIM = REGISTRY.register("wayfinder_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.GRAVEL)));
	public static final RegistryObject<Block> WILD_ARMOR_TRIM = REGISTRY.register("wild_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> KOBOLD_ARMOR_TRIM = REGISTRY.register("kobold_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.TUFF)));
	public static final RegistryObject<Block> NECRO_ARMOR_TRIM = REGISTRY.register("necro_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.SOUL_SOIL)));

	public static final RegistryObject<Block> IRON_INGOT = REGISTRY.register("iron_ingot", () -> new IngotBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> COPPER_INGOT = REGISTRY.register("copper_ingot", () -> new IngotBlock(getProps(SoundType.COPPER)));
	public static final RegistryObject<Block> GOLD_INGOT = REGISTRY.register("gold_ingot", () -> new IngotBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> NETHERITE_INGOT = REGISTRY.register("netherite_ingot", () -> new IngotBlock(getProps(SoundType.NETHERITE_BLOCK)));
	public static final RegistryObject<Block> AZURE_INGOT = REGISTRY.register("azure_ingot", () -> new IngotBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> SCARLET_INGOT = REGISTRY.register("scarlet_ingot", () -> new IngotBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> BRASS_INGOT = REGISTRY.register("brass_ingot", () -> new IngotBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> ZINC_INGOT = REGISTRY.register("zinc_ingot", () -> new IngotBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new IngotBlock(getProps(SoundType.METAL)));

	private static BlockBehaviour.Properties getProps(SoundType sound) {
		return getDefault().mapColor(MapColor.NONE).sound(sound);
	}

	private static BlockBehaviour.Properties getDefault() {
		return BlockBehaviour.Properties.of().noParticlesOnBreak().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
	}
}