package net.freedinner.display.client.renderer;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.model.ArmedModel;
import net.freedinner.display.entity.ItemPillow;
import net.freedinner.display.client.model.PillowModel;
import net.freedinner.display.block.MusicBlock;
import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.PoseStack;

public class PillowedItemLayer extends RenderLayer<ItemPillow, PillowModel<ItemPillow>> {
	private final ItemInHandRenderer item;

	public PillowedItemLayer(RenderLayerParent<ItemPillow, PillowModel<ItemPillow>> context, ItemInHandRenderer target) {
		super(context);
		this.item = target;
	}

	@Override
	public void render(PoseStack pose, MultiBufferSource buffer, int light, ItemPillow target, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
		ItemStack stack = target.getOffhandItem();
		if (stack.getItem() instanceof BlockItem block) {
			this.renderItem(target, stack, block, pose, buffer, light);
		}
	}

	protected void renderItem(LivingEntity target, ItemStack stack, BlockItem block, PoseStack pose, MultiBufferSource buffer, int light) {
		pose.pushPose();
		((ArmedModel) this.getParentModel()).translateToHand(HumanoidArm.RIGHT, pose);
		pose.mulPose(Axis.XP.rotationDegrees(-157.5F));
		pose.mulPose(Axis.YP.rotationDegrees(180.0F));
		pose.translate(0.0F, (block.getBlock() instanceof MusicBlock ? -0.596F : -0.602F), -0.51F);
		this.item.renderItem(target, stack, ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, false, pose, buffer, light);
		pose.popPose();
	}
}