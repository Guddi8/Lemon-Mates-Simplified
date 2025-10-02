package net.doppelr.lemonmates.worldgen;

import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.block.ModBlocks;
import net.doppelr.lemonmates.block.RaspberryBushBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.CherryFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> RASPBERRY_BUSH_KEY = registerKey("raspberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CITRON_TREE_KEY = registerKey("citron_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_CITRON_TREE_KEY = registerKey("small_citron_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_TREE_KEY = registerKey("orange_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_ORANGE_TREE_KEY = registerKey("small_orange_tree");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        register(context, RASPBERRY_BUSH_KEY, Feature.RANDOM_PATCH,
            FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.RASPBERRY_BUSH.get().defaultBlockState().setValue(RaspberryBushBlock.AGE, 3))),
                List.of(Blocks.GRASS_BLOCK)
            )
        );

        register(context, CITRON_TREE_KEY, Feature.TREE, fruitTreeBuilder(ModBlocks.CITRON_LOG, ModBlocks.CITRON_LEAVES).build());
        register(context, SMALL_CITRON_TREE_KEY, Feature.TREE, secondaryFruitTreeBuilder(ModBlocks.CITRON_LOG, ModBlocks.CITRON_LEAVES).build());

        register(context, ORANGE_TREE_KEY, Feature.TREE, fruitTreeBuilder(ModBlocks.ORANGE_LOG, ModBlocks.ORANGE_LEAVES).build());
        register(context, SMALL_ORANGE_TREE_KEY, Feature.TREE, secondaryFruitTreeBuilder(ModBlocks.ORANGE_LOG, ModBlocks.ORANGE_LEAVES).build());
    }

    private static TreeConfiguration.TreeConfigurationBuilder fruitTreeBuilder(DeferredBlock<Block> logBlock, DeferredBlock<LeavesBlock> leavesBlock) {
        return new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(logBlock.get()),
            new BendingTrunkPlacer(
                // int baseHeight, int heightRandA, int heightRandB, int minHeightForLeaves, IntProvider bendLength
                3, 1, 1, 3, UniformInt.of(1, 2)
            ),
            BlockStateProvider.simple(leavesBlock.get()),
            new CherryFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), ConstantInt.of(4), 0.4f, 0.4f, 0.2f, 0.6f),
            new TwoLayersFeatureSize(1, 0, 1)
        );
    }

    private static TreeConfiguration.TreeConfigurationBuilder secondaryFruitTreeBuilder(DeferredBlock<Block> logBlock, DeferredBlock<LeavesBlock> leavesBlock) {
        return new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(logBlock.get()),
            new CherryTrunkPlacer(
                // height: min, additionalA, additionalB
                // e.g. 5, 2, 3 -> minHeight=5 maxHeight=5+2+3=10
                // trees from 5 to 10 height -> 7 and 8 heigh most common
                4, 1, 1,
                ConstantInt. of(1),     // number branches
                UniformInt.of(2, 2),    // branchHorizontalLength
                UniformInt.of(-3, -2),  // branchStartOffsetFromTop
                UniformInt.of(-1, 0)    // branchEndOffsetFromTop
            ),
            BlockStateProvider.simple(leavesBlock.get()),
            new CherryFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(4), 0.4f, 0.4f, 0.2f, 0.6f),
            new TwoLayersFeatureSize(1, 0, 1)
        );
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}