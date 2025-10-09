package net.doppelr.lemonmates.worldgen;

import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> RASPBERRY_BUSH_PLACED_KEY = registerKey("raspberry_bush_placed");
    public static final ResourceKey<PlacedFeature> ORANGE_TREE_PLACED_KEY = registerKey("orange_tree_placed");
    public static final ResourceKey<PlacedFeature> SMALL_ORANGE_TREE_PLACED_KEY = registerKey("small_orange_tree_placed");
    public static final ResourceKey<PlacedFeature> CITRON_TREE_PLACED_KEY = registerKey("citron_tree_placed");
    public static final ResourceKey<PlacedFeature> SMALL_CITRON_TREE_PLACED_KEY = registerKey("small_citron_tree_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, RASPBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RASPBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(64), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, ORANGE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORANGE_TREE_KEY),
            List.of(
                RarityFilter.onAverageOnceEvery(256),
                SurfaceWaterDepthFilter.forMaxDepth(0), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome(),
                BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.DEAD_BUSH.defaultBlockState(), BlockPos.ZERO))
            )
        );

        register(context, SMALL_ORANGE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMALL_ORANGE_TREE_KEY),
            List.of(
                RarityFilter.onAverageOnceEvery(128),
                PlacementUtils.countExtra(3, 0.05f, 2),
                SurfaceWaterDepthFilter.forMaxDepth(0), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome(),
                BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.DEAD_BUSH.defaultBlockState(), BlockPos.ZERO))
            ));

        register(context, CITRON_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CITRON_TREE_KEY),
            VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 2), ModBlocks.CITRON_SAPLING.get()));

        register(context, SMALL_CITRON_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMALL_CITRON_TREE_KEY),
            VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 2), ModBlocks.CITRON_SAPLING.get()));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}