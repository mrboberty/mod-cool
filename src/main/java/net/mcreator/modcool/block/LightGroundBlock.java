package net.mcreator.modcool.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class LightGroundBlock extends Block {
	public LightGroundBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(0.5f));
	}
}