package net.mcreator.modcool.item;

@EventBusSubscriber
public class PolyvalentScepterItem extends Item {
	public PolyvalentScepterItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@SubscribeEvent
	public static void registerClientExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			private PolyvalentScepterItemRenderer rendererInstance;

			@Override
			public BlockEntityWithoutLevelRenderer getCustomRenderer() {
				if (rendererInstance == null)
					rendererInstance = new PolyvalentScepterItemRenderer(Minecraft.getInstance().getBlockEntityRenderDispatcher(), Minecraft.getInstance().getEntityModels());
				return rendererInstance;
			}
		}, ModCoolModItems.POLYVALENT_SCEPTER.get());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		Lancement_des_echantiollonProcedure.execute();
		return ar;
	}
}