package fr.blendman.magnet.api.server.chat;

import fr.blendman.magnet.api.server.chat.PlayerChatConsumer;
import org.bukkit.entity.Player;

public interface ChatManager {

    PlayerChatConsumer getChatProcessor();

    void setChatProcessor(PlayerChatConsumer process);

    void reportPlayer(Player reporter, String messageId);

    boolean isRankVisible();

    void setRankVisible(boolean rankVisible);

}
