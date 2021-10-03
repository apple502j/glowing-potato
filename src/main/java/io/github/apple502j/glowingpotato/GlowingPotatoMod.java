package io.github.apple502j.glowingpotato;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GlowingPotatoMod implements ModInitializer {
    private static final Logger LOGGER = LogManager.getLogger("GlowingPotato");

    @Override
    public void onInitialize() {
        LOGGER.info("Loaded GlowingPotato. Glow berries will not grow under Y=128.");
    }
}
