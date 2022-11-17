package fr.mimifan.gutilib;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.mimifan.gutilib.events.JoinEvent;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		PluginManager pm = Bukkit.getPluginManager();
		Logger logger = getLogger();
		logger.info("Starting GUI Utils Library");
		pm.registerEvents(new JoinEvent(), this);
	}
	
	public void onDisable() {
		
	}

}
