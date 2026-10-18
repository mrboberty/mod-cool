package net.mcreator.modcool.client.renderer;

import com.mojang.math.Axis;

public class LightProjectileRenderer extends EntityRenderer<LightProjectileEntity> {

	private static final ResourceLocation texture = ResourceLocation.parse("mod_cool:textures/entities/light_projectile_texture.png");

	private final Modellight_projectile model;

	public LightProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modellight_projectile(context.bakeLayer(Modellight_projectile.LAYER_LOCATION));
	}

	@Override
	public void render(LightProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.setupAnim(entityIn, 0, 0, entityIn.tickCount + partialTicks, entityIn.getYRot(), entityIn.getXRot());
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(LightProjectileEntity entity) {
		return texture;
	}

}