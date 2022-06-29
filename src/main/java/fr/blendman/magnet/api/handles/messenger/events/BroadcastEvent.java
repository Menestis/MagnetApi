package fr.blendman.magnet.api.handles.messenger.events;

import fr.blendman.magnet.api.handles.messenger.MagnetNetworkEvent;

/**
 * @author Blendman974
 */
public class BroadcastEvent extends MagnetNetworkEvent {

    private String message;
    private String permission;
    private transient String server_kind;

    public BroadcastEvent(String message, String permission, String server_kind) {
        super(Target.EVENTS, "proxy.broadcast"); //TODO
        this.message = message;
        this.permission = permission;
        this.server_kind = server_kind;
    }

    public String getMessage() {
        return message;
    }

    public String getPermission() {
        return permission;
    }

    public String getServerKind() {
        return server_kind;
    }
}
