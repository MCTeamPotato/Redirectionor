package com.teampotato.redirectionor.common;

import it.unimi.dsi.fastutil.chars.Char2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.ChatFormatting;
import net.minecraft.advancements.FrameType;
import net.minecraft.core.Direction;
import net.minecraft.world.BossEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.level.block.entity.JigsawBlockEntity;
import net.minecraft.world.level.chunk.storage.IOWorker;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.functions.CopyNameFunction;
import net.minecraft.world.level.storage.loot.functions.CopyNbtFunction;
import net.minecraft.world.ticks.TickPriority;

import java.util.Map;

import static net.minecraft.core.Direction.*;
import static net.minecraft.world.level.chunk.storage.IOWorker.Priority.*;

public final class Maps {
    public static final Map<String, FrameType> STRING_FRAME_TYPE_MAP = new Object2ObjectOpenHashMap<>();
    public static final Int2ObjectOpenHashMap<ChatFormatting> INTEGER_CHAT_FORMATTING_MAP = new Int2ObjectOpenHashMap<>();
    public static final Char2ObjectOpenHashMap<ChatFormatting> CHARACTER_CHAT_FORMATTING_MAP = new Char2ObjectOpenHashMap<>();
    
    public static final Map<String, BossEvent.BossBarColor> STRING_BOSS_BAR_COLOR_MAP = new Object2ObjectOpenHashMap<>();
    
    public static final Map<String, BossEvent.BossBarOverlay> STRING_BOSS_BAR_OVERLAY_MAP = new Object2ObjectOpenHashMap<>();
    
    public static final Map<String, EquipmentSlot> STRING_EQUIPMENT_SLOT_MAP = new Object2ObjectOpenHashMap<>();
    
    public static final Map<EquipmentSlot.Type, EquipmentSlot> TYPE_EQUIPMENT_SLOT_MAP = new Object2ObjectOpenHashMap<>();
    
    public static final Map<String, JigsawBlockEntity.JointType> STRING_JOINT_TYPE_MAP = new Object2ObjectOpenHashMap<>();
    
    public static final Map<String, LootContext.EntityTarget> STRING_ENTITY_TARGET_MAP = new Object2ObjectOpenHashMap<>();
    
    public static final Map<String, CopyNameFunction.NameSource> STRING_NAME_SOURCE_MAP = new Object2ObjectOpenHashMap<>();
    
    public static final Map<String, CopyNbtFunction.MergeStrategy> STRING_MERGE_STRATEGY_MAP = new Object2ObjectOpenHashMap<>();
    
    public static final Int2ObjectOpenHashMap<TickPriority> INTEGER_TICK_PRIORITY_MAP = new Int2ObjectOpenHashMap<>();

    static {
        for (FrameType frameType : Values.FRAME_TYPES) {
            STRING_FRAME_TYPE_MAP.put(frameType.getName(), frameType);
        }
    }

    static {
        for (ChatFormatting chatFormatting : Values.CHAT_FORMATTINGS) {
            INTEGER_CHAT_FORMATTING_MAP.put(chatFormatting.getId(), chatFormatting);
            CHARACTER_CHAT_FORMATTING_MAP.put(chatFormatting.getChar(), chatFormatting);
        }
    }

    static {
        for (BossEvent.BossBarColor bossBarColor : Values.BOSS_EVENT_BOSS_BAR_COLORS) {
            STRING_BOSS_BAR_COLOR_MAP.put(bossBarColor.getName(), bossBarColor);
        }
    }

    static {
        for (BossEvent.BossBarOverlay bossBarOverlay : Values.BOSS_EVENT_BOSS_BAR_OVERLAYS) {
            STRING_BOSS_BAR_OVERLAY_MAP.put(bossBarOverlay.getName(), bossBarOverlay);
        }
    }

    static {
        for (EquipmentSlot equipmentSlot : Values.EQUIPMENT_SLOTS) {
            STRING_EQUIPMENT_SLOT_MAP.put(equipmentSlot.getName(), equipmentSlot);
        }
    }

    static {
        for (EquipmentSlot equipmentSlot : Values.EQUIPMENT_SLOTS) {
            TYPE_EQUIPMENT_SLOT_MAP.put(equipmentSlot.getType(), equipmentSlot);
        }
    }

    static {
        for (JigsawBlockEntity.JointType jointType : Values.JIGSAW_BLOCK_ENTITY_JOINT_TYPES) {
            STRING_JOINT_TYPE_MAP.put(jointType.getSerializedName(), jointType);
        }
    }

    static {
        for (LootContext.EntityTarget entityTarget : Values.LOOT_CONTEXT_ENTITY_TARGETS) {
            STRING_ENTITY_TARGET_MAP.put(entityTarget.name, entityTarget);
        }
    }

