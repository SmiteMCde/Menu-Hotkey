package de.smitemc.fabric.client;

import de.smitemc.interfaces.ServerAddressProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;

public class FabricServerAddressProvider implements ServerAddressProvider {
    @Override
    public String getServerAddress() {
        Minecraft minecraft = Minecraft.getInstance();
        ServerData data = minecraft.getCurrentServer();
        return data != null ? data.ip : null;
    }
}
