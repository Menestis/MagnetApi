package fr.blendman.magnet.api.handles.messenger.events;

import fr.blendman.magnet.api.handles.messenger.MagnetNetworkEvent;

/**
 * @author Blendman974
 */
public class PlayerCountEvent extends MagnetNetworkEvent {

    private int count;

    public PlayerCountEvent(int count) {
        super(Target.EVENTS, "server.playercount");
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
