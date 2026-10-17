package net.mcreator.modcool.client.renderer.item;

import org.checkerframework.checker.units.qual.s;

import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.component.DataComponents;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.modcool.procedures.PolyvalentScepterPlaybackConditionProcedure;
import net.mcreator.modcool.procedures.PolyvalentScepterLightPlaybackConditionProcedure;
import net.mcreator.modcool.procedures.PolyvalentScepterDarkPlaybackConditionProcedure;
import net.mcreator.modcool.init.ModCoolModItems;
import net.mcreator.modcool.client.model.animations.PolyvalentScepterAnimation;
import net.mcreator.modcool.client.model.ModelPolyvalentScepter;
import net.mcreator.modcool.client.ItemArms;

import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.WeakHashMap;
import java.util.Map;
import java.util.HashMap;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

@OnlyIn(Dist.CLIENT)
public class PolyvalentScepterItemRenderer extends BlockEntityWithoutLevelRenderer {
	private final EntityModelSet entityModelSet;
	private final ItemStack transformSource;
	private final Map<Integer, EntityModel<?>> models = new HashMap<>();
	private final long start;
	private final ResourceLocation DEFAULT_TEXTURE = ResourceLocation.parse("mod_cool:textures/item/scepter_texture.png");

	public PolyvalentScepterItemRenderer(BlockEntityRenderDispatcher blockEntityRenderDispatcher, EntityModelSet entityModelSet) {
		super(blockEntityRenderDispatcher, entityModelSet);
		this.entityModelSet = entityModelSet;
		this.transformSource = new ItemStack(ModCoolModItems.POLYVALENT_SCEPTER.get());
		this.start = System.currentTimeMillis();
		this.models.put(0, new AnimatedModel(this.entityModelSet.bakeLayer(ModelPolyvalentScepter.LAYER_LOCATION)));
	}

	@Override
	public void renderByItem(ItemStack itemstack, ItemDisplayContext displayContext, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
		updateRenderState(itemstack);
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
		if (model instanceof AnimatedModel animatedModel)
			animatedModel.setupItemStackAnim(itemstack, (System.currentTimeMillis() - start) / 50.0f);
		else {
			model.setupAnim(null, 0, 0, (System.currentTimeMillis() - start) / 50.0f, 0, 0);
		}
		boolean isFirstPerson = displayContext == ItemDisplayContext.FIRST_PERSON_LEFT_HAND || displayContext == ItemDisplayContext.FIRST_PERSON_RIGHT_HAND;
		boolean isThirdPerson = displayContext == ItemDisplayContext.THIRD_PERSON_LEFT_HAND || displayContext == ItemDisplayContext.THIRD_PERSON_RIGHT_HAND;
		try {
			if (model instanceof AnimatedModel animatedModel && isFirstPerson && Minecraft.getInstance().player != null && (animatedModel.animator.root().getChild("left_arm") != null || animatedModel.animator.root().getChild("right_arm") != null)) {
				AbstractClientPlayer player = Minecraft.getInstance().player;
				PlayerRenderer playerRenderer = (PlayerRenderer) Minecraft.getInstance().getEntityRenderDispatcher().getRenderer(player);
				PlayerModel<?> playerModel = playerRenderer.getModel();
				ResourceLocation skinTexture = player.getSkin().texture();
				ItemArms.renderPartWithArms(animatedModel.animator, poseStack, vertexConsumer, bufferSource, packedLight, packedOverlay, playerModel, skinTexture, player.isInvisible());
			} else {
				model.renderToBuffer(poseStack, vertexConsumer, packedLight, packedOverlay);
			}
		} catch (Exception ignored) {
		}
		poseStack.popPose();
	}

	private static boolean isLeftHand(ItemDisplayContext type) {
		return type == ItemDisplayContext.FIRST_PERSON_LEFT_HAND || type == ItemDisplayContext.THIRD_PERSON_LEFT_HAND;
	}

