/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EquipmentSlot
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.animal.Animal
 *  net.minecraft.world.entity.item.ItemEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.init.SonsOfSinsModParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;

public class CursePlayerCollidesWithThisEntityProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        Level _level;
        if (entity == null || sourceentity == null) {
            return;
        }
        if (Math.random() < 0.25 && (sourceentity instanceof Mob || sourceentity instanceof Player || sourceentity instanceof Animal)) {
            sourceentity.setDeltaMovement(new Vec3((entity.getX() - sourceentity.getX()) * 0.5, (entity.getY() - sourceentity.getY()) * 0.5, (entity.getZ() - sourceentity.getZ()) * 0.5));
        }
        if (Math.random() < 0.8) {
            LivingEntity _living;
            Player _player;
            Entity _entity;
            ItemEntity entityToSpawn;
            LivingEntity _entGetArmor;
            if (world instanceof Level && !(_level = (Level)world).isClientSide()) {
                ItemStack itemStack;
                if (entity instanceof LivingEntity) {
                    _entGetArmor = (LivingEntity)entity;
                    itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
                } else {
                    itemStack = ItemStack.EMPTY;
                }
                entityToSpawn = new ItemEntity(_level, x, y, z, itemStack);
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (world instanceof Level && !(_level = (Level)world).isClientSide()) {
                ItemStack itemStack;
                if (entity instanceof LivingEntity) {
                    _entGetArmor = (LivingEntity)entity;
                    itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
                } else {
                    itemStack = ItemStack.EMPTY;
                }
                entityToSpawn = new ItemEntity(_level, x, y, z, itemStack);
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (world instanceof Level && !(_level = (Level)world).isClientSide()) {
                ItemStack itemStack;
                if (entity instanceof LivingEntity) {
                    _entGetArmor = (LivingEntity)entity;
                    itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.LEGS);
                } else {
                    itemStack = ItemStack.EMPTY;
                }
                entityToSpawn = new ItemEntity(_level, x, y, z, itemStack);
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (world instanceof Level && !(_level = (Level)world).isClientSide()) {
                ItemStack itemStack;
                if (entity instanceof LivingEntity) {
                    _entGetArmor = (LivingEntity)entity;
                    itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.FEET);
                } else {
                    itemStack = ItemStack.EMPTY;
                }
                entityToSpawn = new ItemEntity(_level, x, y, z, itemStack);
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if ((_entity = entity) instanceof Player) {
                _player = (Player)_entity;
                _player.getInventory().armor.set(3, ItemStack.EMPTY);
                _player.getInventory().setChanged();
            } else if (_entity instanceof LivingEntity) {
                _living = (LivingEntity)_entity;
                _living.setItemSlot(EquipmentSlot.HEAD, ItemStack.EMPTY);
            }
            _entity = entity;
            if (_entity instanceof Player) {
                _player = (Player)_entity;
                _player.getInventory().armor.set(2, ItemStack.EMPTY);
                _player.getInventory().setChanged();
            } else if (_entity instanceof LivingEntity) {
                _living = (LivingEntity)_entity;
                _living.setItemSlot(EquipmentSlot.CHEST, ItemStack.EMPTY);
            }
            _entity = entity;
            if (_entity instanceof Player) {
                _player = (Player)_entity;
                _player.getInventory().armor.set(1, ItemStack.EMPTY);
                _player.getInventory().setChanged();
            } else if (_entity instanceof LivingEntity) {
                _living = (LivingEntity)_entity;
                _living.setItemSlot(EquipmentSlot.LEGS, ItemStack.EMPTY);
            }
            _entity = entity;
            if (_entity instanceof Player) {
                _player = (Player)_entity;
                _player.getInventory().armor.set(0, ItemStack.EMPTY);
                _player.getInventory().setChanged();
            } else if (_entity instanceof LivingEntity) {
                _living = (LivingEntity)_entity;
                _living.setItemSlot(EquipmentSlot.FEET, ItemStack.EMPTY);
            }
        }
        if (world instanceof ServerLevel serverLevel) {
            serverLevel.sendParticles((ParticleOptions) SonsOfSinsModParticleTypes.SIN_SOUL.get(), entity.getX(), entity.getY(), entity.getZ(), 6, 0.3, 0.3, 0.3, 0.01);
        }
    }
}

