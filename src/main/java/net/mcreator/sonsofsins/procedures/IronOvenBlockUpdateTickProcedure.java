/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.init.SonsOfSinsModParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;

public class IronOvenBlockUpdateTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel) {
            ServerLevel _level = (ServerLevel)world;
            _level.sendParticles((ParticleOptions)((SimpleParticleType)SonsOfSinsModParticleTypes.SIN_SOUL.get()), x + 0.5, y + 1.9, z + 0.5, 2, 0.2, 0.2, 0.2, 0.0);
        }
    }
}

