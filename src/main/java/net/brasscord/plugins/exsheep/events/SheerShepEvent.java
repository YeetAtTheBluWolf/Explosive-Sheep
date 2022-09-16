package net.brasscord.plugins.exsheep.events;

import net.brasscord.plugins.exsheep.configuration.BasicConfig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class SheerShepEvent implements Listener {

    public SheerShepEvent() {
    }

    @EventHandler
    void ShepSheered(PlayerShearEntityEvent e){
        if(e.getEntity().toString().equals("CraftSheep")) {
            if(BasicConfig.isRandomBool())
            {
                if(((int) (Math.random() * 2)) == 1)
                {
                    e.getPlayer().setFireTicks(100);
                }
            }
            else
            {
                e.getPlayer().setFireTicks(100);
            }
        }
    }

}
