package ghaliwang.chatcolor;

import Commands.CColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChatColor extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("chatcolor").setExecutor(new CColor());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
