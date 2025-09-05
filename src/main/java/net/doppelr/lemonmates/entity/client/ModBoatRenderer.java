package net.doppelr.lemonmates.entity.client;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.entity.ModBoatEntity;
import net.doppelr.lemonmates.entity.ModChestBoatEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;

import java.util.Map;
import java.util.stream.Stream;

public class ModBoatRenderer extends BoatRenderer {
    private final Map<ModBoatEntity.Type, Pair<ResourceLocation, ListModel<Boat>>> boatResources;

    public ModBoatRenderer(EntityRendererProvider.Context context, boolean chestBoat) {
        super(context, chestBoat);
        boatResources = Stream.of(ModBoatEntity.Type.values()).collect(
            ImmutableMap.toImmutableMap(type -> type, type ->
                Pair.of(ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, getTextureLocation(type, chestBoat)), createBoatModel(context, type, chestBoat)))
        );
    }

    private static String getTextureLocation(ModBoatEntity.Type type, boolean chestBoat) {
        return chestBoat ? "textures/entity/chest_boat/" + type.getName() + ".png" : "textures/entity/boat/" + type.getName() + ".png";
    }

    private ListModel<Boat> createBoatModel(EntityRendererProvider.Context context, ModBoatEntity.Type type, boolean chestBoat) {
        ModelLayerLocation modelLayerLocation = chestBoat ? ModBoatRenderer.createChestBoatModelName(type) : ModBoatRenderer.createBoatModelName(type);
        ModelPart modelpart = context.bakeLayer(modelLayerLocation);
        return chestBoat ? new ChestBoatModel(modelpart) : new BoatModel(modelpart);
    }

    private static ModelLayerLocation createBoatModelName(ModBoatEntity.Type type) {
        return createLocation("boat/" + type.getName(), "main");
    }

    private static ModelLayerLocation createChestBoatModelName(ModBoatEntity.Type type) {
        return createLocation("chest_boat/" + type.getName(), "main");
    }

    private static ModelLayerLocation createLocation(String path, String model) {
        return new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, path), model);
    }

    public Pair<ResourceLocation, ListModel<Boat>> getModelWithLocation(Boat boat) {
        if (boat instanceof ModBoatEntity modBoat) {
            return boatResources.get(modBoat.getModVariant());
        } else if (boat instanceof ModChestBoatEntity modChestBoat){
            return boatResources.get(modChestBoat.getModVariant());
        } else {
            return null;
        }
    }
}
