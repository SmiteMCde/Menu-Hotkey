package de.smitemc;

import dev.architectury.event.events.client.ClientTickEvent;
import dev.architectury.registry.client.keymappings.KeyMappingRegistry;
import net.minecraft.client.KeyMapping;
import net.minecraft.network.chat.Component;
import org.lwjgl.glfw.GLFW;

public final class HotkeyMod {
    public static final String MOD_ID = "smitemc_hotkey";
    public static KeyMapping HOTKEY = new KeyMapping("key.smitemc_hotkey.menu", GLFW.GLFW_KEY_Z, "key.categories.smitemc_hotkey");

    public static void init() {
        KeyMappingRegistry.register(HOTKEY);

        ClientTickEvent.CLIENT_POST.register(client -> {
            while (HOTKEY.consumeClick()) {
                if (PlatformServices.SERVER_ADDRESS_PROVIDER.getServerAddress().toLowerCase().endsWith("smitemc.de")) {
                    PlatformServices.PLUGIN_MESSAGE_SENDER.sendPluginMessage("smitemc:hotkey", new byte[]{1});
                } else {
                    assert client.player != null;
                    client.player.displayClientMessage(Component.translatable("message.smitemc_hotkey.not_on_smitemc"), true);
                }
            }
        });
    }
}
