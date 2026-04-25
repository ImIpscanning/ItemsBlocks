package me.tuservidor.blockcontrol;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.List;

public class BlockListener implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        List<String> blocked = BlockControl.getInstance().getConfig().getStringList("blocked-blocks");

        Material m = e.getBlock().getType();

        if (blocked.contains(m.name())) {
            e.setCancelled(true);
            e.getPlayer().sendMessage("§cNo puedes colocar ese bloque!");
        }
    }
}
