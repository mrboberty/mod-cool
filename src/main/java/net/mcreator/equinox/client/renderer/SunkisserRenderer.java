package net.mcreator.equinox.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.equinox.entity.SunkisserEntity;
import net.mcreator.equinox.client.model.animations.SunkisserAnimation;
import net.mcreator.equinox.client.model.ModelSunkisser;

import com.mojang.blaze3d.vertex.PoseStack;

public class SunkisserRenderer extends MobRenderer<SunkisserEntity, ModelSunkisser<SunkisserEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("equinox:textures/entities/sunkisser_texture.png");

	public SunkisserRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelSunkisser.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(SunkisserEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(SunkisserEntity entity) {
		if (entity.getTexture() != "sunkisser_texture")
			return ResourceLocation.parse("equinox:textures/entities/" + entity.getTexture() + ".png");
		return entityTexture;
	}

	private static final class AnimatedModel extends ModelSunkisser<SunkisserEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<SunkisserEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(SunkisserEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, SunkisserAnimation.idle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(SunkisserEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}