/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modcool.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.modcool.block.TheRealmPortalBlock;
import net.mcreator.modcool.block.LightGroundBlock;
import net.mcreator.modcool.block.LightGrassBlock;
import net.mcreator.modcool.block.LightEssenceBlock;
import net.mcreator.modcool.block.FracturedLogBlock;
import net.mcreator.modcool.ModCoolMod;

public class ModCoolModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ModCoolMod.MODID);
	public static final DeferredBlock<Block> LIGHT_GRASS;
	public static final DeferredBlock<Block> LIGHT_GROUND;
	public static final DeferredBlock<Block> THE_REALM_PORTAL;
	public static final DeferredBlock<Block> LIGHT_ESSENCE;
	public static final DeferredBlock<Block> FRACTURED_LOG;
	static {
		LIGHT_GRASS = REGISTRY.register("light_grass", LightGrassBlock::new);
		LIGHT_GROUND = REGISTRY.register("light_ground", LightGroundBlock::new);
		THE_REALM_PORTAL = REGISTRY.register("the_realm_portal", TheRealmPortalBlock::new);
		LIGHT_ESSENCE = REGISTRY.register("light_essence", LightEssenceBlock::new);
		FRACTURED_LOG = REGISTRY.register("fractured_log", FracturedLogBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}