package fr.blendman.magnet.api.server;

import fr.blendman.magnet.api.server.chat.PlayerChatConsumer;
import org.bukkit.entity.Player;

public interface ChatManager {


    PlayerChatConsumer getChatProcessor();

    void setChatProcessor(PlayerChatConsumer process);


    void reportPlayer(Player reporter, String messageId);

    boolean isRankEnabled();

    void setRankEnabled(boolean rankEnabled);


}
