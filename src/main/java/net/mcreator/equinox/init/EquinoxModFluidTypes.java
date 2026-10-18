/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.equinox.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.modcool.fluid.types.LightEssenceFluidType;
import net.mcreator.equinox.EquinoxMod;

public class EquinoxModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, EquinoxMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> LIGHT_ESSENCE_TYPE = REGISTRY.register("light_essence", () -> new LightEssenceFluidType());
}