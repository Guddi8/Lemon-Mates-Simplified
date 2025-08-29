package net.doppelr.lemonmates.datagen;

import net.doppelr.lemonmates.AllModTags;
import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, LemonMates.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.LOGS).add(
            ModBlocks.ORANGE_LOG.get().asItem(),
            ModBlocks.ORANGE_WOOD.get().asItem(),
            ModBlocks.STRIPPED_ORANGE_LOG.get().asItem(),
            ModBlocks.STRIPPED_ORANGE_WOOD.get().asItem(),
            ModBlocks.CITRON_LOG.get().asItem(),
            ModBlocks.CITRON_WOOD.get().asItem(),
            ModBlocks.STRIPPED_CITRON_LOG.get().asItem(),
            ModBlocks.STRIPPED_CITRON_WOOD.get().asItem()
        );
        tag(ItemTags.LOGS_THAT_BURN).add(
            ModBlocks.ORANGE_LOG.get().asItem(),
            ModBlocks.ORANGE_WOOD.get().asItem(),
            ModBlocks.STRIPPED_ORANGE_LOG.get().asItem(),
            ModBlocks.STRIPPED_ORANGE_WOOD.get().asItem(),
            ModBlocks.CITRON_LOG.get().asItem(),
            ModBlocks.CITRON_WOOD.get().asItem(),
            ModBlocks.STRIPPED_CITRON_LOG.get().asItem(),
            ModBlocks.STRIPPED_CITRON_WOOD.get().asItem()
        );
        tag(Tags.Items.STRIPPED_WOODS).add(
            ModBlocks.STRIPPED_ORANGE_WOOD.get().asItem(),
            ModBlocks.STRIPPED_CITRON_WOOD.get().asItem()
        );
        tag(Tags.Items.STRIPPED_LOGS).add(
                ModBlocks.STRIPPED_ORANGE_LOG.get().asItem(),
                ModBlocks.STRIPPED_CITRON_LOG.get().asItem()
        );
        tag(ItemTags.LEAVES).add(
            ModBlocks.ORANGE_LEAVES.get().asItem(),
            ModBlocks.CITRON_LEAVES.get().asItem()
        );
        tag(ItemTags.SAPLINGS).add(
            ModBlocks.ORANGE_SAPLING.get().asItem(),
            ModBlocks.CITRON_SAPLING.get().asItem()
        );
        tag(ItemTags.PLANKS).add(
            ModBlocks.ORANGE_PLANKS.get().asItem(),
            ModBlocks.CITRON_PLANKS.get().asItem()
        );
        tag(ItemTags.STAIRS).add(
                ModBlocks.ORANGE_STAIRS.get().asItem(),
                ModBlocks.CITRON_STAIRS.get().asItem()
        );
        tag(ItemTags.SLABS).add(
                ModBlocks.ORANGE_SLAB.get().asItem(),
                ModBlocks.CITRON_SLAB.get().asItem()
        );
        tag(AllModTags.Items.ORANGE_LOGS).add(
            ModBlocks.ORANGE_LOG.get().asItem(),
            ModBlocks.ORANGE_WOOD.get().asItem(),
            ModBlocks.STRIPPED_ORANGE_LOG.get().asItem(),
            ModBlocks.STRIPPED_ORANGE_WOOD.get().asItem()
        );
        tag(AllModTags.Items.CITRON_LOGS).add(
            ModBlocks.CITRON_LOG.get().asItem(),
            ModBlocks.CITRON_WOOD.get().asItem(),
            ModBlocks.STRIPPED_CITRON_LOG.get().asItem(),
            ModBlocks.STRIPPED_CITRON_WOOD.get().asItem()
        );
    }
}
