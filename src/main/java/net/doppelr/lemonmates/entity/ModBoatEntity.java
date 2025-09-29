package net.doppelr.lemonmates.entity;

import net.doppelr.lemonmates.block.ModBlocks;
import net.doppelr.lemonmates.item.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.function.IntFunction;

public class ModBoatEntity extends Boat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(ModBoatEntity.class, EntityDataSerializers.INT);

    public ModBoatEntity(EntityType<? extends Boat> entityType, Level level) {
        super(entityType, level);
    }

    public ModBoatEntity(Level level, double x, double y, double z) {
        this(ModEntities.MOD_BOAT.get(), level);
        setPos(x, y, z);
        xo = x;
        yo = y;
        zo = z;
    }

    @Override
    public Item getDropItem() {
        return switch (getModVariant()) {
            case CITRON -> ModItems.CITRON_BOAT.get();
            case ORANGE -> ModItems.ORANGE_BOAT.get();
        };
    }

    public void setVariant(ModBoatEntity.Type variant) {
        entityData.set(DATA_ID_TYPE, variant.ordinal());
    }

    public ModBoatEntity.Type getModVariant() {
        return Type.byId(entityData.get(DATA_ID_TYPE));
    }

    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(DATA_ID_TYPE, Type.CITRON.ordinal());
    }

    protected void addAdditionalSaveData(CompoundTag compound) {
        compound.putString("Type", getModVariant().getSerializedName());
    }

    protected void readAdditionalSaveData(CompoundTag compound) {
        if (compound.contains("Type", 8)) {
            setVariant(Type.byName(compound.getString("Type")));
        }
    }

    public static enum Type implements StringRepresentable, net.neoforged.fml.common.asm.enumextension.IExtensibleEnum {
        CITRON(ModBlocks.CITRON_PLANKS.get(), "citron"),
        ORANGE(ModBlocks.ORANGE_PLANKS.get(), "orange");

        private final String name;
        private final java.util.function.Supplier<Block> planks;
        private final boolean raft;
        public static final StringRepresentable.EnumCodec<ModBoatEntity.Type> CODEC = StringRepresentable.fromEnum(ModBoatEntity.Type::values);
        private static final IntFunction<ModBoatEntity.Type> BY_ID = ByIdMap.continuous(Enum::ordinal, values(), ByIdMap.OutOfBoundsStrategy.ZERO);

        @net.neoforged.fml.common.asm.enumextension.ReservedConstructor
        private Type(Block planks, String name) {
            this(planks, name, false);
        }

        @net.neoforged.fml.common.asm.enumextension.ReservedConstructor
        private Type(Block planks, String name, boolean raft) {
            this.name = name;
            this.planks = () -> planks;
            this.raft = raft;
        }

        @Override
        public String getSerializedName() {
            return this.name;
        }

        public String getName() {
            return this.name;
        }

        public Block getPlanks() {
            return this.planks.get();
        }

        public boolean isRaft() {
            return this.raft;
        }

        @Override
        public String toString() {
            return this.name;
        }

        /**
         * Get a boat type by its enum ordinal
         */
        public static ModBoatEntity.Type byId(int id) {
            return BY_ID.apply(id);
        }

        public static ModBoatEntity.Type byName(String name) {
            return CODEC.byName(name, CITRON);
        }

        public static net.neoforged.fml.common.asm.enumextension.ExtensionInfo getExtensionInfo() {
            return net.neoforged.fml.common.asm.enumextension.ExtensionInfo.nonExtended(Boat.Type.class);
        }
    }
}
