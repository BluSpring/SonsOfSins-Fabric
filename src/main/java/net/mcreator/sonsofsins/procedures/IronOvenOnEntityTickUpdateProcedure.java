/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.init.SonsOfSinsModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;

public class IronOvenOnEntityTickUpdateProcedure {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null) {
            return;
        }
        entity.setDeltaMovement(new Vec3(0.0, 0.0, 0.0));
        Entity _ent = entity;
        _ent.setYRot(entity.getYRot());
        _ent.setXRot(0.0f);
        _ent.setYBodyRot(_ent.getYRot());
        _ent.setYHeadRot(_ent.getYRot());
        _ent.yRotO = _ent.getYRot();
        _ent.xRotO = _ent.getXRot();
        if (_ent instanceof LivingEntity _entity) {
            _entity.yBodyRotO = _entity.getYRot();
            _entity.yHeadRotO = _entity.getYRot();
        }
        if (world.getBlockState(new BlockPos(Math.floor(entity.getX()), Math.floor(entity.getY()), Math.floor(entity.getZ()))).getBlock() != SonsOfSinsModBlocks.IRON_OVEN_BLOCK.get() && !entity.level.isClientSide()) {
            entity.discard();
        }
    }
}

