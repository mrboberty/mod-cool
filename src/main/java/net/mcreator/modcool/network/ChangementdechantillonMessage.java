package net.mcreator.modcool.network;

import net.mcreator.modcool.ModCoolMod;

@EventBusSubscriber
public record ChangementdechantillonMessage(int eventType, int pressedms) implements CustomPacketPayload {

	public static final Type<ChangementdechantillonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(ModCoolMod.MODID, "key_changementdechantillon"));

	public static final StreamCodec<RegistryFriendlyByteBuf, ChangementdechantillonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ChangementdechantillonMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new ChangementdechantillonMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<ChangementdechantillonMessage> type() {
		return TYPE;
	}

	public static void handleData(final ChangementdechantillonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ModCoolMod.addNetworkMessage(ChangementdechantillonMessage.TYPE, ChangementdechantillonMessage.STREAM_CODEC, ChangementdechantillonMessage::handleData);
	}

}