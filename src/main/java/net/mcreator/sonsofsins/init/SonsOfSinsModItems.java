/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.item.BlockItem
 *  net.minecraft.world.item.CreativeModeTab
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.level.block.Block
 *  net.minecraftforge.common.LazySpawnEggItem
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.sonsofsins.init;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.LazySpawnEggItem;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.mcreator.sonsofsins.item.*;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


public class SonsOfSinsModItems {
    public static final LazyRegistrar<Item> REGISTRY = LazyRegistrar.create(Registry.ITEM, "sons_of_sins");
    public static final RegistryObject<Item> IRON_OVEN_BLOCK = SonsOfSinsModItems.block(SonsOfSinsModBlocks.IRON_OVEN_BLOCK, SonsOfSinsModTabs.TAB_SONS_OF_SINS_TAB);
    public static final RegistryObject<Item> WISTIVER_JAWS = REGISTRY.register("wistiver_jaws", () -> new WistiverJawsItem());
    public static final RegistryObject<Item> PEACEFUL_BED = REGISTRY.register("peaceful_bed", () -> new PeacefulBedItem());
    public static final RegistryObject<Item> PROWLER_S_HAND = REGISTRY.register("prowler_s_hand", () -> new ProwlerSHandItem());
    public static final RegistryObject<Item> IRON_MOTOR = REGISTRY.register("iron_motor", () -> new IronMotorItem());
    public static final RegistryObject<Item> CURSED_HEAD = REGISTRY.register("cursed_head", () -> new CursedHeadItem());
    public static final RegistryObject<Item> BLOODY_PUDDLE = REGISTRY.register("bloody_puddle", () -> new BloodyPuddleItem());
    public static final RegistryObject<Item> BUTCHER_CARCASS = REGISTRY.register("butcher_carcass", () -> new ButcherCarcassItem());
    public static final RegistryObject<Item> WISTIVER = REGISTRY.register("wistiver_spawn_egg", () -> new LazySpawnEggItem(SonsOfSinsModEntities.WISTIVER, -4277844, -9422257, new Item.Properties().tab(SonsOfSinsModTabs.TAB_SONS_OF_SINS_TAB)));
    public static final RegistryObject<Item> WALKING_BED = REGISTRY.register("walking_bed_spawn_egg", () -> new LazySpawnEggItem(SonsOfSinsModEntities.WALKING_BED, -7125696, -1318179, new Item.Properties().tab(SonsOfSinsModTabs.TAB_SONS_OF_SINS_TAB)));
    public static final RegistryObject<Item> PROWLER = REGISTRY.register("prowler_spawn_egg", () -> new LazySpawnEggItem(SonsOfSinsModEntities.PROWLER, -723724, -3891297, new Item.Properties().tab(SonsOfSinsModTabs.TAB_SONS_OF_SINS_TAB)));
    public static final RegistryObject<Item> IRON_HIT = REGISTRY.register("iron_hit_spawn_egg", () -> new LazySpawnEggItem(SonsOfSinsModEntities.IRON_HIT, -12632510, -7549423, new Item.Properties().tab(SonsOfSinsModTabs.TAB_SONS_OF_SINS_TAB)));
    public static final RegistryObject<Item> CURSE = REGISTRY.register("curse_spawn_egg", () -> new LazySpawnEggItem(SonsOfSinsModEntities.CURSE, -3410565, -7549423, new Item.Properties().tab(SonsOfSinsModTabs.TAB_SONS_OF_SINS_TAB)));
    public static final RegistryObject<Item> BLOODY_DRIVER = REGISTRY.register("bloody_driver_spawn_egg", () -> new LazySpawnEggItem(SonsOfSinsModEntities.BLOODY_DRIVER, -6723213, -11392712, new Item.Properties().tab(SonsOfSinsModTabs.TAB_SONS_OF_SINS_TAB)));
    public static final RegistryObject<Item> BLOODY_BUTCHER = REGISTRY.register("bloody_butcher_spawn_egg", () -> new LazySpawnEggItem(SonsOfSinsModEntities.BLOODY_BUTCHER, -2638146, -9422257, new Item.Properties().tab(SonsOfSinsModTabs.TAB_SONS_OF_SINS_TAB)));
    public static final RegistryObject<Item> BLOODY_BONE = REGISTRY.register("bloody_bone", () -> new BloodyBoneItem());
    public static final RegistryObject<Item> BLOODY_BONE_PICKAXE = REGISTRY.register("bloody_bone_pickaxe", () -> new BloodyBonePickaxeItem());
    public static final RegistryObject<Item> BLOODY_BONE_AXE = REGISTRY.register("bloody_bone_axe", () -> new BloodyBoneAxeItem());
    public static final RegistryObject<Item> BLOODY_BONE_SWORD = REGISTRY.register("bloody_bone_sword", () -> new BloodyBoneSwordItem());
    public static final RegistryObject<Item> BLOODY_BONE_SHOVEL = REGISTRY.register("bloody_bone_shovel", () -> new BloodyBoneShovelItem());
    public static final RegistryObject<Item> BLOODY_BONE_HOE = REGISTRY.register("bloody_bone_hoe", () -> new BloodyBoneHoeItem());
    public static final RegistryObject<Item> BLOODY_PROJECTILE = REGISTRY.register("bloody_projectile", () -> new BloodyProjectileItem());
    public static final RegistryObject<Item> ROTTEN_APPLE = REGISTRY.register("rotten_apple", () -> new RottenAppleItem());
    public static final RegistryObject<Item> SIN_APPLE = SonsOfSinsModItems.block(SonsOfSinsModBlocks.SIN_APPLE, null);
    public static final RegistryObject<Item> STRUCTURE_SPAWNER = SonsOfSinsModItems.block(SonsOfSinsModBlocks.STRUCTURE_SPAWNER, null);

    private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
}

