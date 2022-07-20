package fr.blendman.magnet.api.handles.messenger.events;


import fr.blendman.magnet.api.handles.messenger.MagnetNetworkEvent;

import java.util.UUID;

/**
 * @author Blendman974
 */
public class DisconnectPlayerEvent extends MagnetNetworkEvent {
    public final transient UUID proxy;
    public final UUID player;
    public final String message;

    public DisconnectPlayerEvent(UUID proxy, UUID player, String message) {
        super(Target.DIRECT, proxy.toString());
        this.proxy = proxy;
        this.player = player;
        this.message = message;
    }
}
