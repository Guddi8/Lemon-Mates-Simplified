package net.doppelr.lemonmates;

import net.doppelr.lemonmates.item.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;

public class AllFoodProperties {
    public static final FoodProperties LEMONADE_DRINK = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .alwaysEdible()
            .effect( () -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400), 0.35f)
            .usingConvertsTo(() -> new ItemStack(ModItems.BOTTLE_CAPPED.get()).getItem())
            .alwaysEdible()
            .build();

    public static final FoodProperties RASPBERRY = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.25f)
            .fast()
            .build();

    public static final FoodProperties ORANGE = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.3f)
            .fast()
            .build();

    public static final FoodProperties CITRON = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.3f)
            .fast()
            .build();
    public static final FoodProperties JUICE_DRINK = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.3f)
            .build();
}
