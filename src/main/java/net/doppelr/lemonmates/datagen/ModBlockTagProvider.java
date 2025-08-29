package net.doppelr.lemonmates.datagen;

import net.doppelr.lemonmates.AllModTags;
import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, LemonMates.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.OVERWORLD_NATURAL_LOGS).add(
            ModBlocks.ORANGE_LOG.get(),
            ModBlocks.CITRON_LOG.get()
        );
        tag(BlockTags.LOGS).add(
            ModBlocks.ORANGE_LOG.get(),
            ModBlocks.ORANGE_WOOD.get(),
            ModBlocks.STRIPPED_ORANGE_LOG.get(),
            ModBlocks.STRIPPED_ORANGE_WOOD.get(),
            ModBlocks.CITRON_LOG.get(),
            ModBlocks.CITRON_WOOD.get(),
            ModBlocks.STRIPPED_CITRON_LOG.get(),
            ModBlocks.STRIPPED_CITRON_WOOD.get()
        );
        tag(BlockTags.LOGS_THAT_BURN).add(
            ModBlocks.ORANGE_LOG.get(),
            ModBlocks.ORANGE_WOOD.get(),
            ModBlocks.STRIPPED_ORANGE_LOG.get(),
            ModBlocks.STRIPPED_ORANGE_WOOD.get(),
            ModBlocks.CITRON_LOG.get(),
            ModBlocks.CITRON_WOOD.get(),
            ModBlocks.STRIPPED_CITRON_LOG.get(),
            ModBlocks.STRIPPED_CITRON_WOOD.get()
        );
        tag(Tags.Blocks.STRIPPED_LOGS).add(
            ModBlocks.STRIPPED_ORANGE_LOG.get(),
            ModBlocks.STRIPPED_CITRON_LOG.get()
        );
        tag(Tags.Blocks.STRIPPED_WOODS).add(
            ModBlocks.STRIPPED_ORANGE_WOOD.get(),
            ModBlocks.STRIPPED_CITRON_WOOD.get()
        );
        tag(BlockTags.LEAVES).add(
            ModBlocks.ORANGE_LEAVES.get(),
            ModBlocks.CITRON_LEAVES.get()
        );
        tag(BlockTags.SAPLINGS).add(
            ModBlocks.ORANGE_SAPLING.get(),
            ModBlocks.CITRON_SAPLING.get()
        );
        tag(BlockTags.PLANKS).add(
            ModBlocks.ORANGE_PLANKS.get(),
            ModBlocks.CITRON_PLANKS.get()
        );
        tag(BlockTags.MINEABLE_WITH_AXE).add(
            ModBlocks.ORANGE_PLANKS.get(),
            ModBlocks.ORANGE_CRATE.get(),
            ModBlocks.RASPBERRY_CRATE.get(),
            ModBlocks.CITRON_PLANKS.get(),
            ModBlocks.CITRON_CRATE.get()
        );
        tag(BlockTags.MINEABLE_WITH_HOE).add(
            ModBlocks.ORANGE_LEAVES.get(),
            ModBlocks.CITRON_LEAVES.get()
        );
        tag(BlockTags.WOODEN_STAIRS).add(
            ModBlocks.ORANGE_STAIRS.get(),
            ModBlocks.CITRON_STAIRS.get()
        );
        tag(BlockTags.WOODEN_SLABS).add(
            ModBlocks.ORANGE_SLAB.get(),
            ModBlocks.CITRON_SLAB.get()
        );
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(
            ModBlocks.ORANGE_PRESSURE_PLATE.get(),
            ModBlocks.CITRON_PRESSURE_PLATE.get()
        );
        tag(BlockTags.WOODEN_BUTTONS).add(
            ModBlocks.ORANGE_BUTTON.get(),
            ModBlocks.CITRON_BUTTON.get()
        );
        tag(BlockTags.FENCES).add(
            ModBlocks.ORANGE_FENCE.get(),
            ModBlocks.CITRON_FENCE.get()
        );
        tag(BlockTags.WOODEN_FENCES).add(
            ModBlocks.ORANGE_FENCE.get(),
            ModBlocks.CITRON_FENCE.get()
        );
        tag(BlockTags.FENCE_GATES).add(
            ModBlocks.ORANGE_FENCE_GATE.get(),
            ModBlocks.CITRON_FENCE_GATE.get()
        );
        tag(BlockTags.DOORS).add(
            ModBlocks.ORANGE_DOOR.get(),
            ModBlocks.CITRON_DOOR.get()
        );
        tag(BlockTags.WOODEN_DOORS).add(
            ModBlocks.ORANGE_DOOR.get(),
            ModBlocks.CITRON_DOOR.get()
        );
        tag(BlockTags.TRAPDOORS).add(
            ModBlocks.ORANGE_TRAPDOOR.get(),
            ModBlocks.CITRON_TRAPDOOR.get()
        );
        tag(BlockTags.WOODEN_TRAPDOORS).add(
            ModBlocks.ORANGE_TRAPDOOR.get(),
            ModBlocks.CITRON_TRAPDOOR.get()
        );
        tag(AllModTags.Blocks.ORANGE_LOGS).add(
            ModBlocks.ORANGE_LOG.get(),
            ModBlocks.ORANGE_WOOD.get(),
            ModBlocks.STRIPPED_ORANGE_LOG.get(),
            ModBlocks.STRIPPED_ORANGE_WOOD.get()
        );
        tag(AllModTags.Blocks.CITRON_LOGS).add(
            ModBlocks.CITRON_LOG.get(),
            ModBlocks.CITRON_WOOD.get(),
            ModBlocks.STRIPPED_CITRON_LOG.get(),
            ModBlocks.STRIPPED_CITRON_WOOD.get()
        );
    }
}
