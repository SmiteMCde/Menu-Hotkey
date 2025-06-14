package de.smitemc;

import dev.architectury.event.events.client.ClientTickEvent;
import dev.architectury.networking.NetworkManager;
import dev.architectury.registry.client.keymappings.KeyMappingRegistry;
import net.minecraft.client.KeyMapping;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.lwjgl.glfw.GLFW;

public final class HotkeyMod {
    public static final String MOD_ID = "smitemc_hotkey";
    public static KeyMapping HOTKEY = new KeyMapping("key.smitemc_hotkey.menu", GLFW.GLFW_KEY_Z, "key.categories.smitemc_hotkey");

    public static void init() {
        KeyMappingRegistry.register(HOTKEY);

        ClientTickEvent.CLIENT_POST.register(client -> {
            while (HOTKEY.consumeClick()) {
                if (PlatformServices.SERVER_ADDRESS_PROVIDER.getServerAddress().toLowerCase().endsWith("smitemc.de") && client.player != null) {
                    NetworkManager.sendToServer(new PluginMessagePacket(ResourceLocation.bySeparator("smitemc:menu_hotkey", ':'), new byte[0]));
                } else {
                    assert client.player != null;
                    client.player.displayClientMessage(Component.translatable("message.smitemc_hotkey.not_on_smitemc"), true);
                }
            }
        });
    }
}
