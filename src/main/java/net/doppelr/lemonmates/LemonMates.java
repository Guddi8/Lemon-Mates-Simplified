package net.doppelr.lemonmates;

import net.doppelr.lemonmates.item.ModCreativeModeTabs;
import net.doppelr.lemonmates.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(LemonMates.MOD_ID)
public class LemonMates {
    public static final String MOD_ID = "lemonmates";
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public LemonMates(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        // modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey()== CreativeModeTabs.FOOD_AND_DRINKS) {
            // Bottle, Cap
            event.accept(ModItems.BOTTLE_CAP);
            event.accept(ModItems.BOTTLE_EMPTY);

            // Labels
            event.accept(ModItems.LABEL_EMPTY);
            event.accept(ModItems.LABEL_TEXT);
            event.accept(ModItems.LABEL_TEXT_COMPANY);

            event.accept(ModItems.LABEL_CITRON_LEMONADE);
            event.accept(ModItems.LABEL_ORANGE_LEMONADE);
            event.accept(ModItems.LABEL_RASPBERRY_LEMONADE);
            event.accept(ModItems.LABEL_SUMMER_MIX);
            event.accept(ModItems.LABEL_WATERMELON_LEMONADE);

            // Citron
            event.accept(ModItems.BOTTLE_CITRON_LABEL);
            event.accept(ModItems.BOTTLE_CITRON_LEMONADE);
            event.accept(ModItems.BOTTLE_CITRON_CAP_LABEL);
            event.accept(ModItems.BOTTLE_CITRON_LEMONADE_CAP_LABEL);
            event.accept(ModItems.BOTTLE_CITRON_LEMONADE_CAP);
            event.accept(ModItems.BOTTLE_CITRON_LEMONADE_LABEL);

            // Orange
            event.accept(ModItems.BOTTLE_ORANGE_LABEL);
            event.accept(ModItems.BOTTLE_ORANGE_LEMONADE);
            event.accept(ModItems.BOTTLE_ORANGE_CAP_LABEL);
            event.accept(ModItems.BOTTLE_ORANGE_LEMONADE_CAP_LABEL);
            event.accept(ModItems.BOTTLE_ORANGE_LEMONADE_CAP);
            event.accept(ModItems.BOTTLE_ORANGE_LEMONADE_LABEL);

            // Raspberry
            event.accept(ModItems.BOTTLE_RASPBERRY_LABEL);
            event.accept(ModItems.BOTTLE_RASPBERRY_LEMONADE);
            event.accept(ModItems.BOTTLE_RASPBERRY_CAP_LABEL);
            event.accept(ModItems.BOTTLE_RASPBERRY_LEMONADE_CAP_LABEL);
            event.accept(ModItems.BOTTLE_RASPBERRY_LEMONADE_CAP);
            event.accept(ModItems.BOTTLE_RASPBERRY_LEMONADE_LABEL);

            // Summer Mix
            event.accept(ModItems.BOTTLE_SUMMERMIX_LABEL);
            event.accept(ModItems.BOTTLE_SUMMERMIX_LEMONADE);
            event.accept(ModItems.BOTTLE_SUMMERMIX_CAP_LABEL);
            event.accept(ModItems.BOTTLE_SUMMERMIX_LEMONADE_CAP_LABEL);
            event.accept(ModItems.BOTTLE_SUMMERMIX_LEMONADE_CAP);
            event.accept(ModItems.BOTTLE_SUMMERMIX_LEMONADE_LABEL);

            // Watermelon
            event.accept(ModItems.BOTTLE_WATERMELON_LABEL);
            event.accept(ModItems.BOTTLE_WATERMELON_LEMONADE);
            event.accept(ModItems.BOTTLE_WATERMELON_CAP_LABEL);
            event.accept(ModItems.BOTTLE_WATERMELON_LEMONADE_CAP_LABEL);
            event.accept(ModItems.BOTTLE_WATERMELON_LEMONADE_CAP);
            event.accept(ModItems.BOTTLE_WATERMELON_LEMONADE_LABEL);

        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = LemonMates.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    static class ClientModEvents {
        @SubscribeEvent
        static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
