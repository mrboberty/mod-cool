package net.mcreator.modcool.procedures;

import net.neoforged.bus.api.Event;

public class DetecteechantillonProcedure {
	public static void execute(LevelAccessor world) {
		if (ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score == 1) {
		} else if (ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score == 2 || ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score == 3) {
		}
	}
}