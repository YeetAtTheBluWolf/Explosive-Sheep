package net.brasscord.plugins.exsheep.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class SheerShepEvent implements Listener {

    public SheerShepEvent() {
    }

    @EventHandler
    void ShepSheered(PlayerShearEntityEvent e){
        if(e.getEntity().toString().equals("CraftSheep")) {
            e.getPlayer().setFireTicks(100);
        }
    }

}
