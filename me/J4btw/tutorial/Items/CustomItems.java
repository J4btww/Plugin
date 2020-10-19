package me.J4btw.tutorial.Items;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import me.J4btw.tutorial.tutorial;
import net.md_5.bungee.api.ChatColor;

public class CustomItems implements Listener {
	private Plugin plugin = tutorial.getPlugin(tutorial.class);

    public void customRecipe(){
	    ItemStack item = new ItemStack(Material.CHEST, 1);
	    ItemMeta meta = item.getItemMeta();
	   	
    	meta.setDisplayName(ChatColor.WHITE + "Chest");
    	meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
    	item.setItemMeta(meta);  	
    	NamespacedKey nsKey = new NamespacedKey(plugin, "zeusaxe");
		ShapedRecipe r = new ShapedRecipe(nsKey, item);
    	
    	r.shape("###","# #","###");
    	r.setIngredient('#', Material.DIAMOND_BLOCK);
    	
    	plugin.getServer().addRecipe(r);
    }
}
