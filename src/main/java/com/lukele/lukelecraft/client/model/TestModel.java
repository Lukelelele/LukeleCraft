package com.lukele.lukelecraft.client.model;

import com.lukele.lukelecraft.entities.TestEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class TestModel<T extends TestEntity> extends EntityModel<T> {

    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer leftArm;
    private final ModelRenderer rightArm;
    private final ModelRenderer leftLeg;
    private final ModelRenderer rightLeg;

    public TestModel() {
        textureWidth = 64;
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 8.0F, 1.0F);
        body.setTextureOffset(0, 11).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 5.0F, 1.0F);
        head.setTextureOffset(0, 0).addBox(-3.0F, -5.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);

        leftArm = new ModelRenderer(this);
        leftArm.setRotationPoint(2.0F, 7.0F, 0.0F);
        setRotationAngle(leftArm, 0.0F, 0.0F, -0.6981F);
        leftArm.setTextureOffset(16, 16).addBox(-1.5195F, -0.8251F, 0.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);

        rightArm = new ModelRenderer(this);
        rightArm.setRotationPoint(-2.0F, 7.0F, 1.0F);
        setRotationAngle(rightArm, 0.0F, 0.0F, 0.6109F);
        rightArm.setTextureOffset(0, 23).addBox(-0.672F, -0.7881F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);

        leftLeg = new ModelRenderer(this);
        leftLeg.setRotationPoint(1.75F, 13.0F, 1.0F);
        leftLeg.setTextureOffset(24, 24).addBox(-0.75F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);

        rightLeg = new ModelRenderer(this);
        rightLeg.setRotationPoint(-1.5F, 13.0F, 1.0F);
        rightLeg.setTextureOffset(8, 23).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
    }



    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
        rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
        leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
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
        this.body.rotateAngleX = ((float)Math.PI / 2F);
        this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}

