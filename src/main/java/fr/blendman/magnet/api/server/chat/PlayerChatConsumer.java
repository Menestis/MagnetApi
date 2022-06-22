package fr.blendman.magnet.api.server.chat;

import org.bukkit.entity.Player;

public interface PlayerChatConsumer {

    void accept(Player player, String message, String messageId);

}
