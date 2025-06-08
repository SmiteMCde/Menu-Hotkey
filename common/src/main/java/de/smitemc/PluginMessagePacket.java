package de.smitemc;

import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Objects;

public class PluginMessagePacket implements CustomPacketPayload {
    private final ResourceLocation channel;
    private final byte[] data;

    public PluginMessagePacket(ResourceLocation channel, byte[] data) {
        this.channel = Objects.requireNonNull(channel, "Channel cannot be null");
        this.data = data;
    }

    @Override
    public @NotNull Type<? extends CustomPacketPayload> type() {
        return new CustomPacketPayload.Type<>(channel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PluginMessagePacket that = (PluginMessagePacket) o;
        return Objects.deepEquals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }
}
