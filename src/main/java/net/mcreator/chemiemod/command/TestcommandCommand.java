
package net.mcreator.chemiemod.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;

import net.minecraft.commands.arguments.item.ItemArgument;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class TestcommandCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("testcommand")

				.then(Commands.argument("players", EntityArgument.players()).then(Commands.argument("item", ItemArgument.item(event.getBuildContext())).then(Commands.argument("quantity", DoubleArgumentType.doubleArg(0, 6400))))));
	}
}
