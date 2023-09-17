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

public class ButcherCarcassItemInInventoryTickProcedure {
    public static void execute(Entity entity) {
        if (entity == null)
            return;

        if (!(entity instanceof LivingEntity _entity))
            return;

        float health = _entity.getHealth();
        float maxHealth = _entity.getMaxHealth();

        if (health <= (maxHealth * 0.25)) {
            _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 1, false, false));
            _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 120, 2, false, false));
            _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120, 2, false, false));
            _entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 120, 2, false, false));
        }
    }
}

