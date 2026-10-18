package net.mcreator.modcool.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class LightGrassBlock extends Block {
	public LightGrassBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WET_GRASS).strength(0.6f));
	}
}