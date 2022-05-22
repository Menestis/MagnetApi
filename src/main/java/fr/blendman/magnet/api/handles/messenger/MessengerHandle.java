package fr.blendman.magnet.api.handles.messenger;

import java.io.IOException;
import java.util.function.Consumer;

/**
 * @author Blendman974
 */
public interface MessengerHandle {
    <T extends MagnetNetworkEvent> void registerListener(Consumer<T> handler, Class<T> clazz);

    //void sendEvent(MagnetNetworkEvent event);

    void subscribe(String key) throws IOException;
}
