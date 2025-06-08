package de.smitemc.interfaces;

public interface PluginMessageSender {

    void sendPluginMessage(String channel, byte[] data);

}
