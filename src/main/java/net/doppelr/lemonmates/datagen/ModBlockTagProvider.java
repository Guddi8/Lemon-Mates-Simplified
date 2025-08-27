package net.doppelr.lemonmates.datagen;

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
        tag(BlockTags.LOGS)
            .add(ModBlocks.ORANGE_LOG.get())
            .add(ModBlocks.ORANGE_WOOD.get())
            .add(ModBlocks.STRIPPED_ORANGE_LOG.get())
            .add(ModBlocks.STRIPPED_ORANGE_WOOD.get());
        tag(BlockTags.LOGS_THAT_BURN)
//            .add(ModBlocks.ORANGE_FENCE.get());
//        tag(BlockTags.FENCE_GATES)
//            .add(ModBlocks.ORANGE_FENCE_GATE.get());
//        tag(BlockTags.DOORS)
//            .add(ModBlocks.ORANGE_DOOR.get());
//        tag(BlockTags.TRAPDOORS)
//            .add(ModBlocks.ORANGE_TRAPDOOR.get());
    }
}
