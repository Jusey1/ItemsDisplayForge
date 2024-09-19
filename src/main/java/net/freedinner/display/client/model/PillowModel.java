package net.freedinner.display.client.model;

import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.ArmedModel;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PillowModel<T extends Entity> extends EntityModel<T> implements ArmedModel {
	private final ModelPart root;

	public PillowModel(ModelPart root) {
		this.root = root;
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		main.addOrReplaceChild("stick1", CubeListBuilder.create().texOffs(4, 13).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -3.0F, 3.75F, 1.5708F, 0.0F, -1.5708F));
		main.addOrReplaceChild("stick2", CubeListBuilder.create().texOffs(4, 13).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -3.0F, 3.75F, 1.5708F, 0.0F, -1.5708F));
		main.addOrReplaceChild("stick3", CubeListBuilder.create().texOffs(0, 13).addBox(-7.0F, -1.0F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 0.0F, 3.25F, 0.0F, -1.5708F, 0.0F));
		main.addOrReplaceChild("stick4", CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -0.5F, 0.25F, 0.0F, -1.5708F, 3.1416F));
		main.addOrReplaceChild("pillow", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -3.0F, -0.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.3F, 0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
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