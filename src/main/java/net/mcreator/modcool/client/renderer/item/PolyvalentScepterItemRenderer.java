package net.mcreator.modcool.client.renderer.item;

@OnlyIn(Dist.CLIENT)
public class PolyvalentScepterItemRenderer extends BlockEntityWithoutLevelRenderer {
	private final EntityModelSet entityModelSet;
	private final ItemStack transformSource;
	private final Map<Integer, EntityModel<?>> models = new HashMap<>();
	private final long start;
	private final ResourceLocation DEFAULT_TEXTURE = ResourceLocation.parse("minecraft:textures/item/breeze_rod.png");

	public PolyvalentScepterItemRenderer(BlockEntityRenderDispatcher blockEntityRenderDispatcher, EntityModelSet entityModelSet) {
		super(blockEntityRenderDispatcher, entityModelSet);
		this.entityModelSet = entityModelSet;
		this.transformSource = new ItemStack(ModCoolModItems.POLYVALENT_SCEPTER.get());
		this.start = System.currentTimeMillis();
		this.models.put(0, new ModelPolyvalentScepter(this.entityModelSet.bakeLayer(ModelPolyvalentScepter.LAYER_LOCATION)));
	}

	@Override
	public void renderByItem(ItemStack itemstack, ItemDisplayContext displayContext, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
		EntityModel<?> model = this.models.get(0);
		ResourceLocation texture = DEFAULT_TEXTURE;
		if (model == null)
			return;
		poseStack.pushPose();
		poseStack.translate(0.5, displayContext == ItemDisplayContext.GUI ? 1.525 : displayContext == ItemDisplayContext.GROUND ? 2.0 : 1.5, 0.45);
		poseStack.scale(1, -1, displayContext == ItemDisplayContext.GUI ? -1 : 1);
		poseStack.mulPose(Axis.YP.rotationDegrees(displayContext == ItemDisplayContext.GUI ? 180f : 0));
		poseStack.scale(-1, 1, 1);
		VertexConsumer vertexConsumer = ItemRenderer.getFoilBufferDirect(bufferSource, model.renderType(texture), false, itemstack.hasFoil());
		model.setupAnim(null, 0, 0, (System.currentTimeMillis() - start) / 50.0f, 0, 0);
		model.renderToBuffer(poseStack, vertexConsumer, packedLight, packedOverlay);
		poseStack.popPose();
	}

	private static boolean isLeftHand(ItemDisplayContext type) {
		return type == ItemDisplayContext.FIRST_PERSON_LEFT_HAND || type == ItemDisplayContext.THIRD_PERSON_LEFT_HAND;
	}

	private static boolean isInventory(ItemDisplayContext type) {
		return type == ItemDisplayContext.GUI || type == ItemDisplayContext.FIXED;
	}
}