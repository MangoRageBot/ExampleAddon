package org.mangorage.example;


import org.mangorage.mangobotapi.core.plugin.api.AddonPlugin;
import org.mangorage.mangobotapi.core.plugin.impl.Plugin;

@Plugin(id = "test", type = Plugin.Type.ADDON)
public class Test extends AddonPlugin {
    public Test() {
        super("test");
        System.out.println("LOADED ADDON!");
    }
}
