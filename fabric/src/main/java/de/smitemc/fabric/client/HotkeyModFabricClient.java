package de.smitemc.fabric.client;

import de.smitemc.PlatformServices;
import net.fabricmc.api.ClientModInitializer;

public final class HotkeyModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        PlatformServices.PLUGIN_MESSAGE_SENDER = new FabricPluginMessageSender();
        PlatformServices.SERVER_ADDRESS_PROVIDER = new FabricServerAddressProvider();
    }
}
