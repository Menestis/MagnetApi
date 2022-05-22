package fr.blendman.magnet.api.handles.messenger.events;

import fr.blendman.magnet.api.handles.messenger.MagnetNetworkEvent;

import java.net.InetAddress;
import java.util.Map;
import java.util.UUID;

/**
 * @author Blendman974
 */
public class NewRouteEvent extends MagnetNetworkEvent {
    public final InetAddress addr;
    public final UUID id;
    public final String name;
    public final String description;
    public final String kind;
    public final Map<String, String> properties;

    public NewRouteEvent(InetAddress addr, UUID id, String name, String description, String kind, Map<String, String> properties) {
        super(Target.EVENTS, "proxy.servers.routes.new");
        this.addr = addr;
        this.id = id;
        this.name = name;
        this.description = description;
        this.kind = kind;
        this.properties = properties;
    }
}
