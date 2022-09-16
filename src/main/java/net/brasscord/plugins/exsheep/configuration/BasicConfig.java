package net.brasscord.plugins.exsheep.configuration;

import net.brasscord.plugins.exsheep.ExSheep;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class BasicConfig {

    private static boolean randomBool;

    public static boolean isRandomBool() {
        return randomBool;
    }

    public static void manageConfig()
    {
        File config = new File("plugins/", "ExplosiveSheep.yml");
        FileConfiguration settings = YamlConfiguration.loadConfiguration(config);
        if(!config.exists())
        {
            try
            {
                config.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            settings.set("Enable", true);
            settings.set("Enable Randomness", false);
            try
            {
                settings.save(config);
            }
            catch(IOException io)
            {
                io.printStackTrace();
            }
        }

        ExSheep.setEnabledPlugin(settings.getBoolean("Enable"));
        randomBool = settings.getBoolean("Enable Randomness");

    }

}
