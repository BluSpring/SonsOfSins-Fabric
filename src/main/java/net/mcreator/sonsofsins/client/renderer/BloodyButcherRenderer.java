/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.sonsofsins.client.renderer;

import net.mcreator.sonsofsins.client.model.Modelwrath;
import net.mcreator.sonsofsins.entity.BloodyButcherEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BloodyButcherRenderer
extends MobRenderer<BloodyButcherEntity, Modelwrath<BloodyButcherEntity>> {
    public BloodyButcherRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelwrath(context.bakeLayer(Modelwrath.LAYER_LOCATION)), 0.5f);
    }

    public ResourceLocation getTextureLocation(BloodyButcherEntity entity) {
        if (entity.getExtraCustomData().getBoolean("tagTarget")) {
            return new ResourceLocation("sons_of_sins:textures/entities/wrath/butcher_is_target.png");
        }
        return new ResourceLocation("sons_of_sins:textures/entities/wrath/butcher_passive.png");
    }
}

