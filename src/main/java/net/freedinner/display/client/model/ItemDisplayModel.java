package net.freedinner.display.client.model;

import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.ArmedModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ItemDisplayModel<T extends Entity> extends EntityModel<T> implements ArmedModel {
	public static final ModelLayerLocation DISPLAY_MODEL = new ModelLayerLocation(new ResourceLocation("items_displayed", "display"), "main");

	private final ModelPart root;

	public ItemDisplayModel(ModelPart root) {
		this.root = root;
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		main.addOrReplaceChild("stick1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3285F, -5.1408F, 0.9266F, -0.3491F, -1.0472F, 1.5708F));
		main.addOrReplaceChild("stick2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.25F, -1.0F, -8.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 2.0F, 1.0737F, 0.1719F, 0.3053F));
		main.addOrReplaceChild("stick3", CubeListBuilder.create().texOffs(0, 13).addBox(-5.0F, -0.75F, -6.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5F, 2.0F, 1.0472F, 0.0F, 0.0F));
		main.addOrReplaceChild("stick4", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -9.4F, 3.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1745F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T display, float limbSwing, float limbSwingAmount, float ageInTicks, float headYaw, float headPitch) {
	}

	@Override
	public void translateToHand(HumanoidArm Arm, PoseStack poseStack) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, buffer, packedLight, packedOverlay);
	}
}