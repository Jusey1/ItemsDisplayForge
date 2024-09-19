package net.freedinner.display.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.freedinner.display.client.model.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DisplayModels {
	public static final ModelLayerLocation DISPLAY = new ModelLayerLocation(new ResourceLocation("items_displayed", "display"), "main");
	public static final ModelLayerLocation PILLOW = new ModelLayerLocation(new ResourceLocation("items_displayed", "pillow"), "main");

	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(DISPLAY, ItemDisplayModel::createBodyLayer);
		event.registerLayerDefinition(PILLOW, PillowModel::createBodyLayer);
	}
}