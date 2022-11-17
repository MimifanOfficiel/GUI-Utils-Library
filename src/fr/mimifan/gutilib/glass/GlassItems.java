package fr.mimifan.gutilib.glass;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.mimifan.gutilib.enums.StainedColors;

public class GlassItems {
	
	public static ItemStack stainedGlass(boolean glassPane, int quantity, String name, String color, String[] lore) {
		ItemStack item;
		if(!glassPane) item = new ItemStack(Material.STAINED_GLASS, quantity, StainedColors.getValue(color));
		else item = new ItemStack(Material.STAINED_GLASS_PANE, quantity, StainedColors.getValue(color));
		ItemMeta itemM = item.getItemMeta();
		itemM.setDisplayName(name);
		List<String> ilore = new ArrayList<>();
		for(int i=0; i < lore.length; i++) {
			ilore.add(lore[i]);
		}
		itemM.setLore(ilore);
		ilore.clear();
		
		item.setItemMeta(itemM);
		return item;
	}
	
	
}
