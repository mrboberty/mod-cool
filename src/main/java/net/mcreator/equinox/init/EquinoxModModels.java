/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.equinox.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.equinox.client.model.Modellight_projectile;
import net.mcreator.equinox.client.model.ModelSunkisser;
import net.mcreator.equinox.client.model.ModelLightPatron;
import net.mcreator.equinox.client.model.ModelFlorevore;

@EventBusSubscriber(Dist.CLIENT)
public class EquinoxModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelFlorevore.LAYER_LOCATION, ModelFlorevore::createBodyLayer);
		event.registerLayerDefinition(Modellight_projectile.LAYER_LOCATION, Modellight_projectile::createBodyLayer);
		event.registerLayerDefinition(ModelLightPatron.LAYER_LOCATION, ModelLightPatron::createBodyLayer);
		event.registerLayerDefinition(ModelSunkisser.LAYER_LOCATION, ModelSunkisser::createBodyLayer);
	}
}