/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.init.SonsOfSinsModParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;

public class SlothOnEffectActiveTickProcedure {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null) {
            return;
        }
        entity.setDeltaMovement(new Vec3(0.0, entity.getDeltaMovement().y(), 0.0));
        entity.setDeltaMovement(new Vec3(0.0, entity.getDeltaMovement().y(), 0.0));
        entity.setDeltaMovement(new Vec3(0.0, entity.getDeltaMovement().y(), 0.0));
        if (Math.random() < 0.1 && world instanceof ServerLevel _level) {
            _level.sendParticles((ParticleOptions) SonsOfSinsModParticleTypes.SLEEP_PA.get(), entity.getX(), entity.getY() + 1.9, entity.getZ(), 1, 0.25, 0.1, 0.25, 0.0);
        }
    }
}

