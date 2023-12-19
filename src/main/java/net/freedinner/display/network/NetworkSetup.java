package net.freedinner.display.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.freedinner.display.DisplayMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NetworkSetup {
	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DisplayMod.addNetworkMessage(DisplayPlace.class, DisplayPlace::buffer, DisplayPlace::reader, DisplayPlace::handler);
	}
}