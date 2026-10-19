package net.mcreator.equinox.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class WalkAnimationConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return Math.abs(entity.getDeltaMovement().x()) + Math.abs(entity.getDeltaMovement().z()) > 0.000001 && !(entity instanceof LivingEntity _livEnt2 && _livEnt2.swinging);
	}
}