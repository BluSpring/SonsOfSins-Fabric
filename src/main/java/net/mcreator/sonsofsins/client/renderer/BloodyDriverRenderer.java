/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.sonsofsins.client.renderer;

import net.mcreator.sonsofsins.client.model.Modelgreed;
import net.mcreator.sonsofsins.entity.BloodyDriverEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BloodyDriverRenderer
extends MobRenderer<BloodyDriverEntity, Modelgreed<BloodyDriverEntity>> {
    public BloodyDriverRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelgreed(context.bakeLayer(Modelgreed.LAYER_LOCATION)), 0.0f);
    }

    public ResourceLocation getTextureLocation(BloodyDriverEntity entity) {
        if (entity.getExtraCustomData().getBoolean("tagTarget")) {
            return new ResourceLocation("sons_of_sins:textures/entities/greed/blood_is_target.png");
        }
        return new ResourceLocation("sons_of_sins:textures/entities/greed/blood_passive.png");
    }
}