    static {
        for (CopyNameFunction.NameSource nameSource : Values.COPY_NAME_FUNCTION_NAME_SOURCES) {
            STRING_NAME_SOURCE_MAP.put(nameSource.name, nameSource);
        }
    }

    static {
        for (CopyNbtFunction.MergeStrategy mergeStrategy : Values.COPY_NAME_FUNCTION_MERGE_STRATEGIES) {
            STRING_MERGE_STRATEGY_MAP.put(mergeStrategy.name, mergeStrategy);
        }
    }

    static {
        for (TickPriority tickPriority : Values.TICK_PRIORITIES) {
            INTEGER_TICK_PRIORITY_MAP.put(tickPriority.getValue(), tickPriority);
        }
    }

    public static final int EAST_3D_DATA_VALUE = EAST.get3DDataValue();
    public static final int SOUTH_3D_DATA_VALUE = SOUTH.get3DDataValue();
    public static final int NORTH_3D_DATA_VALUE = NORTH.get3DDataValue();
    public static final int WEST_3D_DATA_VALUE = WEST.get3DDataValue();
    public static final int UP_3D_DATA_VALUE = UP.get3DDataValue();
    public static final int DOWN_3D_DATA_VALUE = DOWN.get3DDataValue();

    public static final Object2IntOpenHashMap<Direction> DIRECTION_DATA_VALUE_MAP = new Object2IntOpenHashMap<>();

    static {
        DIRECTION_DATA_VALUE_MAP.put(EAST, EAST_3D_DATA_VALUE);
        DIRECTION_DATA_VALUE_MAP.put(SOUTH, SOUTH_3D_DATA_VALUE);
        DIRECTION_DATA_VALUE_MAP.put(NORTH, NORTH_3D_DATA_VALUE);
        DIRECTION_DATA_VALUE_MAP.put(WEST, WEST_3D_DATA_VALUE);
        DIRECTION_DATA_VALUE_MAP.put(UP, UP_3D_DATA_VALUE);
        DIRECTION_DATA_VALUE_MAP.put(DOWN, DOWN_3D_DATA_VALUE);
    }

    public static final int WEST_ORDINAL = WEST.ordinal();
    public static final int NORTH_ORDINAL = NORTH.ordinal();
    public static final int EAST_ORDINAL = EAST.ordinal();
    public static final int SOUTH_ORDINAL = SOUTH.ordinal();
    public static final int UP_ORDINAL = UP.ordinal();
    public static final int DOWN_ORDINAL = DOWN.ordinal();

    public static final Object2IntOpenHashMap<Direction> DIRECTION_ORDINAL_MAP = new Object2IntOpenHashMap<>();

    static {
        DIRECTION_ORDINAL_MAP.put(EAST, EAST_ORDINAL);
        DIRECTION_ORDINAL_MAP.put(SOUTH, SOUTH_ORDINAL);
        DIRECTION_ORDINAL_MAP.put(NORTH, NORTH_ORDINAL);
        DIRECTION_ORDINAL_MAP.put(WEST, WEST_ORDINAL);
        DIRECTION_ORDINAL_MAP.put(UP, UP_ORDINAL);
        DIRECTION_ORDINAL_MAP.put(DOWN, DOWN_ORDINAL);
    }

    public static final Direction.Plane HORIZONTAL = Direction.Plane.HORIZONTAL;
    public static final Direction.Plane VERTICAL = Direction.Plane.VERTICAL;

    public static final Map<Direction.Axis, Direction.Plane> PLANE_MAP = new Object2ObjectOpenHashMap<>();

    static {
        PLANE_MAP.put(Axis.X, HORIZONTAL);
        PLANE_MAP.put(Axis.Z, HORIZONTAL);
        PLANE_MAP.put(Axis.Y, VERTICAL);
    }


    public static final int FOREGROUND_ORDINAL = FOREGROUND.ordinal();
    public static final int BACKGROUND_ORDINAL = BACKGROUND.ordinal();
    public static final int SHUTDOWN_ORDINAL = SHUTDOWN.ordinal();

    public static final Object2IntOpenHashMap<IOWorker.Priority> PRIORITY_ORDINAL_MAP = new Object2IntOpenHashMap<>();

    static {
        PRIORITY_ORDINAL_MAP.put(FOREGROUND, FOREGROUND_ORDINAL);
        PRIORITY_ORDINAL_MAP.put(BACKGROUND, BACKGROUND_ORDINAL);
        PRIORITY_ORDINAL_MAP.put(SHUTDOWN, SHUTDOWN_ORDINAL);
    }
}
