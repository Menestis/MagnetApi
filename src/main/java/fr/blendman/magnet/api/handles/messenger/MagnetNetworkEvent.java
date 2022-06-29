package fr.blendman.magnet.api.handles.messenger;

import java.io.Serializable;

/**
 * @author Blendman974
 */
public abstract class MagnetNetworkEvent implements Serializable {

    protected Target target;
    protected String routingKey;


    public MagnetNetworkEvent(Target target, String routingKey) {
        this.target = target;
        this.routingKey = routingKey;
    }

    public Target getTarget() {
        return target;
    }

    public String getRoutingKey() {
        return routingKey;
    }

    public enum Target {
        DIRECT,
        EVENTS

    }
}
