package riyaya1528.paper.foreverbedrock;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("bedrock")) {
            if (sender.isOp()) {
                if (args[0].length() != 0) {
                    if (args[0].equals("true")) {
                        sender.sendMessage("§a§l有効にしました");
                        ForeverBedRock.instance.getConfig().set("allow", "true");
                        ForeverBedRock.instance.saveConfig();
                        return true;
                    }
                    if (args[0].equals("false")) {
                        sender.sendMessage("§a§l無効にしました");
                        ForeverBedRock.instance.getConfig().set("allow", "false");
                        ForeverBedRock.instance.saveConfig();
                        return true;
                    }
                    if (Bukkit.getServer().getWorld(args[0]) != null) {
                        ForeverBedRock.instance.getConfig().set("world", args[0]);
                    } else {
                        sender.sendMessage("存在するワールド名を入れてください");
                    }
                } else {
                    sender.sendMessage("存在するワールド名を入れてください");
                }
            }
        }
        return false;
    }
}
