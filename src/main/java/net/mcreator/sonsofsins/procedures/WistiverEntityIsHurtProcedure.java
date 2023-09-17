/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.init.SonsOfSinsModParticleTypes;
import net.mcreator.sonsofsins.network.SonsOfSinsModVariables;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class WistiverEntityIsHurtProcedure {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null) {
            return;
        }
        if (world instanceof ServerLevel _level) {
            _level.sendParticles((ParticleOptions) SonsOfSinsModParticleTypes.SIN_BLOOD.get(), entity.getX(), entity.getY(), entity.getZ(), 6, 0.3, 0.3, 0.3, 0.01);
        }
        if (SonsOfSinsModVariables.MapVariables.get(world).sonsgriefing) {
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

                        world.destroyBlock(blockPos, false);
                    }
                }
            }
        }
    }
}

