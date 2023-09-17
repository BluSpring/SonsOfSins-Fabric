/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.ServerLevelAccessor
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.init.SonsOfSinsModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class GoodbyeEffectOnEffectActiveTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        double xcord = 0.0;
        double ycord = 0.0;
        double zcord = 0.0;
        if (entity.getDirection() == Direction.NORTH) {
            xcord = entity.getX();
            ycord = entity.getY();
            zcord = entity.getZ() + 2.0;
        } else if (entity.getDirection() == Direction.SOUTH) {
            xcord = entity.getX();
            ycord = entity.getY();
            zcord = entity.getZ() - 2.0;
        } else if (entity.getDirection() == Direction.EAST) {
            xcord = entity.getX() - 2.0;
            ycord = entity.getY();
            zcord = entity.getZ();
        } else {
            xcord = entity.getX() + 2.0;
            ycord = entity.getY();
            zcord = entity.getZ();
        }

        if (world instanceof ServerLevel _level) {
            var entities = SonsOfSinsModEntities.REGISTRY.getEntries().stream().toList();
            // maybe there's good reason for why it was the way it was,
            // but we don't need that, let's just make it a fair random chance.
            var entityToSpawn = entities.get(world.getRandom().nextInt(entities.size())).get().create(_level);

            entityToSpawn.moveTo(xcord, ycord, zcord, 0.0f, 0.0f);
            entityToSpawn.setYBodyRot(0.0f);
            entityToSpawn.setYHeadRot(0.0f);
            if (entityToSpawn instanceof Mob _mobToSpawn) {
                _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(entityToSpawn);
        }

        if (world instanceof Level level) {
            if (!world.isClientSide()) {
                world.playSound(null, new BlockPos(x, y, z), SoundEvents.WITHER_SPAWN, SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                level.playLocalSound(x, y, z, SoundEvents.WITHER_SPAWN, SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
    }
}

