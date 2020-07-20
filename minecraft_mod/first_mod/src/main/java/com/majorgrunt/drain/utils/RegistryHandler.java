package com.majorgrunt.drain.utils;


import com.majorgrunt.drain.Drain;
import com.majorgrunt.drain.blocks.RubyBlock;
import com.majorgrunt.drain.blocks.RubyOre;
import com.majorgrunt.drain.blocks.BlockItemBase;
import com.majorgrunt.drain.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Drain.MOD_ID);
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Drain.MOD_ID);
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

	}
	
	// Items
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
	
	
	// Blocks
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

	// Blocks Items
	public static final RegistryObject<Item> RUBY_BLOCK_ITEM =ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
	public static final RegistryObject<Item> RUBY_ORE_ITEM =ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));

	

	

}
