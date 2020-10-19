package me.J4btw.tutorial;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class Commands implements CommandExecutor {
	
	public String cmd1 = "giveitem";
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player){
			if(cmd.getName().equalsIgnoreCase(cmd1)){
			   if (args.length != 0) {
			       Material item = Material.getMaterial(args[0].toUpperCase());
			       if(item !=null) {
			          Inventory inv = ((Player) sender).getInventory();
			          inv.addItem(new ItemStack(item, 1));
			          return true;
		          } else {
			           sender.sendMessage(ChatColor.YELLOW + args[0] + ChatColor.RED + " is not a valid item");
			           return true;
		          }
			       
		       }else{
		    	   sender.sendMessage(ChatColor.RED + "Not enough arguments");
		    	   return true;
		       }
			}
		} else {
		    sender.sendMessage(ChatColor.RED + "Only players can use this command!");
		    return true;
		}
		return false;
	}
}