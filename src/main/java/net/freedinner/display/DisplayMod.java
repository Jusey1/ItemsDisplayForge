package net.freedinner.display;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
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
	}
}