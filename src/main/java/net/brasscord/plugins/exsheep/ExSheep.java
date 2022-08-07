package net.brasscord.plugins.exsheep;

import net.brasscord.plugins.exsheep.events.KillShepEvent;
import net.brasscord.plugins.exsheep.events.SheerShepEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExSheep extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new KillShepEvent(), this);
        getServer().getPluginManager().registerEvents(new SheerShepEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
