/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EquipmentSlot
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.item.ItemEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.init.SonsOfSinsModParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class CursedHeadLivingEntityIsHitWithItemProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        if (entity == null || sourceentity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {

            ItemEntity entityToSpawn;

            if (!sourceentity.isShiftKeyDown() && Math.random() < 0.8) {
                Player _player;
                LivingEntity _entGetArmor;
                if (world instanceof Level && !world.isClientSide()) {
                    ItemStack itemStack;
                    if (entity instanceof LivingEntity) {
                        _entGetArmor = (LivingEntity)entity;
                        itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
                    } else {
                        itemStack = ItemStack.EMPTY;
                    }
                    entityToSpawn = new ItemEntity((Level)world, x, y, z, itemStack);
                    entityToSpawn.setPickUpDelay(10);
                    world.addFreshEntity(entityToSpawn);
                }
                if (world instanceof Level && !world.isClientSide()) {
                    ItemStack itemStack;
                    if (entity instanceof LivingEntity) {
                        _entGetArmor = (LivingEntity)entity;
                        itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
                    } else {
                        itemStack = ItemStack.EMPTY;
                    }
                    entityToSpawn = new ItemEntity((Level)world, x, y, z, itemStack);
                    entityToSpawn.setPickUpDelay(10);
                    world.addFreshEntity(entityToSpawn);
                }
                if (world instanceof Level && !world.isClientSide()) {
                    ItemStack itemStack;
                    if (entity instanceof LivingEntity) {
                        _entGetArmor = (LivingEntity)entity;
                        itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.LEGS);
                    } else {
                        itemStack = ItemStack.EMPTY;
                    }
                    entityToSpawn = new ItemEntity((Level)world, x, y, z, itemStack);
                    entityToSpawn.setPickUpDelay(10);
                    world.addFreshEntity(entityToSpawn);
                }
                if (world instanceof Level && !world.isClientSide()) {
                    ItemStack itemStack;
                    if (entity instanceof LivingEntity) {
                        _entGetArmor = (LivingEntity)entity;
                        itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.FEET);
                    } else {
                        itemStack = ItemStack.EMPTY;
                    }
                    entityToSpawn = new ItemEntity((Level)world, x, y, z, itemStack);
                    entityToSpawn.setPickUpDelay(10);
                    world.addFreshEntity(entityToSpawn);
                }
                if (entity instanceof Player) {
                    _player = (Player)entity;
                    _player.getInventory().armor.set(3, ItemStack.EMPTY);
                    _player.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    
                    entity.setItemSlot(EquipmentSlot.HEAD, ItemStack.EMPTY);
                }
                
                if (entity instanceof Player) {
                    _player = (Player)entity;
                    _player.getInventory().armor.set(2, ItemStack.EMPTY);
                    _player.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    
                    entity.setItemSlot(EquipmentSlot.CHEST, ItemStack.EMPTY);
                }
                
                if (entity instanceof Player) {
                    _player = (Player)entity;
                    _player.getInventory().armor.set(1, ItemStack.EMPTY);
                    _player.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    
                    entity.setItemSlot(EquipmentSlot.LEGS, ItemStack.EMPTY);
                }
                
                if (entity instanceof Player) {
                    _player = (Player)entity;
                    _player.getInventory().armor.set(0, ItemStack.EMPTY);
                    _player.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    
                    entity.setItemSlot(EquipmentSlot.FEET, ItemStack.EMPTY);
                }
            }
            if (sourceentity.isShiftKeyDown() && Math.random() < 0.8) {
                if (world instanceof Level && !world.isClientSide()) {
                    ItemStack itemStack;
                    if (entity instanceof LivingEntity _livEnt) {
                        itemStack = _livEnt.getMainHandItem();
                    } else {
                        itemStack = ItemStack.EMPTY;
                    }
                    entityToSpawn = new ItemEntity((Level)world, x, y, z, itemStack);
                    entityToSpawn.setPickUpDelay(10);
                    world.addFreshEntity(entityToSpawn);
                }
                if (entity instanceof LivingEntity living) {
                    ItemStack _setstack = ItemStack.EMPTY;
                    _setstack.setCount(1);
                    living.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                    if (entity instanceof Player _player) {
                        _player.getInventory().setChanged();
                    }
                }
            }
            if (world instanceof ServerLevel level) {
                level.sendParticles((ParticleOptions) SonsOfSinsModParticleTypes.SIN_SOUL.get(), entity.getX(), entity.getY(), entity.getZ(), 6, 0.3, 0.3, 0.3, 0.01);
            }
        }
    }
}

