package net.doppelr.lemonmates.fluid;

import net.doppelr.lemonmates.LemonMates;
import net.minecraft.core.BlockPos;
import net.minecraft.core.dispenser.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.DispensibleContainerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DispenserBlock;
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
import org.jetbrains.annotations.NotNull;

public class ModFluids {
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, LemonMates.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(BuiltInRegistries.FLUID, LemonMates.MOD_ID);
    public static final DeferredRegister<Item> BUCKETS = DeferredRegister.createItems(LemonMates.MOD_ID);
    public static final DeferredRegister<Block> SOURCE_BLOCKS = DeferredRegister.createBlocks(LemonMates.MOD_ID);

    // Plastic
    public static final DeferredHolder<FluidType, FluidType> PLASTIC_TYPE = FLUID_TYPES.register("plastic_type",
        () -> new BaseFluidType("plastic", 0xC3DBE0));
    public static final DeferredHolder<Fluid, FlowingFluid> PLASTIC_SOURCE = FLUIDS.register("plastic",
        () -> new BaseFlowingFluid.Source(ModFluids.PLASTIC_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> PLASTIC_FLOWING = FLUIDS.register("flowing_plastic",
        () -> new BaseFlowingFluid.Flowing(ModFluids.PLASTIC_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> PLASTIC_BUCKET = BUCKETS.register("plastic_bucket",
        () -> new BucketItem(PLASTIC_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> PLASTIC_BLOCK = SOURCE_BLOCKS.register("plastic_fluid_block",
        () -> new LiquidBlock(PLASTIC_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties PLASTIC_PROPERTIES = new BaseFlowingFluid.Properties(
        PLASTIC_TYPE, PLASTIC_SOURCE, PLASTIC_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(PLASTIC_BLOCK).bucket(PLASTIC_BUCKET);

    // Citron
    public static final DeferredHolder<FluidType, FluidType> CITRON_LEMONADE_TYPE = FLUID_TYPES.register("citron_lemonade_type",
        () -> new BaseFluidType("citron_lemonade", 0xBDD4C6));
    public static final DeferredHolder<Fluid, FlowingFluid> CITRON_LEMONADE_SOURCE = FLUIDS.register("citron_lemonade",
        () -> new BaseFlowingFluid.Source(ModFluids.CITRON_LEMONADE_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> CITRON_LEMONADE_FLOWING = FLUIDS.register("flowing_citron_lemonade",
        () -> new BaseFlowingFluid.Flowing(ModFluids.CITRON_LEMONADE_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> CITRON_LEMONADE_BUCKET = BUCKETS.register("citron_lemonade_bucket",
        () -> new BucketItem(CITRON_LEMONADE_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> CITRON_LEMONADE_BLOCK = SOURCE_BLOCKS.register("citron_lemonade_fluid_block",
        () -> new LiquidBlock(CITRON_LEMONADE_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties CITRON_LEMONADE_PROPERTIES = new BaseFlowingFluid.Properties(
        CITRON_LEMONADE_TYPE, CITRON_LEMONADE_SOURCE, CITRON_LEMONADE_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(CITRON_LEMONADE_BLOCK).bucket(CITRON_LEMONADE_BUCKET);

    // Orange
    public static final DeferredHolder<FluidType, FluidType> ORANGE_LEMONADE_TYPE = FLUID_TYPES.register("orange_lemonade_type",
        () -> new BaseFluidType("orange_lemonade", 0xFF9300));
    public static final DeferredHolder<Fluid, FlowingFluid> ORANGE_LEMONADE_SOURCE = FLUIDS.register("orange_lemonade",
        () -> new BaseFlowingFluid.Source(ModFluids.ORANGE_LEMONADE_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> ORANGE_LEMONADE_FLOWING = FLUIDS.register("flowing_orange_lemonade",
        () -> new BaseFlowingFluid.Flowing(ModFluids.ORANGE_LEMONADE_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> ORANGE_LEMONADE_BUCKET = BUCKETS.register("orange_lemonade_bucket",
        () -> new BucketItem(ORANGE_LEMONADE_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> ORANGE_LEMONADE_BLOCK = SOURCE_BLOCKS.register("orange_lemonade_fluid_block",
        () -> new LiquidBlock(ORANGE_LEMONADE_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties ORANGE_LEMONADE_PROPERTIES = new BaseFlowingFluid.Properties(
        ORANGE_LEMONADE_TYPE, ORANGE_LEMONADE_SOURCE, ORANGE_LEMONADE_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ORANGE_LEMONADE_BLOCK).bucket(ORANGE_LEMONADE_BUCKET);

    // Raspberry
    public static final DeferredHolder<FluidType, FluidType> RASPBERRY_LEMONADE_TYPE = FLUID_TYPES.register("raspberry_lemonade_type",
        () -> new BaseFluidType("raspberry_lemonade", 0xCC1839));
    public static final DeferredHolder<Fluid, FlowingFluid> RASPBERRY_LEMONADE_SOURCE = FLUIDS.register("raspberry_lemonade",
        () -> new BaseFlowingFluid.Source(ModFluids.RASPBERRY_LEMONADE_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> RASPBERRY_LEMONADE_FLOWING = FLUIDS.register("flowing_raspberry_lemonade",
        () -> new BaseFlowingFluid.Flowing(ModFluids.RASPBERRY_LEMONADE_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> RASPBERRY_LEMONADE_BUCKET = BUCKETS.register("raspberry_lemonade_bucket",
        () -> new BucketItem(RASPBERRY_LEMONADE_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> RASPBERRY_LEMONADE_BLOCK = SOURCE_BLOCKS.register("raspberry_lemonade_fluid_block",
        () -> new LiquidBlock(RASPBERRY_LEMONADE_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties RASPBERRY_LEMONADE_PROPERTIES = new BaseFlowingFluid.Properties(
            RASPBERRY_LEMONADE_TYPE, RASPBERRY_LEMONADE_SOURCE, RASPBERRY_LEMONADE_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(RASPBERRY_LEMONADE_BLOCK).bucket(RASPBERRY_LEMONADE_BUCKET);

    // Summermix
    public static final DeferredHolder<FluidType, FluidType> SUMMERMIX_LEMONADE_TYPE = FLUID_TYPES.register("summermix_lemonade_type",
        () -> new BaseFluidType("summermix_lemonade", 0xD5CF5D, "Summer-Mix Lemonade"));
    public static final DeferredHolder<Fluid, FlowingFluid> SUMMERMIX_LEMONADE_SOURCE = FLUIDS.register("summermix_lemonade",
        () -> new BaseFlowingFluid.Source(ModFluids.SUMMERMIX_LEMONADE_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> SUMMERMIX_LEMONADE_FLOWING = FLUIDS.register("flowing_summermix_lemonade",
        () -> new BaseFlowingFluid.Flowing(ModFluids.SUMMERMIX_LEMONADE_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> SUMMERMIX_LEMONADE_BUCKET = BUCKETS.register("summermix_lemonade_bucket",
        () -> new BucketItem(SUMMERMIX_LEMONADE_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> SUMMERMIX_LEMONADE_BLOCK = SOURCE_BLOCKS.register("summermix_lemonade_fluid_block",
        () -> new LiquidBlock(SUMMERMIX_LEMONADE_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties SUMMERMIX_LEMONADE_PROPERTIES = new BaseFlowingFluid.Properties(
            SUMMERMIX_LEMONADE_TYPE, SUMMERMIX_LEMONADE_SOURCE, SUMMERMIX_LEMONADE_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(SUMMERMIX_LEMONADE_BLOCK).bucket(SUMMERMIX_LEMONADE_BUCKET);

    // Watermelon
    public static final DeferredHolder<FluidType, FluidType> WATERMELON_LEMONADE_TYPE = FLUID_TYPES.register("watermelon_lemonade_type",
        () -> new BaseFluidType("watermelon_lemonade", 0xB1180D));
    public static final DeferredHolder<Fluid, FlowingFluid> WATERMELON_LEMONADE_SOURCE = FLUIDS.register("watermelon_lemonade",
        () -> new BaseFlowingFluid.Source(ModFluids.WATERMELON_LEMONADE_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> WATERMELON_LEMONADE_FLOWING = FLUIDS.register("flowing_watermelon_lemonade",
        () -> new BaseFlowingFluid.Flowing(ModFluids.WATERMELON_LEMONADE_PROPERTIES));
    public static final DeferredHolder<Item, BucketItem> WATERMELON_LEMONADE_BUCKET = BUCKETS.register("watermelon_lemonade_bucket",
        () -> new BucketItem(WATERMELON_LEMONADE_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredHolder<Block, LiquidBlock> WATERMELON_LEMONADE_BLOCK = SOURCE_BLOCKS.register("watermelon_lemonade_fluid_block",
        () -> new LiquidBlock(WATERMELON_LEMONADE_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final BaseFlowingFluid.Properties WATERMELON_LEMONADE_PROPERTIES = new BaseFlowingFluid.Properties(
            WATERMELON_LEMONADE_TYPE, WATERMELON_LEMONADE_SOURCE, WATERMELON_LEMONADE_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(WATERMELON_LEMONADE_BLOCK).bucket(WATERMELON_LEMONADE_BUCKET);

    private static final DispenseItemBehavior FLUID_BEHAVIOR = new DefaultDispenseItemBehavior() {
        private final DefaultDispenseItemBehavior defaultDispenseItemBehavior = new DefaultDispenseItemBehavior();

        @Override
        public @NotNull ItemStack execute(BlockSource source, ItemStack itemStack) {
            DispensibleContainerItem dispensiblecontaineritem = (DispensibleContainerItem) itemStack.getItem();
            BlockPos blockpos = source.pos().relative(source.state().getValue(DispenserBlock.FACING));
            Level level = source.level();
            if (dispensiblecontaineritem.emptyContents(null, level, blockpos, null, itemStack)) {
                dispensiblecontaineritem.checkExtraContent(null, level, itemStack, blockpos);
                return this.consumeWithRemainder(source, itemStack, new ItemStack(Items.BUCKET));
            } else {
                return this.defaultDispenseItemBehavior.dispense(source, itemStack);
            }
        }
    };

    public static void register(IEventBus modbus) {
        FLUID_TYPES.register(modbus);
        FLUIDS.register(modbus);
        BUCKETS.register(modbus);
        SOURCE_BLOCKS.register(modbus);
        modbus.addListener(ModFluids::clientExt);
    }

    private static void clientExt(RegisterClientExtensionsEvent event) {
        event.registerFluidType(((BaseFluidType) PLASTIC_TYPE.get()).getClientFluidTypeExtensions(), PLASTIC_TYPE.get());
        event.registerFluidType(((BaseFluidType) CITRON_LEMONADE_TYPE.get()).getClientFluidTypeExtensions(), CITRON_LEMONADE_TYPE.get());
        event.registerFluidType(((BaseFluidType) ORANGE_LEMONADE_TYPE.get()).getClientFluidTypeExtensions(), ORANGE_LEMONADE_TYPE.get());
        event.registerFluidType(((BaseFluidType) RASPBERRY_LEMONADE_TYPE.get()).getClientFluidTypeExtensions(), RASPBERRY_LEMONADE_TYPE.get());
        event.registerFluidType(((BaseFluidType) SUMMERMIX_LEMONADE_TYPE.get()).getClientFluidTypeExtensions(), SUMMERMIX_LEMONADE_TYPE.get());
        event.registerFluidType(((BaseFluidType) WATERMELON_LEMONADE_TYPE.get()).getClientFluidTypeExtensions(), WATERMELON_LEMONADE_TYPE.get());
        DispenserBlock.registerBehavior(PLASTIC_BUCKET.get(), FLUID_BEHAVIOR);
        DispenserBlock.registerBehavior(CITRON_LEMONADE_BUCKET.get(), FLUID_BEHAVIOR);
        DispenserBlock.registerBehavior(ORANGE_LEMONADE_BUCKET.get(), FLUID_BEHAVIOR);
        DispenserBlock.registerBehavior(RASPBERRY_LEMONADE_BUCKET.get(), FLUID_BEHAVIOR);
        DispenserBlock.registerBehavior(SUMMERMIX_LEMONADE_BUCKET.get(), FLUID_BEHAVIOR);
        DispenserBlock.registerBehavior(WATERMELON_LEMONADE_BUCKET.get(), FLUID_BEHAVIOR);
    }
}