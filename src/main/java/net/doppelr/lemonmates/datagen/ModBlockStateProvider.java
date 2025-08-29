package net.doppelr.lemonmates.datagen;

import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.block.ModBlocks;
import net.doppelr.lemonmates.block.RaspberryBushBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, LemonMates.MOD_ID, exFileHelper);
    }

    private String blockName(DeferredBlock<?> deferredBlock) {
        return BuiltInRegistries.BLOCK.getKey(deferredBlock.get()).getPath();
    }

    public ResourceLocation resourceBlock(String path) {
        return ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "block/" + path);
    }

    @Override
    protected void registerStatesAndModels() {
        logBlock((RotatedPillarBlock) ModBlocks.ORANGE_LOG.get());
        axisBlock((RotatedPillarBlock) ModBlocks.ORANGE_WOOD.get(), blockTexture(ModBlocks.ORANGE_LOG.get()), blockTexture(ModBlocks.ORANGE_LOG.get()));
        logBlock((RotatedPillarBlock) ModBlocks.STRIPPED_ORANGE_LOG.get());
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_ORANGE_WOOD.get(), blockTexture(ModBlocks.STRIPPED_ORANGE_LOG.get()), blockTexture(ModBlocks.STRIPPED_ORANGE_LOG.get()));
        blockWithItem(ModBlocks.ORANGE_LEAVES);
        saplingBlock(ModBlocks.ORANGE_SAPLING);
        blockWithItem(ModBlocks.ORANGE_PLANKS);
        stairsBlock(ModBlocks.ORANGE_STAIRS.get(), blockTexture(ModBlocks.ORANGE_PLANKS.get()));
        slabBlock(ModBlocks.ORANGE_SLAB.get(), blockTexture(ModBlocks.ORANGE_PLANKS.get()), blockTexture(ModBlocks.ORANGE_PLANKS.get()));
        pressurePlateBlock(ModBlocks.ORANGE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ORANGE_PLANKS.get()));
        buttonBlock(ModBlocks.ORANGE_BUTTON.get(), blockTexture(ModBlocks.ORANGE_PLANKS.get()));
        fenceBlock(ModBlocks.ORANGE_FENCE.get(), blockTexture(ModBlocks.ORANGE_PLANKS.get()));
        fenceGateBlock(ModBlocks.ORANGE_FENCE_GATE.get(), blockTexture(ModBlocks.ORANGE_PLANKS.get()));
        doorBlockWithRenderType(ModBlocks.ORANGE_DOOR.get(), modLoc("block/orange_door_bottom"), modLoc("block/orange_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.ORANGE_TRAPDOOR.get(), modLoc("block/orange_trapdoor"), true, "cutout");
        blockItem(ModBlocks.ORANGE_LOG);
        blockItem(ModBlocks.ORANGE_WOOD);
        blockItem(ModBlocks.STRIPPED_ORANGE_LOG);
        blockItem(ModBlocks.STRIPPED_ORANGE_WOOD);
        blockItem(ModBlocks.ORANGE_STAIRS);
        blockItem(ModBlocks.ORANGE_SLAB);
        blockItem(ModBlocks.ORANGE_PRESSURE_PLATE);
        blockItem(ModBlocks.ORANGE_FENCE_GATE);
        blockItem(ModBlocks.ORANGE_TRAPDOOR, "_bottom");

        logBlock((RotatedPillarBlock) ModBlocks.CITRON_LOG.get());
        axisBlock((RotatedPillarBlock) ModBlocks.CITRON_WOOD.get(), blockTexture(ModBlocks.CITRON_LOG.get()), blockTexture(ModBlocks.CITRON_LOG.get()));
        logBlock((RotatedPillarBlock) ModBlocks.STRIPPED_CITRON_LOG.get());
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_CITRON_WOOD.get(), blockTexture(ModBlocks.STRIPPED_CITRON_LOG.get()), blockTexture(ModBlocks.STRIPPED_CITRON_LOG.get()));
        blockWithItem(ModBlocks.CITRON_LEAVES);
        saplingBlock(ModBlocks.CITRON_SAPLING);
        blockWithItem(ModBlocks.CITRON_PLANKS);
        stairsBlock(ModBlocks.CITRON_STAIRS.get(), blockTexture(ModBlocks.CITRON_PLANKS.get()));
        slabBlock(ModBlocks.CITRON_SLAB.get(), blockTexture(ModBlocks.CITRON_PLANKS.get()), blockTexture(ModBlocks.CITRON_PLANKS.get()));
        pressurePlateBlock(ModBlocks.CITRON_PRESSURE_PLATE.get(), blockTexture(ModBlocks.CITRON_PLANKS.get()));
        buttonBlock(ModBlocks.CITRON_BUTTON.get(), blockTexture(ModBlocks.CITRON_PLANKS.get()));
        fenceBlock(ModBlocks.CITRON_FENCE.get(), blockTexture(ModBlocks.CITRON_PLANKS.get()));
        fenceGateBlock(ModBlocks.CITRON_FENCE_GATE.get(), blockTexture(ModBlocks.CITRON_PLANKS.get()));
        doorBlockWithRenderType(ModBlocks.CITRON_DOOR.get(), modLoc("block/citron_door_bottom"), modLoc("block/citron_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.CITRON_TRAPDOOR.get(), modLoc("block/citron_trapdoor"), true, "cutout");
        blockItem(ModBlocks.CITRON_LOG);
        blockItem(ModBlocks.CITRON_WOOD);
        blockItem(ModBlocks.STRIPPED_CITRON_LOG);
        blockItem(ModBlocks.STRIPPED_CITRON_WOOD);
        blockItem(ModBlocks.CITRON_STAIRS);
        blockItem(ModBlocks.CITRON_SLAB);
        blockItem(ModBlocks.CITRON_PRESSURE_PLATE);
        blockItem(ModBlocks.CITRON_FENCE_GATE);
        blockItem(ModBlocks.CITRON_TRAPDOOR, "_bottom");

        makeBush((SweetBerryBushBlock) ModBlocks.RASPBERRY_BUSH.get(), "raspberry_bush_stage", "raspberry_bush_stage");

        crateBlock(ModBlocks.ORANGE_CRATE, "orange");
        crateBlock(ModBlocks.CITRON_CRATE, "citron");
        crateBlock(ModBlocks.RASPBERRY_CRATE, "raspberry");

        signBlock((StandingSignBlock) ModBlocks.CITRON_SIGN.get(), (WallSignBlock) ModBlocks.CITRON_WALL_SIGN.get(), modLoc("block/citron_planks"));
        hangingSignBlock((CeilingHangingSignBlock) ModBlocks.CITRON_HANGING_SIGN.get(), (WallHangingSignBlock) ModBlocks.CITRON_WALL_HANGING_SIGN.get(), modLoc("block/citron_planks"));
        signBlock((StandingSignBlock) ModBlocks.ORANGE_SIGN.get(), (WallSignBlock) ModBlocks.ORANGE_WALL_SIGN.get(), modLoc("block/citron_planks"));
        hangingSignBlock((CeilingHangingSignBlock) ModBlocks.ORANGE_HANGING_SIGN.get(), (WallHangingSignBlock) ModBlocks.ORANGE_WALL_HANGING_SIGN.get(), modLoc("block/orange_planks"));

    }

    public void crateBlock(DeferredBlock<Block> deferredBlock, String fruitName) {
        simpleBlock(deferredBlock.get(),
            models().cubeBottomTop(blockName(deferredBlock),
                resourceBlock(fruitName + "_crate_side"), resourceBlock("crate_bottom"), resourceBlock(fruitName + "_crate_top")));
        blockItem(deferredBlock);
    }

    private void saplingBlock(DeferredBlock<SaplingBlock> deferredBlock) {
        simpleBlock(deferredBlock.get(),
            models().cross(blockName(deferredBlock),
                blockTexture(deferredBlock.get())).renderType("cutout"));
    }

    public void makeBush(SweetBerryBushBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, modelName, textureName);
        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(RaspberryBushBlock.AGE),
            ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "block/" + textureName + state.getValue(RaspberryBushBlock.AGE))).renderType("cutout"));
        return models;
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("lemonmates:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("lemonmates:block/" + deferredBlock.getId().getPath() + appendix));
    }
}