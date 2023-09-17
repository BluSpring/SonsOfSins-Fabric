/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.FriendlyByteBuf
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraftforge.eventbus.api.IEventBus
 *  net.minecraftforge.fml.common.Mod
 *  net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
 *  net.minecraftforge.network.NetworkEvent$Context
 *  net.minecraftforge.network.NetworkRegistry
 *  net.minecraftforge.network.simple.SimpleChannel
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.mcreator.sonsofsins;

import me.pepperbell.simplenetworking.C2SPacket;
import me.pepperbell.simplenetworking.S2CPacket;
import me.pepperbell.simplenetworking.SimpleChannel;
import net.mcreator.sonsofsins.init.*;
import net.mcreator.sonsofsins.network.SonsOfSinsModVariables;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Function;

public class SonsOfSinsMod {
    public static final Logger LOGGER = LogManager.getLogger(SonsOfSinsMod.class);
    public static final String MODID = "sons_of_sins";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = new SimpleChannel((ResourceLocation)new ResourceLocation("sons_of_sins", "sons_of_sins"));
    private static int messageID = 0;

    public SonsOfSinsMod() {
        SonsOfSinsModTabs.load();
        SonsOfSinsModSounds.REGISTRY.register();
        SonsOfSinsModBlocks.REGISTRY.register();
        SonsOfSinsModEntities.REGISTRY.register();
        SonsOfSinsModEntities.init();
        SonsOfSinsModItems.REGISTRY.register();
        SonsOfSinsModFeatures.REGISTRY.register();
        SonsOfSinsModMobEffects.REGISTRY.register();
        SonsOfSinsModParticleTypes.REGISTRY.register();
        SonsOfSinsModGameRules.init();
        SonsOfSinsModVariables.init();
    }

    public static <T extends S2CPacket & C2SPacket> void addNetworkMessage(Class<T> messageType, Function<FriendlyByteBuf, T> decoder) {
        PACKET_HANDLER.registerC2SPacket(messageType, messageID++, decoder);
        PACKET_HANDLER.registerS2CPacket(messageType, messageID++, decoder);
        ++messageID;
    }
}

