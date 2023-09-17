package xyz.bluspring.sonsofsins.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.mcreator.sonsofsins.SonsOfSinsMod;
import net.mcreator.sonsofsins.init.SonsOfSinsModBlocks;
import net.mcreator.sonsofsins.init.SonsOfSinsModEntityRenderers;
import net.mcreator.sonsofsins.init.SonsOfSinsModModels;
import net.mcreator.sonsofsins.init.SonsOfSinsModParticles;
import net.minecraft.client.renderer.RenderType;

public class SonsOfSinsClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        SonsOfSinsModEntityRenderers.init();
        SonsOfSinsModModels.registerLayerDefinitions();
        SonsOfSinsModParticles.registerParticles();

        SonsOfSinsMod.PACKET_HANDLER.initClientListener();

        BlockRenderLayerMap.INSTANCE.putBlocks(
                RenderType.cutoutMipped(),
                SonsOfSinsModBlocks.IRON_OVEN_BLOCK.get(),
                SonsOfSinsModBlocks.SIN_APPLE.get()
        );
    }
}
