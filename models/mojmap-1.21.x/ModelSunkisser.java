// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSunkisser<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sunkisser"), "main");
	private final ModelPart Body;
	private final ModelPart LowerBody;
	private final ModelPart BackRightLeg;
	private final ModelPart BackLeftLeg;
	private final ModelPart LeftFrontLeg;
	private final ModelPart LowerLeftLeg;
	private final ModelPart RightFrongLeg;
	private final ModelPart LowerRightLeg;
	private final ModelPart Head;
	private final ModelPart LeftWing;
	private final ModelPart RightWing;

	public ModelSunkisser(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LowerBody = this.Body.getChild("LowerBody");
		this.BackRightLeg = this.LowerBody.getChild("BackRightLeg");
		this.BackLeftLeg = this.LowerBody.getChild("BackLeftLeg");
		this.LeftFrontLeg = this.Body.getChild("LeftFrontLeg");
		this.LowerLeftLeg = this.LeftFrontLeg.getChild("LowerLeftLeg");
		this.RightFrongLeg = this.Body.getChild("RightFrongLeg");
		this.LowerRightLeg = this.RightFrongLeg.getChild("LowerRightLeg");
		this.Head = this.Body.getChild("Head");
		this.LeftWing = this.Body.getChild("LeftWing");
		this.RightWing = this.Body.getChild("RightWing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 26)
				.addBox(-5.0F, -6.381F, -7.0714F, 10.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.381F, -3.9286F));

		PartDefinition LowerBody = Body.addOrReplaceChild("LowerBody", CubeListBuilder.create().texOffs(44, 26)
				.addBox(-3.0F, -3.1667F, 0.0F, 6.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.2143F, 4.9286F));

		PartDefinition BackRightLeg = LowerBody.addOrReplaceChild("BackRightLeg", CubeListBuilder.create()
				.texOffs(0, 56).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 3.8333F, 5.5F));

		PartDefinition BackLeftLeg = LowerBody.addOrReplaceChild("BackLeftLeg", CubeListBuilder.create().texOffs(12, 56)
				.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 3.8333F, 5.5F));

		PartDefinition LeftFrontLeg = Body.addOrReplaceChild("LeftFrontLeg", CubeListBuilder.create().texOffs(32, 48)
				.addBox(-1.5F, 0.0F, -1.25F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.75F, 3.619F, -2.8214F));

		PartDefinition LowerLeftLeg = LeftFrontLeg.addOrReplaceChild("LowerLeftLeg",
				CubeListBuilder.create().texOffs(0, 48)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 56)
						.addBox(-2.0F, 4.0F, -3.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, -0.25F));

		PartDefinition RightFrongLeg = Body.addOrReplaceChild("RightFrongLeg", CubeListBuilder.create().texOffs(32, 55)
				.addBox(-1.5F, 0.0F, -1.25F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.75F, 3.619F, -2.8214F));

		PartDefinition LowerRightLeg = RightFrongLeg.addOrReplaceChild("LowerRightLeg",
				CubeListBuilder.create().texOffs(16, 48)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 59)
						.addBox(-2.0F, 4.0F, -3.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, -0.25F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(44, 43).addBox(-3.0F,
				-2.5F, -6.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.881F, -7.0714F));

		PartDefinition LeftWing = Body.addOrReplaceChild("LeftWing", CubeListBuilder.create().texOffs(1, 0)
				.addBox(-0.5F, 0.0F, -6.5F, 21.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.5F, -1.881F, 4.4286F));

		PartDefinition RightWing = Body.addOrReplaceChild("RightWing", CubeListBuilder.create().texOffs(0, 13)
				.addBox(-20.5F, 0.0F, -6.5F, 21.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.5F, -1.881F, 4.4286F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}