package de.smitemc.interfaces;

import java.util.UUID;

public interface PluginMessageSender {

    void sendPluginMessage(UUID uniqueId, String channel, byte[] data);

}
