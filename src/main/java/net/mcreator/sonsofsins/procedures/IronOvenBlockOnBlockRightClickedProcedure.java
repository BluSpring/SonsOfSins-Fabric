//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.sonsofsins.procedures;

import net.mcreator.sonsofsins.init.SonsOfSinsModParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class IronOvenBlockOnBlockRightClickedProcedure {
    public IronOvenBlockOnBlockRightClickedProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (world instanceof Level _lvlCanSmelt) {
                RecipeManager var10000 = _lvlCanSmelt.getRecipeManager();
                RecipeType var10001 = RecipeType.SMELTING;
                SimpleContainer var10002 = new SimpleContainer();
                ItemStack[] var10004 = new ItemStack[1];
                ItemStack var10007;
                if (entity instanceof LivingEntity _livEnt) {
                    var10007 = _livEnt.getMainHandItem();
                } else {
                    var10007 = ItemStack.EMPTY;
                }

                var10004[0] = var10007;
                var10002 = new SimpleContainer(var10004);
                if (var10000.getRecipeFor(var10001, var10002, _lvlCanSmelt).isPresent()) {
                    LivingEntity _entity;
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt;
                        ItemStack var18;
                        label56: {
                            _entity = (LivingEntity)entity;
                            if (world instanceof Level _lvlSmeltResult) {
                                var10000 = _lvlSmeltResult.getRecipeManager();
                                var10001 = RecipeType.SMELTING;
                                var10002 = new SimpleContainer();
                                var10004 = new ItemStack[1];
                                if (entity instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity;
                                    var10007 = _livEnt.getMainHandItem();
                                } else {
                                    var10007 = ItemStack.EMPTY;
                                }

                                var10004[0] = var10007;
                                var10002 = new SimpleContainer(var10004);
                                if (var10000.getRecipeFor(var10001, var10002, _lvlSmeltResult).isPresent()) {
                                    var10000 = _lvlSmeltResult.getRecipeManager();
                                    var10001 = RecipeType.SMELTING;
                                    var10002 = new SimpleContainer(var10004);
                                    var10004 = new ItemStack[1];
                                    if (entity instanceof LivingEntity) {
                                        _livEnt = (LivingEntity)entity;
                                        var10007 = _livEnt.getMainHandItem();
                                    } else {
                                        var10007 = ItemStack.EMPTY;
                                    }

                                    var10004[0] = var10007;
                                    var10002 = new SimpleContainer(var10004);
                                    var18 = ((SmeltingRecipe)var10000.getRecipeFor(var10001, var10002, _lvlSmeltResult).get()).getResultItem().copy();
                                    break label56;
                                }
                            }

                            var18 = ItemStack.EMPTY;
                        }

                        ItemStack _setstack = var18;
                        ItemStack var19;
                        if (entity instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entity;
                            var19 = _livEnt.getMainHandItem();
                        } else {
                            var19 = ItemStack.EMPTY;
                        }

                        _setstack.setCount(var19.getCount());
                        _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                        if (_entity instanceof Player _player) {
                            _player.getInventory().setChanged();
                        }
                    }

                    if (entity instanceof LivingEntity) {
                        _entity = (LivingEntity)entity;
                        _entity.swing(InteractionHand.MAIN_HAND, true);
                    }

                    if (world instanceof ServerLevel _level) {
                        _level.sendParticles(SonsOfSinsModParticleTypes.SIN_SOUL.get(), x + 0.5, y + 1.9, z + 0.5, 8, 0.2, 0.2, 0.2, 0.0);
                    }

                    if (world instanceof Level _level) {
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(x, y, z), Registry.SOUND_EVENT.get(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                        } else {
                            _level.playLocalSound(x, y, z, Registry.SOUND_EVENT.get(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                        }
                    }
                }
            }

        }
    }
}
