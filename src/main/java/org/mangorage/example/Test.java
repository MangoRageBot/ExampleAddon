package org.mangorage.example;

import com.google.gson.GsonBuilder;
import joptsimple.OptionParser;
import joptsimple.OptionSpec;
import org.mangorage.mangobotapi.core.plugin.api.AddonPlugin;
import org.mangorage.mangobotapi.core.plugin.impl.Plugin;

@Plugin(id = "test", type = Plugin.Type.ADDON)
public class Test extends AddonPlugin {
    public Test() {
        super("test");
        OptionParser optionParser = new OptionParser();
        OptionSpec<String> VAL = optionParser.accepts("test").withRequiredArg().ofType(String.class);

        var a = optionParser.parse(new String[]{"test", "129"});

        System.out.println(a.valueOf(VAL));
    }
}
