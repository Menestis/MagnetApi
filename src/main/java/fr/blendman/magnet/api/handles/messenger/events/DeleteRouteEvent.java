package fr.blendman.magnet.api.handles.messenger.events;

import fr.blendman.magnet.api.handles.messenger.MagnetNetworkEvent;

import java.util.UUID;

/**
 * @author Blendman974
 */
public class DeleteRouteEvent extends MagnetNetworkEvent {
    public final UUID id;
    public final String name;

    public DeleteRouteEvent(UUID id, String name) {
        super(Target.EVENTS, "proxy.servers.routes.delete");
        this.id = id;
        this.name = name;
    }
}
