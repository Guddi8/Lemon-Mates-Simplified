package net.doppelr.lemonmates.datagen;

import net.doppelr.lemonmates.block.ModBlocks;
import net.doppelr.lemonmates.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

    protected LootTable.Builder createFruitLeavesDrops(Block leavesBlock, Block saplingBlock, Item fruitItem, float... chances) {
        return this.createLeavesDrops(leavesBlock, saplingBlock, chances)
            .withPool(
                LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1.0F))
                    .when(this.doesNotHaveSilkTouch())
                    .add(
                        ((LootPoolSingletonContainer.Builder<?>)this.applyExplosionCondition(leavesBlock, LootItem.lootTableItem(fruitItem)))
                            .when(
                                BonusLevelTableCondition.bonusLevelFlatChance(
                                        registrylookup.getOrThrow(Enchantments.FORTUNE), 0.02F, 0.03F, 0.45F, 0.06F, 0.08F
                                )
                            )
                    )
            );
    }

    @Override
    protected void generate() {
//        dropSelf(ModBlocks.ORANGE_CRATE.get());
        dropSelf(ModBlocks.ORANGE_LOG.get());
        dropSelf(ModBlocks.ORANGE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_ORANGE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_ORANGE_WOOD.get());
        add(ModBlocks.ORANGE_LEAVES.get(),
                block -> createFruitLeavesDrops(ModBlocks.ORANGE_LEAVES.get(), ModBlocks.ORANGE_SAPLING.get(), ModItems.ORANGE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(ModBlocks.ORANGE_SAPLING.get());
        dropSelf(ModBlocks.ORANGE_PLANKS.get());
        dropSelf(ModBlocks.ORANGE_STAIRS.get());
        add(ModBlocks.ORANGE_SLAB.get(),
            block -> createSlabItemTable(ModBlocks.ORANGE_SLAB.get()));
        dropSelf(ModBlocks.ORANGE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.ORANGE_BUTTON.get());
        dropSelf(ModBlocks.ORANGE_FENCE.get());
        dropSelf(ModBlocks.ORANGE_FENCE_GATE.get());
        dropSelf(ModBlocks.ORANGE_TRAPDOOR.get());
        add(ModBlocks.ORANGE_DOOR.get(),
                block -> createDoorTable(ModBlocks.ORANGE_DOOR.get()));

        this.add(ModBlocks.RASPBERRY_BUSH.get(), block -> this.applyExplosionDecay(
                block,LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.RASPBERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(ModItems.RASPBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                ).withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.RASPBERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                                ).add(LootItem.lootTableItem(ModItems.RASPBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
