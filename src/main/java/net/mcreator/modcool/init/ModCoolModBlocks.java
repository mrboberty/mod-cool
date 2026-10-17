/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modcool.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.modcool.block.TheRealmPortalBlock;
import net.mcreator.modcool.ModCoolMod;

public class ModCoolModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ModCoolMod.MODID);
	public static final DeferredBlock<Block> THE_REALM_PORTAL;
	static {
		THE_REALM_PORTAL = REGISTRY.register("the_realm_portal", TheRealmPortalBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}