package net.mcreator.modcool.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class DetecteechantillonProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(ModCoolModVariables.PLAYER_VARIABLES).Polyvalent_Scepter_Score == 1) {
			{
				ModCoolModVariables.PlayerVariables _vars = entity.getData(ModCoolModVariables.PLAYER_VARIABLES);
				_vars.Polyvalent_Scepter_A_B = 1;
				_vars.markSyncDirty();
			}
		} else if (entity.getData(ModCoolModVariables.PLAYER_VARIABLES).Polyvalent_Scepter_Score == 2 || entity.getData(ModCoolModVariables.PLAYER_VARIABLES).Polyvalent_Scepter_Score == 3) {
			{
				ModCoolModVariables.PlayerVariables _vars = entity.getData(ModCoolModVariables.PLAYER_VARIABLES);
				_vars.Polyvalent_Scepter_A_B = 2;
				_vars.markSyncDirty();
			}
		}
	}
}