package net.brasscord.plugins.exsheep.configuration;

import net.brasscord.plugins.exsheep.ExSheep;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class BasicConfig {

    private static boolean randomBool;
    private static boolean sheerFlames;
    private static int fireTick;
    private static float explosivePower;

    public static boolean isRandomBool() {
        return randomBool;
    }
    public static boolean setABlazed() {
        return sheerFlames;
    }
    public static int getFireTick() {
        return fireTick;
    }
    public static float getExplosivePower() {
        return explosivePower;
    }

    public static void manageConfig() {
        try {
            File config = new File("plugins/", "ExplosiveSheep.yml");
            FileConfiguration settings = YamlConfiguration.loadConfiguration(config);
            createConfig(config, settings);
            ExSheep.setEnabledPlugin(settings.getBoolean("Enable"));
            randomBool = settings.getBoolean("Enable Randomness");
            sheerFlames = settings.getBoolean("Set ablaze if sheered");
            fireTick = settings.getInt("Fire ticks for sheering event");
            explosivePower = (float) settings.getDouble("Explosive power");
        }
        catch(Exception exception) {
            randomBool = false;
            sheerFlames = true;
            fireTick = 100;
            explosivePower = 3.5F;
            exception.printStackTrace();
        }
    }

    private static void createConfig(File config, FileConfiguration settings) {
        if(!config.exists()) {
            try {
                config.createNewFile();
                settings.set("Enable", true);
                settings.set("Enable Randomness", false);
                settings.set("Set ablaze if sheered", true);
                settings.set("Fire ticks for sheering event", 100);
                settings.set("Explosive power", 3.5);
                settings.save(config);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

}
