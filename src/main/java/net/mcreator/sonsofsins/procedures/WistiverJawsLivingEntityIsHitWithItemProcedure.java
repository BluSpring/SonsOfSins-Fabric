/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.init.SonsOfSinsModParticleTypes;
import net.mcreator.sonsofsins.network.SonsOfSinsModVariables;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;

public class WistiverJawsLivingEntityIsHitWithItemProcedure {
    public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, ItemStack itemstack) {
        LivingEntity _entity;
        if (entity == null || sourceentity == null) {
            return;
        }
        if (world instanceof ServerLevel _level) {
            _level.sendParticles((ParticleOptions) SonsOfSinsModParticleTypes.SIN_BLOOD.get(), entity.getX(), entity.getY(), entity.getZ(), 6, 0.3, 0.3, 0.3, 0.01);
        }
        if (sourceentity instanceof LivingEntity) {
            _entity = (LivingEntity)sourceentity;
            _entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 0));
        }
        if (sourceentity instanceof LivingEntity) {
            _entity = (LivingEntity)sourceentity;
            _entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1, 1));
        }
        if (itemstack.getOrCreateTag().getDouble("Damage") < SonsOfSinsModVariables.MapVariables.get(world).wistiverjawlimit) {
            itemstack.getOrCreateTag().putDouble("Damage", itemstack.getOrCreateTag().getDouble("Damage") + 1.0);
        }
        entity.hurt(DamageSource.OUT_OF_WORLD, (float)itemstack.getOrCreateTag().getDouble("Damage"));
    }
}

