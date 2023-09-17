/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.Rarity
 *  net.minecraft.world.item.UseAnim
 */
package net.mcreator.sonsofsins.item;

import net.mcreator.sonsofsins.init.SonsOfSinsModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;

public class BloodyBoneItem
extends Item {
    public BloodyBoneItem() {
        super(new Item.Properties().tab(SonsOfSinsModTabs.TAB_SONS_OF_SINS_TAB).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }
}

