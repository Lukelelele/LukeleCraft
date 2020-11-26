package com.lukele.lukelecraft.entities;

import com.lukele.lukelecraft.init.ModEntityTypes;
import com.lukele.lukelecraft.init.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
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
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class TestEntity extends AnimalEntity {

    public static final Ingredient TEMPTATION_ITEMS = Ingredient.fromItems(ModItems.RUBY.get());

    private EatGrassGoal eatGrassGoal;
    private int testTimer;

    public TestEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes(){
        return MobEntity.registerAttributes()
                .createMutableAttribute(Attributes.MAX_HEALTH, 12.90)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 10)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.250);
    }

    @Override
    protected void registerGoals(){
        super.registerGoals();
        this.eatGrassGoal = new EatGrassGoal(this);
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.250));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.00));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.10, TEMPTATION_ITEMS, false));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.10));
        this.goalSelector.addGoal(5, this.eatGrassGoal);
        this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 1.80));
        this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 6.0f));
        this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 1 + this.world.rand.nextInt(4);
    }


    @Override
    protected SoundEvent getAmbientSound(){
        return SoundEvents.ENTITY_GHAST_DEATH;
    }


    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn){
        return SoundEvents.ENTITY_BAT_DEATH;
    }


    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.ENTITY_PARROT_IMITATE_HOGLIN, 0.15f, 1.87f);
    }

    //.jetbrains.annotations.
    @Nullable
    //@Override
    public AgeableEntity createChild(AgeableEntity ageable) {
        return ModEntityTypes.TEST.get().create(this.world);
    }

    @Override
    protected void updateAITasks() {
        this.testTimer = this.eatGrassGoal.getEatingGrassTimer();
        super.updateAITasks();
    }

    //@org.jetbrains.annotations.Nullable
    @Override
    public AgeableEntity func_241840_a(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
        return null;
    }

    @Override
    public void livingTick() {
        if (this.world.isRemote){
            this.testTimer = Math.max(0, this.testTimer-1);
        }
        super.livingTick();
    }

    @OnlyIn(Dist.CLIENT)
    public void handleStatusUpdate(byte id){
        if (id==10){
            this.testTimer = 40;
        } else {
            super.handleStatusUpdate(id);
        }
    }

}
