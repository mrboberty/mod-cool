package net.mcreator.equinox.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.equinox.entity.LightPatronEntity;
import net.mcreator.equinox.client.model.animations.LightPatronAnimation;
import net.mcreator.equinox.client.model.ModelLightPatron;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LightPatronRenderer extends MobRenderer<LightPatronEntity, ModelLightPatron<LightPatronEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("equinox:textures/entities/light_patron_texture.png");

	public LightPatronRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelLightPatron.LAYER_LOCATION)), 2f);
		this.addLayer(new RenderLayer<LightPatronEntity, ModelLightPatron<LightPatronEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("equinox:textures/entities/light_patron_texture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LightPatronEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
			}
		});
		this.addLayer(new RenderLayer<LightPatronEntity, ModelLightPatron<LightPatronEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("equinox:textures/entities/glowmap_patron.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LightPatronEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
			}
		});
	}

	@Override
	protected void scale(LightPatronEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(LightPatronEntity entity) {
		if (entity.getTexture() != "light_patron_texture")
			return ResourceLocation.parse("equinox:textures/entities/" + entity.getTexture() + ".png");
		return entityTexture;
	}

	private static final class AnimatedModel extends ModelLightPatron<LightPatronEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<LightPatronEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(LightPatronEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, LightPatronAnimation.Idle, ageInTicks, 1f);
				this.animate(entity.animationState1, LightPatronAnimation.summon, ageInTicks, 1f);
				this.animate(entity.animationState2, LightPatronAnimation.knockback, ageInTicks, 1f);
				this.animate(entity.animationState3, LightPatronAnimation.explode, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(LightPatronEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}