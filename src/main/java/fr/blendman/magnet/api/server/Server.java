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
    private final UUID key;
    private final String kind;
    private final String label;
    private final String state;
    private final Map<String, String> properties;

    public Server(UUID id, String description, String ip, UUID key, String kind, String label, String state, Map<String, String> properties) {
        this.id = id;
        this.description = description;
        this.ip = ip;
        this.key = key;
        this.kind = kind;
        this.label = label;
        this.state = state;
        this.properties = properties;
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

    public UUID getKey() {
        return key;
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
}
