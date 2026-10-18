package net.mcreator.modcool.procedures;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.SectionPos;

import net.mcreator.modcool.network.ModCoolModVariables;
import net.mcreator.modcool.ModCoolMod;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class TesteProcedure {
	@SubscribeEvent
	public static void onLeftClick(PlayerInteractEvent.LeftClickEmpty event) {
		PacketDistributor.sendToServer(new TesteMessage());
		execute(event.getEntity());
	}

	@EventBusSubscriber
	public record TesteMessage() implements CustomPacketPayload {
		public static final Type<TesteMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(ModCoolMod.MODID, "procedure_teste"));
		public static final StreamCodec<RegistryFriendlyByteBuf, TesteMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, TesteMessage message) -> {
		}, (RegistryFriendlyByteBuf buffer) -> new TesteMessage());

		@Override
		public Type<TesteMessage> type() {
			return TYPE;
		}

		public static void handleData(final TesteMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.SERVERBOUND) {
				context.enqueueWork(() -> {
					if (!context.player().level().getChunkSource().hasChunk(SectionPos.blockToSectionCoord(context.player().getX()), SectionPos.blockToSectionCoord(context.player().getZ())))
						return;
					execute(context.player());
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			ModCoolMod.addNetworkMessage(TesteMessage.TYPE, TesteMessage.STREAM_CODEC, TesteMessage::handleData);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(ModCoolModVariables.PLAYER_VARIABLES).Polyvalent_Scepter_Score == 0) {
			ModCoolMod.LOGGER.info("rien");
		} else if (entity.getData(ModCoolModVariables.PLAYER_VARIABLES).Polyvalent_Scepter_Score == 1) {
			ModCoolMod.LOGGER.info("ombre");
		} else if (entity.getData(ModCoolModVariables.PLAYER_VARIABLES).Polyvalent_Scepter_Score == 2) {
			ModCoolMod.LOGGER.info("lumi\u00E8re");
		} else if (entity.getData(ModCoolModVariables.PLAYER_VARIABLES).Polyvalent_Scepter_Score == 3) {
			ModCoolMod.LOGGER.info("lumi\u00E8re et ombre");
		}
	}
}