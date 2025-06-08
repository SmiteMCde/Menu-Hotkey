package de.smitemc.neoforge;

import de.smitemc.interfaces.ServerAddressProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;

public class NeoForgeServerAddressProvider implements ServerAddressProvider {
    @Override
    public String getServerAddress() {
        Minecraft client = Minecraft.getInstance();
        ServerData data = client.getCurrentServer();
        return data != null ? data.ip : null;
    }
}
