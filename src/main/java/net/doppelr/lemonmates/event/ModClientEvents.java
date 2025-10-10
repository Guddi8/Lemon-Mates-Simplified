package net.doppelr.lemonmates.event;

import com.simibubi.create.AllDataComponents;
import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import net.doppelr.lemonmates.AllWoodTypes;
import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.block.entity.ModBlockEntities;
import net.doppelr.lemonmates.entity.ModEntities;
import net.doppelr.lemonmates.entity.client.ModBoatRenderer;
import net.doppelr.lemonmates.item.LemonadeDrinkItem;
import net.doppelr.lemonmates.item.ModItems;
import net.doppelr.lemonmates.entity.client.ModModelLayers;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.registries.DeferredHolder;


@EventBusSubscriber(modid = LemonMates.MOD_ID, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.CITRON_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.CITRON_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.ORANGE_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.ORANGE_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
    }

    @SubscribeEvent
    public static void registerBlockEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.HANGING_SIGN.get(), HangingSignRenderer::new);
    }

    @SubscribeEvent
    public static void onClientSetup(net.neoforged.fml.event.lifecycle.FMLClientSetupEvent event) {
        Sheets.addWoodType(AllWoodTypes.CITRON);
        Sheets.addWoodType(AllWoodTypes.ORANGE);

        EntityRenderers.register(ModEntities.MOD_BOAT.get(), context -> new ModBoatRenderer(context, false));
        EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), context -> new ModBoatRenderer(context, true));

        for (DeferredHolder<Item, ?> entry : ModItems.ITEMS.getEntries()) {
            if (entry.get() instanceof SequencedAssemblyItem item) {
                ItemProperties.register(
                    item,
                    LemonMates.rl("assembly_step"),
                    (stack, level, entity, seed) -> {
                        if (stack.has(AllDataComponents.SEQUENCED_ASSEMBLY)) {
                            return stack.get(AllDataComponents.SEQUENCED_ASSEMBLY).step();
                        }
                        return 0.0f;
                    }
                );
            }
        }

        for (DeferredHolder<Item, ?> entry : ModItems.ITEMS.getEntries()) {
            if (entry.get() instanceof LemonadeDrinkItem item) {
                ItemProperties.register(
                    item,
                    LemonMates.rl("drinking_stage"),
                    (stack, level, entity, seed) -> {
                        if (entity != null && entity.isUsingItem() && entity.getUseItem() == stack) {
                            int duration = stack.getUseDuration(entity) - entity.getUseItemRemainingTicks();
                            return duration > 2 ? 1.0f : 0.0f; // opens the bottle after 2 ticks
                        }
                        return 0.0f;
                    }
                );
            }
        }
    }
}
