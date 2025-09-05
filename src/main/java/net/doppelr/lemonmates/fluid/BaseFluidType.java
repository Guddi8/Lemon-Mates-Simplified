package net.doppelr.lemonmates.fluid;

import net.doppelr.lemonmates.LemonMates;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.FluidType;

import javax.annotation.Nullable;

/**
 * Basic implementation of {@link FluidType} that supports specifying still and flowing textures in the constructor.
 *
 * @author Choonster (<a href="https://github.com/Choonster-Minecraft-Mods/TestMod3/blob/1.19.x/LICENSE.txt">MIT License</a>)
 */
public class BaseFluidType extends FluidType {
    private final ResourceLocation stillTexture;
    private final ResourceLocation flowingTexture;

    public BaseFluidType(final String stillTexture, final String flowingTexture,
                         final Properties properties) {
        super(properties);
        this.stillTexture = LemonMates.rl("block/" + stillTexture);
        this.flowingTexture = LemonMates.rl("block/" + flowingTexture);

    }

    public IClientFluidTypeExtensions getClientFluidTypeExtensions() {
        return new IClientFluidTypeExtensions() {
            @Override
            public ResourceLocation getStillTexture() {
                return stillTexture;
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return flowingTexture;
            }

        };
    }
}
