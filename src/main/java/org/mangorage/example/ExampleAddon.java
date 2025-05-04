package org.mangorage.example;

import org.mangorage.mangobotcore.plugin.api.MangoBotPlugin;
import org.mangorage.mangobotcore.plugin.api.Plugin;
import org.mangorage.mangobotcore.plugin.api.PluginManager;

/**
 * An Example of your Addon/Plugin Class...
 */
@MangoBotPlugin(id = ExampleAddon.ID)
public class ExampleAddon implements Plugin {
    public static final String ID = "exampleaddon";

    public ExampleAddon() {
        System.out.println("Example Addon Ctor loaded...");
    }

    @Override
    public String getId() {
        return ID;
    }

    @Override
    public void load() {
        var pl = PluginManager.getInstance().getPlugin("mangobot");
        if (pl != null) {
            TestCommand.load();
        }
    }
}
