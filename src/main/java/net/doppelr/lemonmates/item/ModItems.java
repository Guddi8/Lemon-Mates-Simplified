package net.doppelr.lemonmates.item;

import net.doppelr.lemonmates.LemonMates;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LemonMates.MOD_ID);

    public static final DeferredItem<Item> WATERMELON_LEMONADE = ITEMS.register("watermelon_lemonade",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);
    }
}
