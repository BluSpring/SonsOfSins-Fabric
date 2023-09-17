/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.level.block.Block
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.sonsofsins.init;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.mcreator.sonsofsins.block.IronOvenBlockBlock;
import net.mcreator.sonsofsins.block.SinAppleBlock;
import net.mcreator.sonsofsins.block.StructureSpawnerBlock;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public class SonsOfSinsModBlocks {
    public static final LazyRegistrar<Block> REGISTRY = LazyRegistrar.create(Registry.BLOCK, "sons_of_sins");
    public static final RegistryObject<Block> IRON_OVEN_BLOCK = REGISTRY.register("iron_oven_block", () -> new IronOvenBlockBlock());
    public static final RegistryObject<Block> SIN_APPLE = REGISTRY.register("sin_apple", () -> new SinAppleBlock());
    public static final RegistryObject<Block> STRUCTURE_SPAWNER = REGISTRY.register("structure_spawner", () -> new StructureSpawnerBlock());
}

