package fr.blendman.magnet.api.handles.messenger.events;

import fr.blendman.magnet.api.handles.messenger.MagnetNetworkEvent;

import java.util.UUID;

/**
 * @author Blendman974
 */
public class MovePlayerToAvailableEvent extends MagnetNetworkEvent {
    public final transient UUID proxy;
    public final String kind;
    public final UUID player;

    public MovePlayerToAvailableEvent(UUID proxy, String kind, UUID player) {
        super(Target.DIRECT, proxy.toString());
        this.proxy = proxy;
        this.kind = kind;
        this.player = player;
    }
}
