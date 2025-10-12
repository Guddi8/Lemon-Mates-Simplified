package net.doppelr.lemonmates.fluid;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import net.createmod.catnip.theme.Color;
import net.doppelr.lemonmates.LemonMates;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.FluidType;
import org.apache.commons.lang3.text.WordUtils;
import org.joml.Vector3f;

public class BaseFluidType extends FluidType {
    private final ResourceLocation stillTexture;
    private final ResourceLocation flowingTexture;
    private final int tintColor;
    private final Vector3f fogColor;

    public BaseFluidType(final String name_id, final int fogColor) {
        super(Properties.create().descriptionId(WordUtils.capitalizeFully(name_id.replace("_", " "))));
        this.stillTexture = LemonMates.rl("block/fluid/" + name_id + "_still");
        this.flowingTexture = LemonMates.rl("block/fluid/" + name_id + "_flow");
        this.tintColor = 0xFFFFFFFF; // No Tint
        this.fogColor = new Color(fogColor).asVectorF();
    }

    public BaseFluidType(final String id, final int fogColor, String name) {
        super(Properties.create().descriptionId(name));
        this.stillTexture = LemonMates.rl("block/fluid/" + id + "_still");
        this.flowingTexture = LemonMates.rl("block/fluid/" + id + "_flow");
        this.tintColor = 0xFFFFFFFF; // No Tint
        this.fogColor = new Color(fogColor).asVectorF();
    }

    public BaseFluidType(final ResourceLocation stillTexture, final ResourceLocation flowingTexture, final ResourceLocation overlayTexture,
                         final int tintColor, final Vector3f fogColor, final Properties properties) {
        super(properties);
        this.stillTexture = stillTexture;
        this.flowingTexture = flowingTexture;
        this.tintColor = tintColor;
        this.fogColor = fogColor;
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

            @Override
            public int getTintColor() {
                return tintColor;
            }

            @Override
            public Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level,
                                           int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                return fogColor;
            }

            @Override
            public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick,
                                        float nearDistance, float farDistance, FogShape shape) {
                RenderSystem.setShaderFogShape(FogShape.CYLINDER);
                RenderSystem.setShaderFogStart(-6.0F);
                RenderSystem.setShaderFogEnd(6.0F);
            }
        };
    }
}
