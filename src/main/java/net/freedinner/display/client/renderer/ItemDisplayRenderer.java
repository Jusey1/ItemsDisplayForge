package net.freedinner.display.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.freedinner.display.entity.ItemDisplay;
import net.freedinner.display.client.model.ItemDisplayModel;

public class ItemDisplayRenderer extends LivingEntityRenderer<ItemDisplay, ItemDisplayModel<ItemDisplay>> {
	public ItemDisplayRenderer(EntityRendererProvider.Context context) {
		super(context, new ItemDisplayModel(context.bakeLayer(ItemDisplayModel.DISPLAY_MODEL)), 0.0f);
		this.addLayer(new DisplayedItemLayer(this, context.getItemInHandRenderer()));
	}

	@Override
	public ResourceLocation getTextureLocation(ItemDisplay target) {
		return new ResourceLocation("items_displayed:textures/entity/item_display.png");
	}

	@Override
	protected boolean shouldShowName(ItemDisplay target) {
		return false;
	}
}