package ua.lazydev418.echo_compass;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(EchoCompass.MOD_ID)
public class EchoCompass {
    public static final String MOD_ID = "echo_compass";

    public EchoCompass() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
