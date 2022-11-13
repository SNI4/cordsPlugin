package me.sn1ch;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class abCords extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new moveHandler(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
