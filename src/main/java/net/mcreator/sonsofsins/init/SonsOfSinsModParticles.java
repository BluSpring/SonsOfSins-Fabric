/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleType
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.ParticleProviderRegistry.registerParticleProvidersEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 */
package net.mcreator.sonsofsins.init;

import dev.architectury.registry.client.particle.ParticleProviderRegistry;
import net.mcreator.sonsofsins.client.particle.SinBloodParticle;
import net.mcreator.sonsofsins.client.particle.SinSoulParticle;
import net.mcreator.sonsofsins.client.particle.SleepPaParticle;
import net.minecraft.core.particles.ParticleType;


public class SonsOfSinsModParticles {
    public static void registerParticles() {
        ParticleProviderRegistry.register(SonsOfSinsModParticleTypes.SIN_BLOOD.get(), SinBloodParticle::provider);
        ParticleProviderRegistry.register(SonsOfSinsModParticleTypes.SIN_SOUL.get(), SinSoulParticle::provider);
        ParticleProviderRegistry.register(SonsOfSinsModParticleTypes.SLEEP_PA.get(), SleepPaParticle::provider);
    }
}

