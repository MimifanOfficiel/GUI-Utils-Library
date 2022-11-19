package fr.mimifan.gutilib.legacyItems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class basicItems {
	
	public static ItemStack basicItem(Material material, int quantity, String name, String[] lore, HashMap<Enchantment, Integer> enchants) {
		ItemStack item = new ItemStack(material, quantity);
		ItemMeta itemM = item.getItemMeta();
		itemM.setDisplayName(name);
		List<String> ilore = new ArrayList<>();
		for(int i=0; i < lore.length; i++) {
			ilore.add(lore[i]);
		}
		itemM.setLore(ilore);
		ilore.clear();
		item.setItemMeta(itemM);
		if(!enchants.isEmpty()) {
			for(Enchantment enchant : enchants.keySet()) {
				item.addUnsafeEnchantment(enchant, enchants.get(enchant));
			}
		} else System.out.println("Pas d'enchant");
		return item;
	}
}
