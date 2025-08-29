package net.doppelr.lemonmates.worldgen.tree;

import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public final static TreeGrower ORANGE = new TreeGrower(LemonMates.MOD_ID + ":orange",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ORANGE_TREE_KEY), Optional.empty());

    public final static TreeGrower CITRON = new TreeGrower(LemonMates.MOD_ID + ":citron",
            Optional.empty(), Optional.of(ModConfiguredFeatures.CITRON_TREE_KEY), Optional.empty());
}
