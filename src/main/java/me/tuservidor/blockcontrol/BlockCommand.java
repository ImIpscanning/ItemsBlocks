package me.tuservidor.blockcontrol;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BlockCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
            BlockControl.getInstance().reloadConfig();
            sender.sendMessage("§aConfig recargada!");
            return true;
        }

        sender.sendMessage("§cUsa: /blockcontrol reload");
        return true;
    }
}
