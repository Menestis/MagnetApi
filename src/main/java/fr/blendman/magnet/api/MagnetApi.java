package fr.blendman.magnet.api;

import fr.blendman.magnet.api.handles.PlayerHandle;
import fr.blendman.magnet.api.handles.TransactionsHandle;
import fr.blendman.magnet.api.handles.messenger.MessengerHandle;
import fr.blendman.magnet.api.server.Server;
import fr.blendman.magnet.api.server.leaderboards.Leaderboard;
import fr.blendman.magnet.api.server.leaderboards.LeaderboardEntry;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Blendman974
 */
public interface MagnetApi {

    CompletableFuture<Void> stop();

    MessengerHandle getMessenger();

    TransactionsHandle getTransactionHandle();

    PlayerHandle getPlayerHandle();

    UUID getServerId();

    String getServerLabel();

    CompletableFuture<Integer> getPlayerCount();

    CompletableFuture<List<Server>> getAllServers();

//    enum: ["Idle", "Waiting", "Starting", "Playing"]
    CompletableFuture<Void> setServerState(String state);

    Map<String, String> getProperties();

    CompletableFuture<Void> setServerDescription(String description);

    CompletableFuture<Void> sendWebhook(String name, String message);

    CompletableFuture<String> startServer(String nane, String kind, Map<String, String> properties);

    CompletableFuture<Leaderboard> getLeaderboard(String name);

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
