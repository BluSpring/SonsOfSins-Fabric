/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.entity.Entity
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.entity.ISinEntity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;

public class BloodyBoneSwordLivingEntityIsHitWithToolProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof ISinEntity) {
            entity.hurt(DamageSource.HOT_FLOOR, 30.0f);
        }
    }
}

