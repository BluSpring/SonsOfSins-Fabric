/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.sonsofsins.client.renderer;

import net.mcreator.sonsofsins.client.model.Modelpride;
import net.mcreator.sonsofsins.entity.ProwlerEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ProwlerRenderer
extends MobRenderer<ProwlerEntity, Modelpride<ProwlerEntity>> {
    public ProwlerRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelpride(context.bakeLayer(Modelpride.LAYER_LOCATION)), 0.5f);
    }

    public ResourceLocation getTextureLocation(ProwlerEntity entity) {
        if (entity.getExtraCustomData().getBoolean("tagTarget")) {
            return new ResourceLocation("sons_of_sins:textures/entities/pride/prowler_is_target.png");
        }
        return new ResourceLocation("sons_of_sins:textures/entities/pride/prowler_passive.png");
    }
}

