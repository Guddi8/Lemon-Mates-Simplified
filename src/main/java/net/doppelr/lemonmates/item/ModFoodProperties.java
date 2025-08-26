package net.doppelr.lemonmates.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.level.ItemLike;

public class ModFoodProperties {
    public static final FoodProperties LEMONADE_DRINK = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .alwaysEdible()
            .effect( () -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400), 0.35f)
            .build();
}
