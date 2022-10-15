package fr.blendman.magnet.api.handles;

import fr.blendman.skynet.models.PlayerInfo;
import fr.blendman.skynet.models.PlayerSanctionResult;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Blendman974
 */
public interface PlayerHandle {

    CompletableFuture<PlayerInfo> getPlayerInfo(String player);

//    enum: ["Ok", "Failed" , "PlayerOffline", "MissingServer" , "MissingServerKind", "UnlinkedPlayer"]

    CompletableFuture<String> movePlayerToServer(UUID player, UUID server, boolean whitelist);

    CompletableFuture<String> movePlayerToServer(UUID player, String serverKind);

    CompletableFuture<UUID> getPlayerUUID(String player);

    CompletableFuture<PlayerSanctionResult> sanctionPlayer(UUID player, String category, UUID issuer, boolean unsanction);

    CompletableFuture<Void> setPlayerProperties(UUID player, String key, String value);
}
