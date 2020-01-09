package Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CColor implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("chatcolor")){
            Player player = (Player) sender;
            player.sendMessage("test");
            player.setHealth(10);
        }


        return false;
    }
}
