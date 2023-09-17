/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.sonsofsins.client.renderer;

import net.mcreator.sonsofsins.client.model.Modelsloth;
import net.mcreator.sonsofsins.entity.WalkingBedEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WalkingBedRenderer
extends MobRenderer<WalkingBedEntity, Modelsloth<WalkingBedEntity>> {
    public WalkingBedRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelsloth(context.bakeLayer(Modelsloth.LAYER_LOCATION)), 0.5f);
    }

    public ResourceLocation getTextureLocation(WalkingBedEntity entity) {
        if (entity.getExtraCustomData().getBoolean("tagTarget")) {
            return new ResourceLocation("sons_of_sins:textures/entities/sloth/walking_bed_is_target.png");
        }
        return new ResourceLocation("sons_of_sins:textures/entities/sloth/walking_bed_passive.png");
    }
}

