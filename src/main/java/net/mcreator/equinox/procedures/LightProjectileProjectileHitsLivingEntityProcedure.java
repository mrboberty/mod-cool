package net.mcreator.equinox.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.equinox.entity.SunkisserEntity;
import net.mcreator.equinox.entity.LightPatronEntity;
import net.mcreator.equinox.entity.FlorevoreEntity;

public class LightProjectileProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (entity instanceof SunkisserEntity || entity instanceof FlorevoreEntity || entity instanceof LightPatronEntity) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 15);
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}