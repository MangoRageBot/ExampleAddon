package org.mangorage.example;

import org.eclipse.egit.github.core.client.GitHubClient;
import org.kohsuke.github.GitHub;
import org.mangorage.mangobotapi.core.plugin.api.AddonPlugin;
import org.mangorage.mangobotapi.core.plugin.impl.Plugin;

import java.time.Instant;
import java.util.Date;

@Plugin(id = "test", type = Plugin.Type.ADDON)
public class Test extends AddonPlugin {
    public Test() {
        super("test");
        //  Won't send if 'mangobot' isn't loaded...
        sendInterPluginMessage("mangobot", "getDate", () -> Date.from(Instant.EPOCH));
        GitHubClient client = new GitHubClient();
    }
}
