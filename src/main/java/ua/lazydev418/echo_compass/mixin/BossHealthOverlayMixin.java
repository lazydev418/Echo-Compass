package ua.lazydev418.echo_compass.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.BossHealthOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BossHealthOverlay.class)
public class BossHealthOverlayMixin {

    @Inject(method = "render", at = @At("HEAD"))
    private void BossBarYPosBefore(GuiGraphics gg, CallbackInfo ci) {
        PoseStack ps = gg.pose();
        ps.pushPose();
        ps.translate(0.0F, 48.0F, 0.0F);
    }

    @Inject(method = "render", at = @At("RETURN"))
    private void BossBarYPosAfter(GuiGraphics gg, CallbackInfo ci) {
        PoseStack ps = gg.pose();
        ps.popPose();
    }
}