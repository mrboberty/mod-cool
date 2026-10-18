package net.mcreator.equinox.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class DryGroundBlock extends Block {
	public DryGroundBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.DRIPSTONE_BLOCK).strength(1.5f, 6f).requiresCorrectToolForDrops());
	}
}