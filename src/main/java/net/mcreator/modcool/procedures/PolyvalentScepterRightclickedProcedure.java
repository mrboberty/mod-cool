package net.mcreator.modcool.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;

import net.mcreator.modcool.init.ModCoolModItems;

public class PolyvalentScepterRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("state") == 0) {
				if (hasEntityInInventory(entity, new ItemStack(ModCoolModItems.SHADOWSAMPLE.get()))) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ModCoolModItems.SHADOWSAMPLE.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					{
						final String _tagName = "state";
						final double _tagValue = 1;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (hasEntityInInventory(entity, new ItemStack(ModCoolModItems.LIGHT_SAMPLE.get()))) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ModCoolModItems.LIGHT_SAMPLE.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					{
						final String _tagName = "state";
						final double _tagValue = 2;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("state") == 1) {
				if (hasEntityInInventory(entity, new ItemStack(ModCoolModItems.LIGHT_SAMPLE.get()))) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ModCoolModItems.LIGHT_SAMPLE.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ModCoolModItems.SHADOWSAMPLE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					{
						final String _tagName = "state";
						final double _tagValue = 2;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ModCoolModItems.SHADOWSAMPLE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					{
						final String _tagName = "state";
						final double _tagValue = 0;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("state") == 2) {
				if (hasEntityInInventory(entity, new ItemStack(ModCoolModItems.SHADOWSAMPLE.get()))) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ModCoolModItems.SHADOWSAMPLE.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ModCoolModItems.LIGHT_SAMPLE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					{
						final String _tagName = "state";
						final double _tagValue = 1;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ModCoolModItems.LIGHT_SAMPLE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					{
						final String _tagName = "state";
						final double _tagValue = 0;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
				}
			}
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}
}