package net.mcreator.modcool.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.modcool.init.ModCoolModItems;
import net.mcreator.modcool.init.ModCoolModFluids;
import net.mcreator.modcool.init.ModCoolModFluidTypes;
import net.mcreator.modcool.init.ModCoolModBlocks;

public abstract class LightEssenceFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> ModCoolModFluidTypes.LIGHT_ESSENCE_TYPE.get(), () -> ModCoolModFluids.LIGHT_ESSENCE.get(), () -> ModCoolModFluids.FLOWING_LIGHT_ESSENCE.get())
			.explosionResistance(100f).tickRate(7).bucket(() -> ModCoolModItems.LIGHT_ESSENCE_BUCKET.get()).block(() -> (LiquidBlock) ModCoolModBlocks.LIGHT_ESSENCE.get());

	private LightEssenceFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LightEssenceFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LightEssenceFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}