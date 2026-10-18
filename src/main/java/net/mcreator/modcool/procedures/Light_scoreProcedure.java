package net.mcreator.modcool.procedures;

import net.neoforged.bus.api.Event;

public class Light_scoreProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(ModCoolModVariables.PLAYER_VARIABLES).Polyvalent_Scepter_Score == 0) {
			{
				ModCoolModVariables.PlayerVariables _vars = entity.getData(ModCoolModVariables.PLAYER_VARIABLES);
				_vars.Polyvalent_Scepter_Score = 2;
				_vars.markSyncDirty();
			}
		} else if (entity.getData(ModCoolModVariables.PLAYER_VARIABLES).Polyvalent_Scepter_Score == 1) {
			{
				ModCoolModVariables.PlayerVariables _vars = entity.getData(ModCoolModVariables.PLAYER_VARIABLES);
				_vars.Polyvalent_Scepter_Score = 3;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(ModCoolModItems.LIGHT_SAMPLE.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}