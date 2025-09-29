package net.doppelr.lemonmates.entity.client;

import net.doppelr.lemonmates.LemonMates;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation CITRON_BOAT_LAYER = new ModelLayerLocation(
        ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "boat/citron"), "main");
    public static final ModelLayerLocation CITRON_CHEST_BOAT_LAYER = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "chest_boat/citron"), "main");

    public static final ModelLayerLocation ORANGE_BOAT_LAYER = new ModelLayerLocation(
        ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "boat/orange"), "main");
    public static final ModelLayerLocation ORANGE_CHEST_BOAT_LAYER = new ModelLayerLocation(
        ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "chest_boat/orange"), "main");
}
