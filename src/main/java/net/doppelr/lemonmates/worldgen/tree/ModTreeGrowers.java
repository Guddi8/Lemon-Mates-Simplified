package net.doppelr.lemonmates.worldgen.tree;

import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public final static TreeGrower ORANGE = new TreeGrower(
        LemonMates.MOD_ID + ":orange",
        .3F, // secondary chance
        Optional.empty(), // Mega tree
        Optional.empty(), // Secondary Mega tree
        Optional.of(ModConfiguredFeatures.ORANGE_TREE_KEY), // normal tree
        Optional.of(ModConfiguredFeatures.SMALL_ORANGE_TREE_KEY), // secondary tree
        Optional.empty(), // flowers
        Optional.empty()  // secondary flowers
    );

    public final static TreeGrower CITRON = new TreeGrower(
        LemonMates.MOD_ID + ":citron",
        .3F, // secondary chance
        Optional.empty(), // Mega tree
        Optional.empty(), // Secondary Mega tree
        Optional.of(ModConfiguredFeatures.CITRON_TREE_KEY), // normal tree
        Optional.of(ModConfiguredFeatures.SMALL_CITRON_TREE_KEY), // secondary tree
        Optional.empty(), // flowers
        Optional.empty()  // secondary flowers
    );
}
