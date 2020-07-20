package com.majorgrunt.drain.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyBlock extends Block{

	public RubyBlock() {
		super(Block.Properties.create(Material.IRON)
			.hardnessAndResistance(4.0f, 3.0f)
			.harvestLevel(1)
			.sound(SoundType.METAL)
			.harvestTool(ToolType.PICKAXE)
		);
		
	}

}
