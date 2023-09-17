/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.network.FriendlyByteBuf
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.ServerLevelAccessor
 *  net.minecraft.world.level.saveddata.SavedData
 *  net.minecraftforge.event.entity.player.PlayerEvent$PlayerChangedDimensionEvent
 *  net.minecraftforge.event.entity.player.PlayerEvent$PlayerLoggedInEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 *  net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
 *  net.minecraftforge.network.NetworkEvent$Context
 *  net.minecraftforge.network.PacketDistributor
 */
package net.mcreator.sonsofsins.network;

import dev.architectury.event.events.common.PlayerEvent;
import me.pepperbell.simplenetworking.C2SPacket;
import me.pepperbell.simplenetworking.S2CPacket;
import me.pepperbell.simplenetworking.SimpleChannel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.mcreator.sonsofsins.SonsOfSinsMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.util.thread.BlockableEventLoop;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.saveddata.SavedData;

public class SonsOfSinsModVariables {
    public static void init() {
        SonsOfSinsMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::new);
        EventBusVariableHandlers.init();
    }

    public static class SavedDataSyncMessage implements S2CPacket, C2SPacket {
        public int type;
        public SavedData data;

        public SavedDataSyncMessage(FriendlyByteBuf buffer) {
            this.type = buffer.readInt();
            SavedData savedData = this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
            if (savedData instanceof MapVariables _mapvars) {
                _mapvars.read(buffer.readNbt());
            } else {
                savedData = this.data;
                if (savedData instanceof WorldVariables _worldvars) {
                    _worldvars.read(buffer.readNbt());
                }
            }
        }

        public SavedDataSyncMessage(int type, SavedData data) {
            this.type = type;
            this.data = data;
        }

        public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
            buffer.writeInt(message.type);
            buffer.writeNbt(message.data.save(new CompoundTag()));
        }

        public static void handler(SavedDataSyncMessage message, BlockableEventLoop<?> loop, Player player) {
            loop.execute(() -> {
                if (!(loop instanceof MinecraftServer)) {
                    if (message.type == 0) {
                        MapVariables.clientSide = (MapVariables)message.data;
                    } else {
                        WorldVariables.clientSide = (WorldVariables)message.data;
                    }
                }
            });
        }

        @Override
        public void handle(MinecraftServer server, ServerPlayer player, ServerGamePacketListenerImpl listener, PacketSender responseSender, SimpleChannel channel) {
            handler(this, server, player);
        }

        @Environment(EnvType.CLIENT)
        @Override
        public void handle(Minecraft client, ClientPacketListener listener, PacketSender responseSender, SimpleChannel channel) {
            handler(this, client, client.player);
        }

        @Override
        public void encode(FriendlyByteBuf buf) {
            buffer(this, buf);
        }
    }

    public static class MapVariables
    extends SavedData {
        public static final String DATA_NAME = "sons_of_sins_mapvars";
        public double wistiverjawlimit = 0.0;
        public boolean sonsgriefing = false;
        static MapVariables clientSide = new MapVariables();

        public static MapVariables load(CompoundTag tag) {
            MapVariables data = new MapVariables();
            data.read(tag);
            return data;
        }

        public void read(CompoundTag nbt) {
            this.wistiverjawlimit = nbt.getDouble("wistiverjawlimit");
            this.sonsgriefing = nbt.getBoolean("sonsgriefing");
        }

        public CompoundTag save(CompoundTag nbt) {
            nbt.putDouble("wistiverjawlimit", this.wistiverjawlimit);
            nbt.putBoolean("sonsgriefing", this.sonsgriefing);
            return nbt;
        }

        public void syncData(LevelAccessor world) {
            this.setDirty();
            if (world instanceof Level && !world.isClientSide()) {
                SonsOfSinsMod.PACKET_HANDLER.sendToClientsInCurrentServer(new SavedDataSyncMessage(0, this));
            }
        }

        public static MapVariables get(LevelAccessor world) {
            if (world instanceof ServerLevelAccessor serverLevelAcc) {
                return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
            }
            return clientSide;
        }
    }

    public static class WorldVariables
    extends SavedData {
        public static final String DATA_NAME = "sons_of_sins_worldvars";
        static WorldVariables clientSide = new WorldVariables();

        public static WorldVariables load(CompoundTag tag) {
            WorldVariables data = new WorldVariables();
            data.read(tag);
            return data;
        }

        public void read(CompoundTag nbt) {
        }

        public CompoundTag save(CompoundTag nbt) {
            return nbt;
        }

        public void syncData(LevelAccessor world) {
            Level level;
            this.setDirty();
            if (world instanceof Level && !(level = (Level)world).isClientSide()) {
                SonsOfSinsMod.PACKET_HANDLER.sendToClientsInWorld(new SavedDataSyncMessage(1, this), (ServerLevel) level);
            }
        }

        public static WorldVariables get(LevelAccessor world) {
            if (world instanceof ServerLevel level) {
                return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
            }
            return clientSide;
        }
    }
    
    public static class EventBusVariableHandlers {
        public static void init() {
            ServerPlayConnectionEvents.JOIN.register(((handler, sender, server) -> {
                server.execute(() -> {
                    onPlayerLoggedIn(handler.getPlayer());
                });
            }));

            PlayerEvent.CHANGE_DIMENSION.register(((player, oldLevel, newLevel) -> {
                onPlayerChangedDimension(player);
            }));
        }

        public static void onPlayerLoggedIn(ServerPlayer player) {
            if (!player.level.isClientSide()) {
                MapVariables mapdata = MapVariables.get(player.level);
                WorldVariables worlddata = WorldVariables.get(player.level);
                if (mapdata != null) {
                    SonsOfSinsMod.PACKET_HANDLER.sendToClient(new SavedDataSyncMessage(0, mapdata), player);
                }
                if (worlddata != null) {
                    SonsOfSinsMod.PACKET_HANDLER.sendToClient(new SavedDataSyncMessage(1, worlddata), player);
                }
            }
        }
        
        public static void onPlayerChangedDimension(ServerPlayer player) {
            WorldVariables worlddata;
            if (!player.level.isClientSide() && (worlddata = WorldVariables.get(player.level)) != null) {
                SonsOfSinsMod.PACKET_HANDLER.sendToClient(new SavedDataSyncMessage(1, worlddata), player);
            }
        }
    }
}

