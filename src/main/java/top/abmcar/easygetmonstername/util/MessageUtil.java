package top.abmcar.easygetmonstername.util;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import top.abmcar.easygetmonstername.EasyGetMonsterName;

public class MessageUtil {
    private static final Plugin plugin = EasyGetMonsterName.getPlugin();

    public static void sendMessage(Player player, String message) {
        player.sendMessage(message);
    }
}
