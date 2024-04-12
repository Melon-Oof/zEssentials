package fr.maxlego08.essentials.buttons;

import fr.maxlego08.essentials.api.EssentialsPlugin;
import fr.maxlego08.essentials.api.economy.EconomyProvider;
import fr.maxlego08.essentials.api.user.User;
import fr.maxlego08.menu.api.utils.Placeholders;
import fr.maxlego08.menu.button.ZButton;
import fr.maxlego08.menu.inventory.inventories.InventoryDefault;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.Plugin;

public class ButtonPayConfirm extends ZButton {

    private final EssentialsPlugin plugin;

    public ButtonPayConfirm(Plugin plugin) {
        this.plugin = (EssentialsPlugin) plugin;
    }

    @Override
    public void onClick(Player player, InventoryClickEvent event, InventoryDefault inventory, int slot, Placeholders placeholders) {
        super.onClick(player, event, inventory, slot, placeholders);
        User user = this.plugin.getStorageManager().getStorage().getUser(player.getUniqueId());
        EconomyProvider economyProvider = plugin.getEconomyProvider();
        User targetUser = user.getTargetUser();
        economyProvider.pay(player.getUniqueId(), player.getName(), targetUser.getUniqueId(), targetUser.getName(), user.getTargetEconomy(), user.getTargetDecimal());
    }
}
