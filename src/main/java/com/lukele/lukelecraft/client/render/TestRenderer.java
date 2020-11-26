package com.lukele.lukelecraft.client.render;

import com.lukele.lukelecraft.LukeleCraftMain;
import com.lukele.lukelecraft.client.model.TestModel;
import com.lukele.lukelecraft.entities.TestEntity;

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