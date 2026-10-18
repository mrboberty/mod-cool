package net.mcreator.modcool.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class LightEssenceBlock extends LiquidBlock {
	public LightEssenceBlock() {
		super(ModCoolModFluids.LIGHT_ESSENCE.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}