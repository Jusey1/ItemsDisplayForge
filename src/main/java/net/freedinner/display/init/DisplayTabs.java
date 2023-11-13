package net.freedinner.display.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.freedinner.display.DisplayMod;

public class DisplayTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DisplayMod.MODID);
	public static final RegistryObject<CreativeModeTab> DISPLAYED = REGISTRY.register("display",
			() -> CreativeModeTab.builder().title(Component.translatable("item.items_displayed.item_group_name")).icon(() -> new ItemStack(DisplayItems.DISPLAY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DisplayItems.DISPLAY.get());
				tabData.accept(Items.EMERALD);
				tabData.accept(Items.LAPIS_LAZULI);
				tabData.accept(Items.DIAMOND);
				tabData.accept(Items.IRON_INGOT);
				tabData.accept(Items.COPPER_INGOT);
				tabData.accept(Items.GOLD_INGOT);
				tabData.accept(Items.NETHERITE_INGOT);
				tabData.accept(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE);
				tabData.accept(Items.COAST_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.HOST_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.RIB_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.VEX_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.WARD_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.WILD_ARMOR_TRIM_SMITHING_TEMPLATE);
				tabData.accept(Items.ANGLER_POTTERY_SHERD);
				tabData.accept(Items.ARCHER_POTTERY_SHERD);
				tabData.accept(Items.ARMS_UP_POTTERY_SHERD);
				tabData.accept(Items.BLADE_POTTERY_SHERD);
				tabData.accept(Items.BREWER_POTTERY_SHERD);
				tabData.accept(Items.BURN_POTTERY_SHERD);
				tabData.accept(Items.DANGER_POTTERY_SHERD);
				tabData.accept(Items.EXPLORER_POTTERY_SHERD);
				tabData.accept(Items.FRIEND_POTTERY_SHERD);
				tabData.accept(Items.HEART_POTTERY_SHERD);
				tabData.accept(Items.HEARTBREAK_POTTERY_SHERD);
				tabData.accept(Items.HOWL_POTTERY_SHERD);
				tabData.accept(Items.MINER_POTTERY_SHERD);
				tabData.accept(Items.MOURNER_POTTERY_SHERD);
				tabData.accept(Items.PLENTY_POTTERY_SHERD);
				tabData.accept(Items.PRIZE_POTTERY_SHERD);
				tabData.accept(Items.SHEAF_POTTERY_SHERD);
				tabData.accept(Items.SHELTER_POTTERY_SHERD);
				tabData.accept(Items.SKULL_POTTERY_SHERD);
				tabData.accept(Items.SNORT_POTTERY_SHERD);
			}).build());
}