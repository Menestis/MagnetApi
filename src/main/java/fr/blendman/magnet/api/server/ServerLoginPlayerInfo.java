package fr.blendman.magnet.api.server;

import java.util.*;

/**
 * @author Blendman974
 */
public class ServerLoginPlayerInfo {

    private UUID session;

    private UUID proxy;

    private String prefix;

    private String suffix;

    private String locale;

    private List<String> permissions = new ArrayList();

    private Integer power;

    private Integer currency;

    private Integer premiumCurrency;

    private List<UUID> blocked = new ArrayList();

    private Map<String, Integer> inventory = new HashMap();

    private Map<String, String> properties = new HashMap();

    public ServerLoginPlayerInfo(UUID session, UUID proxy, String prefix, String suffix, String locale, List<String> permissions, Integer power, Integer currency, Integer premiumCurrency, List<UUID> blocked, Map<String, Integer> inventory, Map<String, String> properties) {
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
}
