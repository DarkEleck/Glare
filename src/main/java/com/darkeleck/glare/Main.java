package com.darkeleck.glare;

import com.darkeleck.glare.entity.GlareEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

    public static final EntityType<GlareEntity> GLARE = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("glare", "glare"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GlareEntity::new).dimensions(EntityDimensions.fixed(0.625f, 1.0625f)).build()
    );

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(GLARE, GlareEntity.createMobAttributes());
    }
}
