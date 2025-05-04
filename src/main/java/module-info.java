module org.mangorage.example {
    requires org.mangorage.mangobotplugin;
    requires org.mangorage.mangobotcore;
    requires net.dv8tion.jda;

    exports org.mangorage.example;

    provides org.mangorage.mangobotcore.plugin.api.Plugin with org.mangorage.example.ExampleAddon;
    uses org.mangorage.mangobotcore.plugin.api.Plugin;
}