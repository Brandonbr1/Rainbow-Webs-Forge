package com.easton.rainbowebs.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.WebBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ColorWeb extends WebBlock {

    public ColorWeb() {
        super(Block.Properties.create(Material.WEB)
                .hardnessAndResistance(4.0F)
                .harvestLevel(0)
                .doesNotBlockMovement()
                .notSolid()
                .harvestTool(ToolType.PICKAXE));
    }
}