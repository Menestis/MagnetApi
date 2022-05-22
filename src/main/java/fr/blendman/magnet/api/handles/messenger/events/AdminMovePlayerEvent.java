package fr.blendman.magnet.api.handles.messenger.events;


import fr.blendman.magnet.api.handles.messenger.MagnetNetworkEvent;

import java.util.UUID;

/**
 * @author Blendman974
 */
public class AdminMovePlayerEvent extends MagnetNetworkEvent {
    public final UUID server;
    public final UUID player;

    public AdminMovePlayerEvent(UUID server, UUID player) {
        super(Target.DIRECT, server.toString());
        this.server = server;
        this.player = player;
    }


}
