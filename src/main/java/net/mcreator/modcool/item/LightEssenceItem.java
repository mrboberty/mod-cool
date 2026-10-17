package net.mcreator.modcool.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.modcool.init.ModCoolModFluids;

public class LightEssenceItem extends BucketItem {
	public LightEssenceItem() {
		super(ModCoolModFluids.LIGHT_ESSENCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}