package org.pixeltime.minez.antitreefall;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiTreefall extends JavaPlugin implements Listener {
    public void onEnable() {
        Bukkit.getLogger().info("AntiTreefall by HealPot enabled.");
        getServer().getPluginManager().registerEvents(this, this);
    }


    public void onDisable() {
        Bukkit.getLogger().info("AntiTreefall by HealPot disabled.");
    }


    @EventHandler
    public void onLeavesDecay(LeavesDecayEvent event) {
        event.setCancelled(true);
    }
}
