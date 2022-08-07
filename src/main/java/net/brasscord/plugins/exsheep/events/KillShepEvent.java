package net.brasscord.plugins.exsheep.events;

import net.brasscord.plugins.exsheep.ExSheep;
import org.bukkit.Particle;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KillShepEvent implements Listener {

    private final ExSheep ex;

    public KillShepEvent(ExSheep ex){
        this.ex = ex;
    }

    @EventHandler
    public void ShepDied(EntityDeathEvent e){
        if(e.getEntity().toString().equals("CraftSheep")){
            e.getEntity().getKiller().spawnParticle(Particle.EXPLOSION_HUGE, e.getEntity().getKiller().getLocation(), 32);
            e.getEntity().getKiller().damage(10.0);
            ex.getServer().getLogger().info("[Debug] ShepDied Event IF statements was true");
        }
    }

}
