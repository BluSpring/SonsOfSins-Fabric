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

public class ProwlerSHandLivingEntityIsHitWithItemProcedure {
    public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
        if (entity == null || sourceentity == null) {
            return;
        }
        if (!sourceentity.isShiftKeyDown()) {
            entity.setDeltaMovement(new Vec3((entity.getX() - sourceentity.getX()) * 0.75, (entity.getY() - sourceentity.getY()) * 0.75, (entity.getZ() - sourceentity.getZ()) * 0.75));
        } else {
            entity.setDeltaMovement(new Vec3((sourceentity.getX() - entity.getX()) * 0.5, (sourceentity.getY() - entity.getY()) * 0.5, (sourceentity.getZ() - entity.getZ()) * 0.5));
        }
        if (world instanceof ServerLevel _level) {
            _level.sendParticles((ParticleOptions) SonsOfSinsModParticleTypes.SIN_BLOOD.get(), entity.getX(), entity.getY(), entity.getZ(), 6, 0.3, 0.3, 0.3, 0.01);
        }
    }
}

