package net.doppelr.lemonmates.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public static final Map<DeferredBlock<Block>, DeferredBlock<Block>> BLOCKS_MAP = Map.of(
        ModBlocks.ORANGE_LOG, ModBlocks.STRIPPED_ORANGE_LOG,
        ModBlocks.ORANGE_WOOD, ModBlocks.STRIPPED_ORANGE_WOOD
    );

    public ModFlammableRotatedPillarBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
        if (ItemAbilities.AXE_STRIP == itemAbility) {
            if (BLOCKS_MAP.containsKey(state.getBlockHolder())) {
                return BLOCKS_MAP.get(state.getBlockHolder()).get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}
