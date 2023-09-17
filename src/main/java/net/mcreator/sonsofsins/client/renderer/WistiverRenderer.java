/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.sonsofsins.client.renderer;

import net.mcreator.sonsofsins.client.model.Modelgluttony;
import net.mcreator.sonsofsins.entity.WistiverEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WistiverRenderer
extends MobRenderer<WistiverEntity, Modelgluttony<WistiverEntity>> {
    public WistiverRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelgluttony(context.bakeLayer(Modelgluttony.LAYER_LOCATION)), 0.5f);
    }

    public ResourceLocation getTextureLocation(WistiverEntity entity) {
        if (entity.getExtraCustomData().getBoolean("tagTarget")) {
            return new ResourceLocation("sons_of_sins:textures/entities/gluttony/wistiver_is_target.png");
        }
        return new ResourceLocation("sons_of_sins:textures/entities/gluttony/wistiver_static.png");
    }
}

