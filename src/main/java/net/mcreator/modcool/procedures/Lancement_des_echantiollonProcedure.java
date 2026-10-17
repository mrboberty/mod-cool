package net.mcreator.modcool.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.modcool.network.ModCoolModVariables;
import net.mcreator.modcool.ModCoolMod;

public class Lancement_des_echantiollonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(ModCoolModVariables.PLAYER_VARIABLES).Polyvalent_Scepter_A_B == 0) {
			ModCoolMod.LOGGER.info("aucun echantillon");
		} else if (entity.getData(ModCoolModVariables.PLAYER_VARIABLES).Polyvalent_Scepter_A_B == 1) {
			ModCoolMod.LOGGER.info("echantillon d'ombre");
		} else if (entity.getData(ModCoolModVariables.PLAYER_VARIABLES).Polyvalent_Scepter_A_B == 2) {
			ModCoolMod.LOGGER.info("echantillon de lumiere");
		}
	}
}