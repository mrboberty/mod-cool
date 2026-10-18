/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.equinox.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.modcool.client.renderer.LightProjectileRenderer;
import net.mcreator.equinox.client.renderer.SunkisserRenderer;
import net.mcreator.equinox.client.renderer.DarkProjectileRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class EquinoxModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EquinoxModEntities.LIGHT_PROJECTILE.get(), LightProjectileRenderer::new);
		event.registerEntityRenderer(EquinoxModEntities.DARK_PROJECTILE.get(), DarkProjectileRenderer::new);
		event.registerEntityRenderer(EquinoxModEntities.SUNKISSER.get(), SunkisserRenderer::new);
	}
}