package net.brasscord.plugins.exsheep.utils;

import org.bukkit.entity.Entity;

public class SheepUtils {

    public static boolean isSheep(Entity entity) {
        return entity.toString().equals("CraftSheep");
    }

    public static boolean coinFlip() {
        return (int) (Math.random() * 2) == 1;
    }

}
