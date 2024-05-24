package fr.maxlego08.essentials.commands.commands.hologram;

import fr.maxlego08.essentials.api.EssentialsPlugin;
import fr.maxlego08.essentials.api.commands.CommandResultType;
import fr.maxlego08.essentials.api.commands.Permission;
import fr.maxlego08.essentials.api.messages.Message;
import fr.maxlego08.essentials.hologram.HologramModule;
import fr.maxlego08.essentials.zutils.utils.commands.VCommand;

public class CommandHologram extends VCommand {

    public CommandHologram(EssentialsPlugin plugin) {
        super(plugin);
        this.setModule(HologramModule.class);
        this.setPermission(Permission.ESSENTIALS_HOLOGRAM);
        this.setDescription(Message.DESCRIPTION_HOLOGRAM);

        this.addSubCommand(new CommandHologramCreate(plugin));
        this.addSubCommand(new CommandHologramDelete(plugin));
        this.addSubCommand(new CommandHologramAddLine(plugin));
    }

    @Override
    protected CommandResultType perform(EssentialsPlugin plugin) {
        syntaxMessage();
        return CommandResultType.SUCCESS;
    }
}