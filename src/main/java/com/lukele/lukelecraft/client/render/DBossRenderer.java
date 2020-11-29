package com.lukele.lukelecraft.client.render;

import com.lukele.lukelecraft.LukeleCraftMain;
import com.lukele.lukelecraft.client.entity.model.DesertSettlerModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DBossRenderer extends MobRenderer<DBossEntity, DBossModel<DBossEntity>> {

    protected  static final ResourceLocation TEXTURE = new ResourceLocation(LukeleCraftMain.MOD_ID, "textures/entity/dboss.png");

    public DBossRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DesertSettlerModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getEntityTexture(DBossEntity entity) {
        return TEXTURE;
    }
}
