package fr.blendman.magnet.api.handles;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Blendman974
 */
public interface PlayerHandle {

//    enum: ["Ok", "Failed" , "PlayerOffline", "MissingServer" , "MissingServerKind", "UnlinkedPlayer"]

    CompletableFuture<String> movePlayerToServer(UUID player, UUID server, boolean whitelist);

    CompletableFuture<String> movePlayerToServer(UUID player, String serverKind);
}