package net.doppelr.lemonmates.item;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.AllFoodProperties;
import net.doppelr.lemonmates.block.ModBlocks;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LemonMates.MOD_ID);

    // Sequenced Ingredient
    public static final DeferredItem<Item> INCOMPLETE_CITRON_LEMONADE = ITEMS.register("incomplete_citron_lemonade",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ORANGE_LEMONADE = ITEMS.register("incomplete_orange_lemonade",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_RASPBERRY_LEMONADE = ITEMS.register("incomplete_raspberry_lemonade",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_SUMMERMIX_LEMONADE = ITEMS.register("incomplete_summermix_lemonade",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_WATERMELON_LEMONADE = ITEMS.register("incomplete_watermelon_lemonade",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    // Plastic
    public static final DeferredItem<Item> SEED_FLOUR = ITEMS.register("seed_flour",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STARCH = ITEMS.register("starch",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BIOPLASTIC_MASS = ITEMS.register("bioplastic_mass",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROKEN_BOTTLE = ITEMS.register("broken_bottle",
            () -> new Item(new Item.Properties()));

    // Molds
    public static final DeferredItem<Item> PREFORM_MOLD = ITEMS.register("preform_mold",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PREFORM_MOLD_WITH_PREFORM = ITEMS.register("preform_mold_with_preform",
            () -> new Item(new Item.Properties().craftRemainder(ModItems.PREFORM_MOLD.get())));
    public static final DeferredItem<Item> BOTTLE_MOLD = ITEMS.register("bottle_mold",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_MOLD_WITH_PREFORM = ITEMS.register("bottle_mold_with_preform",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_MOLD_WITH_BOTTLE = ITEMS.register("bottle_mold_with_bottle",
            () -> new Item(new Item.Properties().craftRemainder(ModItems.BOTTLE_MOLD.get())));
    public static final DeferredItem<Item> CAP_MOLD = ITEMS.register("cap_mold",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAP_MOLD_WITH_CAP = ITEMS.register("cap_mold_with_cap",
            () -> new Item(new Item.Properties().craftRemainder(ModItems.CAP_MOLD.get())));

    // Bottle Basics
    public static final DeferredItem<Item> PREFORM = ITEMS.register("preform",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_EMPTY = ITEMS.register("bottle_empty",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_CAP = ITEMS.register("bottle_cap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_CAPPED = ITEMS.register("bottle_capped",
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
    public static final DeferredItem<Item> LABEL_SUMMERMIX_LEMONADE = ITEMS.register("label_summermix_lemonade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LABEL_WATERMELON_LEMONADE = ITEMS.register("label_watermelon_lemonade",
            () -> new Item(new Item.Properties()));

    // Citron
    public static final DeferredItem<Item> BOTTLE_CITRON_CAP_LABEL = ITEMS.register("bottle_citron_cap_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_CITRON_LEMONADE_CAP_LABEL = ITEMS.register("bottle_citron_lemonade_cap_label",
            () -> new LemonadeDrinkItem(AllFoodProperties.lemonadeDrinks(ModItems.BOTTLE_CITRON_CAP_LABEL)));
    public static final DeferredItem<Item> BOTTLE_CITRON_LABEL = ITEMS.register("bottle_citron_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_CITRON_LEMONADE_LABEL = ITEMS.register("bottle_citron_lemonade_label",
            () -> new Item(new Item.Properties()));

    // Orange
    public static final DeferredItem<Item> BOTTLE_ORANGE_CAP_LABEL = ITEMS.register("bottle_orange_cap_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_ORANGE_LEMONADE_CAP_LABEL = ITEMS.register("bottle_orange_lemonade_cap_label",
            () -> new LemonadeDrinkItem(AllFoodProperties.lemonadeDrinks(ModItems.BOTTLE_ORANGE_CAP_LABEL)));
    public static final DeferredItem<Item> BOTTLE_ORANGE_LABEL = ITEMS.register("bottle_orange_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_ORANGE_LEMONADE_LABEL = ITEMS.register("bottle_orange_lemonade_label",
            () -> new Item(new Item.Properties()));

    // Raspberry
    public static final DeferredItem<Item> BOTTLE_RASPBERRY_CAP_LABEL = ITEMS.register("bottle_raspberry_cap_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_RASPBERRY_LEMONADE_CAP_LABEL = ITEMS.register("bottle_raspberry_lemonade_cap_label",
            () -> new LemonadeDrinkItem(AllFoodProperties.lemonadeDrinks(ModItems.BOTTLE_RASPBERRY_CAP_LABEL)));
    public static final DeferredItem<Item> BOTTLE_RASPBERRY_LABEL = ITEMS.register("bottle_raspberry_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_RASPBERRY_LEMONADE_LABEL = ITEMS.register("bottle_raspberry_lemonade_label",
            () -> new Item(new Item.Properties()));

    // Summer Mix
    public static final DeferredItem<Item> BOTTLE_SUMMERMIX_CAP_LABEL = ITEMS.register("bottle_summermix_cap_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_SUMMERMIX_LEMONADE_CAP_LABEL = ITEMS.register("bottle_summermix_lemonade_cap_label",
            () -> new LemonadeDrinkItem(AllFoodProperties.lemonadeDrinks(ModItems.BOTTLE_SUMMERMIX_CAP_LABEL)));
    public static final DeferredItem<Item> BOTTLE_SUMMERMIX_LABEL = ITEMS.register("bottle_summermix_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_SUMMERMIX_LEMONADE_LABEL = ITEMS.register("bottle_summermix_lemonade_label",
            () -> new Item(new Item.Properties()));

    // Watermelon
    public static final DeferredItem<Item> BOTTLE_WATERMELON_CAP_LABEL = ITEMS.register("bottle_watermelon_cap_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_WATERMELON_LEMONADE_CAP_LABEL = ITEMS.register("bottle_watermelon_lemonade_cap_label",
            () -> new LemonadeDrinkItem(AllFoodProperties.lemonadeDrinks(ModItems.BOTTLE_WATERMELON_CAP_LABEL)));
    public static final DeferredItem<Item> BOTTLE_WATERMELON_LABEL = ITEMS.register("bottle_watermelon_label",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTTLE_WATERMELON_LEMONADE_LABEL = ITEMS.register("bottle_watermelon_lemonade_label",
            () -> new Item(new Item.Properties()));

    // Plants
    public static final DeferredItem<Item> CITRON = ITEMS.register("citron",
            () -> new Item(new Item.Properties().food(AllFoodProperties.CITRON)));
    public static final DeferredItem<Item> CITRON_SLICE = ITEMS.register("citron_slice",
            () -> new Item(new Item.Properties().food(AllFoodProperties.CITRON_SLICE)));
    public static final DeferredItem<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().food(AllFoodProperties.ORANGE)));
    public static final DeferredItem<Item> ORANGE_SLICE = ITEMS.register("orange_slice",
            () -> new Item(new Item.Properties().food(AllFoodProperties.ORANGE_SLICE)));
    public static final DeferredItem<Item> RASPBERRY = ITEMS.register("raspberry",
            () -> new ItemNameBlockItem(ModBlocks.RASPBERRY_BUSH.get(), new Item.Properties().food(AllFoodProperties.RASPBERRY)));

    // Wood Items
    public static final DeferredItem<SignItem> CITRON_SIGN = ITEMS.register("citron_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CITRON_SIGN.get(), ModBlocks.CITRON_WALL_SIGN.get()));
    public static final DeferredItem<HangingSignItem> CITRON_HANGING_SIGN = ITEMS.register("citron_hanging_sign",
            () -> new HangingSignItem(ModBlocks.CITRON_HANGING_SIGN.get(), ModBlocks.CITRON_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<SignItem> ORANGE_SIGN = ITEMS.register("orange_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ORANGE_SIGN.get(), ModBlocks.ORANGE_WALL_SIGN.get()));
    public static final DeferredItem<HangingSignItem> ORANGE_HANGING_SIGN = ITEMS.register("orange_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ORANGE_HANGING_SIGN.get(), ModBlocks.ORANGE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final DeferredItem<BoatItem> CITRON_BOAT = ITEMS.register("citron_boat",
            () -> new BoatItem(false, Boat.Type.OAK, new Item.Properties()));
    public static final DeferredItem<BoatItem> ORANGE_BOAT = ITEMS.register("orange_boat",
            () -> new BoatItem(false, Boat.Type.OAK, new Item.Properties()));


    public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);
    }
}
