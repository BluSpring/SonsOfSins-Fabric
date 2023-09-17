/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.effect.MobEffect
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.sonsofsins.init;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.mcreator.sonsofsins.potion.BlurEffectMobEffect;
import net.mcreator.sonsofsins.potion.GreedMobEffect;
import net.mcreator.sonsofsins.potion.SlothMobEffect;
import net.mcreator.sonsofsins.potion.VeryBadOmenMobEffect;
import net.minecraft.core.Registry;
import net.minecraft.world.effect.MobEffect;

public class SonsOfSinsModMobEffects {
    public static final LazyRegistrar<MobEffect> REGISTRY = LazyRegistrar.create(Registry.MOB_EFFECT, "sons_of_sins");
    public static final RegistryObject<MobEffect> BLUR_EFFECT = REGISTRY.register("blur_effect", () -> new BlurEffectMobEffect());
    public static final RegistryObject<MobEffect> VERY_BAD_OMEN = REGISTRY.register("very_bad_omen", () -> new VeryBadOmenMobEffect());
    public static final RegistryObject<MobEffect> SLOTH = REGISTRY.register("sloth", () -> new SlothMobEffect());
    public static final RegistryObject<MobEffect> GREED = REGISTRY.register("greed", () -> new GreedMobEffect());
}

