/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleType
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.sonsofsins.init;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;

public class SonsOfSinsModParticleTypes {
    public static final LazyRegistrar<ParticleType<?>> REGISTRY = LazyRegistrar.create(Registry.PARTICLE_TYPE, (String)"sons_of_sins");
    public static final RegistryObject<SimpleParticleType> SIN_BLOOD = REGISTRY.register("sin_blood", () -> FabricParticleTypes.simple(false));
    public static final RegistryObject<SimpleParticleType> SIN_SOUL = REGISTRY.register("sin_soul", () -> FabricParticleTypes.simple(false));
    public static final RegistryObject<SimpleParticleType> SLEEP_PA = REGISTRY.register("sleep_pa", () -> FabricParticleTypes.simple(false));
}

