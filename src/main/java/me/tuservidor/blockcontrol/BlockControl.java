package me.tuservidor.blockcontrol;

import org.bukkit.plugin.java.JavaPlugin;

public class BlockControl extends JavaPlugin {

    private static BlockControl instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig(); // 🔥 crea la carpeta + config.yml

        getServer().getPluginManager().registerEvents(new BlockListener(), this);
        getCommand("blockcontrol").setExecutor(new BlockCommand());

        getLogger().info("BlockControl activado!");
    }

    public static BlockControl getInstance() {
        return instance;
    }
}
