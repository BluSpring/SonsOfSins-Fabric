/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.sonsofsins.client.renderer;

import net.mcreator.sonsofsins.client.model.Modelenvy;
import net.mcreator.sonsofsins.entity.IronHitEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class IronHitRenderer
extends MobRenderer<IronHitEntity, Modelenvy<IronHitEntity>> {
    public IronHitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelenvy(context.bakeLayer(Modelenvy.LAYER_LOCATION)), 0.5f);
    }

    public ResourceLocation getTextureLocation(IronHitEntity entity) {
        if (entity.getExtraCustomData().getBoolean("tagTarget")) {
            return new ResourceLocation("sons_of_sins:textures/entities/envy/iron_hit_is_target.png");
        }
        return new ResourceLocation("sons_of_sins:textures/entities/envy/iron_hit_passive.png");
    }
}

