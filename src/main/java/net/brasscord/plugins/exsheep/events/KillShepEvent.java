package net.brasscord.plugins.exsheep.events;

import net.brasscord.plugins.exsheep.ExSheep;
import net.brasscord.plugins.exsheep.configuration.BasicConfig;
import net.brasscord.plugins.exsheep.utils.SheepUtils;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class KillShepEvent implements Listener {

    private final ExSheep exs;

    public KillShepEvent(ExSheep exs) {
        this.exs = exs;
    }

    @EventHandler
    public void ShepDied(EntityDeathEvent e) {
        if(SheepUtils.isSheep(e.getEntity())) {
            Location local = e.getEntity().getLocation();
            if(BasicConfig.isRandomBool()) {
                if(SheepUtils.coinFlip()) {
                    exs.getServer().getWorlds().get(0).createExplosion(local, BasicConfig.getExplosivePower(), true, true);
                }
            }
            else {
                exs.getServer().getWorlds().get(0).createExplosion(local, BasicConfig.getExplosivePower(), true, true);
            }
        }
    }

}
