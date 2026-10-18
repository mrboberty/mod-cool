package net.mcreator.modcool.item;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.modcool.procedures.Lancement_des_echantiollonProcedure;
import net.mcreator.modcool.init.ModCoolModItems;
import net.mcreator.modcool.client.renderer.item.PolyvalentScepterItemRenderer;

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
		Lancement_des_echantiollonProcedure.execute(entity);
		return ar;
	}
}