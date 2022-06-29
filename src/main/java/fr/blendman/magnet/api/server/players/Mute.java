package fr.blendman.magnet.api.server.players;

import java.util.UUID;

/**
 * @author Blendman974
 */
public class Mute {
    private UUID id;
    private String start;
    private String end;
    private UUID issuer;
    private String reason;
    private UUID target;

    private Integer remaining;

    public Mute(UUID id, String start, String end, UUID issuer, String reason, UUID target, Integer remaining) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.issuer = issuer;
        this.reason = reason;
        this.target = target;
        this.remaining = remaining;
    }

    public UUID getId() {
        return id;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public UUID getIssuer() {
        return issuer;
    }

    public String getReason() {
        return reason;
    }

    public UUID getTarget() {
        return target;
    }

    public int getRemaining() {
        return remaining;
    }
}
