package net.brasscord.plugins.exsheep;

import net.brasscord.plugins.exsheep.configuration.BasicConfig;
import net.brasscord.plugins.exsheep.events.KillShepEvent;
import net.brasscord.plugins.exsheep.events.SheerShepEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExSheep extends JavaPlugin {

    private boolean isEnabledPlugin() {
        return enabledPlugin;
    }

    public static void setEnabledPlugin(boolean enabledPlugin) {
        ExSheep.enabledPlugin = enabledPlugin;
    }

    private static boolean enabledPlugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        BasicConfig.manageConfig();
        if(isEnabledPlugin())
        {
            getServer().getPluginManager().registerEvents(new KillShepEvent(this), this);
            getServer().getPluginManager().registerEvents(new SheerShepEvent(), this);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
