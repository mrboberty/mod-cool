/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modcool.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.modcool.network.ChangementdechantillonMessage;

@EventBusSubscriber(Dist.CLIENT)
public class ModCoolModKeyMappings {
	public static final KeyMapping CHANGEMENTDECHANTILLON = new KeyMapping("key.mod_cool.changementdechantillon", GLFW.GLFW_KEY_0, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new ChangementdechantillonMessage(0, 0));
				ChangementdechantillonMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(CHANGEMENTDECHANTILLON);
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				CHANGEMENTDECHANTILLON.consumeClick();
			}
		}
	}
}