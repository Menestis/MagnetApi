package fr.blendman.magnet.api;

import fr.blendman.magnet.api.handles.messenger.MessengerHandle;
import fr.blendman.magnet.api.handles.transactions.TransactionsHandle;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Blendman974
 */
public interface MagnetApi {

    CompletableFuture<Void> stop();

    MessengerHandle getMessenger();

    TransactionsHandle getTransactionHandle();

    UUID getServerId();

    CompletableFuture<Integer> getPlayerCount();

//    ApiClient getClient();
//
//    ProxyApi getProxyApi();
//
//    ServerApi getServerApi();
//
//    Server getServer();
//
//    PlayerApi getPlayerApi();
//
//    LoginApi getLoginApi();
//
//    SessionApi getSessionApi();

    CompletableFuture<Boolean> movePlayerToServer(UUID player, UUID server, boolean whitelist);

    CompletableFuture<Boolean> movePlayerToServer(UUID player, String serverKind);

    CompletableFuture<Void> setServerState(String state);

    class MagnetStore {
        private static MagnetApi api;

        public static MagnetApi getApi() {
            return api;
        }

        public static void setApi(MagnetApi api) {
            MagnetStore.api = api;
        }
    }
}
