package net.mcreator.equinox.procedures;

import net.minecraft.world.level.LevelAccessor;

public class DarkProjectileProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			var photon = new com.lowdragmc.photon.command.BlockEffectCommand();
			photon.setLocation(net.minecraft.resources.ResourceLocation.parse("photon:dark_explosion"));
			photon.setPos(new net.minecraft.core.BlockPos((int) x, (int) (y + 0.6), (int) z));
			net.neoforged.neoforge.network.PacketDistributor.sendToAllPlayers(photon);
		}
	}
}