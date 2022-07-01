package fr.blendman.magnet.api.server;

import java.util.Map;
import java.util.UUID;

/**
 * @author Blendman974
 */
public class Server {
    private final UUID id;
    private final String description;
    private final String ip;
    private final String kind;
    private final String label;
    private final String state;
    private final Map<String, String> properties;

    private final int online;

    public Server(UUID id, String description, String ip, String kind, String label, String state, Map<String, String> properties, int online) {
        this.id = id;
        this.description = description;
        this.ip = ip;
        this.kind = kind;
        this.label = label;
        this.state = state;
        this.properties = properties;
        this.online = online;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getIp() {
        return ip;
    }

    public String getKind() {
        return kind;
    }

    public String getLabel() {
        return label;
    }

    public String getState() {
        return state;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public int getOnline() {
        return online;
    }
}
