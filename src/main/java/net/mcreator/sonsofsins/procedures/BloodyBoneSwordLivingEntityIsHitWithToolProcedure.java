/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.entity.Entity
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.entity.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;

public class BloodyBoneSwordLivingEntityIsHitWithToolProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof WistiverEntity || entity instanceof WalkingBedEntity || entity instanceof ProwlerEntity || entity instanceof IronHitEntity || entity instanceof CurseEntity || entity instanceof BloodyDriverEntity || entity instanceof BloodyButcherEntity) {
            entity.hurt(DamageSource.HOT_FLOOR, 30.0f);
        }
    }
}

