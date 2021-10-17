package top.abmcar.easygetmonstername;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import top.abmcar.easygetmonstername.config.ConfigData;

public class DamageListener implements Listener {
    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
        Entity attacker = event.getDamager();
        Entity damager = event.getEntity();
        if (damager instanceof Player)
            return;
        if (attacker instanceof Player) {
            Player player = (Player) attacker;
            for (int i = 0; i < ConfigData.INSTANCE.playerNames.size(); i++)
                if (player.getName().equalsIgnoreCase(ConfigData.INSTANCE.playerNames.get((i)))) {
                    attacker.sendMessage(damager.getType().name());
                    attacker.sendMessage(damager.getCustomName());
                }
        }
    }
}
