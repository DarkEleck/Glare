package com.darkeleck.glare.client.renderer;

import com.darkeleck.glare.Client;
import com.darkeleck.glare.client.model.GlareEntityModel;
import com.darkeleck.glare.entity.GlareEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GlareEntityRenderer extends MobEntityRenderer<GlareEntity, GlareEntityModel> {

    public GlareEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new GlareEntityModel(context.getPart(Client.MODEL_GLARE_LAYER)), 0.5f);
    }
    @Override
    public Identifier getTexture(GlareEntity entity) {
        return new Identifier("glare", "textures/entity/glare/glare.png");
    }
}
