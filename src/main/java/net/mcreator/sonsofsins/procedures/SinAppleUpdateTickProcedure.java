/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.level.block.state.BlockState
 */
package net.mcreator.sonsofsins.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class SinAppleUpdateTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getBlockState(new BlockPos(x, y + 1.0, z)).getBlock() != Blocks.OAK_LEAVES) {
            BlockPos _pos = new BlockPos(x, y, z);
            Block.dropResources((BlockState)world.getBlockState(_pos), (LevelAccessor)world, (BlockPos)new BlockPos(x, y, z), null);
            world.destroyBlock(_pos, false);
        }
    }
}

