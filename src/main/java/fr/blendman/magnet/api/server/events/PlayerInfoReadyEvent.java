package fr.blendman.magnet.api.server.events;

import fr.blendman.magnet.api.server.players.ServerLoginPlayerInfo;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * @author Blendman974
 */
public class PlayerInfoReadyEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final ServerLoginPlayerInfo info;
    private final Player player;
    private final boolean reCache;

    public PlayerInfoReadyEvent(ServerLoginPlayerInfo info, Player player, boolean reCache) {
        this.info = info;
        this.player = player;
        this.reCache = reCache;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public ServerLoginPlayerInfo getInfo() {
        return info;
    }

    public Player getPlayer() {
        return player;
    }

    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public boolean isReCache() {
        return reCache;
    }
}
