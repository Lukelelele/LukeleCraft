package com.lukele.lukelecraft.entities;

import com.lukele.lukelecraft.init.ModEntityTypes;
import com.lukele.lukelecraft.init.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class EvilEntity extends CreatureEntity {

    public EvilEntity(EntityType<? extends CreatureEntity> type, World worldIn) {super(type, worldIn);}

    public static AttributeModifierMap.MutableAttribute setCustomAttributes(){
        return CreatureEntity.registerAttributes()
                .createMutableAttribute(Attributes.MAX_HEALTH, 100.90)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 30)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.250);
    }

    @Override
    protected void registerGoals(){
        super.registerGoals();
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 1.80));
        this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 10.0f));
        this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 1 + this.world.rand.nextInt(4);
    }


    @Override
    protected SoundEvent getAmbientSound(){
        return SoundEvents.ENTITY_ENDER_DRAGON_AMBIENT;
    }


    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn){
        return SoundEvents.ENTITY_BEE_STING;
    }


    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.BLOCK_ANCIENT_DEBRIS_BREAK, 10.15f, 10.87f);
    }


}