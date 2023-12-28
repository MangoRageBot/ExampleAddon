package org.mangorage.example;

import net.dv8tion.jda.api.entities.Message;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHMyself;
import org.kohsuke.github.GHPullRequest;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.mangorage.mangobotapi.core.commands.Arguments;
import org.mangorage.mangobotapi.core.commands.CommandResult;
import org.mangorage.mangobotapi.core.commands.IBasicCommand;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class TestCommand implements IBasicCommand {
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
