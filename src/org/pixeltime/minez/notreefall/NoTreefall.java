package org.pixeltime.minez.notreefall;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.LeavesDecayEvent;

public class NoTreefall extends JavaPlugin implements Listener {
    public void onEnable() {
        Bukkit.getLogger().info("NoTreefall by HealPot enabled.");
        getServer().getPluginManager().registerEvents(this, this);
    }


    public void onDisable() {
        Bukkit.getLogger().info("NoTreefall by HealPot disabled.");
    }


    @EventHandler
    public void onLeavesDecay(LeavesDecayEvent event) {
        event.setCancelled(true);
    }
}
