package net.kingcolton1.civcrossbow;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class CivCrossbow extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
      Bukkit.getPluginManager().registerEvents(this, this);
    }
  
    // TO DO: Set up the crossbow item and its functionality
}
