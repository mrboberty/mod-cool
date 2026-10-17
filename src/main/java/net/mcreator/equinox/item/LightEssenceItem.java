package net.mcreator.equinox.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.equinox.init.EquinoxModFluids;

public class LightEssenceItem extends BucketItem {
	public LightEssenceItem() {
		super(EquinoxModFluids.LIGHT_ESSENCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}