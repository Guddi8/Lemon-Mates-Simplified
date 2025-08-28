package net.doppelr.lemonmates.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;

public class ModFoodProperties {
    public static final FoodProperties LEMONADE_DRINK = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .alwaysEdible()
            .effect( () -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400), 0.35f)
            .usingConvertsTo(() -> new ItemStack(ModItems.BOTTLE_CAPPED.get()).getItem())
            .alwaysEdible()
            .build();
}
