/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.equinox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.equinox.block.*;
import net.mcreator.equinox.EquinoxMod;

public class EquinoxModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(EquinoxMod.MODID);
	public static final DeferredBlock<Block> LIGHT_GRASS;
	public static final DeferredBlock<Block> LIGHT_GROUND;
	public static final DeferredBlock<Block> THE_REALM_PORTAL;
	public static final DeferredBlock<Block> LIGHT_ESSENCE;
	public static final DeferredBlock<Block> FRACTURED_LOG;
	public static final DeferredBlock<Block> DENSE_LEAVES;
	public static final DeferredBlock<Block> DRY_GRASS;
	public static final DeferredBlock<Block> DRY_GROUND;
	public static final DeferredBlock<Block> WIGGLY_LIGHT_GRASS;
	public static final DeferredBlock<Block> STAR_FLOWER;
	public static final DeferredBlock<Block> ALTAR;
	static {
		LIGHT_GRASS = REGISTRY.register("light_grass", LightGrassBlock::new);
		LIGHT_GROUND = REGISTRY.register("light_ground", LightGroundBlock::new);
		THE_REALM_PORTAL = REGISTRY.register("the_realm_portal", TheRealmPortalBlock::new);
		LIGHT_ESSENCE = REGISTRY.register("light_essence", LightEssenceBlock::new);
		FRACTURED_LOG = REGISTRY.register("fractured_log", FracturedLogBlock::new);
		DENSE_LEAVES = REGISTRY.register("dense_leaves", DenseLeavesBlock::new);
		DRY_GRASS = REGISTRY.register("dry_grass", DryGrassBlock::new);
		DRY_GROUND = REGISTRY.register("dry_ground", DryGroundBlock::new);
		WIGGLY_LIGHT_GRASS = REGISTRY.register("wiggly_light_grass", WigglyLightGrassBlock::new);
		STAR_FLOWER = REGISTRY.register("star_flower", StarFlowerBlock::new);
		ALTAR = REGISTRY.register("altar", AltarBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}