package fr.blendman.magnet.api.server;

import fr.blendman.skynet.models.ServerLoginPlayerInfo;

import java.util.UUID;

/**
 * @author Blendman974
 */
public interface ServerCacheHandler {
    void storeInfo(UUID uniqueId, ServerLoginPlayerInfo info);

    ServerLoginPlayerInfo getInfo(UUID uniqueId);

    boolean shouldBeWhitelisted(UUID uuid);

    void addWhitelist(UUID player);

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
