package de.smitemc;

import de.smitemc.interfaces.PluginMessageSender;
import de.smitemc.interfaces.ServerAddressProvider;

public class PlatformServices {

    public static PluginMessageSender PLUGIN_MESSAGE_SENDER = (channel, data) -> {};
    public static ServerAddressProvider SERVER_ADDRESS_PROVIDER = () -> null;

}
