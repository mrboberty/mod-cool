package net.mcreator.equinox.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.equinox.entity.SunkisserEntity;
import net.mcreator.equinox.entity.LightPatronEntity;
import net.mcreator.equinox.entity.FlorevoreEntity;

public class DarkProjectileProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (entity instanceof SunkisserEntity || entity instanceof FlorevoreEntity || entity instanceof LightPatronEntity) {
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 15);
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
			if (!world.isClientSide()) {
				var photon = new com.lowdragmc.photon.command.BlockEffectCommand();
				photon.setLocation(net.minecraft.resources.ResourceLocation.parse("photon:dark_explosion"));
				photon.setPos(new net.minecraft.core.BlockPos((int) x, (int) y, (int) z));
				net.neoforged.neoforge.network.PacketDistributor.sendToAllPlayers(photon);
			}
		}
	}
}