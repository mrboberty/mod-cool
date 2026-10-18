package net.mcreator.modcool.item;

import net.minecraft.network.chat.Component;

public class LightEssenceItem extends BucketItem {

	public LightEssenceItem() {
		super(ModCoolModFluids.LIGHT_ESSENCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}

}