package net.doppelr.lemonmates.item;

import net.doppelr.lemonmates.LemonMates;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LemonMates.MOD_ID);

    public static final DeferredItem<Item> BOTTLE_EMPTY = ITEMS.register("bottle_empty",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_CAP = ITEMS.register("bottle_cap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CITRON_LEMONADE = ITEMS.register("citron_lemonade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CITRON_LEMONADE_EMPTY = ITEMS.register("citron_lemonade_empty",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CITRON_LEMONADE_LABEL = ITEMS.register("citron_lemonade_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORANGE_LEMONADE = ITEMS.register("orange_lemonade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORANGE_LEMONADE_EMPTY = ITEMS.register("orange_lemonade_empty",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORANGE_LEMONADE_LABEL = ITEMS.register("orange_lemonade_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WATERMELON_LEMONADE = ITEMS.register("watermelon_lemonade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WATERMELON_LEMONADE_EMPTY = ITEMS.register("watermelon_lemonade_empty",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WATERMELON_LEMONADE_LABEL = ITEMS.register("watermelon_lemonade_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RASPBERRY_SODA = ITEMS.register("raspberry_soda",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RASPBERRY_SODA_EMPTY = ITEMS.register("raspberry_soda_empty",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RASPBERRY_SODA_LABEL = ITEMS.register("raspberry_soda_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SUMMER_MIX = ITEMS.register("summer_mix",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SUMMER_MIX_EMPTY = ITEMS.register("summer_mix_empty",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SUMMER_MIX_LABEL = ITEMS.register("summer_mix_label",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);
    }
}
