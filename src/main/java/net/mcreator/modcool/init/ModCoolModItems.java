/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modcool.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.modcool.item.TheRealmItem;
import net.mcreator.modcool.ModCoolMod;

public class ModCoolModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ModCoolMod.MODID);
	public static final DeferredItem<Item> THE_REALM;
	static {
		THE_REALM = REGISTRY.register("the_realm", TheRealmItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}