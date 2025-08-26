package net.doppelr.lemonmates.item;

import net.doppelr.lemonmates.LemonMates;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LemonMates.MOD_ID);

    // Bottle Basics
    public static final DeferredItem<Item> BOTTLE_EMPTY = ITEMS.register("bottle_empty",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_CAP = ITEMS.register("bottle_cap",
            () -> new Item(new Item.Properties()));


    // Lemonade related
    // Labels Basic
    public static final DeferredItem<Item> LABEL_EMPTY = ITEMS.register("label_empty",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LABEL_TEXT = ITEMS.register("label_text",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LABEL_TEXT_COMPANY = ITEMS.register("label_text_company",
            () -> new Item(new Item.Properties()));

    // Labels Lemonades
    public static final DeferredItem<Item> LABEL_CITRON_LEMONADE = ITEMS.register("label_citron_lemonade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LABEL_ORANGE_LEMONADE = ITEMS.register("label_orange_lemonade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LABEL_RASPBERRY_LEMONADE = ITEMS.register("label_raspberry_lemonade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LABEL_SUMMER_MIX = ITEMS.register("label_summer_mix",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LABEL_WATERMELON_LEMONADE = ITEMS.register("label_watermelon_lemonade",
            () -> new Item(new Item.Properties()));

    // Citron
    public static final DeferredItem<Item> BOTTLE_CITRON_LEMONADE = ITEMS.register("bottle_citron_lemonade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_CITRON_LEMONADE_CAP = ITEMS.register("bottle_citron_lemonade_cap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_CITRON_LEMONADE_CAP_LABEL = ITEMS.register("bottle_citron_lemonade_cap_label",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LEMONADE_DRINK)));
    public static final DeferredItem<Item> BOTTLE_CITRON_CAP_LABEL = ITEMS.register("bottle_citron_cap_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_CITRON_LABEL = ITEMS.register("bottle_citron_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_CITRON_LEMONADE_LABEL = ITEMS.register("bottle_citron_lemonade_label",
            () -> new Item(new Item.Properties()));

    // Orange
    public static final DeferredItem<Item> BOTTLE_ORANGE_LEMONADE = ITEMS.register("bottle_orange_lemonade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_ORANGE_LEMONADE_CAP = ITEMS.register("bottle_orange_lemonade_cap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_ORANGE_LEMONADE_CAP_LABEL = ITEMS.register("bottle_orange_lemonade_cap_label",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LEMONADE_DRINK)));
    public static final DeferredItem<Item> BOTTLE_ORANGE_CAP_LABEL = ITEMS.register("bottle_orange_cap_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_ORANGE_LABEL = ITEMS.register("bottle_orange_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_ORANGE_LEMONADE_LABEL = ITEMS.register("bottle_orange_lemonade_label",
            () -> new Item(new Item.Properties()));

    // Raspberry
    public static final DeferredItem<Item> BOTTLE_RASPBERRY_LEMONADE = ITEMS.register("bottle_raspberry_lemonade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_RASPBERRY_LEMONADE_CAP = ITEMS.register("bottle_raspberry_lemonade_cap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_RASPBERRY_CAP_LABEL = ITEMS.register("bottle_raspberry_cap_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_RASPBERRY_LEMONADE_CAP_LABEL = ITEMS.register("bottle_raspberry_lemonade_cap_label",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LEMONADE_DRINK)));
    public static final DeferredItem<Item> BOTTLE_RASPBERRY_LABEL = ITEMS.register("bottle_raspberry_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_RASPBERRY_LEMONADE_LABEL = ITEMS.register("bottle_raspberry_lemonade_label",
            () -> new Item(new Item.Properties()));

    // Summer Mix
    public static final DeferredItem<Item> BOTTLE_SUMMERMIX_LEMONADE = ITEMS.register("bottle_summermix_lemonade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_SUMMERMIX_LEMONADE_CAP = ITEMS.register("bottle_summermix_lemonade_cap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_SUMMERMIX_LEMONADE_CAP_LABEL = ITEMS.register("bottle_summermix_lemonade_cap_label",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LEMONADE_DRINK)));
    public static final DeferredItem<Item> BOTTLE_SUMMERMIX_CAP_LABEL = ITEMS.register("bottle_summermix_cap_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_SUMMERMIX_LABEL = ITEMS.register("bottle_summermix_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_SUMMERMIX_LEMONADE_LABEL = ITEMS.register("bottle_summermix_lemonade_label",
            () -> new Item(new Item.Properties()));

    // Watermelon
    public static final DeferredItem<Item> BOTTLE_WATERMELON_LEMONADE = ITEMS.register("bottle_watermelon_lemonade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_WATERMELON_LEMONADE_CAP = ITEMS.register("bottle_watermelon_lemonade_cap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_WATERMELON_CAP_LABEL = ITEMS.register("bottle_watermelon_cap_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_WATERMELON_LEMONADE_CAP_LABEL = ITEMS.register("bottle_watermelon_lemonade_cap_label",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LEMONADE_DRINK)));
    public static final DeferredItem<Item> BOTTLE_WATERMELON_LABEL = ITEMS.register("bottle_watermelon_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_WATERMELON_LEMONADE_LABEL = ITEMS.register("bottle_watermelon_lemonade_label",
            () -> new Item(new Item.Properties()));

    /* Plants
    public static final DeferredItem<Item> CITRON = ITEMS.register("citron",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RASPBERRY = ITEMS.register("raspberry",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CITRON_SAPLING = ITEMS.register("citron_sapling",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORANGE_SAPLING = ITEMS.register("orange_sapling",
            () -> new Item(new Item.Properties()));
    */
    public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);
    }
}
