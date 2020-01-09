package ghaliwang.chatcolor;

import Commands.CColor;
import Events.GUIClick;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChatColor extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("chatcolor").setExecutor(new CColor());
        getServer().getPluginManager().registerEvents(new GUIClick(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
