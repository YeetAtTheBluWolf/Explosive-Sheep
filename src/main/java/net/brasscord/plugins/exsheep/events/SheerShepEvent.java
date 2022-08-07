package net.brasscord.plugins.exsheep.events;

import net.brasscord.plugins.exsheep.ExSheep;
import org.bukkit.Particle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class SheerShepEvent implements Listener {

    private final ExSheep ex;

    public SheerShepEvent(ExSheep ex){
        this.ex = ex;
    }

    @EventHandler
    void ShepSheered(PlayerShearEntityEvent e){
        if(e.getEntity().toString().equals("CraftSheep")) {
            e.getPlayer().spawnParticle(Particle.EXPLOSION_NORMAL, e.getPlayer().getLocation(), 32);
            e.getPlayer().damage(5.0);
            ex.getServer().getLogger().info("[Debug] ShepSheered Event IF statements was true");
        }
    }

}
