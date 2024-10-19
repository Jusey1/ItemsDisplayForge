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
	public static final RegistryObject<Block> FLOW_POTTERY_SHERD = REGISTRY.register("flow_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> FRIEND_POTTERY_SHERD = REGISTRY.register("friend_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> GUSTER_POTTERY_SHERD = REGISTRY.register("guster_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> HEART_POTTERY_SHERD = REGISTRY.register("heart_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> HEARTBREAK_POTTERY_SHERD = REGISTRY.register("heartbreak_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> HOWL_POTTERY_SHERD = REGISTRY.register("howl_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> MINER_POTTERY_SHERD = REGISTRY.register("miner_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> MOURNER_POTTERY_SHERD = REGISTRY.register("mourner_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> PLENTY_POTTERY_SHERD = REGISTRY.register("plenty_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> PRIZE_POTTERY_SHERD = REGISTRY.register("prize_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> SCRAPE_POTTERY_SHERD = REGISTRY.register("scrape_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> SHEAF_POTTERY_SHERD = REGISTRY.register("sheaf_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> SHELTER_POTTERY_SHERD = REGISTRY.register("shelter_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> SKULL_POTTERY_SHERD = REGISTRY.register("skull_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> SNORT_POTTERY_SHERD = REGISTRY.register("snort_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> DINOSAUR_POTTERY_SHERD = REGISTRY.register("dinosaur_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> FOOTPRINT_POTTERY_SHERD = REGISTRY.register("footprint_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> GUARDIAN_POTTERY_SHERD = REGISTRY.register("guardian_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> HERO_POTTERY_SHERD = REGISTRY.register("hero_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> CROWN_POTTERY_SHERD = REGISTRY.register("crown_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> SPADE_POTTERY_SHERD = REGISTRY.register("spade_pottery_sherd", () -> new SherdBlock(getProps(SoundType.DECORATED_POT)));
	
	public static final RegistryObject<Block> NETHERITE_UPGRADE = REGISTRY.register("netherite_upgrade", () -> new UpgradeBlock(getProps(SoundType.NETHERRACK)));
	public static final RegistryObject<Block> GOTHIC_UPGRADE = REGISTRY.register("gothic_upgrade", () -> new UpgradeBlock(getProps(SoundType.SOUL_SOIL)));
	public static final RegistryObject<Block> PRESERVED_UPGRADE = REGISTRY.register("preserved_upgrade", () -> new UpgradeBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> SILVER_UPGRADE = REGISTRY.register("silver_upgrade", () -> new UpgradeBlock(getProps(SoundType.WOOD)));

	public static final RegistryObject<Block> BOLT_ARMOR_TRIM = REGISTRY.register("bolt_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.COPPER)));
	public static final RegistryObject<Block> COAST_ARMOR_TRIM = REGISTRY.register("coast_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> DUNE_ARMOR_TRIM = REGISTRY.register("dune_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.DRIPSTONE_BLOCK)));
	public static final RegistryObject<Block> EYE_ARMOR_TRIM = REGISTRY.register("eye_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.CALCITE)));
	public static final RegistryObject<Block> FLOW_ARMOR_TRIM = REGISTRY.register("flow_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.STONE)));
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
	public static final RegistryObject<Block> POLAR_ARMOR_TRIM = REGISTRY.register("polarity_armor_trim", () -> new ArmorTrimBlock(getProps(SoundType.STONE)));

	public static final RegistryObject<Block> BRICK = REGISTRY.register("brick", () -> new IngotBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> NETHER_BRICK = REGISTRY.register("nether_brick", () -> new IngotBlock(getProps(SoundType.NETHER_BRICKS)));
	public static final RegistryObject<Block> ASH_BRICK = REGISTRY.register("ash_brick", () -> new IngotBlock(getProps(SoundType.DECORATED_POT)));
	public static final RegistryObject<Block> IRON_INGOT = REGISTRY.register("iron_ingot", () -> new IngotBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> COPPER_INGOT = REGISTRY.register("copper_ingot", () -> new IngotBlock(getProps(SoundType.COPPER)));
	public static final RegistryObject<Block> GOLD_INGOT = REGISTRY.register("gold_ingot", () -> new IngotBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> NETHERITE_INGOT = REGISTRY.register("netherite_ingot", () -> new IngotBlock(getProps(SoundType.NETHERITE_BLOCK)));
	public static final RegistryObject<Block> AZURE_INGOT = REGISTRY.register("azure_ingot", () -> new IngotBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> SCARLET_INGOT = REGISTRY.register("scarlet_ingot", () -> new IngotBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> BRASS_INGOT = REGISTRY.register("brass_ingot", () -> new IngotBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> ZINC_INGOT = REGISTRY.register("zinc_ingot", () -> new IngotBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new IngotBlock(getProps(SoundType.METAL)));

	public static final RegistryObject<Block> FRAGMENTS = REGISTRY.register("disc_fragment_5", () -> new FragmentsBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> FUSIONS = REGISTRY.register("disc_fragment_fusion", () -> new FragmentsBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> TASTYS = REGISTRY.register("disc_fragment_tasty", () -> new FragmentsBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> COAL = REGISTRY.register("coal", () -> new GemBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> CHARCOAL = REGISTRY.register("charcoal", () -> new GemBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> AMETHYST = REGISTRY.register("amethyst_shard", () -> new GemBlock(getProps(SoundType.AMETHYST)));
	public static final RegistryObject<Block> DIAMOND = REGISTRY.register("diamond", () -> new GemBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> EMERALD = REGISTRY.register("emerald", () -> new GemBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> LAPIS = REGISTRY.register("lapis_lazuli", () -> new GemBlock(getProps(SoundType.METAL)));
	public static final RegistryObject<Block> ECHO = REGISTRY.register("echo_shard", () -> new GemBlock(getProps(SoundType.AMETHYST)));
	public static final RegistryObject<Block> ALLURITE = REGISTRY.register("allurite_shard", () -> new GemBlock(getProps(SoundType.AMETHYST)));
	public static final RegistryObject<Block> LUMIERE = REGISTRY.register("lumiere_shard", () -> new GemBlock(getProps(SoundType.AMETHYST)));

	public static final RegistryObject<Block> MUSIC_FIVE = REGISTRY.register("music_disc_5", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_ELE = REGISTRY.register("music_disc_11", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_THREE = REGISTRY.register("music_disc_13", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_BLOCKS = REGISTRY.register("music_disc_blocks", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_CAT = REGISTRY.register("music_disc_cat", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_CHIRP = REGISTRY.register("music_disc_chirp", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_CREATOR = REGISTRY.register("music_disc_creator", () -> new MusicBlock(getProps(SoundType.COPPER)));
	public static final RegistryObject<Block> MUSIC_CREATOR_BOX = REGISTRY.register("music_disc_creator_music_box", () -> new MusicBlock(getProps(SoundType.COPPER)));
	public static final RegistryObject<Block> MUSIC_FAR = REGISTRY.register("music_disc_far", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_MALL = REGISTRY.register("music_disc_mall", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_MELLO = REGISTRY.register("music_disc_mellohi", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_OTHERSIDE = REGISTRY.register("music_disc_otherside", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_PIG = REGISTRY.register("music_disc_pigstep", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_PRECIPICE = REGISTRY.register("music_disc_precipice", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_RELIC = REGISTRY.register("music_disc_relic", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_STAL = REGISTRY.register("music_disc_stal", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_SRAD = REGISTRY.register("music_disc_strad", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_WAIT = REGISTRY.register("music_disc_wait", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_WARD = REGISTRY.register("music_disc_ward", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_FUSION = REGISTRY.register("music_disc_fusion", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_TASTY = REGISTRY.register("music_disc_tasty", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_DRIFT = REGISTRY.register("music_disc_drift", () -> new MusicBlock(getProps(SoundType.WOOL)));
	public static final RegistryObject<Block> MUSIC_COCO = REGISTRY.register("music_disc_coconut", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_KOBOLD = REGISTRY.register("music_disc_kobblestone", () -> new MusicBlock(getProps(SoundType.STONE)));
	public static final RegistryObject<Block> MUSIC_ROT = REGISTRY.register("music_disc_rot", () -> new MusicBlock(getProps(SoundType.STONE)));

	private static BlockBehaviour.Properties getProps(SoundType sound) {
		return getDefault().mapColor(MapColor.NONE).sound(sound);
	}

	private static BlockBehaviour.Properties getDefault() {
		return BlockBehaviour.Properties.of().noParticlesOnBreak().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
	}
}