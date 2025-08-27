package net.doppelr.lemonmates.block;

import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(LemonMates.MOD_ID);

//    public static final DeferredBlock<Block> CITRON_LOG = registerBlock("citron_log",
//            () -> new Block(BlockBehaviour.Properties.of()
//                    .strength(4f).sound(SoundType.WOOD)));
//    public static final DeferredBlock<Block> CITRON_LEAF = registerBlock("citron_leaf",
//            () -> new Block(BlockBehaviour.Properties.of()
//                    .strength(4f).sound(SoundType.WOOD)));
//    public static final DeferredBlock<Block> ORANGE_LOG = registerBlock("orange_log",
//            () -> new Block(BlockBehaviour.Properties.of()
//                    .strength(4f).sound(SoundType.WOOD)));
//    public static final DeferredBlock<Block> ORANGE_LEAF = registerBlock("orange_leaf",
//            () -> new Block(BlockBehaviour.Properties.of()
//                    .strength(4f).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> RASPBERRY_BUSH = registerBlock("raspberry_bush",
            () -> new RaspberryBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier <T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
