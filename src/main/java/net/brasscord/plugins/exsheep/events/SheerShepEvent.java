package net.brasscord.plugins.exsheep.events;

import net.brasscord.plugins.exsheep.configuration.BasicConfig;
import net.brasscord.plugins.exsheep.utils.SheepUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class SheerShepEvent implements Listener {

    @EventHandler
    void ShepSheered(PlayerShearEntityEvent e) {
        if(BasicConfig.setABlazed()) {
            if(SheepUtils.isSheep(e.getEntity())) {
                if(BasicConfig.isRandomBool()) {
                    if(SheepUtils.coinFlip()) {
                        e.getPlayer().setFireTicks(BasicConfig.getFireTick());
                    }
                }
                else {
                    e.getPlayer().setFireTicks(BasicConfig.getFireTick());
                }
            }
        }
    }

}
