package net.freedinner.display;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.common.MinecraftForge;

import net.freedinner.display.init.*;

@Mod("display")
public class DisplayMod {
	public static final String MODID = "items_displayed";

	public DisplayMod() {
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		DisplayBlocks.REGISTRY.register(bus);
		DisplayItems.REGISTRY.register(bus);
		DisplayMobs.REGISTRY.register(bus);
		DisplayTabs.REGISTRY.register(bus);
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DisplayConfig.CONFIG, "items-displayed-common.toml");
	}
}