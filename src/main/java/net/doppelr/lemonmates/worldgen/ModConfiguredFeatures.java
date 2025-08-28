package net.doppelr.lemonmates.worldgen;

import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.block.ModBlocks;
import net.doppelr.lemonmates.block.RaspberryBushBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.CherryFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> RASPBERRY_BUSH_KEY = registerKey("raspberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_TREE_KEY = registerKey("orange_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CITRON_TREE_KEY = registerKey("citron_tree");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        register(context, RASPBERRY_BUSH_KEY, Feature.RANDOM_PATCH,
            FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.RASPBERRY_BUSH.get().defaultBlockState().setValue(RaspberryBushBlock.AGE, 3))
                ), List.of(Blocks.GRASS_BLOCK)));

        register(context, ORANGE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(ModBlocks.ORANGE_LOG.get()),
            // int baseHeight, int heightRandA, int heightRandB, IntProvider branchCount, IntProvider branchHorizontalLength, UniformInt branchStartOffsetFromTop, IntProvider branchEndOffsetFromTop
            new CherryTrunkPlacer(
                5, 1, 0,
                new WeightedListInt(SimpleWeightedRandomList.<IntProvider>builder().add(ConstantInt.of(1), 2).add(ConstantInt.of(2), 1).build()),
                UniformInt.of(2, 2), UniformInt.of(-3, -2), UniformInt.of(-1, 0)
            ),
            BlockStateProvider.simple(ModBlocks.ORANGE_LEAVES.get()),
            // IntProvider radius, IntProvider offset, IntProvider height, chances: wideBottomLayerHole, cornerHole, hangingLeaves, hangingLeavesExtension: 0.25f, 0.5f, 0.4f, 0.33333334f
            new CherryFoliagePlacer(ConstantInt.of(5), ConstantInt.of(2), ConstantInt.of(4), 0.3f, 0.3f, 0.1f, 0.6f),
            new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, CITRON_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(ModBlocks.CITRON_LOG.get()),
            // int baseHeight, int heightRandA, int heightRandB, IntProvider branchCount, IntProvider branchHorizontalLength, UniformInt branchStartOffsetFromTop, IntProvider branchEndOffsetFromTop
            new CherryTrunkPlacer(
                5, 1, 0,
                new WeightedListInt(SimpleWeightedRandomList.<IntProvider>builder().add(ConstantInt.of(1), 2).add(ConstantInt.of(2), 1).build()),
                UniformInt.of(2, 2), UniformInt.of(-3, -2), UniformInt.of(-1, 0)
            ),
            BlockStateProvider.simple(ModBlocks.CITRON_LEAVES.get()),
            // IntProvider radius, IntProvider offset, IntProvider height, chances: wideBottomLayerHole, cornerHole, hangingLeaves, hangingLeavesExtension: 0.25f, 0.5f, 0.4f, 0.33333334f
            new CherryFoliagePlacer(ConstantInt.of(5), ConstantInt.of(2), ConstantInt.of(4), 0.3f, 0.3f, 0.1f, 0.6f),
            new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}