package net.mcreator.modcool.item;

public class ShadowsampleItem extends Item {
	public ShadowsampleItem() {
		super(new Item.Properties().rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		Shadow_scoreProcedure.execute(world);
		return ar;
	}
}