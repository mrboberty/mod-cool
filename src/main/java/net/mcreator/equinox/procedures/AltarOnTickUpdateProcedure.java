package net.mcreator.equinox.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.equinox.init.EquinoxModItems;

public class AltarOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			var photon = new com.lowdragmc.photon.command.BlockEffectCommand();
			photon.setLocation(net.minecraft.resources.ResourceLocation.parse("photon:altar_idle"));
			photon.setPos(new net.minecraft.core.BlockPos((int) x, (int) y, (int) z));
			net.neoforged.neoforge.network.PacketDistributor.sendToAllPlayers(photon);
		}
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).getLightEmission(world, BlockPos.containing(x, y + 1, z)) == 15) {
			if (Math.random() < 0.005) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EquinoxModItems.LIGHT_PELLET.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (world.getBlockState(BlockPos.containing(x, y + 1, z)).getLightEmission(world, BlockPos.containing(x, y + 1, z)) == 0) {
			if (Math.random() < 0.005) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EquinoxModItems.DARKNESS_PELLET.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}