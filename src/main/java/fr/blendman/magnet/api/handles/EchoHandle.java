package fr.blendman.magnet.api.handles;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

/**
 * @author Blendman974
 */
public interface EchoHandle {
    CompletableFuture<Void> enableFeature();

    CompletableFuture<Integer> addPlayer(UUID player);

    EchoPlayerStatus getPlayerStatus(UUID player);

    void setMuted(UUID player, boolean serverMuted);

    void setDeafen(UUID player, boolean serverDeafened);

    void setBroadcast(UUID player, boolean broadcast);

    void setWorld(UUID player, String world);
//    void setPlayerWorld(UUID player, boolean serverMuted, boolean serverDeafened, boolean broadcast); //todo

    void addEchoEventListener(String name, BiConsumer<UUID, EchoEvent> listener);

    void removeEchoEventListener(String name);

    enum EchoEvent {
        Connected,
        Connecting,
        Disconnected,
        Status
    }

    class EchoPlayerStatus{
        private boolean muted = false;
        private boolean serverMuted = false;
        private boolean deafen = false;
        private boolean serverDeafen = false;
        private boolean connected = false;


        public boolean isMuted() {
            return muted;
        }

        public boolean isDeafen() {
            return deafen;
        }

        public boolean isConnected() {
            return connected;
        }

        public void setMuted(boolean muted) {
            this.muted = muted;
        }

        public void setDeafen(boolean deafen) {
            this.deafen = deafen;
        }

        public void setConnected(boolean connected) {
            this.connected = connected;
        }

        public boolean isServerDeafen() {
            return serverDeafen;
        }

        public void setServerDeafen(boolean serverDeafen) {
            this.serverDeafen = serverDeafen;
        }

        public boolean isServerMuted() {
            return serverMuted;
        }

        public void setServerMuted(boolean serverMuted) {
            this.serverMuted = serverMuted;
        }
    }
}
