package com.majorgrunt.drain.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyOre extends Block{

	public RubyOre() {
		super(Block.Properties.create(Material.EARTH)
			.hardnessAndResistance(2.0f, 3.0f)
			.harvestLevel(1)
			.sound(SoundType.STONE)
			.harvestTool(ToolType.PICKAXE)
		);
		
	}

}
