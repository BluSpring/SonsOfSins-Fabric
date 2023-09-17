/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.entity.AreaEffectCloud
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobType
 *  net.minecraft.world.entity.PathfinderMob
 *  net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.ai.control.FlyingMoveControl
 *  net.minecraft.world.entity.ai.goal.Goal
 *  net.minecraft.world.entity.ai.goal.Goal$Flag
 *  net.minecraft.world.entity.ai.goal.RandomLookAroundGoal
 *  net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal
 *  net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal
 *  net.minecraft.world.entity.ai.navigation.FlyingPathNavigation
 *  net.minecraft.world.entity.ai.navigation.PathNavigation
 *  net.minecraft.world.entity.monster.Monster
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.entity.projectile.AbstractArrow
 *  net.minecraft.world.entity.projectile.ThrownPotion
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.network.NetworkHooks
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.sonsofsins.entity;

import net.mcreator.sonsofsins.procedures.CurseEntityIsHurtProcedure;
import net.mcreator.sonsofsins.procedures.CurseOnEntityTickUpdateProcedure;
import net.mcreator.sonsofsins.procedures.CursePlayerCollidesWithThisEntityProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

import java.util.EnumSet;


public class CurseEntity
extends Monster {

    public CurseEntity(EntityType<CurseEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        this.setNoAi(false);
        this.setPersistenceRequired();
        this.moveControl = new FlyingMoveControl((Mob)this, 10, true);
    }

    public Packet<?> getAddEntityPacket() {
        return new ClientboundAddEntityPacket((Entity)this);
    }

    protected PathNavigation createNavigation(Level world) {
        return new FlyingPathNavigation((Mob)this, world);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new Goal(){
            {
                this.setFlags(EnumSet.of(Goal.Flag.MOVE));
            }

            public boolean canUse() {
                return CurseEntity.this.getTarget() != null && !CurseEntity.this.getMoveControl().hasWanted();
            }

            public boolean canContinueToUse() {
                return CurseEntity.this.getMoveControl().hasWanted() && CurseEntity.this.getTarget() != null && CurseEntity.this.getTarget().isAlive();
            }

            public void start() {
                LivingEntity livingentity = CurseEntity.this.getTarget();
                Vec3 vec3d = livingentity.getEyePosition(1.0f);
                CurseEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 2.0);
            }

            public void tick() {
                LivingEntity livingentity = CurseEntity.this.getTarget();
                if (CurseEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
                    CurseEntity.this.doHurtTarget((Entity)livingentity);
                } else {
                    double d0 = CurseEntity.this.distanceToSqr((Entity)livingentity);
                    if (d0 < 16.0) {
                        Vec3 vec3d = livingentity.getEyePosition(1.0f);
                        CurseEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 2.0);
                    }
                }
            }
        });
        this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, false, false));
        this.targetSelector.addGoal(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
        this.goalSelector.addGoal(5, (Goal)new RandomLookAroundGoal((Mob)this));
    }

    public MobType getMobType() {
        return MobType.UNDEAD;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    public SoundEvent getAmbientSound() {
        return Registry.SOUND_EVENT.get(new ResourceLocation("sons_of_sins:curse_ambient"));
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return Registry.SOUND_EVENT.get(new ResourceLocation("sons_of_sins:curse_hurt"));
    }

    public SoundEvent getDeathSound() {
        return Registry.SOUND_EVENT.get(new ResourceLocation("sons_of_sins:curse_death"));
    }

    public boolean causeFallDamage(float l, float d, DamageSource source) {
        return false;
    }

    public boolean hurt(DamageSource source, float amount) {
        CurseEntityIsHurtProcedure.execute((LevelAccessor)this.level, (Entity)this, source.getEntity());
        if (source.getDirectEntity() instanceof AbstractArrow) {
            return false;
        }
        if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud) {
            return false;
        }
        if (source == DamageSource.FALL) {
            return false;
        }
        if (source == DamageSource.DROWN) {
            return false;
        }
        if (source == DamageSource.WITHER) {
            return false;
        }
        if (source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return super.hurt(source, amount);
    }

    public void baseTick() {
        super.baseTick();
        CurseOnEntityTickUpdateProcedure.execute((LevelAccessor)this.level, this.getX(), this.getY(), this.getZ(), (Entity)this);
    }

    public void playerTouch(Player sourceentity) {
        super.playerTouch(sourceentity);
        CursePlayerCollidesWithThisEntityProcedure.execute((LevelAccessor)this.level, this.getX(), this.getY(), this.getZ(), (Entity)this, (Entity)sourceentity);
    }

    public boolean isPushable() {
        return false;
    }

    protected void doPush(Entity entityIn) {
    }

    protected void pushEntities() {
    }

    protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
    }

    public void setNoGravity(boolean ignored) {
        super.setNoGravity(true);
    }

    public void aiStep() {
        super.aiStep();
        this.setNoGravity(true);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
        builder = builder.add(Attributes.MAX_HEALTH, 200.0);
        builder = builder.add(Attributes.ARMOR, 0.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 5.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 64.0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1.0);
        builder = builder.add(Attributes.FLYING_SPEED, 0.3);
        return builder;
    }
}

