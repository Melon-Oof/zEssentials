package fr.maxlego08.essentials.commands;

import fr.maxlego08.essentials.ZEssentialsPlugin;
import fr.maxlego08.essentials.api.EssentialsPlugin;
import fr.maxlego08.essentials.api.commands.CommandManager;
import fr.maxlego08.essentials.commands.commands.enderchest.CommandEnderChest;
import fr.maxlego08.essentials.commands.commands.enderchest.CommandEnderSee;
import fr.maxlego08.essentials.commands.commands.gamemode.CommandGameMode;
import fr.maxlego08.essentials.commands.commands.gamemode.CommandGameModeAdventure;
import fr.maxlego08.essentials.commands.commands.gamemode.CommandGameModeCreative;
import fr.maxlego08.essentials.commands.commands.gamemode.CommandGameModeSpectator;
import fr.maxlego08.essentials.commands.commands.gamemode.CommandGameModeSurvival;
import fr.maxlego08.essentials.commands.commands.teleport.CommandTeleportAccept;
import fr.maxlego08.essentials.commands.commands.teleport.CommandTeleportTo;
import fr.maxlego08.essentials.commands.commands.utils.CommandSpeed;
import fr.maxlego08.essentials.commands.commands.utils.CommandTop;
import fr.maxlego08.essentials.commands.commands.weather.CommandDay;
import fr.maxlego08.essentials.commands.commands.weather.CommandNight;
import fr.maxlego08.essentials.commands.commands.weather.CommandSun;
import fr.maxlego08.essentials.zutils.utils.commands.VCommand;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandLoader {

    private final ZEssentialsPlugin plugin;
    private final List<RegisterCommand> commands = new ArrayList<>();

    public CommandLoader(ZEssentialsPlugin plugin) {
        this.plugin = plugin;
    }

    public void loadCommands(CommandManager commandManager) {

        register("gamemode", CommandGameMode.class, "gm");
        register("gmc", CommandGameModeCreative.class, "creat");
        register("gma", CommandGameModeAdventure.class, "advent");
        register("gms", CommandGameModeSurvival.class, "survi");
        register("gmsp", CommandGameModeSpectator.class, "spec");

        register("day", CommandDay.class);
        register("night", CommandNight.class);
        register("sun", CommandSun.class);

        register("enderchest", CommandEnderChest.class, "ec");
        register("endersee", CommandEnderSee.class, "ecsee");

        register("top", CommandTop.class);
        register("speed", CommandSpeed.class);

        register("tpa", CommandTeleportTo.class);
        register("tpaccept", CommandTeleportAccept.class, "tpyes");

        File file = new File(plugin.getDataFolder(), "commands.yml");
        if (!file.exists()) this.plugin.saveResource("commands.yml", false);

        this.loadCommands(YamlConfiguration.loadConfiguration(file), commandManager);
    }

    private void register(String command, Class<? extends VCommand> commandClass, String... aliases) {
        commands.add(new RegisterCommand(command, commandClass, Arrays.asList(aliases)));
    }

    private void loadCommands(YamlConfiguration configuration, CommandManager commandManager) {

        for (RegisterCommand command : commands) {
            if (configuration.getBoolean(command.command, true)) {
                try {
                    commandManager.registerCommand(this.plugin, command.command, command.commandClass.getConstructor(EssentialsPlugin.class).newInstance(this.plugin), command.aliases);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    public record RegisterCommand(String command, Class<? extends VCommand> commandClass, List<String> aliases) {

    }
}