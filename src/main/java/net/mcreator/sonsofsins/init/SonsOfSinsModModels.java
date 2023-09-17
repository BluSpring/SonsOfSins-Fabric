/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.EntityRenderersEvent$RegisterLayerDefinitions
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 */
package net.mcreator.sonsofsins.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.mcreator.sonsofsins.client.model.*;

public class SonsOfSinsModModels {
    public static void registerLayerDefinitions() {
        EntityModelLayerRegistry.registerModelLayer(Modelgreed.LAYER_LOCATION, Modelgreed::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(Modelwrath.LAYER_LOCATION, Modelwrath::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(Modeliron_oven.LAYER_LOCATION, Modeliron_oven::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(Modelpride.LAYER_LOCATION, Modelpride::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(Modelsloth.LAYER_LOCATION, Modelsloth::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(Modelgluttony.LAYER_LOCATION, Modelgluttony::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(Modellust.LAYER_LOCATION, Modellust::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(Modelenvy.LAYER_LOCATION, Modelenvy::createBodyLayer);
    }
}

