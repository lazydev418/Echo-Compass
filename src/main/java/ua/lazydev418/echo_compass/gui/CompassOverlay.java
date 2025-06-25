package ua.lazydev418.echo_compass.gui;

import net.minecraft.resources.ResourceLocation;
import ua.lazydev418.echo_compass.EchoCompass;
import ua.lazydev418.echo_compass.interfaces.IPlayerTabOverlay;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.PlayerTabOverlay;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = EchoCompass.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.FORGE,
        value = {Dist.CLIENT}
)
public class CompassOverlay {

    @SubscribeEvent
    public static void onRenderGameOverlay(RenderGuiOverlayEvent.Pre event) {
        ResourceLocation overlayId = event.getOverlay().id();
        if(overlayId.equals(VanillaGuiOverlay.HOTBAR.id())) {
            Minecraft mc = Minecraft.getInstance();
            Player player = mc.player;
            if (player != null && !mc.options.renderDebug) {
                PlayerTabOverlay playerTabOverlay = mc.gui.getTabList();
                IPlayerTabOverlay gui = (IPlayerTabOverlay) playerTabOverlay;
                if (!gui.isVisible()) {
                    GuiGraphics graphics = event.getGuiGraphics();
                    int screenWidth = mc.getWindow().getGuiScaledWidth();
                    int centerX = screenWidth / 2;
                    float yaw = (player.getYRot() % 360 + 360) % 360;
                    CompassRenderer.renderBackgroundCompass(graphics, centerX);
                    CompassRenderer.renderCompass(graphics, mc, centerX, yaw);
                    CompassRenderer.renderInformation(graphics, mc, player, centerX, yaw);
                }
            }
        }
    }
}
