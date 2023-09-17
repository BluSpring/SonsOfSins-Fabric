/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.EntityType$Builder
 *  net.minecraft.world.entity.MobCategory
 *  net.minecraftforge.event.entity.EntityAttributeCreationEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 *  net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.sonsofsins.init;

import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.mcreator.sonsofsins.entity.*;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class SonsOfSinsModEntities {
    public static final LazyRegistrar<EntityType<?>> REGISTRY = LazyRegistrar.create(Registry.ENTITY_TYPE, (String)"sons_of_sins");
    public static final RegistryObject<EntityType<WistiverEntity>> WISTIVER = SonsOfSinsModEntities.register("wistiver", EntityType.Builder.of(WistiverEntity::new, (MobCategory)MobCategory.MONSTER).clientTrackingRange(128).updateInterval(3).fireImmune().sized(0.6f, 1.8f));
    public static final RegistryObject<EntityType<WalkingBedEntity>> WALKING_BED = SonsOfSinsModEntities.register("walking_bed", EntityType.Builder.of(WalkingBedEntity::new, (MobCategory)MobCategory.MONSTER).clientTrackingRange(128).updateInterval(3).fireImmune().sized(1.4f, 2.7f));
    public static final RegistryObject<EntityType<ProwlerEntity>> PROWLER = SonsOfSinsModEntities.register("prowler", EntityType.Builder.of(ProwlerEntity::new, (MobCategory)MobCategory.MONSTER).clientTrackingRange(128).updateInterval(3).fireImmune().sized(0.9f, 0.9f));
    public static final RegistryObject<EntityType<IronHitEntity>> IRON_HIT = SonsOfSinsModEntities.register("iron_hit", EntityType.Builder.of(IronHitEntity::new, (MobCategory)MobCategory.MONSTER).clientTrackingRange(128).updateInterval(3).fireImmune().sized(0.6f, 1.8f));
    public static final RegistryObject<EntityType<CurseEntity>> CURSE = SonsOfSinsModEntities.register("curse", EntityType.Builder.of(CurseEntity::new, (MobCategory)MobCategory.MONSTER).clientTrackingRange(128).updateInterval(3).fireImmune().sized(0.6f, 1.8f));
    public static final RegistryObject<EntityType<BloodyDriverEntity>> BLOODY_DRIVER = SonsOfSinsModEntities.register("bloody_driver", EntityType.Builder.of(BloodyDriverEntity::new, (MobCategory)MobCategory.MONSTER).clientTrackingRange(128).updateInterval(3).fireImmune().sized(0.6f, 0.6f));
    public static final RegistryObject<EntityType<BloodyButcherEntity>> BLOODY_BUTCHER = SonsOfSinsModEntities.register("bloody_butcher", EntityType.Builder.of(BloodyButcherEntity::new, (MobCategory)MobCategory.MONSTER).clientTrackingRange(128).updateInterval(3).fireImmune().sized(0.6f, 1.95f));
    public static final RegistryObject<EntityType<IronOvenEntity>> IRON_OVEN = SonsOfSinsModEntities.register("iron_oven", EntityType.Builder.of(IronOvenEntity::new, (MobCategory)MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3).fireImmune().sized(0.4f, 0.4f));
    public static final RegistryObject<EntityType<BloodyProjectileEntity>> BLOODY_PROJECTILE = SonsOfSinsModEntities.register("projectile_bloody_projectile", EntityType.Builder.of(BloodyProjectileEntity::new, (MobCategory)MobCategory.MISC).clientTrackingRange(64).updateInterval(1).sized(0.5f, 0.5f));

    private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        return REGISTRY.register(registryname, () -> entityTypeBuilder.build(registryname));
    }

    public static void init() {
        WistiverEntity.init();
        WalkingBedEntity.init();
        ProwlerEntity.init();
        IronHitEntity.init();
        CurseEntity.init();
        BloodyDriverEntity.init();
        BloodyButcherEntity.init();
        IronOvenEntity.init();

        registerAttributes();
    }
    
    public static void registerAttributes() {
        EntityAttributeRegistry.register(WISTIVER, WistiverEntity::createAttributes);
        EntityAttributeRegistry.register(WALKING_BED, WalkingBedEntity::createAttributes);
        EntityAttributeRegistry.register(PROWLER, ProwlerEntity::createAttributes);
        EntityAttributeRegistry.register(IRON_HIT, IronHitEntity::createAttributes);
        EntityAttributeRegistry.register(CURSE, CurseEntity::createAttributes);
        EntityAttributeRegistry.register(BLOODY_DRIVER, BloodyDriverEntity::createAttributes);
        EntityAttributeRegistry.register(BLOODY_BUTCHER, BloodyButcherEntity::createAttributes);
        EntityAttributeRegistry.register(IRON_OVEN, IronOvenEntity::createAttributes);
    }
}

