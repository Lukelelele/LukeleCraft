package com.lukele.lukelecraft.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DTrapBlock extends Block {

    public DTrapBlock() {
        super(Properties.create(Material.IRON)
            .hardnessAndResistance(10.0f, 10.0f)
            .sound(SoundType.LODESTONE)
            .harvestLevel(4)
            .harvestTool(ToolType.PICKAXE));


    }
}
