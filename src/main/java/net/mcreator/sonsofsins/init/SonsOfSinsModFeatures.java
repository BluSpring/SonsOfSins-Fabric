/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.level.levelgen.feature.Feature
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.sonsofsins.init;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.mcreator.sonsofsins.world.features.StrangeHouseFeature;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.Feature;

public class SonsOfSinsModFeatures {
    public static final LazyRegistrar<Feature<?>> REGISTRY = LazyRegistrar.create(Registry.FEATURE, "sons_of_sins");
    public static final RegistryObject<Feature<?>> STRANGE_HOUSE = REGISTRY.register("strange_house", StrangeHouseFeature::feature);
}

