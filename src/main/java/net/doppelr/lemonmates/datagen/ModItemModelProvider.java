package net.doppelr.lemonmates.datagen;


import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.block.ModBlocks;
import net.doppelr.lemonmates.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LemonMates.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RASPBERRY.get());

        basicItem(ModItems.CITRON.get());
        saplingItem(ModBlocks.CITRON_SAPLING);
        buttonItem(ModBlocks.CITRON_BUTTON, ModBlocks.CITRON_PLANKS);
        fenceItem(ModBlocks.CITRON_FENCE, ModBlocks.CITRON_PLANKS);
        basicItem(ModBlocks.CITRON_DOOR.asItem());
        basicItem(ModItems.CITRON_SIGN.get());
        basicItem(ModItems.CITRON_HANGING_SIGN.get());

        basicItem(ModItems.ORANGE.get());
        saplingItem(ModBlocks.ORANGE_SAPLING);
        buttonItem(ModBlocks.ORANGE_BUTTON, ModBlocks.ORANGE_PLANKS);
        fenceItem(ModBlocks.ORANGE_FENCE, ModBlocks.ORANGE_PLANKS);
        basicItem(ModBlocks.ORANGE_DOOR.asItem());
        basicItem(ModItems.ORANGE_SIGN.get());
        basicItem(ModItems.ORANGE_HANGING_SIGN.get());
    }

    private ItemModelBuilder lemonadeItem(DeferredItem<Item> item) {
        return withExistingParent(item.getId().getPath(), ResourceLocation.parse("item/generated"))
            .texture("layer0", ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "item/bottle_empty_cap"))
            .texture("layer1", ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "item/bottle_fluid/orange"))
            .texture("layer2", ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "item/label/bottle_empty"))
            .texture("layer3", ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "item/label/company"))
            .texture("layer4", ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "item/label/orange"));
    }

    private ItemModelBuilder saplingItem(DeferredBlock<SaplingBlock> item) {
        return withExistingParent(item.getId().getPath(), ResourceLocation.parse("item/generated"))
            .texture("layer0", ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "block/" + item.getId().getPath()));
    }

    public void buttonItem(DeferredBlock<ButtonBlock> button, DeferredBlock<Block> baseBlock) {
        withExistingParent(button.getId().getPath(), mcLoc("block/button_inventory"))
            .texture("texture", ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<FenceBlock> fence, DeferredBlock<Block> baseBlock) {
        withExistingParent(fence.getId().getPath(), mcLoc("block/fence_inventory"))
            .texture("texture", ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "block/" + baseBlock.getId().getPath()));
    }
}
