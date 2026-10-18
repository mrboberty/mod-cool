/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.equinox.init;

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

import net.mcreator.equinox.EquinoxMod;

@EventBusSubscriber
public class EquinoxModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EquinoxMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EQUINOX = REGISTRY.register("equinox",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.equinox.equinox")).icon(() -> new ItemStack(EquinoxModBlocks.LIGHT_GRASS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EquinoxModBlocks.LIGHT_GRASS.get().asItem());
				tabData.accept(EquinoxModBlocks.LIGHT_GROUND.get().asItem());
				tabData.accept(EquinoxModBlocks.FRACTURED_LOG.get().asItem());
				tabData.accept(EquinoxModItems.POLYVALENT_SCEPTER.get());
				tabData.accept(EquinoxModItems.LIGHT_PELLET.get());
				tabData.accept(EquinoxModItems.DARKNESS_PELLET.get());
				tabData.accept(EquinoxModItems.THE_REALM.get());
				tabData.accept(EquinoxModItems.LIGHT_ESSENCE_BUCKET.get());
				tabData.accept(EquinoxModBlocks.DENSE_LEAVES.get().asItem());
				tabData.accept(EquinoxModBlocks.DRY_GRASS.get().asItem());
				tabData.accept(EquinoxModBlocks.DRY_GROUND.get().asItem());
				tabData.accept(EquinoxModBlocks.WIGGLY_LIGHT_GRASS.get().asItem());
				tabData.accept(EquinoxModBlocks.STAR_FLOWER.get().asItem());
				tabData.accept(EquinoxModItems.SUNKISSER_SPAWN_EGG.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(EquinoxModItems.POLYVALENT_SCEPTER.get());
		}
	}
}