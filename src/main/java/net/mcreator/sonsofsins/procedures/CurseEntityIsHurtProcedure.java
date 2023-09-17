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
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;
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
            var blockPos = new BlockPos.MutableBlockPos();
            for (int x = -1; x <= 1; x++) {
                for (int y = -1; y <= 1; y++) {
                    for (int z = -1; z <= 1; z++) {
                        blockPos.set((int) (entity.getX() + x), (int) (entity.getY() + y), (int) (entity.getZ() + z));
                        var blockState = world.getBlockState(blockPos);

                        // don't fucking break bedrock. why the fuck would you want it to break BEDROCK.
                        if (blockState.getBlock().defaultDestroyTime() < 0)
                            continue;

                        // and obsidian. my god, why.
                        if (blockState.getBlock().getExplosionResistance() >= 1000)
                            continue;

                        // don't fucking break gravestones
                        if (Registry.BLOCK.getKey(blockState.getBlock()).getNamespace().equals("gravestones"))
                            continue;

                        if (blockState.is(BlockTags.WITHER_IMMUNE) || blockState.is(BlockTags.DRAGON_IMMUNE))
                            continue;

                        if (blockState.getFluidState().getType() != Fluids.EMPTY)
                            continue;

                        world.destroyBlock(blockPos, false);
                        world.blockUpdated(blockPos, Blocks.AIR);
                    }
                }
            }
        }
    }
}

