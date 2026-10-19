// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelLightPatron<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "lightpatron"), "main");
	private final ModelPart LowerBody;
	private final ModelPart Body;
	private final ModelPart LeftStripe;
	private final ModelPart LeftLowerPart;
	private final ModelPart LeftStripe2;
	private final ModelPart LeftLowerPart2;
	private final ModelPart RightStripe;
	private final ModelPart RightLowerPart;
	private final ModelPart RightStripe2;
	private final ModelPart RightLowerPart2;
	private final ModelPart RightArm;
	private final ModelPart UpperRightArm;
	private final ModelPart LowerRightArm;
	private final ModelPart RightHand;
	private final ModelPart RightFinger3;
	private final ModelPart RightLowerFinger3;
	private final ModelPart RightFinger2;
	private final ModelPart RightLowerFinger2;
	private final ModelPart RightFinger1;
	private final ModelPart RightLowerFinger1;
	private final ModelPart LeftArm;
	private final ModelPart UpperLeftArm;
	private final ModelPart LowerLeftArm;
	private final ModelPart LeftHand;
	private final ModelPart LeftFinger2;
	private final ModelPart LeftLowerFinger2;
	private final ModelPart LeftFinger3;
	private final ModelPart LeftLowerFinger3;
	private final ModelPart LeftFinger1;
	private final ModelPart LeftLowerFinger1;
	private final ModelPart Cube;
	private final ModelPart Head;
	private final ModelPart Strates;
	private final ModelPart Strate;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Strate8;
	private final ModelPart bone22;
	private final ModelPart bone23;
	private final ModelPart bone24;
	private final ModelPart Strate4;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart Strate6;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart Strate5;
	private final ModelPart bone13;
	private final ModelPart bone14;
	private final ModelPart bone15;
	private final ModelPart Strate7;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart Strate3;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart Strate10;
	private final ModelPart bone28;
	private final ModelPart bone29;
	private final ModelPart bone30;
	private final ModelPart Strate2;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart Strate9;
	private final ModelPart bone25;
	private final ModelPart bone26;
	private final ModelPart bone27;

	public ModelLightPatron(ModelPart root) {
		this.LowerBody = root.getChild("LowerBody");
		this.Body = this.LowerBody.getChild("Body");
		this.LeftStripe = this.Body.getChild("LeftStripe");
		this.LeftLowerPart = this.LeftStripe.getChild("LeftLowerPart");
		this.LeftStripe2 = this.Body.getChild("LeftStripe2");
		this.LeftLowerPart2 = this.LeftStripe2.getChild("LeftLowerPart2");
		this.RightStripe = this.Body.getChild("RightStripe");
		this.RightLowerPart = this.RightStripe.getChild("RightLowerPart");
		this.RightStripe2 = this.Body.getChild("RightStripe2");
		this.RightLowerPart2 = this.RightStripe2.getChild("RightLowerPart2");
		this.RightArm = this.Body.getChild("RightArm");
		this.UpperRightArm = this.RightArm.getChild("UpperRightArm");
		this.LowerRightArm = this.UpperRightArm.getChild("LowerRightArm");
		this.RightHand = this.LowerRightArm.getChild("RightHand");
		this.RightFinger3 = this.RightHand.getChild("RightFinger3");
		this.RightLowerFinger3 = this.RightFinger3.getChild("RightLowerFinger3");
		this.RightFinger2 = this.RightHand.getChild("RightFinger2");
		this.RightLowerFinger2 = this.RightFinger2.getChild("RightLowerFinger2");
		this.RightFinger1 = this.RightHand.getChild("RightFinger1");
		this.RightLowerFinger1 = this.RightFinger1.getChild("RightLowerFinger1");
		this.LeftArm = this.Body.getChild("LeftArm");
		this.UpperLeftArm = this.LeftArm.getChild("UpperLeftArm");
		this.LowerLeftArm = this.UpperLeftArm.getChild("LowerLeftArm");
		this.LeftHand = this.LowerLeftArm.getChild("LeftHand");
		this.LeftFinger2 = this.LeftHand.getChild("LeftFinger2");
		this.LeftLowerFinger2 = this.LeftFinger2.getChild("LeftLowerFinger2");
		this.LeftFinger3 = this.LeftHand.getChild("LeftFinger3");
		this.LeftLowerFinger3 = this.LeftFinger3.getChild("LeftLowerFinger3");
		this.LeftFinger1 = this.LeftHand.getChild("LeftFinger1");
		this.LeftLowerFinger1 = this.LeftFinger1.getChild("LeftLowerFinger1");
		this.Cube = this.LeftHand.getChild("Cube");
		this.Head = this.Body.getChild("Head");
		this.Strates = this.LowerBody.getChild("Strates");
		this.Strate = this.Strates.getChild("Strate");
		this.bone = this.Strate.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.Strate8 = this.Strates.getChild("Strate8");
		this.bone22 = this.Strate8.getChild("bone22");
		this.bone23 = this.bone22.getChild("bone23");
		this.bone24 = this.bone23.getChild("bone24");
		this.Strate4 = this.Strates.getChild("Strate4");
		this.bone10 = this.Strate4.getChild("bone10");
		this.bone11 = this.bone10.getChild("bone11");
		this.bone12 = this.bone11.getChild("bone12");
		this.Strate6 = this.Strates.getChild("Strate6");
		this.bone16 = this.Strate6.getChild("bone16");
		this.bone17 = this.bone16.getChild("bone17");
		this.bone18 = this.bone17.getChild("bone18");
		this.Strate5 = this.Strates.getChild("Strate5");
		this.bone13 = this.Strate5.getChild("bone13");
		this.bone14 = this.bone13.getChild("bone14");
		this.bone15 = this.bone14.getChild("bone15");
		this.Strate7 = this.Strates.getChild("Strate7");
		this.bone19 = this.Strate7.getChild("bone19");
		this.bone20 = this.bone19.getChild("bone20");
		this.bone21 = this.bone20.getChild("bone21");
		this.Strate3 = this.Strates.getChild("Strate3");
		this.bone7 = this.Strate3.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone9 = this.bone8.getChild("bone9");
		this.Strate10 = this.Strates.getChild("Strate10");
		this.bone28 = this.Strate10.getChild("bone28");
		this.bone29 = this.bone28.getChild("bone29");
		this.bone30 = this.bone29.getChild("bone30");
		this.Strate2 = this.Strates.getChild("Strate2");
		this.bone4 = this.Strate2.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
		this.Strate9 = this.Strates.getChild("Strate9");
		this.bone25 = this.Strate9.getChild("bone25");
		this.bone26 = this.bone25.getChild("bone26");
		this.bone27 = this.bone26.getChild("bone27");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LowerBody = partdefinition.addOrReplaceChild("LowerBody",
				CubeListBuilder.create().texOffs(50, 54)
						.addBox(-6.2187F, -0.0919F, -5.0F, 12.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 75)
						.addBox(-4.7187F, 2.9081F, -4.5F, 9.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(50, 39)
						.addBox(-6.2187F, 8.9081F, -6.0F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2187F, -14.9081F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition Body = LowerBody.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-10.1111F, -13.4597F, -5.0F, 18.0F, 13.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.8924F, 0.3678F, 0.0F));

		PartDefinition LeftStripe = Body.addOrReplaceChild("LeftStripe",
				CubeListBuilder.create().texOffs(126, 91)
						.addBox(-4.0F, -0.1667F, -1.6667F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(98, 15)
						.addBox(-4.0F, -0.1667F, 0.3333F, 8.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.1111F, -13.2931F, 6.6667F));

		PartDefinition LeftLowerPart = LeftStripe.addOrReplaceChild("LeftLowerPart", CubeListBuilder.create()
				.texOffs(72, 100).addBox(-4.0F, -0.5F, 0.0F, 8.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.3333F, 0.3333F));

		PartDefinition LeftStripe2 = Body.addOrReplaceChild("LeftStripe2",
				CubeListBuilder.create().texOffs(126, 91)
						.addBox(-4.0F, -0.1667F, -1.6667F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(98, 15)
						.addBox(-4.0F, -0.1667F, 0.3333F, 8.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1111F, -13.2931F, -6.3333F, 0.0F, 3.1416F, 0.0F));

		PartDefinition LeftLowerPart2 = LeftStripe2.addOrReplaceChild("LeftLowerPart2", CubeListBuilder.create()
				.texOffs(72, 100).addBox(-4.0F, -0.5F, 0.0F, 8.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.3333F, 0.3333F));

		PartDefinition RightStripe = Body.addOrReplaceChild("RightStripe",
				CubeListBuilder.create().texOffs(126, 93)
						.addBox(-4.0F, -0.1667F, -1.6667F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(98, 33)
						.addBox(-4.0F, -0.1667F, 0.3333F, 8.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.8889F, -13.2931F, 6.6667F));

		PartDefinition RightLowerPart = RightStripe.addOrReplaceChild("RightLowerPart", CubeListBuilder.create()
				.texOffs(88, 100).addBox(-4.0F, -0.5F, 0.0F, 8.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.3333F, 0.3333F));

		PartDefinition RightStripe2 = Body.addOrReplaceChild("RightStripe2",
				CubeListBuilder.create().texOffs(126, 93)
						.addBox(-4.0F, -0.1667F, -1.6667F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(98, 33)
						.addBox(-4.0F, -0.1667F, 0.3333F, 8.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8889F, -13.2931F, -6.3333F, 0.0F, 3.1416F, 0.0F));

		PartDefinition RightLowerPart2 = RightStripe2.addOrReplaceChild("RightLowerPart2", CubeListBuilder.create()
				.texOffs(88, 100).addBox(-4.0F, -0.5F, 0.0F, 8.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.3333F, 0.3333F));

		PartDefinition RightArm = Body.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(7.8889F, -10.5639F, 0.0F));

		PartDefinition UpperRightArm = RightArm.addOrReplaceChild("UpperRightArm", CubeListBuilder.create()
				.texOffs(0, 23).addBox(0.0F, -5.8958F, -6.5F, 12.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LowerRightArm = UpperRightArm.addOrReplaceChild("LowerRightArm",
				CubeListBuilder.create().texOffs(52, 101)
						.addBox(-4.0F, -0.2917F, -11.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-4.0F, -0.2917F, -4.5F, 8.0F, 14.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(52, 101)
						.addBox(4.0F, -0.2917F, -11.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(24, 90)
						.addBox(-4.0F, 6.7083F, -8.5F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 7.3958F, 0.0F));

		PartDefinition cube_r1 = LowerRightArm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(128, 6).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.7083F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition RightHand = LowerRightArm.addOrReplaceChild("RightHand", CubeListBuilder.create().texOffs(90, 0)
				.addBox(-2.5F, -0.25F, -3.5F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.9583F, 0.0F));

		PartDefinition RightFinger3 = RightHand.addOrReplaceChild("RightFinger3", CubeListBuilder.create()
				.texOffs(130, 74).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.75F, -2.0F));

		PartDefinition RightLowerFinger3 = RightFinger3.addOrReplaceChild("RightLowerFinger3", CubeListBuilder.create()
				.texOffs(84, 132).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition RightFinger2 = RightHand.addOrReplaceChild("RightFinger2", CubeListBuilder.create()
				.texOffs(72, 90).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.75F, 2.0F));

		PartDefinition RightLowerFinger2 = RightFinger2.addOrReplaceChild("RightLowerFinger2", CubeListBuilder.create()
				.texOffs(128, 12).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition RightFinger1 = RightHand.addOrReplaceChild("RightFinger1", CubeListBuilder.create()
				.texOffs(128, 40).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.75F, 4.0F));

		PartDefinition RightLowerFinger1 = RightFinger1.addOrReplaceChild("RightLowerFinger1", CubeListBuilder.create()
				.texOffs(128, 33).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 1.0F));

		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(-10.1111F, -7.5639F, 0.0F));

		PartDefinition UpperLeftArm = LeftArm.addOrReplaceChild("UpperLeftArm", CubeListBuilder.create().texOffs(0, 49)
				.addBox(-12.0F, -8.8958F, -6.5F, 12.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LowerLeftArm = UpperLeftArm.addOrReplaceChild("LowerLeftArm",
				CubeListBuilder.create().texOffs(56, 0)
						.addBox(-4.0F, -0.2917F, -4.5F, 8.0F, 14.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(52, 101)
						.addBox(-4.0F, -0.2917F, -11.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(24, 90)
						.addBox(-4.0F, 6.7083F, -8.5F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 101)
						.addBox(4.0F, -0.2917F, -11.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 4.3958F, 0.0F));

		PartDefinition cube_r2 = LowerLeftArm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(128, 6).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.7083F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition LeftHand = LowerLeftArm.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(90, 0)
				.addBox(-2.5F, -0.25F, -3.5F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.9583F, 0.0F));

		PartDefinition LeftFinger2 = LeftHand.addOrReplaceChild("LeftFinger2", CubeListBuilder.create().texOffs(72, 90)
				.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.75F, 2.0F));

		PartDefinition LeftLowerFinger2 = LeftFinger2.addOrReplaceChild("LeftLowerFinger2", CubeListBuilder.create()
				.texOffs(128, 12).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition LeftFinger3 = LeftHand.addOrReplaceChild("LeftFinger3", CubeListBuilder.create().texOffs(130, 74)
				.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.75F, -2.0F));

		PartDefinition LeftLowerFinger3 = LeftFinger3.addOrReplaceChild("LeftLowerFinger3", CubeListBuilder.create()
				.texOffs(84, 132).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition LeftFinger1 = LeftHand.addOrReplaceChild("LeftFinger1", CubeListBuilder.create().texOffs(128, 40)
				.addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.75F, 3.5F));

		PartDefinition LeftLowerFinger1 = LeftFinger1.addOrReplaceChild("LeftLowerFinger1", CubeListBuilder.create()
				.texOffs(128, 33).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 1.5F));

		PartDefinition Cube = LeftHand.addOrReplaceChild("Cube", CubeListBuilder.create().texOffs(84, 86).addBox(-4.0F,
				-3.0F, -4.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 4.0F, 0.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(-1.1111F, -13.6597F, 1.2686F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(94, 120)
						.addBox(-8.0F, 4.5F, 1.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(94, 54)
						.addBox(-8.0F, 5.5F, -8.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(94, 54)
						.addBox(-2.0F, 2.5F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(120, 126)
						.addBox(1.0F, 4.5F, -8.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.3F, 2.7314F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(50, 23)
						.addBox(-6.0F, 2.5F, -6.0F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(84, 67)
						.addBox(-4.0F, 6.5F, -4.0F, 8.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -17.3F, -1.2686F, 0.0F, -0.7854F, 0.0F));

		PartDefinition Strates = LowerBody.addOrReplaceChild("Strates", CubeListBuilder.create(),
				PartPose.offset(-0.2364F, 11.9081F, 0.1925F));

		PartDefinition Strate = Strates.addOrReplaceChild("Strate", CubeListBuilder.create(),
				PartPose.offset(0.0177F, 0.0F, -5.4425F));

		PartDefinition bone = Strate
				.addOrReplaceChild("bone",
						CubeListBuilder.create().texOffs(104, 100).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone2 = bone
				.addOrReplaceChild("bone2",
						CubeListBuilder.create().texOffs(0, 105).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2
				.addOrReplaceChild("bone3",
						CubeListBuilder.create().texOffs(110, 51).addBox(-3.0F, -0.2F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Strate8 = Strates.addOrReplaceChild("Strate8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0177F, 0.0F, 5.5575F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition bone22 = Strate8
				.addOrReplaceChild("bone22",
						CubeListBuilder.create().texOffs(104, 100).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone23 = bone22
				.addOrReplaceChild("bone23",
						CubeListBuilder.create().texOffs(0, 105).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone24 = bone23
				.addOrReplaceChild("bone24",
						CubeListBuilder.create().texOffs(110, 51).addBox(-3.0F, -0.2F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Strate4 = Strates.addOrReplaceChild("Strate4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.9061F, 0.0F, -2.8252F, 0.0F, 1.3526F, 0.0F));

		PartDefinition bone10 = Strate4
				.addOrReplaceChild("bone10",
						CubeListBuilder.create().texOffs(104, 100).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone11 = bone10
				.addOrReplaceChild("bone11",
						CubeListBuilder.create().texOffs(0, 105).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone12 = bone11
				.addOrReplaceChild("bone12",
						CubeListBuilder.create().texOffs(110, 51).addBox(-3.0F, -0.2F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Strate6 = Strates.addOrReplaceChild("Strate6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.9416F, 0.0F, 2.4402F, -3.1416F, -1.309F, 3.1416F));

		PartDefinition bone16 = Strate6
				.addOrReplaceChild("bone16",
						CubeListBuilder.create().texOffs(104, 100).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone17 = bone16
				.addOrReplaceChild("bone17",
						CubeListBuilder.create().texOffs(0, 105).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone18 = bone17
				.addOrReplaceChild("bone18",
						CubeListBuilder.create().texOffs(110, 51).addBox(-3.0F, -0.2F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Strate5 = Strates.addOrReplaceChild("Strate5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.9061F, 0.0F, 2.4402F, -3.1416F, 1.3526F, 3.1416F));

		PartDefinition bone13 = Strate5
				.addOrReplaceChild("bone13",
						CubeListBuilder.create().texOffs(104, 100).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone14 = bone13
				.addOrReplaceChild("bone14",
						CubeListBuilder.create().texOffs(0, 105).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone15 = bone14
				.addOrReplaceChild("bone15",
						CubeListBuilder.create().texOffs(110, 51).addBox(-3.0F, -0.2F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Strate7 = Strates.addOrReplaceChild("Strate7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.9416F, 0.0F, -2.5752F, 0.0F, -1.3526F, 0.0F));

		PartDefinition bone19 = Strate7
				.addOrReplaceChild("bone19",
						CubeListBuilder.create().texOffs(104, 100).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone20 = bone19
				.addOrReplaceChild("bone20",
						CubeListBuilder.create().texOffs(0, 105).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone21 = bone20
				.addOrReplaceChild("bone21",
						CubeListBuilder.create().texOffs(110, 51).addBox(-3.0F, -0.2F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Strate3 = Strates.addOrReplaceChild("Strate3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.0196F, 0.0F, -3.5359F, 0.0F, 0.5672F, 0.0F));

		PartDefinition bone7 = Strate3
				.addOrReplaceChild("bone7",
						CubeListBuilder.create().texOffs(104, 100).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone8 = bone7
				.addOrReplaceChild("bone8",
						CubeListBuilder.create().texOffs(0, 105).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone9 = bone8
				.addOrReplaceChild("bone9",
						CubeListBuilder.create().texOffs(110, 51).addBox(-3.0F, -0.2F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Strate10 = Strates.addOrReplaceChild("Strate10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.9804F, 0.0F, 3.9641F, -3.1416F, -0.5672F, 3.1416F));

		PartDefinition bone28 = Strate10
				.addOrReplaceChild("bone28",
						CubeListBuilder.create().texOffs(104, 100).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone29 = bone28
				.addOrReplaceChild("bone29",
						CubeListBuilder.create().texOffs(0, 105).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone30 = bone29
				.addOrReplaceChild("bone30",
						CubeListBuilder.create().texOffs(110, 51).addBox(-3.0F, -0.2F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Strate2 = Strates.addOrReplaceChild("Strate2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.3413F, 0.0F, -3.7616F, 0.0F, -0.6109F, 0.0F));

		PartDefinition bone4 = Strate2
				.addOrReplaceChild("bone4",
						CubeListBuilder.create().texOffs(104, 100).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone5 = bone4
				.addOrReplaceChild("bone5",
						CubeListBuilder.create().texOffs(0, 105).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone6 = bone5
				.addOrReplaceChild("bone6",
						CubeListBuilder.create().texOffs(110, 51).addBox(-3.0F, -0.2F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Strate9 = Strates.addOrReplaceChild("Strate9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.4087F, 0.0F, 3.7384F, -3.1416F, 0.6109F, 3.1416F));

		PartDefinition bone25 = Strate9
				.addOrReplaceChild("bone25",
						CubeListBuilder.create().texOffs(104, 100).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone26 = bone25
				.addOrReplaceChild("bone26",
						CubeListBuilder.create().texOffs(0, 105).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone27 = bone26
				.addOrReplaceChild("bone27",
						CubeListBuilder.create().texOffs(110, 51).addBox(-3.0F, -0.2F, -0.5F, 6.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LowerBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}