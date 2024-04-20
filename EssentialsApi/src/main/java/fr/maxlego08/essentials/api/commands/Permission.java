package fr.maxlego08.essentials.api.commands;

/**
 * Represents permissions related to commands.
 * This enum provides methods to generate permission strings based on its constants.
 */
public enum Permission {

    ESSENTIALS_USE,
    ESSENTIALS_RELOAD,
    ESSENTIALS_GAMEMODE,
    ESSENTIALS_GAMEMODE_OTHER,
    ESSENTIALS_GAMEMODE_CREATIVE,
    ESSENTIALS_GAMEMODE_SURVIVAL,
    ESSENTIALS_GAMEMODE_SPECTATOR,
    ESSENTIALS_GAMEMODE_ADVENTURE,
    ESSENTIALS_DAY,
    ESSENTIALS_NIGHT,
    ESSENTIALS_SUN,
    ESSENTIALS_ENDERCHEST,
    ESSENTIALS_ENDERSEE,
    ESSENTIALS_TOP,
    ESSENTIALS_GOD,
    ESSENTIALS_HEAL,
    ESSENTIALS_SPEED,
    ESSENTIALS_TELEPORT_BYPASS,
    ESSENTIALS_TPA,
    ESSENTIALS_TPA_ACCEPT,
    ESSENTIALS_TPA_DENY,
    ESSENTIALS_TPA_CANCEL,
    ESSENTIALS_BYPASS_COOLDOWN,
    ESSENTIALS_MORE,
    ESSENTIALS_TP_WORLD,
    ESSENTIALS_TP_WORLD_OTHER,
    ESSENTIALS_TRASH,
    ESSENTIALS_FEED,
    ESSENTIALS_INVSEE,
    ESSENTIALS_FEED_OTHER,
    ESSENTIALS_HEAL_OTHER,
    ESSENTIALS_CRAFT,
    ESSENTIALS_ENCHANTING, ESSENTIALS_INVSEE_INTERACT,
    ESSENTIALS_COMPACT, ESSENTIALS_HAT,
    ESSENTIALS_PLAYER_WEATHER, ESSENTIALS_PLAYER_TIME,
    ESSENTIALS_TP, ESSENTIALS_ECO_USE,
    ESSENTIALS_ECO_GIVE, ESSENTIALS_ECO_TAKE,
    ESSENTIALS_ECO_GIVE_ALL, ESSENTIALS_MONEY,
    ESSENTIALS_ECO_SET, ESSENTIALS_ECO_RESET,
    ESSENTIALS_ECO_SHOW, ESSENTIALS_PAY,
    ESSENTIALS_TP_HERE, ESSENTIALS_FLY,
    ESSENTIALS_SILENT_QUIT,
    ESSENTIALS_SILENT_JOIN, ESSENTIALS_ANVIL,
    ESSENTIALS_CARTOGRAPHYTABLE, ESSENTIALS_GRINDSTONE,
    ESSENTIALS_LOOM, ESSENTIALS_STONECUTTER,
    ESSENTIALS_SMITHINGTABLE, ESSENTIALS_BACK,
    ESSENTIALS_SET_SPAWN, ESSENTIALS_SPAWN,
    ESSENTIALS_WARP_SET, ESSENTIALS_WARP,
    ESSENTIALS_WARPS, ESSENTIALS_WARP_DEL,
    ESSENTIALS_TP_RANDOM, ESSENTIALS_SET_HOME,
    ESSENTIALS_SET_HOME_OTHER, ESSENTIALS_HOME,
    ESSENTIALS_HOME_OTHER, ESSENTIALS_DEL_HOME,
    ESSENTIALS_KICK, ESSENTIALS_KICK_NOTIFY,
    ESSENTIALS_KICK_ALL, ESSENTIALS_KICK_BYPASS_ALL,
    ESSENTIALS_KITTY_CANNON, ESSENTIALS_MUTE,
    ESSENTIALS_BAN, ESSENTIALS_UNBAN,
    ESSENTIALS_UNMUTE, ESSENTIALS_WARN,
    ESSENTIALS_BAN_NOTIFY, ESSENTIALS_MUTE_NOTIFY,
    ESSENTIALS_UNMUTE_NOTIFY, ESSENTIALS_UN_MUTE,
    ESSENTIALS_UNBAN_NOTIFY, ESSENTIALS_UN_BAN, ESSENTIALS_SANCTION,
    ESSENTIALS_CHAT_BYPASS_ALPHANUMERIC, ESSENTIALS_CHAT_BYPASS_DYNAMIC_COOLDOWN,
    ESSENTIALS_CHAT_BYPASS_LINK, ESSENTIALS_CHAT_BYPASS_SAME_MESSAGE,
    ESSENTIALS_CHAT_BYPASS_DISABLE, ESSENTIALS_CHAT_MODERATOR,
    ESSENTIALS_CHAT_COLOR, ESSENTIALS_CHAT_DECORATION,
    ESSENTIALS_CHAT_RAINBOW, ESSENTIALS_CHAT_GRADIENT,
    ESSENTIALS_CHAT_CLICK, ESSENTIALS_CHAT_HOVER,
    ESSENTIALS_CHAT_NEWLINE, ESSENTIALS_CHAT_RESET,
    ESSENTIALS_CHAT_FONT, ESSENTIALS_CHAT_KEYBIND, ESSENTIALS_CHAT_LINK, ESSENTIALS_CHAT_HISTORY, ESSENTIALS_CHAT_CLEAR, ESSENTIALS_CHAT_ENABLE, ESSENTIALS_CHAT_DISABLE;


    /**
     * Generates the permission string for this enum constant.
     * Converts the enum constant name to lowercase and replaces underscores with periods.
     *
     * @return The permission string.
     */
    public String asPermission() {
        return name().toLowerCase().replace("_", ".");
    }

    /**
     * Generates a permission string for this enum constant with an additional suffix.
     * Appends the specified suffix to the permission string generated by {@link #asPermission()}.
     *
     * @param with The suffix to append.
     * @return The permission string with the suffix.
     */
    public String asPermission(String with) {
        return String.format(asPermission() + ".%s", with);
    }

    }

