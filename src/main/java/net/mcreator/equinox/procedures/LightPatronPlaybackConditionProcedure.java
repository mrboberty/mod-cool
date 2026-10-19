package net.mcreator.equinox.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.equinox.entity.LightPatronEntity;

public class LightPatronPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof LightPatronEntity _datEntI ? _datEntI.getEntityData().get(LightPatronEntity.DATA_attack_timer) : 0) < 2;
	}
}