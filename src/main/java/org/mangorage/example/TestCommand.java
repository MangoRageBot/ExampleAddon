package org.mangorage.example;

import net.dv8tion.jda.api.entities.Message;
import org.mangorage.mangobot.MangoBotPlugin;
import org.mangorage.mangobotapi.core.commands.Arguments;
import org.mangorage.mangobotapi.core.commands.CommandResult;
import org.mangorage.mangobotapi.core.commands.IBasicCommand;
import org.mangorage.mangobotapi.core.plugin.PluginManager;

public class TestCommand implements IBasicCommand {
    public static void load() {
        MangoBotPlugin plugin = PluginManager.getPlugin("mangobot", MangoBotPlugin.class);
        plugin.getCommandRegistry().addBasicCommand(new TestCommand());
    }

    @Override
    public CommandResult execute(Message message, Arguments arguments) {
        message.reply("Addon Worked!").queue();
        return CommandResult.PASS;
    }

    @Override
    public String commandId() {
        return "addonTest";
    }
}
