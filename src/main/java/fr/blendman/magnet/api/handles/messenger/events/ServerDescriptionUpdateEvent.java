package fr.blendman.magnet.api.handles.messenger.events;

import fr.blendman.magnet.api.handles.messenger.MagnetNetworkEvent;

import java.util.UUID;

/**
 * @author Blendman974
 */
public class ServerDescriptionUpdateEvent extends MagnetNetworkEvent {

    private UUID server;
    private String description;

    public ServerDescriptionUpdateEvent(UUID server, String description) {
        super(Target.EVENTS, "server.update.description");
        this.server = server;

        this.description = description;
    }

    public UUID getServer() {
        return server;
    }

    public String getDescription() {
        return description;
    }
}
