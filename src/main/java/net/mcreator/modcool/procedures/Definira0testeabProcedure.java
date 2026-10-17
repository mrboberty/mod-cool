package net.mcreator.modcool.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.modcool.network.ModCoolModVariables;

public class Definira0testeabProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			ModCoolModVariables.PlayerVariables _vars = entity.getData(ModCoolModVariables.PLAYER_VARIABLES);
			_vars.Polyvalent_Scepter_A_B = 0;
			_vars.markSyncDirty();
		}
	}
}