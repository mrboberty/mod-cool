// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPolyvalentScepter<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "polyvalentscepter"), "main");
	private final ModelPart Handle;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart darknesscube;
	private final ModelPart lightcube;

	public ModelPolyvalentScepter(ModelPart root) {
		this.Handle = root.getChild("Handle");
		this.bone = this.Handle.getChild("bone");
		this.bone2 = this.Handle.getChild("bone2");
		this.bone3 = this.Handle.getChild("bone3");
		this.bone4 = this.Handle.getChild("bone4");
		this.darknesscube = this.Handle.getChild("darknesscube");
		this.lightcube = this.Handle.getChild("lightcube");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Handle = partdefinition.addOrReplaceChild("Handle",
				CubeListBuilder.create().texOffs(0, 34)
						.addBox(-2.0F, -24.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-1.0F, -22.0F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 34)
						.addBox(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = Handle.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, -23.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -5.0F, -3.5F, 0.0F, 10.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -3.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = Handle.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -23.0F, 0.0F));

		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(14, 0).addBox(0.0F, -5.0F, -3.5F, 0.0F, 10.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 4.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone3 = Handle.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, -23.0F, 0.0F));

		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -5.0F, -3.5F, 0.0F, 10.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.875F, -4.0F, 0.125F, 0.0F, -1.5708F, 0.1309F));

		PartDefinition bone4 = Handle.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(0.0F, -23.0F, 0.0F));

		PartDefinition cube_r4 = bone4.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(14, 17).addBox(0.0F, -5.0F, -3.5F, 0.0F, 10.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.875F, -4.0F, 0.125F, 0.0F, -1.5708F, -0.1309F));

		PartDefinition darknesscube = Handle.addOrReplaceChild("darknesscube", CubeListBuilder.create().texOffs(28, 19)
				.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -28.0F, 0.0F));

		PartDefinition lightcube = Handle.addOrReplaceChild("lightcube", CubeListBuilder.create().texOffs(28, 27)
				.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -28.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Handle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}