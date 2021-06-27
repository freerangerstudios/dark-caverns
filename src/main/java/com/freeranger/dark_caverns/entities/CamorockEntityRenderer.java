package com.freeranger.dark_caverns.entities;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@OnlyIn(Dist.CLIENT)
public class CamorockEntityRenderer extends GeoEntityRenderer {
    public CamorockEntityRenderer(EntityRendererManager renderManager) {
        super(renderManager, new CamorockEntityModel());
        this.shadowRadius = 0.4f;
    }
}
