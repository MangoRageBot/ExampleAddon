package org.mangorage.example;


import net.dv8tion.jda.api.entities.Message;
import org.mangorage.commonutils.misc.Arguments;
import org.mangorage.mangobotcore.jda.command.api.CommandResult;
import org.mangorage.mangobotcore.jda.command.api.ICommand;

import org.mangorage.mangobotcore.plugin.api.PluginManager;
import org.mangorage.mangobotplugin.entrypoint.MangoBot;

import java.util.List;

/**
 * An example of how you can make a command!
 */
public class TestCommand implements ICommand {
    public static void load() {
        MangoBot plugin = PluginManager.getInstance().getPlugin(("mangobot")).getInstance(MangoBot.class);
        plugin.getCommandManager().register(new TestCommand());
    }

    @Override
    public String id() {
        return "examplecmd";
    }

    @Override
    public List<String> commands() {
        return List.of(id());
    }

    @Override
    public String usage() {
        return "Test Command Usage: N/A";
    }

    @Override
    public CommandResult execute(Message message, Arguments arguments) {
        message.reply("Addon Worked!").queue();
        return CommandResult.PASS;
    }
}
