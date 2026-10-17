package net.mcreator.modcool.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class LightGrassBlock extends Block {
	public LightGrassBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WET_GRASS).strength(0.6f));
	}
}