package net.mcreator.modcool.procedures;

import net.neoforged.bus.api.Event;

public class Light_scoreProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score == 0) {
			ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score = 2;
			ModCoolModVariables.MapVariables.get(world).markSyncDirty();
		} else if (ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score == 1) {
			ModCoolModVariables.MapVariables.get(world).Polyvalent_Scepter_Score = 3;
			ModCoolModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(ModCoolModItems.LIGHT_SAMPLE.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}