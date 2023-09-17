/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.ThrownItemRenderer
 *  net.minecraft.world.entity.EntityType
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.EntityRenderersEvent$RegisterRenderers
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 */
package net.mcreator.sonsofsins.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.mcreator.sonsofsins.client.renderer.*;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;

public class SonsOfSinsModEntityRenderers {
    public static void init() {
        registerEntityRenderers();
    }

    public static void registerEntityRenderers() {
        EntityRendererRegistry.register(SonsOfSinsModEntities.WISTIVER.get(), WistiverRenderer::new);
        EntityRendererRegistry.register(SonsOfSinsModEntities.WALKING_BED.get(), WalkingBedRenderer::new);
        EntityRendererRegistry.register(SonsOfSinsModEntities.PROWLER.get(), ProwlerRenderer::new);
        EntityRendererRegistry.register(SonsOfSinsModEntities.IRON_HIT.get(), IronHitRenderer::new);
        EntityRendererRegistry.register(SonsOfSinsModEntities.CURSE.get(), CurseRenderer::new);
        EntityRendererRegistry.register(SonsOfSinsModEntities.BLOODY_DRIVER.get(), BloodyDriverRenderer::new);
        EntityRendererRegistry.register(SonsOfSinsModEntities.BLOODY_BUTCHER.get(), BloodyButcherRenderer::new);
        EntityRendererRegistry.register(SonsOfSinsModEntities.IRON_OVEN.get(), IronOvenRenderer::new);
        EntityRendererRegistry.register(SonsOfSinsModEntities.BLOODY_PROJECTILE.get(), ThrownItemRenderer::new);
    }
}

