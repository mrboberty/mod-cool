/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.equinox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.equinox.fluid.LightEssenceFluid;
import net.mcreator.equinox.EquinoxMod;

public class EquinoxModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, EquinoxMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> LIGHT_ESSENCE = REGISTRY.register("light_essence", () -> new LightEssenceFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_LIGHT_ESSENCE = REGISTRY.register("flowing_light_essence", () -> new LightEssenceFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LIGHT_ESSENCE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIGHT_ESSENCE.get(), RenderType.translucent());
		}
	}
}