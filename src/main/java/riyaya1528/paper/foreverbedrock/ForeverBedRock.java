package riyaya1528.paper.foreverbedrock;

import org.bukkit.plugin.java.JavaPlugin;

public final class ForeverBedRock extends JavaPlugin {
    public static ForeverBedRock instance;

    @Override
    public void onEnable() {
        instance = this;
        getCommand("bedrock").setExecutor(new Commands());
        getServer().getPluginManager().registerEvents(new BedRock(),this);
        saveDefaultConfig();
        getLogger().info("プラグインが有効になりました");
    }

    @Override
    public void onDisable() {
        getLogger().info("プラグインが無効になりました");
    }
}
