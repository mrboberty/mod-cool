package net.mcreator.modcool.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.modcool.procedures.Shadow_scoreProcedure;

public class ShadowsampleItem extends Item {
	public ShadowsampleItem() {
		super(new Item.Properties().rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		Shadow_scoreProcedure.execute(entity);
		return ar;
	}
}