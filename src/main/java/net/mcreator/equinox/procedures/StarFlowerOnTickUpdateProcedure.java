package net.mcreator.equinox.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import java.util.Comparator;

public class StarFlowerOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			var photon = new com.lowdragmc.photon.command.BlockEffectCommand();
			photon.setLocation(net.minecraft.resources.ResourceLocation.parse("photon:light_explosion"));
			photon.setPos(new net.minecraft.core.BlockPos((int) x, (int) y, (int) z));
			net.neoforged.neoforge.network.PacketDistributor.sendToAllPlayers(photon);
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				entityiterator.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("equinox:exposure")))), 3);
			}
		}
	}
}