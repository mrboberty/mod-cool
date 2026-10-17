package net.mcreator.modcool.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber(Dist.CLIENT)
public class TesteProcedure {
	@SubscribeEvent
	public static void onLeftClick(PlayerInteractEvent.LeftClickEmpty event) {
		PacketDistributor.sendToServer(new TesteMessage());
		execute();
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
					execute();
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

	public static void execute() {
		execute(null);
	}

private static void execute(
@Nullable Event event
) {
if (==0) {ModCoolMod.LOGGER.info("rien");}else if (==1) {ModCoolMod.LOGGER.info("ombre");}else if (==2) {ModCoolMod.LOGGER.info("lumi\u00E8re");}else if (==3) {ModCoolMod.LOGGER.info("lumi\u00E8re et ombre");}
}
}