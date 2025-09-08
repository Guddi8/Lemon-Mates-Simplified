package net.doppelr.lemonmates;

import net.doppelr.lemonmates.block.ModBlocks;
import net.doppelr.lemonmates.fluid.ModFluids;
import net.doppelr.lemonmates.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class AllCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LemonMates.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LEMONMATES_TAB = CREATIVE_MODE_TAB.register("lemonmates_tab",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + LemonMates.MOD_ID + ".lemonmates"))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .icon(() -> new ItemStack(ModItems.BOTTLE_WATERMELON_LEMONADE_CAP_LABEL.get()))
            .displayItems((params, output) -> {
                // Finished Lemonades
                output.accept(ModItems.BOTTLE_CITRON_LEMONADE_CAP_LABEL);
                output.accept(ModItems.BOTTLE_ORANGE_LEMONADE_CAP_LABEL);
                output.accept(ModItems.BOTTLE_RASPBERRY_LEMONADE_CAP_LABEL);
                output.accept(ModItems.BOTTLE_SUMMERMIX_LEMONADE_CAP_LABEL);
                output.accept(ModItems.BOTTLE_WATERMELON_LEMONADE_CAP_LABEL);

                // Bottle Basics
                output.accept(ModItems.BOTTLE_CAP);
                output.accept(ModItems.BOTTLE_EMPTY);
                output.accept(ModItems.BOTTLE_CAPPED);

                // Labels
                output.accept(ModItems.LABEL_EMPTY);
                output.accept(ModItems.LABEL_TEXT);
                output.accept(ModItems.LABEL_TEXT_COMPANY);

                output.accept(ModItems.LABEL_CITRON_LEMONADE);
                output.accept(ModItems.LABEL_ORANGE_LEMONADE);
                output.accept(ModItems.LABEL_RASPBERRY_LEMONADE);
                output.accept(ModItems.LABEL_SUMMER_MIX);
                output.accept(ModItems.LABEL_WATERMELON_LEMONADE);

                // Bottle with Label
                output.accept(ModItems.BOTTLE_CITRON_LABEL);
                output.accept(ModItems.BOTTLE_ORANGE_LABEL);
                output.accept(ModItems.BOTTLE_RASPBERRY_LABEL);
                output.accept(ModItems.BOTTLE_SUMMERMIX_LABEL);
                output.accept(ModItems.BOTTLE_WATERMELON_LABEL);

                // Bottle with Lemonade
                output.accept(ModItems.BOTTLE_CITRON_LEMONADE);
                output.accept(ModItems.BOTTLE_ORANGE_LEMONADE);
                output.accept(ModItems.BOTTLE_RASPBERRY_LEMONADE);
                output.accept(ModItems.BOTTLE_SUMMERMIX_LEMONADE);
                output.accept(ModItems.BOTTLE_WATERMELON_LEMONADE);

                // Bottle with Cap and Label
                output.accept(ModItems.BOTTLE_CITRON_CAP_LABEL);
                output.accept(ModItems.BOTTLE_ORANGE_CAP_LABEL);
                output.accept(ModItems.BOTTLE_RASPBERRY_CAP_LABEL);
                output.accept(ModItems.BOTTLE_SUMMERMIX_CAP_LABEL);
                output.accept(ModItems.BOTTLE_WATERMELON_CAP_LABEL);

                // Bottle with Lemonade and Cap
                output.accept(ModItems.BOTTLE_CITRON_LEMONADE_CAP);
                output.accept(ModItems.BOTTLE_ORANGE_LEMONADE_CAP);
                output.accept(ModItems.BOTTLE_RASPBERRY_LEMONADE_CAP);
                output.accept(ModItems.BOTTLE_SUMMERMIX_LEMONADE_CAP);
                output.accept(ModItems.BOTTLE_WATERMELON_LEMONADE_CAP);

                // Bottle with Lemonade and Label
                output.accept(ModItems.BOTTLE_CITRON_LEMONADE_LABEL);
                output.accept(ModItems.BOTTLE_ORANGE_LEMONADE_LABEL);
                output.accept(ModItems.BOTTLE_RASPBERRY_LEMONADE_LABEL);
                output.accept(ModItems.BOTTLE_SUMMERMIX_LEMONADE_LABEL);
                output.accept(ModItems.BOTTLE_WATERMELON_LEMONADE_LABEL);
            })
            .build()
    );

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LEMONMATES_PLANTS_TAB = CREATIVE_MODE_TAB.register("lemonmates_plants_tab",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + LemonMates.MOD_ID + ".lemonmates_plants"))
            .withTabsBefore(LEMONMATES_TAB.getKey())
            .icon(() -> new ItemStack(ModItems.ORANGE.get()))
            .displayItems((params, output) -> {
                // Fruits
                output.accept(ModItems.CITRON);
                output.accept(ModItems.ORANGE);
                output.accept(ModItems.RASPBERRY);

                // Crates
                output.accept(ModBlocks.CITRON_CRATE);
                output.accept(ModBlocks.ORANGE_CRATE);
                output.accept(ModBlocks.RASPBERRY_CRATE);

                // Juices
                output.accept(ModItems.CITRON_JUICE);
                output.accept(ModItems.ORANGE_JUICE);
                output.accept(ModItems.RASPBERRY_JUICE);

                // Citron Wood Stuffs
                output.accept(ModBlocks.CITRON_SAPLING);
                output.accept(ModBlocks.CITRON_LEAVES);
                output.accept(ModBlocks.CITRON_LOG);
                output.accept(ModBlocks.CITRON_WOOD);
                output.accept(ModBlocks.STRIPPED_CITRON_LOG);
                output.accept(ModBlocks.STRIPPED_CITRON_WOOD);
                output.accept(ModBlocks.CITRON_PLANKS);
                output.accept(ModBlocks.CITRON_STAIRS);
                output.accept(ModBlocks.CITRON_SLAB);
                output.accept(ModBlocks.CITRON_FENCE);
                output.accept(ModBlocks.CITRON_FENCE_GATE);
                output.accept(ModBlocks.CITRON_DOOR);
                output.accept(ModBlocks.CITRON_TRAPDOOR);
                output.accept(ModBlocks.CITRON_PRESSURE_PLATE);
                output.accept(ModBlocks.CITRON_BUTTON);
                output.accept(ModBlocks.CITRON_SIGN);
                output.accept(ModItems.CITRON_SIGN);
                output.accept(ModItems.CITRON_HANGING_SIGN);

                // Orange Wood Stuffs
                output.accept(ModBlocks.ORANGE_SAPLING);
                output.accept(ModBlocks.ORANGE_LEAVES);
                output.accept(ModBlocks.ORANGE_LOG);
                output.accept(ModBlocks.ORANGE_WOOD);
                output.accept(ModBlocks.STRIPPED_ORANGE_LOG);
                output.accept(ModBlocks.STRIPPED_ORANGE_WOOD);
                output.accept(ModBlocks.ORANGE_PLANKS);
                output.accept(ModBlocks.ORANGE_STAIRS);
                output.accept(ModBlocks.ORANGE_SLAB);
                output.accept(ModBlocks.ORANGE_FENCE);
                output.accept(ModBlocks.ORANGE_FENCE_GATE);
                output.accept(ModBlocks.ORANGE_DOOR);
                output.accept(ModBlocks.ORANGE_TRAPDOOR);
                output.accept(ModBlocks.ORANGE_PRESSURE_PLATE);
                output.accept(ModBlocks.ORANGE_BUTTON);
                output.accept(ModItems.ORANGE_SIGN);
                output.accept(ModItems.ORANGE_HANGING_SIGN);
            })
            .build()
    );

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LEMONMATES_PROCESSING_TAB = CREATIVE_MODE_TAB.register("lemonmates_processing_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + LemonMates.MOD_ID + ".lemonmates_processing"))
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> new ItemStack(ModFluids.WATERMELON_LEMONADE_FLUID_BUCKET.get()))
                    .displayItems((params, output) -> {
                        // Liquids
                        output.accept(ModFluids.CITRON_LEMONADE_FLUID_BUCKET.get());
                        output.accept(ModFluids.ORANGE_LEMONADE_FLUID_BUCKET.get());
                        output.accept(ModFluids.RASPBERRY_LEMONADE_FLUID_BUCKET.get());
                        output.accept(ModFluids.SUMMERMIX_LEMONADE_FLUID_BUCKET.get());
                        output.accept(ModFluids.WATERMELON_LEMONADE_FLUID_BUCKET.get());
                        output.accept(ModFluids.MIXED_CITRON_LEMONADE_FLUID_BUCKET.get());
                        output.accept(ModFluids.MIXED_ORANGE_LEMONADE_FLUID_BUCKET.get());
                        output.accept(ModFluids.MIXED_RASPBERRY_LEMONADE_FLUID_BUCKET.get());
                        output.accept(ModFluids.MIXED_SUMMERMIX_LEMONADE_FLUID_BUCKET.get());
                        output.accept(ModFluids.MIXED_WATERMELON_LEMONADE_FLUID_BUCKET.get());

                        // Bottle form related
                        output.accept(ModItems.BOTTLE_INCOMPLETE);
                        output.accept(ModItems.FORMABLE_PLASTIC);
                        output.accept(ModItems.BOTTLE_FORM);
                    })
            .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
