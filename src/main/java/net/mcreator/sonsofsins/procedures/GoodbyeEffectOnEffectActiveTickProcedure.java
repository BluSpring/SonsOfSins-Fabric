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

import net.mcreator.sonsofsins.entity.*;
import net.mcreator.sonsofsins.init.SonsOfSinsModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class GoodbyeEffectOnEffectActiveTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        ServerLevel _level;
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
        if (Math.random() < 0.143) {
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                BloodyButcherEntity entityToSpawn = new BloodyButcherEntity(SonsOfSinsModEntities.BLOODY_BUTCHER.get(), _level);
                entityToSpawn.moveTo(xcord, ycord, zcord, 0.0f, 0.0f);
                entityToSpawn.setYBodyRot(0.0f);
                entityToSpawn.setYHeadRot(0.0f);
                if (entityToSpawn instanceof Mob) {
                    Mob _mobToSpawn = entityToSpawn;
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(entityToSpawn);
            }
        } else if (Math.random() < 0.143) {
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                BloodyDriverEntity entityToSpawn = new BloodyDriverEntity(SonsOfSinsModEntities.BLOODY_DRIVER.get(), _level);
                entityToSpawn.moveTo(xcord, ycord, zcord, 0.0f, 0.0f);
                entityToSpawn.setYBodyRot(0.0f);
                entityToSpawn.setYHeadRot(0.0f);
                if (entityToSpawn instanceof Mob) {
                    Mob _mobToSpawn = entityToSpawn;
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(entityToSpawn);
            }
        } else if (Math.random() < 0.143) {
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                CurseEntity entityToSpawn = new CurseEntity(SonsOfSinsModEntities.CURSE.get(), _level);
                entityToSpawn.moveTo(xcord, ycord, zcord, 0.0f, 0.0f);
                entityToSpawn.setYBodyRot(0.0f);
                entityToSpawn.setYHeadRot(0.0f);
                if (entityToSpawn instanceof Mob) {
                    Mob _mobToSpawn = entityToSpawn;
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(entityToSpawn);
            }
        } else if (Math.random() < 0.143) {
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                IronHitEntity entityToSpawn = new IronHitEntity(SonsOfSinsModEntities.IRON_HIT.get(), _level);
                entityToSpawn.moveTo(xcord, ycord, zcord, 0.0f, 0.0f);
                entityToSpawn.setYBodyRot(0.0f);
                entityToSpawn.setYHeadRot(0.0f);
                if (entityToSpawn instanceof Mob) {
                    Mob _mobToSpawn = entityToSpawn;
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(entityToSpawn);
            }
        } else if (Math.random() < 0.143) {
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                ProwlerEntity entityToSpawn = new ProwlerEntity(SonsOfSinsModEntities.PROWLER.get(), _level);
                entityToSpawn.moveTo(xcord, ycord, zcord, 0.0f, 0.0f);
                entityToSpawn.setYBodyRot(0.0f);
                entityToSpawn.setYHeadRot(0.0f);
                if (entityToSpawn instanceof Mob) {
                    Mob _mobToSpawn = entityToSpawn;
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(entityToSpawn);
            }
        } else if (Math.random() < 0.143) {
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                WalkingBedEntity entityToSpawn = new WalkingBedEntity(SonsOfSinsModEntities.WALKING_BED.get(), _level);
                entityToSpawn.moveTo(xcord, ycord, zcord, 0.0f, 0.0f);
                entityToSpawn.setYBodyRot(0.0f);
                entityToSpawn.setYHeadRot(0.0f);
                if (entityToSpawn instanceof Mob) {
                    Mob _mobToSpawn = entityToSpawn;
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(entityToSpawn);
            }
        } else if (world instanceof ServerLevel) {
            _level = (ServerLevel)world;
            WistiverEntity entityToSpawn = new WistiverEntity(SonsOfSinsModEntities.WISTIVER.get(), _level);
            entityToSpawn.moveTo(xcord, ycord, zcord, 0.0f, 0.0f);
            entityToSpawn.setYBodyRot(0.0f);
            entityToSpawn.setYHeadRot(0.0f);
            if (entityToSpawn instanceof Mob) {
                Mob _mobToSpawn = entityToSpawn;
                _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(entityToSpawn);
        }
        if (world instanceof Level level) {
            if (!world.isClientSide()) {
                world.playSound(null, new BlockPos(x, y, z), Registry.SOUND_EVENT.get(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                level.playLocalSound(x, y, z, Registry.SOUND_EVENT.get(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
    }
}

