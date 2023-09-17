/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.entity.projectile.Projectile
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.Level
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.entity.BloodyProjectileEntity;
import net.mcreator.sonsofsins.init.SonsOfSinsModEntities;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BloodyPuddleRightClickedInAirProcedure {
    public static void execute(Entity entity, ItemStack itemstack) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entity) {
            _entity.swing(InteractionHand.MAIN_HAND, true);
        }
        Entity _shootFrom = entity;
        Level projectileLevel = _shootFrom.level;
        if (!projectileLevel.isClientSide()) {
            Projectile _entityToSpawn = new Object(){

                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                    BloodyProjectileEntity entityToSpawn = new BloodyProjectileEntity((SonsOfSinsModEntities.BLOODY_PROJECTILE.get()), level);
                    entityToSpawn.setOwner(shooter);
                    entityToSpawn.setBaseDamage(damage);
                    entityToSpawn.setKnockback(knockback);
                    entityToSpawn.setSilent(true);
                    return entityToSpawn;
                }
            }.getArrow(projectileLevel, entity, 1.0f, 0);
            _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
            _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.5f, 0.0f);
            projectileLevel.addFreshEntity(_entityToSpawn);
        }
        if (entity instanceof Player _player) {
            _player.getCooldowns().addCooldown(itemstack.getItem(), 5);
        }
    }
}

