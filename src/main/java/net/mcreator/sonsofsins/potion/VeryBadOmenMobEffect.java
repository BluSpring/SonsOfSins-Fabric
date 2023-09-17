/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.effect.MobEffect
 *  net.minecraft.world.effect.MobEffectCategory
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.ai.attributes.AttributeMap
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.sonsofsins.potion;

import net.mcreator.sonsofsins.procedures.GoodbyeEffectOnEffectActiveTickProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.level.LevelAccessor;

public class VeryBadOmenMobEffect
extends MobEffect {
    public VeryBadOmenMobEffect() {
        super(MobEffectCategory.HARMFUL, -1);
    }

    public String getDescriptionId() {
        return "effect.sons_of_sins.very_bad_omen";
    }

    public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        super.removeAttributeModifiers(entity, attributeMap, amplifier);
        GoodbyeEffectOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
    }

    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}

