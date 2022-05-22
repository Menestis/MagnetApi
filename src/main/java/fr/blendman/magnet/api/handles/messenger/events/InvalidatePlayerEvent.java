package fr.blendman.magnet.api.handles.messenger.events;

import fr.blendman.magnet.api.handles.messenger.MagnetNetworkEvent;

import java.util.UUID;

/**
 * @author Blendman974
 */
public class InvalidatePlayerEvent extends MagnetNetworkEvent {

    private transient final UUID server;
    private final UUID uuid;

    public InvalidatePlayerEvent(UUID server, UUID uuid) {
        super(Target.DIRECT, server.toString());
        this.server = server;
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }
}
