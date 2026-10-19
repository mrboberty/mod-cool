package net.mcreator.equinox.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.equinox.entity.FlorevoreEntity;
import net.mcreator.equinox.client.model.animations.FlorevoreAnimation;
import net.mcreator.equinox.client.model.ModelFlorevore;

import com.mojang.blaze3d.vertex.PoseStack;

public class FlorevoreRenderer extends MobRenderer<FlorevoreEntity, ModelFlorevore<FlorevoreEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("equinox:textures/entities/florevore_texture.png");

	public FlorevoreRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelFlorevore.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(FlorevoreEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlorevoreEntity entity) {
		if (entity.getTexture() != "florevore_texture")
			return ResourceLocation.parse("equinox:textures/entities/" + entity.getTexture() + ".png");
		return entityTexture;
	}

	private static final class AnimatedModel extends ModelFlorevore<FlorevoreEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<FlorevoreEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(FlorevoreEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, FlorevoreAnimation.idle, ageInTicks, 1f);
				this.animate(entity.animationState1, FlorevoreAnimation.walk, ageInTicks, 1f);
				this.animate(entity.animationState2, FlorevoreAnimation.attack, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(FlorevoreEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}