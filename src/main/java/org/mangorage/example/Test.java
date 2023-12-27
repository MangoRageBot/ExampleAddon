package org.mangorage.example;

import joptsimple.OptionParser;
import org.mangorage.mangobotapi.core.plugin.PluginManager;
import org.mangorage.mangobotapi.core.plugin.api.AddonPlugin;
import org.mangorage.mangobotapi.core.plugin.api.CorePlugin;
import org.mangorage.mangobotapi.core.plugin.impl.Plugin;

@Plugin(id = "test", type = Plugin.Type.ADDON)
public class Test extends AddonPlugin {
    public Test() {
        super("test");
        PluginManager.getPlugin("mangobot", CorePlugin.class).getCommandRegistry().addBasicCommand(new TestCommand());
        OptionParser parser = new OptionParser();
    }
}
