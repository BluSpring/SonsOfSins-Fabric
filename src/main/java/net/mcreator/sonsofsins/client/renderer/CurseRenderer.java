/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.client.renderer.entity.RenderLayerParent
 *  net.minecraft.client.renderer.entity.layers.EyesLayer
 *  net.minecraft.client.renderer.entity.layers.RenderLayer
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.Level
 */
package net.mcreator.sonsofsins.client.renderer;

import net.mcreator.sonsofsins.client.model.Modellust;
import net.mcreator.sonsofsins.entity.CurseEntity;
import net.mcreator.sonsofsins.procedures.CurseTransparentEntityModelConditionProcedure;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class CurseRenderer
extends MobRenderer<CurseEntity, Modellust<CurseEntity>> {
    public CurseRenderer(EntityRendererProvider.Context context) {
        super(context, new Modellust(context.bakeLayer(Modellust.LAYER_LOCATION)), 0.5f);
        this.addLayer(new EyesLayer<>(this) {

            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("sons_of_sins:textures/entities/lust/curse_glowing_passive.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(CurseEntity entity) {
        if (entity.getExtraCustomData().getBoolean("tagTarget")) {
            return new ResourceLocation("sons_of_sins:textures/entities/lust/curse_is_target.png");
        }
        return new ResourceLocation("sons_of_sins:textures/entities/lust/curse_passive.png");
    }

    protected boolean isBodyVisible(CurseEntity _ent) {
        CurseEntity entity = _ent;
        Level world = entity.level;
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();
        return !CurseTransparentEntityModelConditionProcedure.execute();
    }
}

