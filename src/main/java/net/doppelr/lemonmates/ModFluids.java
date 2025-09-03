package net.doppelr.lemonmates;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.BaseFlowingFluid.Properties;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModFluids {

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, LemonMates.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(BuiltInRegistries.FLUID, LemonMates.MOD_ID);
    public static final DeferredRegister<Item> BUCKETS = DeferredRegister.createItems(LemonMates.MOD_ID);
    public static final DeferredRegister<Block> SOURCEBLOCKS = DeferredRegister.createBlocks(LemonMates.MOD_ID);


    // Finished Fluids
    // Citron final
    public static final DeferredHolder<FluidType, FluidType> CITRON_LEMONADE_FLUID = FLUID_TYPES.register("citron_lemonade_fluid", () -> new FluidType(FluidType.Properties.create().descriptionId("Citron Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> CITRON_LEMONADE_FLUID_SOURCE = FLUIDS.register("citron_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(liquidProperties()));
    public static final DeferredHolder<Fluid, FlowingFluid> CITRON_LEMONADE_FLUID_FLOWING = FLUIDS.register("citron_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(liquidProperties()));
    public static final DeferredHolder<Item, BucketItem> CITRON_LEMONADE_FLUID_BUCKET = BUCKETS.register("citron_lemonade_bucket", () -> new BucketItem(CITRON_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> CITRON_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("citron_lemonade_block", () -> new LiquidBlock(CITRON_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    // Orange final
    public static final DeferredHolder<FluidType, FluidType> ORANGE_LEMONADE_FLUID = FLUID_TYPES.register("orange_lemonade_fluid", () -> new FluidType(FluidType.Properties.create().descriptionId("Orange Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> ORANGE_LEMONADE_FLUID_SOURCE = FLUIDS.register("orange_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(liquidProperties()));
    public static final DeferredHolder<Fluid, FlowingFluid> ORANGE_LEMONADE_FLUID_FLOWING = FLUIDS.register("orange_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(liquidProperties()));
    public static final DeferredHolder<Item, BucketItem> ORANGE_LEMONADE_FLUID_BUCKET = BUCKETS.register("orange_lemonade_bucket", () -> new BucketItem(ORANGE_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> ORANGE_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("orange_lemonade_block", () -> new LiquidBlock(ORANGE_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    // Raspberry final
    public static final DeferredHolder<FluidType, FluidType> RASPBERRY_LEMONADE_FLUID = FLUID_TYPES.register("raspberry_lemonade_fluid", () -> new FluidType(FluidType.Properties.create().descriptionId("Raspberry Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> RASPBERRY_LEMONADE_FLUID_SOURCE = FLUIDS.register("raspberry_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(liquidProperties()));
    public static final DeferredHolder<Fluid, FlowingFluid> RASPBERRY_LEMONADE_FLUID_FLOWING = FLUIDS.register("raspberry_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(liquidProperties()));
    public static final DeferredHolder<Item, BucketItem> RASPBERRY_LEMONADE_FLUID_BUCKET = BUCKETS.register("raspberry_lemonade_bucket", () -> new BucketItem(RASPBERRY_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> RASPBERRY_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("raspberry_lemonade_block", () -> new LiquidBlock(RASPBERRY_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    // Summermix final
    public static final DeferredHolder<FluidType, FluidType> SUMMERMIX_LEMONADE_FLUID = FLUID_TYPES.register("summermix_lemonade_fluid", () -> new FluidType(FluidType.Properties.create().descriptionId("Summer-Mix Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> SUMMERMIX_LEMONADE_FLUID_SOURCE = FLUIDS.register("summermix_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(liquidProperties()));
    public static final DeferredHolder<Fluid, FlowingFluid> SUMMERMIX_LEMONADE_FLUID_FLOWING = FLUIDS.register("summermix_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(liquidProperties()));
    public static final DeferredHolder<Item, BucketItem> SUMMERMIX_LEMONADE_FLUID_BUCKET = BUCKETS.register("summermix_lemonade_bucket", () -> new BucketItem(SUMMERMIX_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> SUMMERMIX_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("summermix_lemonade_block", () -> new LiquidBlock(SUMMERMIX_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    // Watermelon final
    public static final DeferredHolder<FluidType, FluidType> WATERMELON_LEMONADE_FLUID = FLUID_TYPES.register("watermelon_lemonade_fluid", () -> new FluidType(FluidType.Properties.create().descriptionId("Watermelon Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> WATERMELON_LEMONADE_FLUID_SOURCE = FLUIDS.register("watermelon_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(liquidProperties()));
    public static final DeferredHolder<Fluid, FlowingFluid> WATERMELON_LEMONADE_FLUID_FLOWING = FLUIDS.register("watermelon_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(liquidProperties()));
    public static final DeferredHolder<Item, BucketItem> WATERMELON_LEMONADE_FLUID_BUCKET = BUCKETS.register("watermelon_lemonade_bucket", () -> new BucketItem(WATERMELON_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> WATERMELON_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("watermelon_lemonade_block", () -> new LiquidBlock(WATERMELON_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));


    // Mixed Fluids
    // Citron mixed
    public static final DeferredHolder<FluidType, FluidType> MIXED_CITRON_LEMONADE_FLUID = FLUID_TYPES.register("citron_lemonade_fluid", () -> new FluidType(FluidType.Properties.create().descriptionId("Citron Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_CITRON_LEMONADE_FLUID_SOURCE = FLUIDS.register("citron_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(liquidProperties()));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_CITRON_LEMONADE_FLUID_FLOWING = FLUIDS.register("citron_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(liquidProperties()));
    public static final DeferredHolder<Item, BucketItem> MIXED_CITRON_LEMONADE_FLUID_BUCKET = BUCKETS.register("citron_lemonade_bucket", () -> new BucketItem(MIXED_CITRON_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> MIXED_CITRON_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("citron_lemonade_block", () -> new LiquidBlock(MIXED_CITRON_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    // Orange mixed
    public static final DeferredHolder<FluidType, FluidType> MIXED_ORANGE_LEMONADE_FLUID = FLUID_TYPES.register("mixed_orange_lemonade_fluid", () -> new FluidType(FluidType.Properties.create().descriptionId("Orange Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_ORANGE_LEMONADE_FLUID_SOURCE = FLUIDS.register("mixed_orange_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(liquidProperties()));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_ORANGE_LEMONADE_FLUID_FLOWING = FLUIDS.register("mixed_orange_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(liquidProperties()));
    public static final DeferredHolder<Item, BucketItem> MIXED_ORANGE_LEMONADE_FLUID_BUCKET = BUCKETS.register("mixed_orange_lemonade_bucket", () -> new BucketItem(MIXED_ORANGE_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> MIXED_ORANGE_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("mixed_orange_lemonade_block", () -> new LiquidBlock(MIXED_ORANGE_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    // Raspberry mixed
    public static final DeferredHolder<FluidType, FluidType> MIXED_RASPBERRY_LEMONADE_FLUID = FLUID_TYPES.register("mixed_raspberry_lemonade_fluid", () -> new FluidType(FluidType.Properties.create().descriptionId("Raspberry Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_RASPBERRY_LEMONADE_FLUID_SOURCE = FLUIDS.register("mixed_raspberry_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(liquidProperties()));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_RASPBERRY_LEMONADE_FLUID_FLOWING = FLUIDS.register("mixed_raspberry_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(liquidProperties()));
    public static final DeferredHolder<Item, BucketItem> MIXED_RASPBERRY_LEMONADE_FLUID_BUCKET = BUCKETS.register("mixed_raspberry_lemonade_bucket", () -> new BucketItem(MIXED_RASPBERRY_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> MIXED_RASPBERRY_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("mixed_raspberry_lemonade_block", () -> new LiquidBlock(MIXED_RASPBERRY_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    // Summermix mixed
    public static final DeferredHolder<FluidType, FluidType> MIXED_SUMMERMIX_LEMONADE_FLUID = FLUID_TYPES.register("mixed_summermix_lemonade_fluid", () -> new FluidType(FluidType.Properties.create().descriptionId("Summer-Mix Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_SUMMERMIX_LEMONADE_FLUID_SOURCE = FLUIDS.register("mixed_summermix_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(liquidProperties()));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_SUMMERMIX_LEMONADE_FLUID_FLOWING = FLUIDS.register("mixed_summermix_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(liquidProperties()));
    public static final DeferredHolder<Item, BucketItem> MIXED_SUMMERMIX_LEMONADE_FLUID_BUCKET = BUCKETS.register("mixed_summermix_lemonade_bucket", () -> new BucketItem(MIXED_SUMMERMIX_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> MIXED_SUMMERMIX_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("mixed_summermix_lemonade_block", () -> new LiquidBlock(MIXED_SUMMERMIX_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    // Watermelon mixed
    public static final DeferredHolder<FluidType, FluidType> MIXED_WATERMELON_LEMONADE_FLUID = FLUID_TYPES.register("mixed_watermelon_lemonade_fluid", () -> new FluidType(FluidType.Properties.create().descriptionId("Watermelon Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_WATERMELON_LEMONADE_FLUID_SOURCE = FLUIDS.register("mixed_watermelon_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(liquidProperties()));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_WATERMELON_LEMONADE_FLUID_FLOWING = FLUIDS.register("mixed_watermelon_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(liquidProperties()));
    public static final DeferredHolder<Item, BucketItem> MIXED_WATERMELON_LEMONADE_FLUID_BUCKET = BUCKETS.register("mixed_watermelon_lemonade_bucket", () -> new BucketItem(MIXED_WATERMELON_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> MIXED_WATERMELON_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("mixed_watermelon_lemonade_block", () -> new LiquidBlock(MIXED_WATERMELON_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));

    public static void register(IEventBus modbus) {
        FLUID_TYPES.register(modbus);
        FLUIDS.register(modbus);
        BUCKETS.register(modbus);
        SOURCEBLOCKS.register(modbus);
        modbus.addListener(ModFluids::clientExt);
    }

    private static final IClientFluidTypeExtensions liquidExt = new IClientFluidTypeExtensions() {
        @Override
        public ResourceLocation getStillTexture() {
            return LemonMates.rl("block/watermelon_lemonade_liquid_still");
        }

        @Override
        public ResourceLocation getFlowingTexture() {
            return LemonMates.rl("block/watermelon_lemonade_liquid_flowing");
        }
    };

    private static void clientExt(RegisterClientExtensionsEvent event) {
        event.registerFluidType(liquidExt, CITRON_LEMONADE_FLUID.get());
        event.registerFluidType(liquidExt, ORANGE_LEMONADE_FLUID.get());
        event.registerFluidType(liquidExt, RASPBERRY_LEMONADE_FLUID.get());
        event.registerFluidType(liquidExt, SUMMERMIX_LEMONADE_FLUID.get());
        event.registerFluidType(liquidExt, WATERMELON_LEMONADE_FLUID.get());
    }

    private static Properties liquidProperties() {
        return new Properties(WATERMELON_LEMONADE_FLUID, WATERMELON_LEMONADE_FLUID_SOURCE, WATERMELON_LEMONADE_FLUID_FLOWING).bucket(WATERMELON_LEMONADE_FLUID_BUCKET).block(WATERMELON_LEMONADE_FLUID_BLOCK);
    }
}