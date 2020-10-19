package me.J4btw.tutorial;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import me.J4btw.tutorial.Events.EventsClass;
import me.J4btw.tutorial.Items.CustomItems;


public class tutorial extends JavaPlugin implements Listener {
    private Commands commands = new Commands();
	public void onEnable(){
	   getCommand(commands.cmd1).setExecutor(commands);
       getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nTutorial has been Enabled\n\n");
       getServer().getPluginManager().registerEvents(new EventsClass(), this);
       loadConfig();
       
       CustomItems items = new CustomItems();
       items.customRecipe();
	}
	public void onDisable(){
	       getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nTutorial has been Disabled\n\n");
	}
	
	public void loadConfig(){
		getConfig().options().copyDefaults(true);
		saveConfig();

	}
}