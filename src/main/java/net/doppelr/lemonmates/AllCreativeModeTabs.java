package net.doppelr.lemonmates;

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
                // Bottle, Cap
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

                // Citron
                output.accept(ModItems.BOTTLE_CITRON_LABEL);
                output.accept(ModItems.BOTTLE_CITRON_LEMONADE);
                output.accept(ModItems.BOTTLE_CITRON_CAP_LABEL);
                output.accept(ModItems.BOTTLE_CITRON_LEMONADE_CAP_LABEL);
                output.accept(ModItems.BOTTLE_CITRON_LEMONADE_CAP);
                output.accept(ModItems.BOTTLE_CITRON_LEMONADE_LABEL);

                // Orange
                output.accept(ModItems.BOTTLE_ORANGE_LABEL);
                output.accept(ModItems.BOTTLE_ORANGE_LEMONADE);
                output.accept(ModItems.BOTTLE_ORANGE_CAP_LABEL);
                output.accept(ModItems.BOTTLE_ORANGE_LEMONADE_CAP_LABEL);
                output.accept(ModItems.BOTTLE_ORANGE_LEMONADE_CAP);
                output.accept(ModItems.BOTTLE_ORANGE_LEMONADE_LABEL);

                // Raspberry
                output.accept(ModItems.BOTTLE_RASPBERRY_LABEL);
                output.accept(ModItems.BOTTLE_RASPBERRY_LEMONADE);
                output.accept(ModItems.BOTTLE_RASPBERRY_CAP_LABEL);
                output.accept(ModItems.BOTTLE_RASPBERRY_LEMONADE_CAP_LABEL);
                output.accept(ModItems.BOTTLE_RASPBERRY_LEMONADE_CAP);
                output.accept(ModItems.BOTTLE_RASPBERRY_LEMONADE_LABEL);

                // Summer Mix
                output.accept(ModItems.BOTTLE_SUMMERMIX_LABEL);
                output.accept(ModItems.BOTTLE_SUMMERMIX_LEMONADE);
                output.accept(ModItems.BOTTLE_SUMMERMIX_CAP_LABEL);
                output.accept(ModItems.BOTTLE_SUMMERMIX_LEMONADE_CAP_LABEL);
                output.accept(ModItems.BOTTLE_SUMMERMIX_LEMONADE_CAP);
                output.accept(ModItems.BOTTLE_SUMMERMIX_LEMONADE_LABEL);

                // Watermelon
                output.accept(ModItems.BOTTLE_WATERMELON_LABEL);
                output.accept(ModItems.BOTTLE_WATERMELON_LEMONADE);
                output.accept(ModItems.BOTTLE_WATERMELON_CAP_LABEL);
                output.accept(ModItems.BOTTLE_WATERMELON_LEMONADE_CAP_LABEL);
                output.accept(ModItems.BOTTLE_WATERMELON_LEMONADE_CAP);
                output.accept(ModItems.BOTTLE_WATERMELON_LEMONADE_LABEL);
            })
            .build()
    );

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LEMONMATES_PLANTS_TAB = CREATIVE_MODE_TAB.register("lemonmates_plants_tab",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + LemonMates.MOD_ID + ".lemonmates_plants"))
            .withTabsBefore(LEMONMATES_TAB.getKey())
            .icon(() -> new ItemStack(ModItems.RASPBERRY.get()))
            .displayItems((params, output) -> {
                // Plants
             //   output.accept(ModItems.CITRON);
             //   output.accept(ModItems.CITRON_SAPLING);
             //   output.accept(ModItems.ORANGE);
             //   output.accept(ModItems.ORANGE_SAPLING);
                output.accept(ModItems.RASPBERRY);
//                        output.accept(ModBlocks.CITRON_LOG);
//                        output.accept(ModBlocks.CITRON_LEAF);
//                        output.accept(ModBlocks.ORANGE_LOG);
//                        output.accept(ModBlocks.ORANGE_LEAF);
            })
            .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
