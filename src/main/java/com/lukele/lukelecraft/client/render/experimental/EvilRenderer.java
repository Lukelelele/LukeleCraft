package com.lukele.lukelecraft.client.render.experimental;

import com.lukele.lukelecraft.LukeleCraftMain;
import com.lukele.lukelecraft.client.entity.model.experimental.EvilModel;
import com.lukele.lukelecraft.entities.experimental.EvilEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class EvilRenderer extends MobRenderer<EvilEntity, EvilModel<EvilEntity>> {

    protected  static final ResourceLocation TEXTURE = new ResourceLocation(LukeleCraftMain.MOD_ID, "textures/entity/evil.png");

    public EvilRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new EvilModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getEntityTexture(EvilEntity entity) {
        return TEXTURE;
    }
}
