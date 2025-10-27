package net.doppelr.lemonmates.datagen;

import net.doppelr.lemonmates.AllTags;
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
        tag(AllTags.FluidTags.LEMONADES).add(
            ModFluids.CITRON_LEMONADE_SOURCE.get(),
            ModFluids.CITRON_LEMONADE_FLOWING.get(),
            ModFluids.ORANGE_LEMONADE_SOURCE.get(),
            ModFluids.ORANGE_LEMONADE_FLOWING.get(),
            ModFluids.RASPBERRY_LEMONADE_SOURCE.get(),
            ModFluids.RASPBERRY_LEMONADE_FLOWING.get(),
            ModFluids.SUMMERMIX_LEMONADE_SOURCE.get(),
            ModFluids.SUMMERMIX_LEMONADE_FLOWING.get(),
            ModFluids.WATERMELON_LEMONADE_SOURCE.get(),
            ModFluids.WATERMELON_LEMONADE_FLOWING.get()
        );
        tag(AllTags.FluidTags.LEMONADES_CITRON).add(
            ModFluids.CITRON_LEMONADE_SOURCE.get(),
            ModFluids.CITRON_LEMONADE_FLOWING.get()
        );
        tag(AllTags.FluidTags.LEMONADES_ORANGE).add(
            ModFluids.ORANGE_LEMONADE_SOURCE.get(),
            ModFluids.ORANGE_LEMONADE_FLOWING.get()
        );
        tag(AllTags.FluidTags.LEMONADES_RASPBERRY).add(
            ModFluids.RASPBERRY_LEMONADE_SOURCE.get(),
            ModFluids.RASPBERRY_LEMONADE_FLOWING.get()
        );
        tag(AllTags.FluidTags.LEMONADES_SUMMERMIX).add(
            ModFluids.SUMMERMIX_LEMONADE_SOURCE.get(),
            ModFluids.SUMMERMIX_LEMONADE_FLOWING.get()
        );
        tag(AllTags.FluidTags.LEMONADES_WATERMELON).add(
            ModFluids.WATERMELON_LEMONADE_SOURCE.get(),
            ModFluids.WATERMELON_LEMONADE_FLOWING.get()
        );

        tag(AllTags.FluidTags.C_LEMONADES).add(
            ModFluids.CITRON_LEMONADE_SOURCE.get(),
            ModFluids.CITRON_LEMONADE_FLOWING.get(),
            ModFluids.ORANGE_LEMONADE_SOURCE.get(),
            ModFluids.ORANGE_LEMONADE_FLOWING.get(),
            ModFluids.RASPBERRY_LEMONADE_SOURCE.get(),
            ModFluids.RASPBERRY_LEMONADE_FLOWING.get(),
            ModFluids.SUMMERMIX_LEMONADE_SOURCE.get(),
            ModFluids.SUMMERMIX_LEMONADE_FLOWING.get(),
            ModFluids.WATERMELON_LEMONADE_SOURCE.get(),
            ModFluids.WATERMELON_LEMONADE_FLOWING.get()
        );
        tag(AllTags.FluidTags.C_PLASTIC).add(
            ModFluids.PLASTIC_SOURCE.get(),
            ModFluids.PLASTIC_FLOWING.get()
        );
    }
}
