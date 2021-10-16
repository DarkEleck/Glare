package com.darkeleck.glare.client.model;

import com.darkeleck.glare.entity.GlareEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;

public class GlareEntityModel extends EntityModel<GlareEntity> {

    private final ModelPart head;
    private final ModelPart basehead;
    private final ModelPart base1;
    private final ModelPart base2;
    private final ModelPart base3;
    private final ModelPart base4;

    public GlareEntityModel(ModelPart modelPart) {

        this.head = modelPart.getChild(EntityModelPartNames.HEAD);
        this.basehead = modelPart.getChild(EntityModelPartNames.BODY);
        this.base1 = modelPart.getChild(EntityModelPartNames.JACKET);
        this.base2 = modelPart.getChild(EntityModelPartNames.HAT);
        this.base3 = modelPart.getChild(EntityModelPartNames.HAT_RIM);
        this.base4 = modelPart.getChild(EntityModelPartNames.CUBE);

    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create().uv(36, 0).cuboid(-4.0F, -17.0F, 1.0F, 8.0F, 8.0F, 3.0F), ModelTransform.pivot(0f, 24.0f, 0f));
        modelPartData.addChild(EntityModelPartNames.BODY, ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -17.0F, -4.0F, 10.0F, 8.0F, 8.0F), ModelTransform.pivot(0f, 24.0f, 0f));
        modelPartData.addChild(EntityModelPartNames.JACKET, ModelPartBuilder.create().uv(28, 14).cuboid(-5.0F, -9.0F, -4.0F, 10.0F, 5.0F, 8.0F), ModelTransform.pivot(0f, 24.0f, 0f));
        modelPartData.addChild(EntityModelPartNames.HAT, ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -9.0F, -3.0F, 8.0F, 6.0F, 6.0F), ModelTransform.pivot(0f, 24.0f, 0f));
        modelPartData.addChild(EntityModelPartNames.HAT_RIM, ModelPartBuilder.create().uv(0, 28).cuboid(-3.0F, -8.0F, -2.0F, 6.0F, 7.0F, 4.0F), ModelTransform.pivot(0f, 24.0f, 0f));
        modelPartData.addChild(EntityModelPartNames.CUBE, ModelPartBuilder.create().uv(52, 30).cuboid(-2.0F, -8.0F, -1.0F, 4.0F, 8.0F, 2.0F), ModelTransform.pivot(0f, 24.0f, 0f));

        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(GlareEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {


        head.setPivot(0.0F, 24.0F, 0.0F);
        basehead.setPivot(0.0F, 24.0F, 0.0F);
        base1.setPivot(0.0F, 24.0F, 0.0F);
        base2.setPivot(0.0F, 24.0F, 0.0F);
        base3.setPivot(0.0F, 24.0F, 0.0F);
        base4.setPivot(0.0F, 24.0F, 0.0F);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.head, this.basehead, this.base1, this.base2, this.base3, this.base4).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
    }
}
