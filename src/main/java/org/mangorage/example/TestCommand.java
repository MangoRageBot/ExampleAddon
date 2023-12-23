package org.mangorage.example;

import net.dv8tion.jda.api.entities.Message;
import org.mangorage.mangobotapi.core.commands.Arguments;
import org.mangorage.mangobotapi.core.commands.CommandResult;
import org.mangorage.mangobotapi.core.commands.IBasicCommand;

public class TestCommand implements IBasicCommand {
    @Override
    public CommandResult execute(Message message, Arguments arguments) {
        message.reply("It worked! The addon works!!").queue();
        return CommandResult.PASS;
    }

    @Override
    public String commandId() {
        return "addonExample";
    }
}
