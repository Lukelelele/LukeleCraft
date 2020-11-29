package com.lukele.lukelecraft.client.render.experimental;

import com.lukele.lukelecraft.LukeleCraftMain;
import com.lukele.lukelecraft.client.entity.model.experimental.TestModel;
import com.lukele.lukelecraft.entities.experimental.TestEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.minecraft.util.ResourceLocation;

public class TestRenderer extends MobRenderer<TestEntity, TestModel<TestEntity>> {

    protected  static final ResourceLocation TEXTURE = new ResourceLocation(LukeleCraftMain.MOD_ID, "textures/entity/test.png");

    public TestRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new TestModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getEntityTexture(TestEntity entity) {
        return TEXTURE;
    }
}