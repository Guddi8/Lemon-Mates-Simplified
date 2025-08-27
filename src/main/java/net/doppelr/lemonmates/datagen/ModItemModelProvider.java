package net.doppelr.lemonmates.datagen;


import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.block.ModBlocks;
import net.doppelr.lemonmates.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.WallBlock;
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
        basicItem(ModItems.ORANGE.get());
        saplingItem(ModBlocks.ORANGE_SAPLING);
    }

    private ItemModelBuilder saplingItem(DeferredBlock<SaplingBlock> item) {
        return withExistingParent(item.getId().getPath(), ResourceLocation.parse("item/generated"))
            .texture("layer0", ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "block/" + item.getId().getPath()));
    }

    public void buttonItem(DeferredBlock<ButtonBlock> button, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(button.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<FenceBlock> fence, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(fence.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(LemonMates.MOD_ID, "block/" + baseBlock.getId().getPath()));
    }
}
