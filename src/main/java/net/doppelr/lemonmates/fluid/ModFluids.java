package net.doppelr.lemonmates.fluid;

import net.doppelr.lemonmates.LemonMates;
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
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.joml.Vector3f;

public class ModFluids {

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, LemonMates.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(BuiltInRegistries.FLUID, LemonMates.MOD_ID);
    public static final DeferredRegister<Item> BUCKETS = DeferredRegister.createItems(LemonMates.MOD_ID);
    public static final DeferredRegister<Block> SOURCEBLOCKS = DeferredRegister.createBlocks(LemonMates.MOD_ID);
    public static final ResourceLocation WATER_STILL_RL = ResourceLocation.parse("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = ResourceLocation.parse("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = ResourceLocation.parse("block/water_overlay");

    // Finished Fluids
    // Citron final
    public static final DeferredHolder<FluidType, FluidType> CITRON_LEMONADE_FLUID = FLUID_TYPES.register("citron_lemonade_fluid", () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL,0xFFFFFF99, new Vector3f(108f / 255f, 168f / 255f, 212f / 255f), FluidType.Properties.create().descriptionId("Citron Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> CITRON_LEMONADE_FLUID_SOURCE = FLUIDS.register("citron_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(ModFluids.CITRON_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> CITRON_LEMONADE_FLUID_FLOWING = FLUIDS.register("citron_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.CITRON_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> CITRON_LEMONADE_FLUID_BUCKET = BUCKETS.register("citron_lemonade_bucket", () -> new BucketItem(CITRON_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> CITRON_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("citron_lemonade_block", () -> new LiquidBlock(CITRON_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties CITRON_LEMONADE_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
                    CITRON_LEMONADE_FLUID, CITRON_LEMONADE_FLUID_SOURCE, CITRON_LEMONADE_FLUID_FLOWING)
                        .slopeFindDistance(2).levelDecreasePerBlock(1)
                        .block(CITRON_LEMONADE_FLUID_BLOCK)
                        .bucket(CITRON_LEMONADE_FLUID_BUCKET);
    // Orange final
    public static final DeferredHolder<FluidType, FluidType> ORANGE_LEMONADE_FLUID = FLUID_TYPES.register("orange_lemonade_fluid", () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL,0xFFFFD1B3, new Vector3f(108f / 255f, 168f / 255f, 212f / 255f),  FluidType.Properties.create().descriptionId("Orange Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> ORANGE_LEMONADE_FLUID_SOURCE = FLUIDS.register("orange_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(ModFluids.ORANGE_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> ORANGE_LEMONADE_FLUID_FLOWING = FLUIDS.register("orange_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.ORANGE_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> ORANGE_LEMONADE_FLUID_BUCKET = BUCKETS.register("orange_lemonade_bucket", () -> new BucketItem(ORANGE_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> ORANGE_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("orange_lemonade_block", () -> new LiquidBlock(ORANGE_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties ORANGE_LEMONADE_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            ORANGE_LEMONADE_FLUID, ORANGE_LEMONADE_FLUID_SOURCE, ORANGE_LEMONADE_FLUID_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ORANGE_LEMONADE_FLUID_BLOCK)
            .bucket(ORANGE_LEMONADE_FLUID_BUCKET);
    // Raspberry final
    public static final DeferredHolder<FluidType, FluidType> RASPBERRY_LEMONADE_FLUID = FLUID_TYPES.register("raspberry_lemonade_fluid", () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL,0xFFE30B5D, new Vector3f(108f / 255f, 168f / 255f, 212f / 255f),  FluidType.Properties.create().descriptionId("Raspberry Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> RASPBERRY_LEMONADE_FLUID_SOURCE = FLUIDS.register("raspberry_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(ModFluids.RASPBERRY_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> RASPBERRY_LEMONADE_FLUID_FLOWING = FLUIDS.register("raspberry_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.RASPBERRY_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> RASPBERRY_LEMONADE_FLUID_BUCKET = BUCKETS.register("raspberry_lemonade_bucket", () -> new BucketItem(RASPBERRY_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> RASPBERRY_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("raspberry_lemonade_block", () -> new LiquidBlock(RASPBERRY_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties RASPBERRY_LEMONADE_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            RASPBERRY_LEMONADE_FLUID, RASPBERRY_LEMONADE_FLUID_SOURCE, RASPBERRY_LEMONADE_FLUID_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(RASPBERRY_LEMONADE_FLUID_BLOCK)
            .bucket(RASPBERRY_LEMONADE_FLUID_BUCKET);
    // Summermix final
    public static final DeferredHolder<FluidType, FluidType> SUMMERMIX_LEMONADE_FLUID = FLUID_TYPES.register("summermix_lemonade_fluid", () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL,0xFF9ACD32, new Vector3f(108f / 255f, 168f / 255f, 212f / 255f),  FluidType.Properties.create().descriptionId("Summer-Mix Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> SUMMERMIX_LEMONADE_FLUID_SOURCE = FLUIDS.register("summermix_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(ModFluids.SUMMERMIX_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> SUMMERMIX_LEMONADE_FLUID_FLOWING = FLUIDS.register("summermix_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.SUMMERMIX_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> SUMMERMIX_LEMONADE_FLUID_BUCKET = BUCKETS.register("summermix_lemonade_bucket", () -> new BucketItem(SUMMERMIX_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> SUMMERMIX_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("summermix_lemonade_block", () -> new LiquidBlock(SUMMERMIX_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties SUMMERMIX_LEMONADE_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            SUMMERMIX_LEMONADE_FLUID, SUMMERMIX_LEMONADE_FLUID_SOURCE, SUMMERMIX_LEMONADE_FLUID_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(SUMMERMIX_LEMONADE_FLUID_BLOCK)
            .bucket(SUMMERMIX_LEMONADE_FLUID_BUCKET);
    // Watermelon final
    public static final DeferredHolder<FluidType, FluidType> WATERMELON_LEMONADE_FLUID = FLUID_TYPES.register("watermelon_lemonade_fluid", () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL,0xFFFC6C85, new Vector3f(108f / 255f, 168f / 255f, 212f / 255f),  FluidType.Properties.create().descriptionId("Watermelon Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> WATERMELON_LEMONADE_FLUID_SOURCE = FLUIDS.register("watermelon_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(ModFluids.WATERMELON_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> WATERMELON_LEMONADE_FLUID_FLOWING = FLUIDS.register("watermelon_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.WATERMELON_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> WATERMELON_LEMONADE_FLUID_BUCKET = BUCKETS.register("watermelon_lemonade_bucket", () -> new BucketItem(WATERMELON_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> WATERMELON_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("watermelon_lemonade_block", () -> new LiquidBlock(WATERMELON_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties WATERMELON_LEMONADE_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            WATERMELON_LEMONADE_FLUID, WATERMELON_LEMONADE_FLUID_SOURCE, WATERMELON_LEMONADE_FLUID_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(WATERMELON_LEMONADE_FLUID_BLOCK)
            .bucket(WATERMELON_LEMONADE_FLUID_BUCKET);

    // Mixed Fluids
    // Citron mixed
    public static final DeferredHolder<FluidType, FluidType> MIXED_CITRON_LEMONADE_FLUID = FLUID_TYPES.register("mixed_citron_lemonade_fluid", () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL,0xFFFFFF99, new Vector3f(108f / 255f, 168f / 255f, 212f / 255f), FluidType.Properties.create().descriptionId("Undistilled Citron Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_CITRON_LEMONADE_FLUID_SOURCE = FLUIDS.register("mixed_citron_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(ModFluids.MIXED_CITRON_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_CITRON_LEMONADE_FLUID_FLOWING = FLUIDS.register("mixed_citron_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.MIXED_CITRON_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> MIXED_CITRON_LEMONADE_FLUID_BUCKET = BUCKETS.register("mixed_citron_lemonade_bucket", () -> new BucketItem(MIXED_CITRON_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> MIXED_CITRON_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("mixed_citron_lemonade_block", () -> new LiquidBlock(MIXED_CITRON_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties MIXED_CITRON_LEMONADE_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            MIXED_CITRON_LEMONADE_FLUID, MIXED_CITRON_LEMONADE_FLUID_SOURCE, MIXED_CITRON_LEMONADE_FLUID_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(MIXED_CITRON_LEMONADE_FLUID_BLOCK)
            .bucket(MIXED_CITRON_LEMONADE_FLUID_BUCKET);
    // Orange mixed
    public static final DeferredHolder<FluidType, FluidType> MIXED_ORANGE_LEMONADE_FLUID = FLUID_TYPES.register("mixed_orange_lemonade_fluid", () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL,0xFFFFD1B3, new Vector3f(108f / 255f, 168f / 255f, 212f / 255f), FluidType.Properties.create().descriptionId("Undistilled Orange Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_ORANGE_LEMONADE_FLUID_SOURCE = FLUIDS.register("mixed_orange_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(ModFluids.MIXED_ORANGE_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_ORANGE_LEMONADE_FLUID_FLOWING = FLUIDS.register("mixed_orange_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.MIXED_ORANGE_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> MIXED_ORANGE_LEMONADE_FLUID_BUCKET = BUCKETS.register("mixed_orange_lemonade_bucket", () -> new BucketItem(MIXED_ORANGE_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> MIXED_ORANGE_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("mixed_orange_lemonade_block", () -> new LiquidBlock(MIXED_ORANGE_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties MIXED_ORANGE_LEMONADE_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            MIXED_ORANGE_LEMONADE_FLUID, MIXED_ORANGE_LEMONADE_FLUID_SOURCE, MIXED_ORANGE_LEMONADE_FLUID_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(MIXED_ORANGE_LEMONADE_FLUID_BLOCK)
            .bucket(MIXED_ORANGE_LEMONADE_FLUID_BUCKET);
    // Raspberry mixed
    public static final DeferredHolder<FluidType, FluidType> MIXED_RASPBERRY_LEMONADE_FLUID = FLUID_TYPES.register("mixed_raspberry_lemonade_fluid", () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL,0xFFE30B5D, new Vector3f(108f / 255f, 168f / 255f, 212f / 255f), FluidType.Properties.create().descriptionId("Undistilled Raspberry Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_RASPBERRY_LEMONADE_FLUID_SOURCE = FLUIDS.register("mixed_raspberry_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(ModFluids.MIXED_RASPBERRY_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_RASPBERRY_LEMONADE_FLUID_FLOWING = FLUIDS.register("mixed_raspberry_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.MIXED_RASPBERRY_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> MIXED_RASPBERRY_LEMONADE_FLUID_BUCKET = BUCKETS.register("mixed_raspberry_lemonade_bucket", () -> new BucketItem(MIXED_RASPBERRY_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> MIXED_RASPBERRY_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("mixed_raspberry_lemonade_block", () -> new LiquidBlock(MIXED_RASPBERRY_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties MIXED_RASPBERRY_LEMONADE_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            MIXED_RASPBERRY_LEMONADE_FLUID, MIXED_RASPBERRY_LEMONADE_FLUID_SOURCE, MIXED_RASPBERRY_LEMONADE_FLUID_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(MIXED_RASPBERRY_LEMONADE_FLUID_BLOCK)
            .bucket(MIXED_RASPBERRY_LEMONADE_FLUID_BUCKET);
    // Summermix mixed
    public static final DeferredHolder<FluidType, FluidType> MIXED_SUMMERMIX_LEMONADE_FLUID = FLUID_TYPES.register("mixed_summermix_lemonade_fluid", () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL,0xFF9ACD32, new Vector3f(108f / 255f, 168f / 255f, 212f / 255f), FluidType.Properties.create().descriptionId("Undistilled Summer-Mix Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_SUMMERMIX_LEMONADE_FLUID_SOURCE = FLUIDS.register("mixed_summermix_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(ModFluids.MIXED_SUMMERMIX_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_SUMMERMIX_LEMONADE_FLUID_FLOWING = FLUIDS.register("mixed_summermix_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.MIXED_SUMMERMIX_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> MIXED_SUMMERMIX_LEMONADE_FLUID_BUCKET = BUCKETS.register("mixed_summermix_lemonade_bucket", () -> new BucketItem(MIXED_SUMMERMIX_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> MIXED_SUMMERMIX_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("mixed_summermix_lemonade_block", () -> new LiquidBlock(MIXED_SUMMERMIX_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties MIXED_SUMMERMIX_LEMONADE_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            MIXED_SUMMERMIX_LEMONADE_FLUID, MIXED_SUMMERMIX_LEMONADE_FLUID_SOURCE, MIXED_SUMMERMIX_LEMONADE_FLUID_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(MIXED_SUMMERMIX_LEMONADE_FLUID_BLOCK)
            .bucket(MIXED_SUMMERMIX_LEMONADE_FLUID_BUCKET);
    // Watermelon mixed
    public static final DeferredHolder<FluidType, FluidType> MIXED_WATERMELON_LEMONADE_FLUID = FLUID_TYPES.register("mixed_watermelon_lemonade_fluid", () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL,0xFFFC6C85, new Vector3f(108f / 255f, 168f / 255f, 212f / 255f), FluidType.Properties.create().descriptionId("Undistilled Watermelon Lemonade")));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_WATERMELON_LEMONADE_FLUID_SOURCE = FLUIDS.register("mixed_watermelon_lemonade_liquid_source", () -> new BaseFlowingFluid.Source(ModFluids.MIXED_WATERMELON_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> MIXED_WATERMELON_LEMONADE_FLUID_FLOWING = FLUIDS.register("mixed_watermelon_lemonade_liquid_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.MIXED_WATERMELON_LEMONADE_FLUID_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> MIXED_WATERMELON_LEMONADE_FLUID_BUCKET = BUCKETS.register("mixed_watermelon_lemonade_bucket", () -> new BucketItem(MIXED_WATERMELON_LEMONADE_FLUID_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> MIXED_WATERMELON_LEMONADE_FLUID_BLOCK = SOURCEBLOCKS.register("mixed_watermelon_lemonade_block", () -> new LiquidBlock(MIXED_WATERMELON_LEMONADE_FLUID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties MIXED_WATERMELON_LEMONADE_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            MIXED_WATERMELON_LEMONADE_FLUID, MIXED_WATERMELON_LEMONADE_FLUID_SOURCE, MIXED_WATERMELON_LEMONADE_FLUID_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(MIXED_WATERMELON_LEMONADE_FLUID_BLOCK)
            .bucket(MIXED_WATERMELON_LEMONADE_FLUID_BUCKET);

    public static void register(IEventBus modbus) {
        FLUID_TYPES.register(modbus);
        FLUIDS.register(modbus);
        BUCKETS.register(modbus);
        SOURCEBLOCKS.register(modbus);
        modbus.addListener(ModFluids::clientExt);
    }

    private static void clientExt(RegisterClientExtensionsEvent event) {
        event.registerFluidType(((BaseFluidType) CITRON_LEMONADE_FLUID.get()).getClientFluidTypeExtensions(),
                CITRON_LEMONADE_FLUID.get());
        event.registerFluidType(((BaseFluidType) ORANGE_LEMONADE_FLUID.get()).getClientFluidTypeExtensions(),
                ORANGE_LEMONADE_FLUID.get());
        event.registerFluidType(((BaseFluidType) RASPBERRY_LEMONADE_FLUID.get()).getClientFluidTypeExtensions(),
                RASPBERRY_LEMONADE_FLUID.get());
        event.registerFluidType(((BaseFluidType) SUMMERMIX_LEMONADE_FLUID.get()).getClientFluidTypeExtensions(),
                SUMMERMIX_LEMONADE_FLUID.get());
        event.registerFluidType(((BaseFluidType) WATERMELON_LEMONADE_FLUID.get()).getClientFluidTypeExtensions(),
                WATERMELON_LEMONADE_FLUID.get());
        event.registerFluidType(((BaseFluidType) MIXED_CITRON_LEMONADE_FLUID.get()).getClientFluidTypeExtensions(),
                MIXED_CITRON_LEMONADE_FLUID.get());
        event.registerFluidType(((BaseFluidType) MIXED_ORANGE_LEMONADE_FLUID.get()).getClientFluidTypeExtensions(),
                MIXED_ORANGE_LEMONADE_FLUID.get());
        event.registerFluidType(((BaseFluidType) MIXED_RASPBERRY_LEMONADE_FLUID.get()).getClientFluidTypeExtensions(),
                MIXED_RASPBERRY_LEMONADE_FLUID.get());
        event.registerFluidType(((BaseFluidType) MIXED_SUMMERMIX_LEMONADE_FLUID.get()).getClientFluidTypeExtensions(),
                MIXED_SUMMERMIX_LEMONADE_FLUID.get());
        event.registerFluidType(((BaseFluidType) MIXED_WATERMELON_LEMONADE_FLUID.get()).getClientFluidTypeExtensions(),
                MIXED_WATERMELON_LEMONADE_FLUID.get());
    }
}