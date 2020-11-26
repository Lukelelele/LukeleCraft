package com.lukele.lukelecraft.init;

import com.lukele.lukelecraft.LukeleCraftMain;
import com.lukele.lukelecraft.entities.experimental.EvilEntity;
import com.lukele.lukelecraft.entities.experimental.TestEntity;
import com.lukele.lukelecraft.entities.settlers.DesertSettlerEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, LukeleCraftMain.MOD_ID);

    //Entity Types
    //Test Mob
    public static final RegistryObject<EntityType<TestEntity>> TEST = ENTITY_TYPES.register("test",
            () -> EntityType.Builder.create(TestEntity::new, EntityClassification.CREATURE)
                .size(1.0f, 1.0f)
                .build(new ResourceLocation(LukeleCraftMain.MOD_ID, "test").toString()));

    //Evil Mob
    public static final RegistryObject<EntityType<EvilEntity>> EVIL = ENTITY_TYPES.register("evil",
            () -> EntityType.Builder.create(EvilEntity::new, EntityClassification.CREATURE)
                    .size(1.0f, 5.0f)
                    .build(new ResourceLocation(LukeleCraftMain.MOD_ID, "evil").toString()));

    //Villager Mob
public static final RegistryObject<EntityType<DesertSettlerEntity>> DESERT_SETTLER = ENTITY_TYPES.register("desertsettler",
            ()-> EntityType.Builder.create(DesertSettlerEntity::new, EntityClassification.CREATURE)
                .size(1.0f, 5.0f)
                .build(new ResourceLocation(LukeleCraftMain.MOD_ID, "desert_settler").toString()));

}
