package net.doppelr.lemonmates;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class AllWoodTypes {
    public static final WoodType CITRON = WoodType.register(new WoodType(LemonMates.MOD_ID + ":citron", BlockSetType.OAK));
    public static final WoodType ORANGE = WoodType.register(new WoodType(LemonMates.MOD_ID + ":orange", BlockSetType.OAK));

}
