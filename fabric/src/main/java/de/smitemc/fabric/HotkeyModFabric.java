package de.smitemc.fabric;

import net.fabricmc.api.ModInitializer;

import de.smitemc.HotkeyMod;

public final class HotkeyModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        HotkeyMod.init();
    }
}
