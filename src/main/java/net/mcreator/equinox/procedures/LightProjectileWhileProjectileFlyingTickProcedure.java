package net.mcreator.equinox.procedures;

import net.minecraft.world.entity.Entity;

public class LightProjectileWhileProjectileFlyingTickProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (immediatesourceentity.getPersistentData().getDouble("life_time") < 100) {
			immediatesourceentity.getPersistentData().putDouble("life_time", (immediatesourceentity.getPersistentData().getDouble("life_time") + 1));
		} else {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}