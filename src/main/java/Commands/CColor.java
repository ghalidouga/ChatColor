package Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CColor implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("chatcolor")){ //command /chatcolor
            Player player = (Player) sender;
            Inventory CCgui = Bukkit.createInventory(player, 9, "ChatColor"); // gui untuk chat color
            ItemStack red = new ItemStack(Material.RED_CARPET); // list item di gui
            ItemStack blue = new ItemStack(Material.BLUE_CARPET);
            ItemStack yellow = new ItemStack(Material.YELLOW_CARPET);

            ItemStack[] color_items = {red, blue, yellow}; //array
            CCgui.setContents(color_items); // masukin array ke gui
            player.openInventory(CCgui); // nampilin gui ke player
        }


        return false;
    }
}
