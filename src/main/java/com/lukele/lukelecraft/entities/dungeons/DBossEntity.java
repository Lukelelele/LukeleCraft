package com.lukele.lukelecraft.entities.dungeons;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class DBossEntity extends MonsterEntity implements IAnimatedEntity {

    //public static final Ingredient TEMPTATION_ITEMS = Ingredient.fromItems(ModItems.RUBY.get());

    private int testTimer;
    private Entity
    public DBossEntity(EntityType<? extends VillagerEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes(){
        return MobEntity.registerAttributes()
                .createMutableAttribute(Attributes.MAX_HEALTH, 12.9f)
                .createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE,12.90)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 0.0)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.15);

    }

    @Override
    protected void registerGoals(){
        super.registerGoals();
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.250));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomWalkingGoal(this, 1.80));
        this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 6.0f));
        this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 1 + this.world.rand.nextInt(4);
    }


    @Override
    protected SoundEvent getAmbientSound(){
        return SoundEvents.ENTITY_VILLAGER_AMBIENT;
    }


    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn){
        return SoundEvents.ENTITY_VILLAGER_HURT;
    }


    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.ENTITY_SHEEP_STEP, 0.15f, 1.87f);
    }

    /**.jetbrains.annotations.
    @Nullable
    //@Override
    public AgeableEntity createChild(AgeableEntity ageable) {
        return ModEntityTypes.TEST.get().create(this.world);
    }
*/

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
