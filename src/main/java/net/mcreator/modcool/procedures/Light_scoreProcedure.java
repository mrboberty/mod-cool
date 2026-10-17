package net.mcreator.modcool.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.modcool.network.ModCoolModVariables;

public class Light_scoreProcedure {
	public static void execute(LevelAccessor world) {
		if (ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score == 0) {
			ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score = 2;
			ModCoolModVariables.MapVariables.get(world).markSyncDirty();
		} else if (ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score == 1) {
			ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score = 3;
			ModCoolModVariables.MapVariables.get(world).markSyncDirty();
		}
	}
}