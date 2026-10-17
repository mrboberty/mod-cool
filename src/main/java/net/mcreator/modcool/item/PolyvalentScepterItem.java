package net.mcreator.modcool.item;

public class PolyvalentScepterItem extends Item {
	public PolyvalentScepterItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		Lancement_des_echantiollonProcedure.execute();
		return ar;
	}
}