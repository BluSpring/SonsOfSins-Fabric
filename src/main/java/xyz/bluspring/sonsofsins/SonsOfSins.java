package xyz.bluspring.sonsofsins;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.mcreator.sonsofsins.SonsOfSinsMod;
import net.mcreator.sonsofsins.procedures.SonsGriefingPrProcedure;
import net.mcreator.sonsofsins.procedures.WistiverJawLimitPrProcedure;
import net.mcreator.sonsofsins.world.features.StrangeHouseFeature;
import net.minecraft.world.level.levelgen.GenerationStep;

public class SonsOfSins implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        var mod = new SonsOfSinsMod();

        SonsGriefingPrProcedure.init();
        SonsOfSinsMod.PACKET_HANDLER.initServerListener();
        WistiverJawLimitPrProcedure.init();

        BiomeModifications.addFeature((ctx) -> true, GenerationStep.Decoration.SURFACE_STRUCTURES, StrangeHouseFeature.PLACED_FEATURE.unwrapKey().get());
    }
}
