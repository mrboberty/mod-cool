package net.mcreator.modcool.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.modcool.network.ModCoolModVariables;

public class DetecteechantillonProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score == 1) {
			{
				ModCoolModVariables.PlayerVariables _vars = entity.getData(ModCoolModVariables.PLAYER_VARIABLES);
				_vars.Polyvalent_Scepter_A_B = 1;
				_vars.markSyncDirty();
			}
		} else if (ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score == 2 || ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score == 3) {
			{
				ModCoolModVariables.PlayerVariables _vars = entity.getData(ModCoolModVariables.PLAYER_VARIABLES);
				_vars.Polyvalent_Scepter_A_B = 2;
				_vars.markSyncDirty();
			}
		}
	}
}