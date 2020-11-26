package com.lukele.lukelecraft.init;

import com.lukele.lukelecraft.LukeleCraftMain;
import com.lukele.lukelecraft.items.armor.ModArmorMaterial;
import com.lukele.lukelecraft.blocks.BlockItemBase;
import com.lukele.lukelecraft.items.ItemBase;
import com.lukele.lukelecraft.items.tools.lukelecraftItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LukeleCraftMain.MOD_ID);//Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

    //Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(lukelecraftItemTier.RUBY, 2, -2.4f, new Item.Properties().group(LukeleCraftMain.TAB)));

    //Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(LukeleCraftMain.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(LukeleCraftMain.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(LukeleCraftMain.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_FEET = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(LukeleCraftMain.TAB)));

    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(ModBlocks.RUBY_BLOCK.get()));
    public static final RegistryObject<Item> BIT_BLOCK_ITEM = ITEMS.register("bit_block", () -> new BlockItemBase(ModBlocks.BIT_BLOCK.get()));
}
