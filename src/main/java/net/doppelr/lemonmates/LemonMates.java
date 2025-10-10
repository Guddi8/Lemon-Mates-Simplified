package net.doppelr.lemonmates;

import net.doppelr.lemonmates.block.ModBlocks;
import net.doppelr.lemonmates.block.entity.ModBlockEntities;
import net.doppelr.lemonmates.fluid.ModFluids;
import net.doppelr.lemonmates.entity.ModEntities;
import net.doppelr.lemonmates.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(LemonMates.MOD_ID)
public class LemonMates {
    public static final String MOD_ID = "lemonmates";
    public static final Logger LOGGER = LogUtils.getLogger();

    public LemonMates(IEventBus modEventBus, ModContainer modContainer) {
        AllCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModFluids.register(modEventBus);

        ModBlockEntities.register(modEventBus);

        ModEntities.register(modEventBus);
    }

    public static ResourceLocation rl(String path){
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
