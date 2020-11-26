package com.lukele.lukelecraft.client.model;

import com.lukele.lukelecraft.entities.EvilEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class EvilModel<T extends EvilEntity> extends EntityModel<T> {

    private final ModelRenderer leftLeg;
    private final ModelRenderer rightLeg;
    private final ModelRenderer leftArm;
    private final ModelRenderer rightArm;
    private final ModelRenderer body;
    private final ModelRenderer head;

    public EvilModel() {
        textureWidth = 128;
        textureHeight = 128;

        leftLeg = new ModelRenderer(this);
        leftLeg.setRotationPoint(5.0F, 10.0F, 0.0F);
        leftLeg.setTextureOffset(20, 43).addBox(-12.0F, 0.0F, -2.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);
        leftLeg.setTextureOffset(4, 4).addBox(0.0F, -24.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
        leftLeg.setTextureOffset(0, 0).addBox(-11.0F, -24.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

        rightLeg = new ModelRenderer(this);
        rightLeg.setRotationPoint(-4.0F, 10.0F, 0.0F);
        rightLeg.setTextureOffset(0, 41).addBox(6.0F, 0.0F, -2.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);

        leftArm = new ModelRenderer(this);
        leftArm.setRotationPoint(6.0F, 1.0F, 0.0F);
        leftArm.setTextureOffset(31, 9).addBox(0.0F, -1.0F, -14.0F, 2.0F, 2.0F, 15.0F, 0.0F, false);

        rightArm = new ModelRenderer(this);
        rightArm.setRotationPoint(-6.0F, 1.0F, 0.0F);
        rightArm.setTextureOffset(23, 26).addBox(-2.0F, -1.0F, -14.0F, 2.0F, 2.0F, 15.0F, 0.0F, false);

        body = new ModelRenderer(this);
        //body.setRotationPoint(0.0F, -2.0F, 0.0F);
        body.setTextureOffset(0, 0).addBox(-6.0F, -1.0F, -5.0F, 12.0F, 13.0F, 11.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -3.0F, 0.0F);
        head.setTextureOffset(0, 24).addBox(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 9.0F, 0.0F, false);



    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
        rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
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
        this.rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}
