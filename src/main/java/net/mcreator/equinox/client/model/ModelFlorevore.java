package net.mcreator.equinox.client.model;

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

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelFlorevore<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("equinox", "model_florevore"), "main");
	public final ModelPart Body;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart FirstBone;
	public final ModelPart SecondBone;
	public final ModelPart RightHead;
	public final ModelPart LeftHead;

	public ModelFlorevore(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightLeg = this.Body.getChild("RightLeg");
		this.LeftLeg = this.Body.getChild("LeftLeg");
		this.FirstBone = this.Body.getChild("FirstBone");
		this.SecondBone = this.FirstBone.getChild("SecondBone");
		this.RightHead = this.SecondBone.getChild("RightHead");
		this.LeftHead = this.SecondBone.getChild("LeftHead");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(32, 0).addBox(-3.0F, -1.375F, -2.25F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.375F, -0.75F));
		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(32, 10).addBox(-3.0F, -0.75F, -0.5F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 28).addBox(-3.0F, 4.25F, -2.5F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 0.375F, -0.75F));
		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(32, 19).addBox(-1.0F, -0.75F, -0.5F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 30).addBox(-1.0F, 4.25F, -2.5F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 0.375F, -0.75F));
		PartDefinition FirstBone = Body.addOrReplaceChild("FirstBone", CubeListBuilder.create().texOffs(32, 28).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.375F, 0.75F));
		PartDefinition SecondBone = FirstBone.addOrReplaceChild("SecondBone", CubeListBuilder.create().texOffs(32, 36).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition RightHead = SecondBone.addOrReplaceChild("RightHead", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -11.0F, -5.0F, 6.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition LeftHead = SecondBone.addOrReplaceChild("LeftHead", CubeListBuilder.create().texOffs(0, 21).addBox(0.0F, -11.0F, -5.0F, 6.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}