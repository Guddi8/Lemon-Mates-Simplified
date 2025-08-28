package net.doppelr.lemonmates.datagen;

import net.doppelr.lemonmates.block.ModBlocks;
import net.doppelr.lemonmates.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CRATE.get())
            .pattern("###")
            .pattern("###")
            .pattern("###")
            .define('#', ModItems.ORANGE.get())
            .unlockedBy("has_orange", has(ModItems.ORANGE))
            .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ORANGE.get(), 9)
            .requires(ModBlocks.ORANGE_CRATE.get()).unlockedBy("has_orange", has(ModItems.ORANGE)).save(recipeOutput);

        stairBuilder(ModBlocks.ORANGE_STAIRS.get(), Ingredient.of(ModBlocks.ORANGE_PLANKS))
            .unlockedBy("has_orange_planks", has(ModBlocks.ORANGE_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_SLAB.get(), ModBlocks.ORANGE_PLANKS);
        pressurePlate(recipeOutput, ModBlocks.ORANGE_PRESSURE_PLATE.get(), ModBlocks.ORANGE_PLANKS);
        buttonBuilder(ModBlocks.ORANGE_BUTTON.get(), Ingredient.of(ModBlocks.ORANGE_PLANKS))
            .unlockedBy("has_orange_planks", has(ModBlocks.ORANGE_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.ORANGE_FENCE, Ingredient.of(ModBlocks.ORANGE_PLANKS))
            .unlockedBy("has_orange_planks", has(ModBlocks.ORANGE_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.ORANGE_FENCE_GATE, Ingredient.of(ModBlocks.ORANGE_PLANKS))
            .unlockedBy("has_orange_planks", has(ModBlocks.ORANGE_PLANKS)).save(recipeOutput);
        doorBuilder(ModBlocks.ORANGE_DOOR, Ingredient.of(ModBlocks.ORANGE_PLANKS))
            .unlockedBy("has_orange_planks", has(ModBlocks.ORANGE_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.ORANGE_TRAPDOOR, Ingredient.of(ModBlocks.ORANGE_PLANKS))
            .unlockedBy("has_orange_planks", has(ModBlocks.ORANGE_PLANKS)).save(recipeOutput);
    }
}
