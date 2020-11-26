package com.lukele.lukelecraft.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BitBlock extends Block {

    public BitBlock() {
        super(Properties.create(Material.IRON)
            .hardnessAndResistance(5.0f, 5.0f)
            .sound(SoundType.BONE)
            .jumpFactor(10.0f)
            .harvestLevel(3)
            .harvestTool(ToolType.HOE));


    }
}
