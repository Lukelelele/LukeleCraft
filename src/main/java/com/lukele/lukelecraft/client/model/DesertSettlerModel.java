package com.lukele.lukelecraft.client.model;

import com.lukele.lukelecraft.entities.settlers.DesertSettlerEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.VillagerModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class DesertSettlerModel<T extends DesertSettlerEntity> extends EntityModel<T> {
        private final ModelRenderer head;
        private final ModelRenderer body;
        private final ModelRenderer leftLeg;
        private final ModelRenderer rightLeg;
        private final ModelRenderer rightArm;
        private final ModelRenderer leftArm;

	public DesertSettlerModel() {
            textureWidth = 64;
            textureHeight = 64;

            head = new ModelRenderer(this);
            head.setRotationPoint(0.0F, 0.0F, 0.0F);
            head.setTextureOffset(24, 0).addBox(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, true);
            head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, true);

            body = new ModelRenderer(this);
            body.setRotationPoint(0.0F, 0.0F, 0.0F);
            body.setTextureOffset(16, 20).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, true);
            body.setTextureOffset(0, 38).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, 0.5F, true);

            leftLeg = new ModelRenderer(this);
            leftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
            leftLeg.setTextureOffset(0, 22).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

            rightLeg = new ModelRenderer(this);
            rightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
            rightLeg.setTextureOffset(0, 22).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

            rightArm = new ModelRenderer(this);
            rightArm.setRotationPoint(0.0F, 2.0F, 0.0F);
            setRotationAngle(rightArm, -0.9599F, 0.0F, 0.0F);
            rightArm.setTextureOffset(40, 38).addBox(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F, true);
            rightArm.setTextureOffset(44, 22).addBox(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);
            rightArm.setTextureOffset(44, 22).addBox(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

            leftArm = new ModelRenderer(this);
            leftArm.setRotationPoint(0.0F, 2.0F, 0.0F);
            setRotationAngle(leftArm, -0.9599F, 0.0F, 0.0F);
            leftArm.setTextureOffset(40, 38).addBox(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F, true);
            leftArm.setTextureOffset(44, 22).addBox(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);
            leftArm.setTextureOffset(44, 22).addBox(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);
        }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }


    @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
            head.render(matrixStack, buffer, packedLight, packedOverlay);
            body.render(matrixStack, buffer, packedLight, packedOverlay);
            leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
            rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
            rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
            leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }
    }