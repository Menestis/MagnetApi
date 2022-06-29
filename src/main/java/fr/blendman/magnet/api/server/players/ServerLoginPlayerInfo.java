package fr.blendman.magnet.api.server.players;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Blendman974
 */
public class ServerLoginPlayerInfo {

    private final UUID session;

    private final UUID proxy;

    private final String prefix;

    private final String suffix;

    private final String locale;

    private final List<String> permissions;

    private final Integer power;

    private final Integer currency;

    private final Integer premiumCurrency;

    private final List<UUID> blocked;

    private final Map<String, Integer> inventory;

    private final Map<String, String> properties;

    private final String discordId;

    private final Mute mute;

    public ServerLoginPlayerInfo(UUID session, UUID proxy, String prefix, String suffix, String locale, List<String> permissions, Integer power, Integer currency, Integer premiumCurrency, List<UUID> blocked, Map<String, Integer> inventory, Map<String, String> properties, String discordId, Mute mute) {
        this.session = session;
        this.proxy = proxy;
        this.prefix = prefix;
        this.suffix = suffix;
        this.locale = locale;
        this.permissions = permissions;
        this.power = power;
        this.currency = currency;
        this.premiumCurrency = premiumCurrency;
        this.blocked = blocked;
        this.inventory = inventory;
        this.properties = properties;
        this.discordId = discordId;
        this.mute = mute;
    }


    public UUID getSession() {
        return session;
    }

    public UUID getProxy() {
        return proxy;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getLocale() {
        return locale;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getCurrency() {
        return currency;
    }

    public Integer getPremiumCurrency() {
        return premiumCurrency;
    }

    public List<UUID> getBlocked() {
        return blocked;
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public String getDiscordId() {
        return discordId;
    }

    public Mute getMute() {
        return mute;
    }
}
