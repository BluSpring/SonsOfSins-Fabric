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

import net.mcreator.sonsofsins.procedures.SlothOnEffectActiveTickProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;

public class SlothMobEffect
extends MobEffect {
    public SlothMobEffect() {
        super(MobEffectCategory.NEUTRAL, -10275770);
    }

    public String getDescriptionId() {
        return "effect.sons_of_sins.sloth";
    }

    public void applyEffectTick(LivingEntity entity, int amplifier) {
        SlothOnEffectActiveTickProcedure.execute(entity.level, entity);
    }

    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}

