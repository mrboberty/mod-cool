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
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHT_SHOOT = REGISTRY.register("light_shoot", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("equinox", "light_shoot")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DARK_SHOOT = REGISTRY.register("dark_shoot", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("equinox", "dark_shoot")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHT_PATRON_SUMMON_RISE = REGISTRY.register("light_patron_summon_rise",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("equinox", "light_patron_summon_rise")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHT_PATRON_SUMMON_STAND = REGISTRY.register("light_patron_summon_stand",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("equinox", "light_patron_summon_stand")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHT_PATRON_SUMMON_HANDLE = REGISTRY.register("light_patron_summon_handle",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("equinox", "light_patron_summon_handle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHT_PATRON_AMBIENT = REGISTRY.register("light_patron_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("equinox", "light_patron_ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHT_PATRON_EXPULSE_AWAY = REGISTRY.register("light_patron_expulse_away",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("equinox", "light_patron_expulse_away")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHT_PATRON_EXPULSE_MIND = REGISTRY.register("light_patron_expulse_mind",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("equinox", "light_patron_expulse_mind")));
}