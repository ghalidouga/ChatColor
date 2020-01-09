package Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


public class GUIClick implements Listener {
    @EventHandler
    public void clickEvent (InventoryClickEvent e){
        if(e.getClickedInventory().getTitle().equalsIgnoreCase("ChatColor")){
            e.setCancelled(true); // gui Chatcolor agar tidkk tercury
        }
    }
}
