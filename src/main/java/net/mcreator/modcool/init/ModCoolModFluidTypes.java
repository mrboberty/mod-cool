/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modcool.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.modcool.fluid.types.LightEssenceFluidType;
import net.mcreator.modcool.ModCoolMod;

public class ModCoolModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, ModCoolMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> LIGHT_ESSENCE_TYPE = REGISTRY.register("light_essence", () -> new LightEssenceFluidType());
}