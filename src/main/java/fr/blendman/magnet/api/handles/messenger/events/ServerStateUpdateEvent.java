package fr.blendman.magnet.api.handles.messenger.events;

import fr.blendman.magnet.api.handles.messenger.MagnetNetworkEvent;

import java.util.UUID;

/**
 * @author Blendman974
 */
public class ServerStateUpdateEvent extends MagnetNetworkEvent {

    private UUID server;
    private String state;

    public ServerStateUpdateEvent(UUID server, String state) {
        super(Target.EVENTS, "server.update.state");
        this.server = server;

        this.state = state;
    }
    public UUID getServer() {
        return server;
    }

    public String getState() {
        return state;
    }
}
