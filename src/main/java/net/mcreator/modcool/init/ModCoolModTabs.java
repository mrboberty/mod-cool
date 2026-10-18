/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modcool.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.modcool.ModCoolMod;

@EventBusSubscriber
public class ModCoolModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModCoolMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EQUINOX = REGISTRY.register("equinox",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mod_cool.equinox")).icon(() -> new ItemStack(ModCoolModBlocks.LIGHT_GRASS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ModCoolModItems.THE_REALM.get());
				tabData.accept(ModCoolModBlocks.LIGHT_GRASS.get().asItem());
				tabData.accept(ModCoolModBlocks.LIGHT_GROUND.get().asItem());
				tabData.accept(ModCoolModItems.LIGHT_ESSENCE_BUCKET.get());
				tabData.accept(ModCoolModItems.LIGHT_PELLET.get());
				tabData.accept(ModCoolModItems.DARKNESS_PELLET.get());
				tabData.accept(ModCoolModBlocks.FRACTURED_LOG.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ModCoolModItems.POLYVALENT_SCEPTER.get());
		}
	}
}