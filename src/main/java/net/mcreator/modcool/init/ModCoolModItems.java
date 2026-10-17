/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modcool.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.modcool.item.ShadowsampleItem;
import net.mcreator.modcool.item.PolyvalentScepterItem;
import net.mcreator.modcool.item.LightSampleItem;
import net.mcreator.modcool.ModCoolMod;

public class ModCoolModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ModCoolMod.MODID);
	public static final DeferredItem<Item> LIGHT_GRASS;
	public static final DeferredItem<Item> LIGHT_GROUND;
	public static final DeferredItem<Item> SHADOWSAMPLE;
	public static final DeferredItem<Item> LIGHT_SAMPLE;
	public static final DeferredItem<Item> POLYVALENT_SCEPTER;
	static {
		LIGHT_GRASS = block(ModCoolModBlocks.LIGHT_GRASS);
		LIGHT_GROUND = block(ModCoolModBlocks.LIGHT_GROUND);
		SHADOWSAMPLE = REGISTRY.register("shadowsample", ShadowsampleItem::new);
		LIGHT_SAMPLE = REGISTRY.register("light_sample", LightSampleItem::new);
		POLYVALENT_SCEPTER = REGISTRY.register("polyvalent_scepter", PolyvalentScepterItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}