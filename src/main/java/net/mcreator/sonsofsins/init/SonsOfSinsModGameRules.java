/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.level.GameRules
 *  net.minecraft.world.level.GameRules$BooleanValue
 *  net.minecraft.world.level.GameRules$Category
 *  net.minecraft.world.level.GameRules$IntegerValue
 *  net.minecraft.world.level.GameRules$Key
 *  net.minecraft.world.level.GameRules$Type
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 */
package net.mcreator.sonsofsins.init;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.level.GameRules;

public class SonsOfSinsModGameRules {
    public static void init() {
    }

    public static final GameRules.Key<GameRules.BooleanValue> SONSGRIEFING = GameRuleRegistry.register("sonsGriefing", GameRules.Category.MOBS, (GameRules.Type)GameRules.BooleanValue.create(true));
    public static final GameRules.Key<GameRules.IntegerValue> WISTIVERJAWLIMIT = GameRuleRegistry.register("wistiverJawLimit", GameRules.Category.MISC, (GameRules.Type)GameRules.IntegerValue.create(666));
}

