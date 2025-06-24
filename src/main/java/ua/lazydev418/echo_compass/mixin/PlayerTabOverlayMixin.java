package ua.lazydev418.echo_compass.mixin;

import net.minecraft.client.gui.components.PlayerTabOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import ua.lazydev418.echo_compass.interfaces.IPlayerTabOverlay;

@Mixin({PlayerTabOverlay.class})
public class PlayerTabOverlayMixin implements IPlayerTabOverlay {
    @Shadow
    private boolean visible;

    public boolean isVisible() {
        return this.visible;
    }
}
