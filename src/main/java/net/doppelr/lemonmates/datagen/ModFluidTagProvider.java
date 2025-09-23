package net.doppelr.lemonmates.datagen;

import net.doppelr.lemonmates.AllModTags;
import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.fluid.ModFluids;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModFluidTagProvider extends FluidTagsProvider {

    public ModFluidTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, LemonMates.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(AllModTags.FluidTags.COMMON_PLASTIC).add(
            ModFluids.PLASTIC_FLUID.get(),
            ModFluids.PLASTIC_FLUID_FLOWING.get()
        );
    }
}
