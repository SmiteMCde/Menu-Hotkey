package de.smitemc.neoforge;

import de.smitemc.PlatformServices;
import net.neoforged.fml.common.Mod;

import de.smitemc.HotkeyMod;

@Mod(HotkeyMod.MOD_ID)
public final class HotkeyModNeoForge {
    public HotkeyModNeoForge() {
        PlatformServices.PLUGIN_MESSAGE_SENDER = new NeoForgePluginMessageSender();
        PlatformServices.SERVER_ADDRESS_PROVIDER = new NeoForgeServerAddressProvider();
        HotkeyMod.init();
    }
}
