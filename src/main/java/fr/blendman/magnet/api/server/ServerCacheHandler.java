package fr.blendman.magnet.api.server;


import fr.blendman.magnet.api.handles.EchoHandle;
import fr.blendman.magnet.api.server.chat.ChatManager;
import fr.blendman.skynet.models.ServerLoginPlayerInfo;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Blendman974
 */
public interface ServerCacheHandler {

    ServerLoginPlayerInfo getInfo(UUID uniqueId);

    boolean shouldBeWhitelisted(UUID uuid);

    void addWhitelist(UUID player);

    ChatManager getChatManager();

    EchoHandle getEchoHandle();

    //    enum: ["Idle", "Waiting", "Starting", "Playing"]
    CompletableFuture<Void> setServerState(String state);

    class ServerCacheHandlerStore {
        private static ServerCacheHandler serverCacheHandler;

        public ServerCacheHandlerStore() {
        }

        public static ServerCacheHandler getServerCacheHandler() {
            return serverCacheHandler;
        }

        public static void setServerCacheHandler(ServerCacheHandler api) {
            ServerCacheHandler.ServerCacheHandlerStore.serverCacheHandler = api;
        }
    }

}
