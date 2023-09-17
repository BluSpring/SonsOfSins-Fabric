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
        if (entity instanceof LivingEntity living) {
            if (!sourceentity.isShiftKeyDown() && Math.random() < 0.8) {
                if (world instanceof Level && !world.isClientSide()) {
                    for (EquipmentSlot slot : EquipmentSlot.values()) {
                        if (slot.getType() != EquipmentSlot.Type.ARMOR)
                            continue;

                        var itemStack = living.getItemBySlot(slot);
                        var itemEntity = new ItemEntity((Level) world, x, y, z, itemStack);
                        itemEntity.setPickUpDelay(10);
                        world.addFreshEntity(itemEntity);

                        if (living instanceof Player player) {
                            player.getInventory().armor.set(slot.getIndex(), ItemStack.EMPTY);
                        } else {
                            living.setItemSlot(slot, ItemStack.EMPTY);
                        }
                    }

                    if (living instanceof Player player) {
                        player.getInventory().setChanged();
                    }
                }
            }
            if (sourceentity.isShiftKeyDown() && Math.random() < 0.8) {
                if (world instanceof Level && !world.isClientSide()) {
                    for (InteractionHand hand : InteractionHand.values()) {
                        var itemStack = living.getItemInHand(hand);
                        var itemEntity = new ItemEntity((Level) world, x, y, z, itemStack);
                        itemEntity.setPickUpDelay(10);
                        world.addFreshEntity(itemEntity);

                        living.setItemInHand(hand, ItemStack.EMPTY);
                    }

                    if (living instanceof Player player) {
                        player.getInventory().setChanged();
                    }
                }
            }

            if (world instanceof ServerLevel level) {
                level.sendParticles((ParticleOptions) SonsOfSinsModParticleTypes.SIN_SOUL.get(), entity.getX(), entity.getY(), entity.getZ(), 6, 0.3, 0.3, 0.3, 0.01);
            }
        }
    }
}

