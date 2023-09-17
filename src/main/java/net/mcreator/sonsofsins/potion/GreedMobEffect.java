/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.effect.MobEffect
 *  net.minecraft.world.effect.MobEffectCategory
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.sonsofsins.potion;

import net.mcreator.sonsofsins.procedures.GreedOnEffectActiveTickProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;

public class GreedMobEffect
extends MobEffect {
    public GreedMobEffect() {
        super(MobEffectCategory.NEUTRAL, -10275770);
    }

    public String getDescriptionId() {
        return "effect.sons_of_sins.greed";
    }

    public void applyEffectTick(LivingEntity entity, int amplifier) {
        GreedOnEffectActiveTickProcedure.execute((LevelAccessor)entity.level, (Entity)entity);
    }

    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}

