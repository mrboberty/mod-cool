/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.equinox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.equinox.item.TheRealmItem;
import net.mcreator.equinox.item.PolyvalentScepterItem;
import net.mcreator.equinox.item.LightPelletItem;
import net.mcreator.equinox.item.LightEssenceItem;
import net.mcreator.equinox.item.DarknessPelletItem;
import net.mcreator.equinox.EquinoxMod;

@EventBusSubscriber
public class EquinoxModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(EquinoxMod.MODID);
	public static final DeferredItem<Item> LIGHT_GRASS;
	public static final DeferredItem<Item> LIGHT_GROUND;
	public static final DeferredItem<Item> THE_REALM;
	public static final DeferredItem<Item> LIGHT_ESSENCE_BUCKET;
	public static final DeferredItem<Item> FRACTURED_LOG;
	public static final DeferredItem<Item> POLYVALENT_SCEPTER;
	public static final DeferredItem<Item> LIGHT_PELLET;
	public static final DeferredItem<Item> DARKNESS_PELLET;
	static {
		LIGHT_GRASS = block(EquinoxModBlocks.LIGHT_GRASS);
		LIGHT_GROUND = block(EquinoxModBlocks.LIGHT_GROUND);
		THE_REALM = REGISTRY.register("the_realm", TheRealmItem::new);
		LIGHT_ESSENCE_BUCKET = REGISTRY.register("light_essence_bucket", LightEssenceItem::new);
		FRACTURED_LOG = block(EquinoxModBlocks.FRACTURED_LOG);
		POLYVALENT_SCEPTER = REGISTRY.register("polyvalent_scepter", PolyvalentScepterItem::new);
		LIGHT_PELLET = REGISTRY.register("light_pellet", LightPelletItem::new);
		DARKNESS_PELLET = REGISTRY.register("darkness_pellet", DarknessPelletItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), LIGHT_ESSENCE_BUCKET.get());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}