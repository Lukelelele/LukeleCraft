package com.lukele.lukelecraft.client.render;

import com.lukele.lukelecraft.LukeleCraftMain;
import com.lukele.lukelecraft.client.model.DesertSettlerModel;
import com.lukele.lukelecraft.client.model.experimental.EvilModel;
import com.lukele.lukelecraft.entities.experimental.EvilEntity;
import com.lukele.lukelecraft.entities.settlers.DesertSettlerEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.util.ResourceLocation;

public class DesertSettlerRenderer extends MobRenderer<DesertSettlerEntity, DesertSettlerModel<DesertSettlerEntity>> {

    protected  static final ResourceLocation TEXTURE = new ResourceLocation(LukeleCraftMain.MOD_ID, "textures/entity/desertsettler.png");

    public DesertSettlerRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DesertSettlerModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getEntityTexture(DesertSettlerEntity entity) {
        return TEXTURE;
    }
}
