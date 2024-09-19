package net.freedinner.display.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.freedinner.display.init.DisplayModels;
import net.freedinner.display.entity.ItemDisplay;
import net.freedinner.display.client.model.ItemDisplayModel;
import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.PoseStack;

public class ItemDisplayRenderer extends LivingEntityRenderer<ItemDisplay, ItemDisplayModel<ItemDisplay>> {
	public ItemDisplayRenderer(EntityRendererProvider.Context context) {
		super(context, new ItemDisplayModel(context.bakeLayer(DisplayModels.DISPLAY)), 0.0f);
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

	@Override
	protected void setupRotations(ItemDisplay target, PoseStack pose, float f1, float f2, float f3) {
		pose.mulPose(Axis.YP.rotationDegrees(180.0F - f2));
		float f = (float) (target.level().getGameTime() - target.lastHit) + f3;
		if (f < 5.0F) {
			pose.mulPose(Axis.YP.rotationDegrees(Mth.sin(f / 1.5F * (float) Math.PI) * 3.0F));
		}
	}
}