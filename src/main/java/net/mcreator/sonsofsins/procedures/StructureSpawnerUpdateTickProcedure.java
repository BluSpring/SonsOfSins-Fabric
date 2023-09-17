/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.ServerLevelAccessor
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.level.block.Mirror
 *  net.minecraft.world.level.block.Rotation
 *  net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings
 *  net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate
 */
package net.mcreator.sonsofsins.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

public class StructureSpawnerUpdateTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        ServerLevel _serverworld;
        StructureTemplate template;
        world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
        if (world instanceof ServerLevel && (template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(new ResourceLocation("sons_of_sins", "strange_home"))) != null) {
            template.placeInWorld(_serverworld, new BlockPos(x - 17.0, y - 6.0, z - 17.0), new BlockPos(x - 17.0, y - 6.0, z - 17.0), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
        }
    }
}

