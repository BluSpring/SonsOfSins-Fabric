/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.chat.Component
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.SwordItem
 *  net.minecraft.world.item.Tier
 *  net.minecraft.world.item.TooltipFlag
 *  net.minecraft.world.item.crafting.Ingredient
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 */
package net.mcreator.sonsofsins.item;

import net.mcreator.sonsofsins.init.SonsOfSinsModItems;
import net.mcreator.sonsofsins.init.SonsOfSinsModTabs;
import net.mcreator.sonsofsins.procedures.BloodyBoneSwordLivingEntityIsHitWithToolProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

import java.util.List;

public class BloodyBoneSwordItem
extends SwordItem {
    public BloodyBoneSwordItem() {
        super(new Tier(){

            public int getUses() {
                return 2450;
            }

            public float getSpeed() {
                return 6.0f;
            }

            public float getAttackDamageBonus() {
                return 3.0f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 14;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(SonsOfSinsModItems.BLOODY_BONE.get()));
            }
        }, 3, -2.4f, new Item.Properties().tab(SonsOfSinsModTabs.TAB_SONS_OF_SINS_TAB).fireResistant());
    }

    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        BloodyBoneSwordLivingEntityIsHitWithToolProcedure.execute(entity);
        return retval;
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.literal("\u00a75\u00a7oSeems more effective against the Sons of sins..."));
    }
}

