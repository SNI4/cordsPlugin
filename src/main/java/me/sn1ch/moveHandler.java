package me.sn1ch;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class moveHandler implements Listener {

    @EventHandler
    public void join(PlayerMoveEvent e){

        Player p = e.getPlayer();

        Location loc = p.getLocation();

        String x = String.format("%.2f", ((Location) loc).getX());
        String y = String.format("%.2f", loc.getY());
        String z = String.format("%.2f", loc.getZ());

        p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.DARK_PURPLE + "X: " + ChatColor.GREEN
                + x + ChatColor.DARK_PURPLE + " Y: " + ChatColor.GREEN + y + ChatColor.DARK_PURPLE +  " Z: " + ChatColor.GREEN + z));

    }
}
