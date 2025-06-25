package ua.lazydev418.echo_compass_hud;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(EchoCompassHUD.MOD_ID)
public class EchoCompassHUD {
    public static final String MOD_ID = "echo_compass_hud";

    public EchoCompassHUD() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
