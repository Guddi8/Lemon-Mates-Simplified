package net.doppelr.lemonmates.datagen;

import net.doppelr.lemonmates.AllModTags;
import net.doppelr.lemonmates.LemonMates;
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
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.CITRON.get())
            .pattern("##")
            .pattern("##")
            .define('#', ModItems.CITRON_SLICE.get())
            .unlockedBy("has_citron_slice", has(ModItems.CITRON_SLICE))
            .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CITRON_SLICE.get(), 4)
            .requires(ModItems.CITRON.get()).unlockedBy("has_citron", has(ModItems.CITRON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CITRON_CRATE.get())
            .pattern("###")
            .pattern("###")
            .pattern("###")
            .define('#', ModItems.CITRON.get())
            .unlockedBy("has_citron", has(ModItems.CITRON))
            .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CITRON.get(), 9)
            .requires(ModBlocks.CITRON_CRATE.get()).unlockedBy("has_citron", has(ModItems.CITRON)).save(recipeOutput, LemonMates.rl("citron_from_crate"));
        planksFromLog(recipeOutput, ModBlocks.CITRON_PLANKS, AllModTags.Items.CITRON_LOGS, 4);
        woodFromLogs(recipeOutput, ModBlocks.CITRON_WOOD, ModBlocks.CITRON_LOG);
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_CITRON_WOOD, ModBlocks.STRIPPED_CITRON_LOG);
        stairBuilder(ModBlocks.CITRON_STAIRS.get(), Ingredient.of(ModBlocks.CITRON_PLANKS))
            .unlockedBy("has_citron_planks", has(ModBlocks.CITRON_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CITRON_SLAB.get(), ModBlocks.CITRON_PLANKS);
        pressurePlate(recipeOutput, ModBlocks.CITRON_PRESSURE_PLATE.get(), ModBlocks.CITRON_PLANKS);
        buttonBuilder(ModBlocks.CITRON_BUTTON.get(), Ingredient.of(ModBlocks.CITRON_PLANKS))
            .unlockedBy("has_citron_planks", has(ModBlocks.CITRON_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.CITRON_FENCE, Ingredient.of(ModBlocks.CITRON_PLANKS))
            .unlockedBy("has_citron_planks", has(ModBlocks.CITRON_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.CITRON_FENCE_GATE, Ingredient.of(ModBlocks.CITRON_PLANKS))
            .unlockedBy("has_citron_planks", has(ModBlocks.CITRON_PLANKS)).save(recipeOutput);
        doorBuilder(ModBlocks.CITRON_DOOR, Ingredient.of(ModBlocks.CITRON_PLANKS))
            .unlockedBy("has_citron_planks", has(ModBlocks.CITRON_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.CITRON_TRAPDOOR, Ingredient.of(ModBlocks.CITRON_PLANKS))
            .unlockedBy("has_citron_planks", has(ModBlocks.CITRON_PLANKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.ORANGE.get())
            .pattern("##")
            .pattern("##")
            .define('#', ModItems.ORANGE_SLICE.get())
            .unlockedBy("has_orange_slice", has(ModItems.ORANGE_SLICE))
            .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ORANGE_SLICE.get(), 4)
            .requires(ModItems.ORANGE.get()).unlockedBy("has_orange", has(ModItems.ORANGE)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CRATE.get())
            .pattern("###")
            .pattern("###")
            .pattern("###")
            .define('#', ModItems.ORANGE.get())
            .unlockedBy("has_orange", has(ModItems.ORANGE))
            .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ORANGE.get(), 9)
            .requires(ModBlocks.ORANGE_CRATE.get()).unlockedBy("has_orange", has(ModItems.ORANGE)).save(recipeOutput, LemonMates.rl("orange_from_crate"));
        planksFromLog(recipeOutput, ModBlocks.ORANGE_PLANKS, AllModTags.Items.ORANGE_LOGS, 4);
        woodFromLogs(recipeOutput, ModBlocks.ORANGE_WOOD, ModBlocks.ORANGE_LOG);
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_ORANGE_WOOD, ModBlocks.STRIPPED_ORANGE_LOG);
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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RASPBERRY_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RASPBERRY.get())
                .unlockedBy("has_raspberry", has(ModItems.RASPBERRY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RASPBERRY.get(), 9)
                .requires(ModBlocks.RASPBERRY_CRATE.get()).unlockedBy("has_raspberry", has(ModItems.RASPBERRY)).save(recipeOutput);

        // get Molds back
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PREFORM.get(), 1)
            .requires(ModItems.PREFORM_MOLD_WITH_PREFORM.get()).unlockedBy("has_preform", has(ModItems.PREFORM)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BOTTLE_EMPTY.get(), 1)
            .requires(ModItems.MOLD_WITH_BOTTLE.get()).unlockedBy("has_preform", has(ModItems.PREFORM)).save(recipeOutput);

    }
}
