package net.mcreator.modcool.procedures;

import net.neoforged.bus.api.Event;

public class Definira0Procedure {
	public static void execute(LevelAccessor world) {
		ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score = 0;
		ModCoolModVariables.MapVariables.get(world).markSyncDirty();
	}
}