package net.brasscord.plugins.exsheep.events;

import net.brasscord.plugins.exsheep.ExSheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class KillShepEvent implements Listener {

    private final ExSheep exs;

    public KillShepEvent(ExSheep exs) {
        this.exs = exs;
    }

    @EventHandler
    public void ShepDied(EntityDeathEvent e){
        if(e.getEntity().toString().equals("CraftSheep")){
            exs.getServer().getWorlds().get(0).createExplosion(e.getEntity().getLocation(), 3.5F, true, true);
        }
    }

}
