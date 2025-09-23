package net.doppelr.lemonmates;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;

public class AllFoodProperties {
    public static Item.Properties lemonadeDrinks(DeferredItem<Item> usingConvertsTo) {
        return new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400), 0.35f)
            .usingConvertsTo(() -> new ItemStack(usingConvertsTo.get()).getItem())
            .alwaysEdible()
            .build());
    }

    public static final FoodProperties RASPBERRY = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.25f)
            .fast()
            .build();

    public static final FoodProperties ORANGE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodProperties ORANGE_SLICE = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.3f)
            .fast()
            .build();

    public static final FoodProperties CITRON = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodProperties CITRON_SLICE = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.3f)
            .fast()
            .build();

    public static final FoodProperties JUICE_DRINK = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.3f)
            .build();
}
