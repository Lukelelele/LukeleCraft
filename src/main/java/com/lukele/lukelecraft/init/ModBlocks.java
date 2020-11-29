package com.lukele.lukelecraft.init;

import com.lukele.lukelecraft.LukeleCraftMain;
import com.lukele.lukelecraft.blocks.BitBlock;
import com.lukele.lukelecraft.blocks.DTrapBlock;
import com.lukele.lukelecraft.blocks.RubyBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LukeleCraftMain.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> BIT_BLOCK = BLOCKS.register("bit_block", BitBlock::new);
    /** DUNGEON */
    public static final RegistryObject<Block> DTRAP_BLOCK = BLOCKS.register("dtrap_block", DTrapBlock::new);
}
