/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modcool.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.modcool.item.TestttttItem;
import net.mcreator.modcool.item.PlinnitemItem;
import net.mcreator.modcool.item.Plinnitem2Item;
import net.mcreator.modcool.ModCoolMod;

public class ModCoolModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ModCoolMod.MODID);
	public static final DeferredItem<Item> TESTTTTT;
	public static final DeferredItem<Item> PLINNITEM;
	public static final DeferredItem<Item> PLINNITEM_2;
	static {
		TESTTTTT = REGISTRY.register("testtttt", TestttttItem::new);
		PLINNITEM = REGISTRY.register("plinnitem", PlinnitemItem::new);
		PLINNITEM_2 = REGISTRY.register("plinnitem_2", Plinnitem2Item::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}