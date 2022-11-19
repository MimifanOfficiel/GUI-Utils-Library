package fr.mimifan.gutilib;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/*import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import fr.mimifan.gutilib.events.JoinEvent;*/

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		/*PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new JoinEvent(), this);*/
		Logger logger = getLogger();
		logger.info("Starting GUI Utils Library");
		
	}
	
	public void onDisable() {
		
	}

}
