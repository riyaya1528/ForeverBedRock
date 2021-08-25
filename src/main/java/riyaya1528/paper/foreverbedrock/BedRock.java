package riyaya1528.paper.foreverbedrock;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class BedRock implements Listener {
    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        if (e.getPlayer().getWorld().getName().equals(ForeverBedRock.instance.getConfig().getString("world"))) {
            if(ForeverBedRock.instance.getConfig().getBoolean("allow")) {

                Location Location = e.getPlayer().getLocation();
                Location.setY(Location.getY() - 1);

                if (!Location.getBlock().getType().equals(Material.AIR) && !Location.getBlock().getType().equals(Material.CAVE_AIR)) {
                    Location.getBlock().setType(Material.BEDROCK);
                }
            }
        }
    }
}
