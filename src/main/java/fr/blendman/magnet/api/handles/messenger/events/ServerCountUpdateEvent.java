package fr.blendman.magnet.api.handles.messenger.events;

import fr.blendman.magnet.api.handles.messenger.MagnetNetworkEvent;

import java.util.UUID;

/**
 * @author Blendman974
 */
public class ServerCountUpdateEvent extends MagnetNetworkEvent {

    private UUID server;
    private int count;

    public ServerCountUpdateEvent(UUID server, int count) {
        super(Target.EVENTS, "server.update.onlines");
        this.server = server;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public UUID getServer() {
        return server;
    }
}
