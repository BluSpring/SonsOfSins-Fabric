/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.GameType
 */
package net.mcreator.sonsofsins.procedures;

import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameType;

public class BlurEffectOnEffectActiveTickProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (new Object(){

            public boolean checkGamemode(Entity _ent) {
                if (_ent instanceof ServerPlayer) {
                    ServerPlayer _serverPlayer = (ServerPlayer)_ent;
                    return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
                }
                if (_ent.level.isClientSide() && _ent instanceof Player) {
                    Player _player = (Player)_ent;
                    return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
                }
                return false;
            }
        }.checkGamemode(entity) || new Object(){

            public boolean checkGamemode(Entity _ent) {
                if (_ent instanceof ServerPlayer) {
                    ServerPlayer _serverPlayer = (ServerPlayer)_ent;
                    return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
                }
                if (_ent.level.isClientSide() && _ent instanceof Player) {
                    Player _player = (Player)_ent;
                    return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
                }
                return false;
            }
        }.checkGamemode(entity)) {
            LivingEntity _entity;
            Entity _ent;
            if (entity instanceof LivingEntity) {
                LivingEntity _entity2 = (LivingEntity)entity;
                _entity2.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2, 2, false, false));
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
        }
    }
}

