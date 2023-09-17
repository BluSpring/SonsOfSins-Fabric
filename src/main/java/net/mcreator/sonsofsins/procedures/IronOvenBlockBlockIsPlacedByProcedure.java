/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.ServerLevelAccessor
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.entity.IronOvenEntity;
import net.mcreator.sonsofsins.init.SonsOfSinsModEntities;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;

public class IronOvenBlockBlockIsPlacedByProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (world instanceof ServerLevel) {
            ServerLevel _level = (ServerLevel)world;
            IronOvenEntity entityToSpawn = new IronOvenEntity((EntityType<IronOvenEntity>)((EntityType)SonsOfSinsModEntities.IRON_OVEN.get()), (Level)_level);
            entityToSpawn.moveTo(x + 0.5, y, z + 0.5, entity.getYRot(), 0.0f);
            entityToSpawn.setYBodyRot(entity.getYRot());
            entityToSpawn.setYHeadRot(entity.getYRot());
            if (entityToSpawn instanceof Mob) {
                Mob _mobToSpawn = (Mob)entityToSpawn;
                _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity((Entity)entityToSpawn);
        }
    }
}

