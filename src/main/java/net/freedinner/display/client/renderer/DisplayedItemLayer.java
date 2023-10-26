package net.freedinner.display.client.renderer;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.model.ArmedModel;

import net.freedinner.display.entity.ItemDisplay;
import net.freedinner.display.client.model.ItemDisplayModel;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.PoseStack;

public class DisplayedItemLayer extends RenderLayer<ItemDisplay, ItemDisplayModel<ItemDisplay>> {
	private final ItemInHandRenderer item;

	public DisplayedItemLayer(RenderLayerParent<ItemDisplay, ItemDisplayModel<ItemDisplay>> context, ItemInHandRenderer target) {
		super(context);
		this.item = target;
	}

	@Override
	public void render(PoseStack pose, MultiBufferSource buffer, int light, ItemDisplay target, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
		ItemStack stack = target.getOffhandItem();
		if (stack.isEmpty()) {
			return;
		}
		this.renderItem(target, stack, pose, buffer, light);
	}

	protected void renderItem(LivingEntity target, ItemStack stack, PoseStack pose, MultiBufferSource buffer, int light) {
		pose.pushPose();
		((ArmedModel) this.getParentModel()).translateToHand(HumanoidArm.RIGHT, pose);
		pose.mulPose(Axis.XP.rotationDegrees(-120.0f));
		pose.mulPose(Axis.YP.rotationDegrees(180.0f));
		if (stack.is(ItemTags.create(new ResourceLocation("items_displayed:sherds")))) {
			pose.translate(0f, -0.11f, -0.94f);
		} else if (stack.is(ItemTags.create(new ResourceLocation("items_displayed:smithing_templates")))) {
			pose.translate(0f, -0.11f, -1.01f);
		}
		this.item.renderItem(target, stack, ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, false, pose, buffer, light);
		pose.popPose();
	}
}