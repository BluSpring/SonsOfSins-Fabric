/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraftforge.event.TickEvent$LevelTickEvent
 *  net.minecraftforge.event.TickEvent$Phase
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 */
package net.mcreator.sonsofsins.procedures;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.mcreator.sonsofsins.init.SonsOfSinsModGameRules;
import net.mcreator.sonsofsins.network.SonsOfSinsModVariables;
import net.minecraft.world.level.LevelAccessor;

public class WistiverJawLimitPrProcedure {
    public static void init() {
        ServerTickEvents.END_WORLD_TICK.register(WistiverJawLimitPrProcedure::execute);
    }

    private static void execute(LevelAccessor world) {
        var old = SonsOfSinsModVariables.MapVariables.get(world).wistiverjawlimit;
        SonsOfSinsModVariables.MapVariables.get(world).wistiverjawlimit = world.getLevelData().getGameRules().getInt(SonsOfSinsModGameRules.WISTIVERJAWLIMIT);

        if (old != SonsOfSinsModVariables.MapVariables.get(world).wistiverjawlimit)
            SonsOfSinsModVariables.MapVariables.get(world).syncData(world);
    }
}

