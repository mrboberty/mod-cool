package net.mcreator.modcool.item;

public class LightSampleItem extends Item {
	public LightSampleItem() {
		super(new Item.Properties().rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		Light_scoreProcedure.execute(world, entity);
		return ar;
	}
}