package fr.blendman.magnet.api.handles.messenger.events;


import fr.blendman.magnet.api.handles.messenger.MagnetNetworkEvent;

import java.util.UUID;

/**
 * @author Blendman974
 */
public class MovePlayerEvent extends MagnetNetworkEvent {
    public final transient UUID proxy;
    public final UUID server;
    public final UUID player;

    public MovePlayerEvent(UUID proxy, UUID server, UUID player) {
        super(Target.DIRECT, proxy.toString());
        this.proxy = proxy;
        this.server = server;
        this.player = player;
    }


}
