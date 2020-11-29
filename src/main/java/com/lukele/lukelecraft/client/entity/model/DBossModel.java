// Made with Blockbench 3.6.0
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package com.lukele.lukelecraft.client.entity.model;

import com.lukele.lukelecraft.entities.dungeons.DBossEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class DBossModel extends AnimatedEntityModel<DBossEntity> {

    private final AnimatedModelRenderer head;
	private final AnimatedModelRenderer righthorn;
	private final AnimatedModelRenderer bone;
	private final AnimatedModelRenderer lefthorn;
	private final AnimatedModelRenderer bone2;
	private final AnimatedModelRenderer body;
	private final AnimatedModelRenderer rightLeg;
	private final AnimatedModelRenderer leftLeg;
	private final AnimatedModelRenderer leftArm;
	private final AnimatedModelRenderer leftjoint;
	private final AnimatedModelRenderer leftarmend;
	private final AnimatedModelRenderer rightArm;
	private final AnimatedModelRenderer rightjoint;
	private final AnimatedModelRenderer rightarmend;

    public DBossModel(){
    textureWidth = 64;
    textureHeight = 64;
    	head = new AnimatedModelRenderer(this);
		head.setRotationPoint(0.0F, -1.0F, 0.0F);
		head.setTextureOffset(0, 18).addBox(-4.0F, -6.0F, -3.0F, 8.0F, 7.0F, 7.0F, 0.0F, false);
		head.setModelRendererName("head");
		this.registerModelRenderer(head);

		righthorn = new AnimatedModelRenderer(this);
		righthorn.setRotationPoint(-3.0F, -5.0F, 1.0F);
		head.addChild(righthorn);
		setRotationAngle(righthorn, 0.0F, 0.0F, 0.829F);
		righthorn.setTextureOffset(0, 18).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		righthorn.setModelRendererName("righthorn");
		this.registerModelRenderer(righthorn);

		bone = new AnimatedModelRenderer(this);
		bone.setRotationPoint(-2.0F, 0.0F, 0.0F);
		righthorn.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 0.5236F);
		bone.setTextureOffset(0, 4).addBox(-1.5F, -0.134F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setModelRendererName("bone");
		this.registerModelRenderer(bone);

		lefthorn = new AnimatedModelRenderer(this);
		lefthorn.setRotationPoint(3.0F, -5.0F, 1.0F);
		head.addChild(lefthorn);
		setRotationAngle(lefthorn, 0.0F, 0.0F, -0.829F);
		lefthorn.setTextureOffset(0, 2).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		lefthorn.setModelRendererName("lefthorn");
		this.registerModelRenderer(lefthorn);

		bone2 = new AnimatedModelRenderer(this);
		bone2.setRotationPoint(2.0F, 0.0F, 0.0F);
		lefthorn.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.5236F);
		bone2.setTextureOffset(0, 0).addBox(-0.5F, -0.134F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setModelRendererName("bone2");
		this.registerModelRenderer(bone2);

		body = new AnimatedModelRenderer(this);
		body.setRotationPoint(0.0F, 11.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-4.0F, -11.0F, -1.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);
		body.setModelRendererName("body");
		this.registerModelRenderer(body);

		rightLeg = new AnimatedModelRenderer(this);
		rightLeg.setRotationPoint(-3.0F, 12.0F, 0.0F);
		rightLeg.setTextureOffset(27, 29).addBox(-2.0F, 0.0F, 1.0F, 3.0F, 12.0F, 3.0F, 0.0F, false);
		rightLeg.setModelRendererName("rightLeg");
		this.registerModelRenderer(rightLeg);

		leftLeg = new AnimatedModelRenderer(this);
		leftLeg.setRotationPoint(3.0F, 12.0F, 0.0F);
		leftLeg.setTextureOffset(28, 0).addBox(-1.0F, 0.0F, 1.0F, 3.0F, 12.0F, 3.0F, 0.0F, false);
		leftLeg.setModelRendererName("leftLeg");
		this.registerModelRenderer(leftLeg);

		leftArm = new AnimatedModelRenderer(this);
		leftArm.setRotationPoint(4.0F, 3.0F, 2.0F);
		setRotationAngle(leftArm, -0.1186F, -0.1284F, 0.7494F);
		leftArm.setTextureOffset(12, 34).addBox(-1.1194F, -1.0469F, -1.5209F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		leftArm.setModelRendererName("leftArm");
		this.registerModelRenderer(leftArm);

		leftjoint = new AnimatedModelRenderer(this);
		leftjoint.setRotationPoint(4.8806F, 0.9531F, -0.5209F);
		leftArm.addChild(leftjoint);
		setRotationAngle(leftjoint, 0.0F, 0.7418F, 0.0F);
		leftjoint.setTextureOffset(0, 36).addBox(-1.4129F, -2.0F, -1.9383F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		leftjoint.setModelRendererName("leftjoint");
		this.registerModelRenderer(leftjoint);

		leftarmend = new AnimatedModelRenderer(this);
		leftarmend.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftjoint.addChild(leftarmend);
		setRotationAngle(leftarmend, 0.0F, 0.3491F, 0.0F);
		leftarmend.setTextureOffset(0, 32).addBox(0.5306F, -2.0F, -1.7412F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		leftarmend.setModelRendererName("leftarmend");
		this.registerModelRenderer(leftarmend);

		rightArm = new AnimatedModelRenderer(this);
		rightArm.setRotationPoint(-3.0F, 3.0F, 2.0F);
		setRotationAngle(rightArm, -0.1186F, 0.1284F, -0.7494F);
		rightArm.setTextureOffset(30, 22).addBox(-4.6067F, -1.7122F, -1.6946F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		rightArm.setModelRendererName("rightArm");
		this.registerModelRenderer(rightArm);

		rightjoint = new AnimatedModelRenderer(this);
		rightjoint.setRotationPoint(-5.6067F, 0.2878F, -0.6946F);
		rightArm.addChild(rightjoint);
		setRotationAngle(rightjoint, 0.0F, -0.7418F, 0.0F);
		rightjoint.setTextureOffset(35, 15).addBox(-0.5871F, -2.0F, -1.9383F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		rightjoint.setModelRendererName("rightjoint");
		this.registerModelRenderer(rightjoint);

		rightarmend = new AnimatedModelRenderer(this);
		rightarmend.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightjoint.addChild(rightarmend);
		setRotationAngle(rightarmend, 0.0F, -0.3491F, 0.0F);
		rightarmend.setTextureOffset(23, 18).addBox(-5.5306F, -2.0F, -1.7412F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		rightarmend.setModelRendererName("rightarmend");
		this.registerModelRenderer(rightarmend);

    this.rootBones.add(head);
		this.rootBones.add(body);
		this.rootBones.add(rightLeg);
		this.rootBones.add(leftLeg);
		this.rootBones.add(leftArm);
		this.rootBones.add(rightArm);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("lukelecraft", "animations/dboss_entity.json");
    }
}