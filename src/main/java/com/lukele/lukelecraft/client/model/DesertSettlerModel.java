package com.lukele.lukelecraft.client.model;

import com.lukele.lukelecraft.entities.settlers.DesertSettlerEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.VillagerModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class DesertSettlerModel<T extends DesertSettlerEntity> extends EntityModel<T> {
private final ModelRenderer head;
private final ModelRenderer nose;
private final ModelRenderer body;
private final ModelRenderer leftLeg;
private final ModelRenderer rightLeg;
private final ModelRenderer arms;

public DesertSettlerModel() {
        //super();
        textureWidth = 64;
        textureHeight = 64;

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 0.0F, 0.0F);
        head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, true);

        nose = new ModelRenderer(this);
        nose.setRotationPoint(0.0F, -2.0F, -4.0F);
        nose.setTextureOffset(24, 0).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, true);

        body = new ModelRenderer(this);
        //body.setRotationPoint(0.0F, 7.0F, 0.0F);
        body.setTextureOffset(16, 20).addBox(-4.0F, -7.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, true);
        body.setTextureOffset(0, 38).addBox(-4.0F, -7.0F, -3.0F, 8.0F, 18.0F, 6.0F, 0.5F, true);

        leftLeg = new ModelRenderer(this);
        leftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        leftLeg.setTextureOffset(0, 22).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

        rightLeg = new ModelRenderer(this);
        rightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        rightLeg.setTextureOffset(0, 22).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

        arms = new ModelRenderer(this);
        arms.setRotationPoint(0.0F, 2.0F, 0.0F);
        setRotationAngle(arms, -0.9163F, 0.0F, 0.0F);
        arms.setTextureOffset(40, 38).addBox(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F, true);
        arms.setTextureOffset(44, 22).addBox(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);
        arms.setTextureOffset(44, 22).addBox(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);
        }
/**
@Override
public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
        }
*/
@Override
public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        nose.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        arms.render(matrixStack, buffer, packedLight, packedOverlay);
        }

public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
        }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
            this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
            //this.body.rotateAngleX = ((float)Math.PI / 2F);
            this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.arms.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
           // this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}