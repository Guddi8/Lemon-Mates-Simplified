package net.doppelr.lemonmates;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class AllModTags {
    public static class BlockTags {
        public static final TagKey<Block> ORANGE_LOGS = createTag("orange_logs");
        public static final TagKey<Block> CITRON_LOGS = createTag("citron_logs");

        private static TagKey<Block> createTag(String name) {
            return net.minecraft.tags.BlockTags.create(ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, name));
        }
    }

    public static class ItemTags {
        public static final TagKey<Item> ORANGE_LOGS = createTag("orange_logs");
        public static final TagKey<Item> CITRON_LOGS = createTag("citron_logs");
        public static final TagKey<Item> BOTTLES = createTag("bottles");
        public static final TagKey<Item> LEMONADES = createTag("lemonades");
        public static final TagKey<Item> LEMONADES_EMPTY = createTag("lemonades/empty");
        public static final TagKey<Item> LEMONADES_CITRON = createTag("lemonades/citron");
        public static final TagKey<Item> LEMONADES_ORANGE = createTag("lemonades/orange");
        public static final TagKey<Item> LEMONADES_RASPBERRY = createTag("lemonades/raspberry");
        public static final TagKey<Item> LEMONADES_SUMMERMIX = createTag("lemonades/summermix");
        public static final TagKey<Item> LEMONADES_WATERMELON = createTag("lemonades/watermelon");
        public static final TagKey<Item> LABELS = createTag("labels");
        public static final TagKey<Item> MOLDS = createTag("molds");


        private static TagKey<Item> createTag(String name) {
            return net.minecraft.tags.ItemTags.create(ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, name));
        }
    }

    public static class FluidTags {
        public static final TagKey<Fluid> LEMONADES = createTag("lemonades");
        public static final TagKey<Fluid> LEMONADES_CITRON = createTag("lemonades/citron");
        public static final TagKey<Fluid> LEMONADES_ORANGE = createTag("lemonades/orange");
        public static final TagKey<Fluid> LEMONADES_RASPBERRY = createTag("lemonades/raspberry");
        public static final TagKey<Fluid> LEMONADES_SUMMERMIX = createTag("lemonades/summermix");
        public static final TagKey<Fluid> LEMONADES_WATERMELON = createTag("lemonades/watermelon");
        public static final TagKey<Fluid> C_LEMONADES = createTag("c", "lemonades");
        public static final TagKey<Fluid> C_PLASTIC = createTag("c", "plastic");

        private static TagKey<Fluid> createTag(String name) {
            return net.minecraft.tags.FluidTags.create(ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, name));
        }

        private static TagKey<Fluid> createTag(String namespace, String name) {
            return net.minecraft.tags.FluidTags.create(ResourceLocation.fromNamespaceAndPath(namespace, name));
        }
    }
}

