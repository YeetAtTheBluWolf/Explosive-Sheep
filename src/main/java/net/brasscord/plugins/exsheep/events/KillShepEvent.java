package net.brasscord.plugins.exsheep.events;

import net.brasscord.plugins.exsheep.configuration.BasicConfig;
import net.brasscord.plugins.exsheep.utils.SheepUtils;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Objects;

public class KillShepEvent implements Listener {

    @EventHandler
    public void ShepDied(EntityDeathEvent e) {
        if(SheepUtils.isSheep(e.getEntity())) {
            Location local = e.getEntity().getLocation();
            if(BasicConfig.isRandomBool()) {
                if(SheepUtils.coinFlip()) {
                    Objects.requireNonNull(local.getWorld()).createExplosion(local, BasicConfig.getExplosivePower(), true, true);
                }
            }
            else {
                Objects.requireNonNull(local.getWorld()).createExplosion(local, BasicConfig.getExplosivePower(), true, true);
            }
        }
    }

}
