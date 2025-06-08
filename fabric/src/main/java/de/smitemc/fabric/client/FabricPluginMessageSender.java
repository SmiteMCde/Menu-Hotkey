package de.smitemc.fabric.client;

import de.smitemc.interfaces.PluginMessageSender;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class FabricPluginMessageSender implements PluginMessageSender {
    @Override
    public void sendPluginMessage(@NotNull UUID uniqueId, String channel, byte[] data) {
    }
}
