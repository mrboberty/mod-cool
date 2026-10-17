package net.mcreator.modcool.command;

@EventBusSubscriber
public class Scorepolyvalent0Command {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("scorepolyvalent0")

		);
	}

}