package fr.maxlego08.essentials.api;

import com.google.gson.Gson;
import com.tcoded.folialib.impl.ServerImplementation;
import fr.maxlego08.essentials.api.commands.CommandManager;
import fr.maxlego08.essentials.api.storage.Persist;
import fr.maxlego08.essentials.api.storage.StorageManager;
import org.bukkit.plugin.Plugin;

import java.util.List;

public interface EssentialsPlugin extends Plugin {

    CommandManager getCommandManager();

    StorageManager getStorageManager();

    List<ConfigurationFile> getConfigurationFiles();

    Gson getGson();

    Persist getPersist();

    ServerImplementation getScheduler();
}