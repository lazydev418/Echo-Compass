package ua.lazydev418.echo_compass_hud.enums;

import net.minecraft.network.chat.Component;

public enum DirectionLabel {
    SOUTH("direction.south", "direction.short.south"),
    SOUTHWEST("direction.southwest", "direction.short.sw"),
    WEST("direction.west", "direction.short.west"),
    NORTHWEST("direction.northwest", "direction.short.nw"),
    NORTH("direction.north", "direction.short.north"),
    NORTHEAST("direction.northeast", "direction.short.ne"),
    EAST("direction.east", "direction.short.east"),
    SOUTHEAST("direction.southeast", "direction.short.se");

    private final String fullKey;
    private final String shortKey;

    DirectionLabel(String fullKey, String shortKey) {
        this.fullKey = fullKey;
        this.shortKey = shortKey;
    }

    public Component getFull() {
        return Component.translatable(fullKey);
    }

    public Component getShort() {
        return Component.translatable(shortKey);
    }
}
