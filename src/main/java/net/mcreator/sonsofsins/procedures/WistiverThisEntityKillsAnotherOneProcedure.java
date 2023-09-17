/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 */
package net.mcreator.sonsofsins.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class WistiverThisEntityKillsAnotherOneProcedure {
    public static void execute(Entity sourceentity) {
        LivingEntity _livEnt;
        if (sourceentity == null) {
            return;
        }
        if (sourceentity instanceof LivingEntity && (_livEnt = (LivingEntity)sourceentity).hasEffect(MobEffects.DAMAGE_BOOST)) {
            if (sourceentity instanceof LivingEntity) {
                LivingEntity _livEnt2;
                LivingEntity _entity = (LivingEntity)sourceentity;
                _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 19200, (sourceentity instanceof LivingEntity && (_livEnt2 = (LivingEntity)sourceentity).hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt2.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) + 1, false, false));
            }
        } else if (sourceentity instanceof LivingEntity) {
            LivingEntity _entity = (LivingEntity)sourceentity;
            _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 19200, 0, false, false));
        }
        if (sourceentity instanceof LivingEntity) {
            LivingEntity _entity = (LivingEntity)sourceentity;
            _entity.addEffect(new MobEffectInstance(MobEffects.HARM, 1, 4, false, false));
        }
    }
}

