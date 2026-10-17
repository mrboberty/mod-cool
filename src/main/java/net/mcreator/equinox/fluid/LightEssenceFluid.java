package net.mcreator.equinox.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.equinox.init.EquinoxModItems;
import net.mcreator.equinox.init.EquinoxModFluids;
import net.mcreator.equinox.init.EquinoxModFluidTypes;
import net.mcreator.equinox.init.EquinoxModBlocks;

public abstract class LightEssenceFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> EquinoxModFluidTypes.LIGHT_ESSENCE_TYPE.get(), () -> EquinoxModFluids.LIGHT_ESSENCE.get(), () -> EquinoxModFluids.FLOWING_LIGHT_ESSENCE.get())
			.explosionResistance(100f).tickRate(7).bucket(() -> EquinoxModItems.LIGHT_ESSENCE_BUCKET.get()).block(() -> (LiquidBlock) EquinoxModBlocks.LIGHT_ESSENCE.get());

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