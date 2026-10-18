/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.equinox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.equinox.EquinoxMod;

public class EquinoxModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, EquinoxMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> DARKNESS_SHOOT = REGISTRY.register("darkness_shoot", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("equinox", "darkness_shoot")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHT_SHOOT = REGISTRY.register("light_shoot", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("equinox", "light_shoot")));
}