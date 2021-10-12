package com.darkeleck.glare;

import com.darkeleck.glare.client.model.GlareEntityModel;
import com.darkeleck.glare.client.renderer.GlareEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class Client implements ClientModInitializer {
    public static final EntityModelLayer MODEL_GLARE_LAYER = new EntityModelLayer(new Identifier("glare", "glare"), "main");
    @Override
    public void onInitializeClient() {

        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Main.GLARE, (context) ->{
            return new GlareEntityRenderer(context);
        });

        EntityModelLayerRegistry.registerModelLayer(MODEL_GLARE_LAYER, GlareEntityModel::getTexturedModelData);
    }
}
