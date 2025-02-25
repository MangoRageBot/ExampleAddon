package org.mangorage.example;

import org.mangorage.mangobotapi.core.plugin.AbstractPlugin;
import org.mangorage.mangobotapi.core.plugin.PluginManager;
import org.mangorage.mangobotapi.core.plugin.impl.Plugin;

@Plugin(id = "exampleaddon")
public class ExampleAddon extends AbstractPlugin {

    public ExampleAddon() {

    }

    @Override
    protected void init() {
        if (PluginManager.isLoaded("mangobot")) {
            TestCommand.load();
        }
    }
}
