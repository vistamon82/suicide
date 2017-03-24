package com.irql.suicide;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
  extends JavaPlugin
{
  public void onEnable()
  {
    getCommand("suicide").setExecutor(this);
  }
  public void onDisable() {}
  
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    if ((sender instanceof Player))
    {
      Player p = (Player)sender;
      p.damage(((Player)sender).getMaxHealth());
    }
    return false;
  }
}
