/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.sonsofsins.init;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class SonsOfSinsModSounds {
    public static final LazyRegistrar<SoundEvent> REGISTRY = LazyRegistrar.create(Registry.SOUND_EVENT, (String)"sons_of_sins");
    public static final RegistryObject<SoundEvent> BLOODY_BUTCHER_AMBIENT = REGISTRY.register("bloody_butcher_ambient", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "bloody_butcher_ambient")));
    public static final RegistryObject<SoundEvent> BLOODY_BUTCHER_DEATH = REGISTRY.register("bloody_butcher_death", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "bloody_butcher_death")));
    public static final RegistryObject<SoundEvent> BLOODY_BUTCHER_HURT = REGISTRY.register("bloody_butcher_hurt", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "bloody_butcher_hurt")));
    public static final RegistryObject<SoundEvent> BLOODY_DRIVER_HURT = REGISTRY.register("bloody_driver_hurt", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "bloody_driver_hurt")));
    public static final RegistryObject<SoundEvent> CURSE_AMBIENT = REGISTRY.register("curse_ambient", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "curse_ambient")));
    public static final RegistryObject<SoundEvent> CURSE_DEATH = REGISTRY.register("curse_death", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "curse_death")));
    public static final RegistryObject<SoundEvent> IRON_HIT_AMBIENT = REGISTRY.register("iron_hit_ambient", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "iron_hit_ambient")));
    public static final RegistryObject<SoundEvent> CURSE_HURT = REGISTRY.register("curse_hurt", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "curse_hurt")));
    public static final RegistryObject<SoundEvent> IRON_HIT_HURT = REGISTRY.register("iron_hit_hurt", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "iron_hit_hurt")));
    public static final RegistryObject<SoundEvent> IRON_HIT_DEATH = REGISTRY.register("iron_hit_death", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "iron_hit_death")));
    public static final RegistryObject<SoundEvent> PROWLER_AMBIENT = REGISTRY.register("prowler_ambient", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "prowler_ambient")));
    public static final RegistryObject<SoundEvent> PROWLER_DEATH = REGISTRY.register("prowler_death", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "prowler_death")));
    public static final RegistryObject<SoundEvent> PROWLER_HURT = REGISTRY.register("prowler_hurt", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "prowler_hurt")));
    public static final RegistryObject<SoundEvent> BLOODY_DRIVER_AMBIENT = REGISTRY.register("bloody_driver_ambient", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "bloody_driver_ambient")));
    public static final RegistryObject<SoundEvent> WALKING_BED_AMBIENT = REGISTRY.register("walking_bed_ambient", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "walking_bed_ambient")));
    public static final RegistryObject<SoundEvent> WALKING_BED_DEATH = REGISTRY.register("walking_bed_death", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "walking_bed_death")));
    public static final RegistryObject<SoundEvent> WALKING_BED_HURT = REGISTRY.register("walking_bed_hurt", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "walking_bed_hurt")));
    public static final RegistryObject<SoundEvent> WISTIVER_AMBIENT = REGISTRY.register("wistiver_ambient", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "wistiver_ambient")));
    public static final RegistryObject<SoundEvent> BLOODY_DRIVER_DEATH = REGISTRY.register("bloody_driver_death", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "bloody_driver_death")));
    public static final RegistryObject<SoundEvent> WISTIVER_DEATH = REGISTRY.register("wistiver_death", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "wistiver_death")));
    public static final RegistryObject<SoundEvent> WISTIVER_HURT = REGISTRY.register("wistiver_hurt", () -> new SoundEvent(new ResourceLocation("sons_of_sins", "wistiver_hurt")));
}

