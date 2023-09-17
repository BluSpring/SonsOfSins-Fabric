/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.sonsofsins.client.renderer;

import net.mcreator.sonsofsins.client.model.Modeliron_oven;
import net.mcreator.sonsofsins.entity.IronOvenEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class IronOvenRenderer
extends MobRenderer<IronOvenEntity, Modeliron_oven<IronOvenEntity>> {
    public IronOvenRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeliron_oven(context.bakeLayer(Modeliron_oven.LAYER_LOCATION)), 0.0f);
    }

    public ResourceLocation getTextureLocation(IronOvenEntity entity) {
        return new ResourceLocation("sons_of_sins:textures/entities/iron_oven.png");
    }
}

