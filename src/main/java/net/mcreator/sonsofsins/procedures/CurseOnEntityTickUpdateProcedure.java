/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.world.effect.MobEffect
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.GameType
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.init.SonsOfSinsModMobEffects;
import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CurseOnEntityTickUpdateProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        LivingEntity _entity;
        Entity _ent;
        if (entity == null) {
            return;
        }
        boolean target = false;
        if (entity instanceof LivingEntity _entity2) {
            _entity2.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 60, 1, false, false));
        }
        Vec3 _center = new Vec3(x, y, z);
        Vec3 final_center1 = _center;
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(final_center1))).collect(Collectors.toList());
        for (Entity entityiterator : _entfound) {
            LivingEntity _livEnt;
            if (entityiterator == entity || entity instanceof LivingEntity && (_livEnt = (LivingEntity)entity).hasEffect(SonsOfSinsModMobEffects.BLUR_EFFECT.get()) || !(entityiterator instanceof LivingEntity _entity3)) continue;
            _entity3.addEffect(new MobEffectInstance(SonsOfSinsModMobEffects.BLUR_EFFECT.get(), 40, 0, false, false));
        }
        if (Math.random() < 0.5) {
            _ent = entity;
            _ent.setYRot((float)((double)entity.getYRot() + 0.5));
            _ent.setXRot(entity.getXRot());
            _ent.setYBodyRot(_ent.getYRot());
            _ent.setYHeadRot(_ent.getYRot());
            _ent.yRotO = _ent.getYRot();
            _ent.xRotO = _ent.getXRot();
            if (_ent instanceof LivingEntity) {
                _entity = (LivingEntity)_ent;
                _entity.yBodyRotO = _entity.getYRot();
                _entity.yHeadRotO = _entity.getYRot();
            }
        } else {
            _ent = entity;
            _ent.setYRot((float)((double)entity.getYRot() - 0.5));
            _ent.setXRot(entity.getXRot());
            _ent.setYBodyRot(_ent.getYRot());
            _ent.setYHeadRot(_ent.getYRot());
            _ent.yRotO = _ent.getYRot();
            _ent.xRotO = _ent.getXRot();
            if (_ent instanceof LivingEntity) {
                _entity = (LivingEntity)_ent;
                _entity.yBodyRotO = _entity.getYRot();
                _entity.yHeadRotO = _entity.getYRot();
            }
        }
        if (Math.random() < 0.5) {
            _ent = entity;
            _ent.setYRot(entity.getYRot());
            _ent.setXRot((float)((double)entity.getXRot() + 0.5));
            _ent.setYBodyRot(_ent.getYRot());
            _ent.setYHeadRot(_ent.getYRot());
            _ent.yRotO = _ent.getYRot();
            _ent.xRotO = _ent.getXRot();
            if (_ent instanceof LivingEntity) {
                _entity = (LivingEntity)_ent;
                _entity.yBodyRotO = _entity.getYRot();
                _entity.yHeadRotO = _entity.getYRot();
            }
        } else {
            _ent = entity;
            _ent.setYRot(entity.getYRot());
            _ent.setXRot((float)((double)entity.getXRot() - 0.5));
            _ent.setYBodyRot(_ent.getYRot());
            _ent.setYHeadRot(_ent.getYRot());
            _ent.yRotO = _ent.getYRot();
            _ent.xRotO = _ent.getXRot();
            if (_ent instanceof LivingEntity) {
                _entity = (LivingEntity)_ent;
                _entity.yBodyRotO = _entity.getYRot();
                _entity.yHeadRotO = _entity.getYRot();
            }
        }
        _center = new Vec3(entity.getX(), entity.getY(), entity.getZ());
        Vec3 final_center = _center;
        _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(final_center))).collect(Collectors.toList());
        for (Entity entityiterator : _entfound) {
            if (entityiterator instanceof Player && (new Object(){

                public boolean checkGamemode(Entity _ent) {
                    if (_ent instanceof ServerPlayer _serverPlayer) {
                        return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
                    }
                    if (_ent.level.isClientSide() && _ent instanceof Player _player) {
                        return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
                    }
                    return false;
                }
            }.checkGamemode(entityiterator) || new Object(){

                public boolean checkGamemode(Entity _ent) {
                    if (_ent instanceof ServerPlayer _serverPlayer) {
                        return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
                    }
                    if (_ent.level.isClientSide() && _ent instanceof Player _player) {
                        return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
                    }
                    return false;
                }
            }.checkGamemode(entityiterator))) {
                target = true;
                break;
            }
            target = false;
        }
        entity.getExtraCustomData().putBoolean("tagTarget", target);
    }
}

