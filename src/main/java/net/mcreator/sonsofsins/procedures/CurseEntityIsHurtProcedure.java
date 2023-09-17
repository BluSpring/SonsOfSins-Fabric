/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.animal.Animal
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.init.SonsOfSinsModGameRules;
import net.mcreator.sonsofsins.init.SonsOfSinsModParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;

public class CurseEntityIsHurtProcedure {
    public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
        if (entity == null || sourceentity == null) {
            return;
        }
        if (Math.random() < 0.25 && (sourceentity instanceof Mob || sourceentity instanceof Player || sourceentity instanceof Animal)) {
            sourceentity.setDeltaMovement(new Vec3((entity.getX() - sourceentity.getX()) * 0.5, (entity.getY() - sourceentity.getY()) * 0.5, (entity.getZ() - sourceentity.getZ()) * 0.5));
        }
        if (world instanceof ServerLevel _level) {
            _level.sendParticles((ParticleOptions) SonsOfSinsModParticleTypes.SIN_SOUL.get(), entity.getX(), entity.getY(), entity.getZ(), 6, 0.3, 0.3, 0.3, 0.01);
        }
        if (world.getLevelData().getGameRules().getBoolean(SonsOfSinsModGameRules.SONSGRIEFING)) {
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()), Math.floor(entity.getY()), Math.floor(entity.getZ())), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()), Math.floor(entity.getY()) + 1.0, Math.floor(entity.getZ())), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()) + 1.0, Math.floor(entity.getY()), Math.floor(entity.getZ())), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()) + 1.0, Math.floor(entity.getY()) + 1.0, Math.floor(entity.getZ())), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()) - 1.0, Math.floor(entity.getY()), Math.floor(entity.getZ())), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()) - 1.0, Math.floor(entity.getY()) + 1.0, Math.floor(entity.getZ())), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()), Math.floor(entity.getY()), Math.floor(entity.getZ()) + 1.0), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()), Math.floor(entity.getY()) + 1.0, Math.floor(entity.getZ()) + 1.0), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()), Math.floor(entity.getY()), Math.floor(entity.getZ()) - 1.0), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()), Math.floor(entity.getY()) + 1.0, Math.floor(entity.getZ()) - 1.0), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()) + 1.0, Math.floor(entity.getY()), Math.floor(entity.getZ()) - 1.0), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()) + 1.0, Math.floor(entity.getY()) + 1.0, Math.floor(entity.getZ()) - 1.0), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()) - 1.0, Math.floor(entity.getY()), Math.floor(entity.getZ()) + 1.0), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()) - 1.0, Math.floor(entity.getY()) + 1.0, Math.floor(entity.getZ()) + 1.0), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()) + 1.0, Math.floor(entity.getY()), Math.floor(entity.getZ()) + 1.0), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()) + 1.0, Math.floor(entity.getY()) + 1.0, Math.floor(entity.getZ()) + 1.0), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()) - 1.0, Math.floor(entity.getY()), Math.floor(entity.getZ()) - 1.0), false);
            world.destroyBlock(new BlockPos(Math.floor(entity.getX()) - 1.0, Math.floor(entity.getY()) + 1.0, Math.floor(entity.getZ()) - 1.0), false);
        }
    }
}

