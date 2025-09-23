package net.doppelr.lemonmates.item;

import net.doppelr.lemonmates.LemonMates;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.neoforged.fml.loading.FMLEnvironment;
import org.jetbrains.annotations.NotNull;

public class LemonadeDrinkItem extends Item {
    public LemonadeDrinkItem(Properties properties) {
        super(properties);

        if (FMLEnvironment.dist.isClient()) {
            ItemProperties.register(
                this,
                LemonMates.rl("drinking_stage"),
                (stack, level, entity, seed) -> {
                    if (entity != null && entity.isUsingItem() && entity.getUseItem() == stack) {
                        int duration = stack.getUseDuration(entity) - entity.getUseItemRemainingTicks();
                        return duration > 2 ? 1.0f : 0.0f;
                        // open the bottle after 2 ticks
                    }
                    return 0.0f;
                }
            );
        }
    }

    @Override
    public @NotNull UseAnim getUseAnimation(@NotNull ItemStack stack) {
        return UseAnim.DRINK; // setting this to EAT would allow for custom particles in the textures model
    }

    @Override
    public @NotNull SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public @NotNull SoundEvent getDrinkingSound() {
        return SoundEvents.GENERIC_DRINK;
    }
}
