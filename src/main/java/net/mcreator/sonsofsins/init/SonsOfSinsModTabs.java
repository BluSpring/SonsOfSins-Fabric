/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.item.CreativeModeTab
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.ItemLike
 */
package net.mcreator.sonsofsins.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.mcreator.sonsofsins.SonsOfSinsMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

public class SonsOfSinsModTabs {
    public static CreativeModeTab TAB_SONS_OF_SINS_TAB;

    public static void load() {
        TAB_SONS_OF_SINS_TAB = FabricItemGroupBuilder.create(new ResourceLocation(SonsOfSinsMod.MODID, "tab"))
                .icon(() -> new ItemStack((ItemLike)SonsOfSinsModItems.BUTCHER_CARCASS.get()))
                .build();
    }
}

