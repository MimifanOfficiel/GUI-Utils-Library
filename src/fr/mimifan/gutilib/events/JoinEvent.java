package fr.mimifan.gutilib.events;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.mimifan.gutilib.glass.GlassItems;
import fr.mimifan.gutilib.legacyItems.basicItems;

public class JoinEvent implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		event.getPlayer().getInventory().addItem(GlassItems.stainedGlass(false, 5, "§eSalut", "light_blue", new String[] {}));
		HashMap<Enchantment, Integer> enchants = new HashMap<>();
		enchants.put(Enchantment.KNOCKBACK, 1);
		enchants.put(Enchantment.ARROW_INFINITE, 1);
		event.getPlayer().getInventory().addItem(basicItems.basicItem(Material.DIAMOND_AXE, 1, "Wesh BG", new String[] {}, enchants));
	}
	
}
