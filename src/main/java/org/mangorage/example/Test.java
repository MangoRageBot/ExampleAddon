package org.mangorage.example;

import org.mangorage.mangobot.MangoBotPlugin;
import org.mangorage.mangobotapi.core.plugin.PluginManager;
import org.mangorage.mangobotapi.core.plugin.api.AddonPlugin;
import org.mangorage.mangobotapi.core.plugin.api.CorePlugin;
import org.mangorage.mangobotapi.core.plugin.impl.Plugin;

import java.time.Instant;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@Plugin(id = "test", type = Plugin.Type.ADDON)
public class Test extends AddonPlugin {
    public Test() {
        super("test");
        //  Won't send if 'mangobot' isn't loaded...
        sendInterPluginMessage("mangobot", "getDate", () -> Date.from(Instant.EPOCH));
    }
}
