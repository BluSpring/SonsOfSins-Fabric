/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.init.SonsOfSinsModParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class GreedOnEffectActiveTickProcedure {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null) {
            return;
        }
        Entity _ent = entity;
        _ent.teleportTo(entity.getX(), entity.getY(), entity.getZ());

        if (world instanceof ServerLevel _level) {
            _level.sendParticles((ParticleOptions) SonsOfSinsModParticleTypes.SIN_BLOOD.get(), entity.getX(), entity.getY(), entity.getZ(), 2, 0.3, 0.3, 0.3, 0.01);
        }
    }
}