	private static boolean isInventory(ItemDisplayContext type) {
		return type == ItemDisplayContext.GUI || type == ItemDisplayContext.FIXED;
	}

	private static final Map<ItemStack, Map<Integer, AnimationState>> CACHE = new WeakHashMap<>();

	private static Map<Integer, AnimationState> getAnimationState(ItemStack stack) {
		return CACHE.computeIfAbsent(stack, s -> IntStream.range(0, 3).boxed().collect(Collectors.toMap(i -> i, i -> new AnimationState(), (a, b) -> b)));
	}

	private void updateRenderState(ItemStack itemstack) {
		int tickCount = (int) (System.currentTimeMillis() - start) / 50;
		updateAnimation(itemstack, tickCount);
		getAnimationState(itemstack).get(0).animateWhen(PolyvalentScepterPlaybackConditionProcedure.execute(itemstack), tickCount);
		getAnimationState(itemstack).get(1).animateWhen(PolyvalentScepterDarkPlaybackConditionProcedure.execute(itemstack), tickCount);
		getAnimationState(itemstack).get(2).animateWhen(PolyvalentScepterLightPlaybackConditionProcedure.execute(itemstack), tickCount);
	}

	private void updateAnimation(ItemStack itemstack, int tickCount) {
		CompoundTag data = itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
		int oldAnim = data.getInt("oldAnimState");
		int newAnim = data.getInt("animState");
		if (oldAnim != newAnim) {
			switch (newAnim) {
				case -1 :
					getAnimationState(itemstack).get(0).stop();
					break;
				case -2 :
					getAnimationState(itemstack).get(1).stop();
					break;
				case -3 :
					getAnimationState(itemstack).get(2).stop();
					break;
				case 0 :
					getAnimationState(itemstack).get(0).start(tickCount);
					break;
				case 1 :
					getAnimationState(itemstack).get(1).start(tickCount);
					break;
				case 2 :
					getAnimationState(itemstack).get(2).start(tickCount);
					break;
			}
			CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putInt("oldAnimState", newAnim));
		}
	}

	private static boolean init = false;

	@SubscribeEvent
	public static void resetItems(ClientTickEvent.Pre event) {
		if (Minecraft.getInstance().player != null && !CACHE.isEmpty() && !init) {
			for (Map.Entry<ItemStack, Map<Integer, AnimationState>> entry : CACHE.entrySet()) {
				ItemStack itemstack = entry.getKey();
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putInt("oldAnimState", itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getInt("animState")));
				for (int i = 0; i < 3; i++) {
					getAnimationState(itemstack).get(i).stop();
				}
				init = true;
			}
		}
	}

	@SubscribeEvent
	public static void logOut(ClientPlayerNetworkEvent.LoggingOut event) {
		init = false;
	}

	public void resetAnimations(EntityModel model) {
		if (model instanceof AnimatedModel animated)
			animated.animator.root().getAllParts().forEach(ModelPart::resetPose);
	}

	private final class AnimatedModel extends ModelPolyvalentScepter {
		private final ModelPart root;
		public final BlockEntityHierarchicalModel animator = new BlockEntityHierarchicalModel();

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		public void setupItemStackAnim(ItemStack itemstack, float ageInTicks) {
			animator.setupItemStackAnim(itemstack, ageInTicks);
			super.setupAnim(null, 0, 0, ageInTicks, 0, 0);
		}

		private class BlockEntityHierarchicalModel extends HierarchicalModel<Entity> {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			}

			public void setupItemStackAnim(ItemStack itemstack, float ageInTicks) {
				animator.root().getAllParts().forEach(ModelPart::resetPose);
				animator.animate(getAnimationState(itemstack).get(0), PolyvalentScepterAnimation.idle_none, ageInTicks, 1f);
				animator.animate(getAnimationState(itemstack).get(1), PolyvalentScepterAnimation.idle_dark, ageInTicks, 1f);
				animator.animate(getAnimationState(itemstack).get(2), PolyvalentScepterAnimation.idle_light, ageInTicks, 1f);
			}
		}
	}
}