package fr.mimifan.gutilib.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.mimifan.gutilib.glass.GlassItems;

public class JoinEvent implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		event.getPlayer().getInventory().addItem(GlassItems.stainedGlass(true, 5, "§eSalut", "light_blue", new String[] {}));
	}
	
}
