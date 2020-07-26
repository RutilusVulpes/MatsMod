package com.majorgrunt.drain.utils;


import com.majorgrunt.drain.Drain;
import com.majorgrunt.drain.blocks.RubyBlock;
import com.majorgrunt.drain.blocks.RubyOre;
import com.majorgrunt.drain.blocks.Stall;
import com.majorgrunt.drain.blocks.BlockItemBase;
import com.majorgrunt.drain.items.ItemBase;
import com.majorgrunt.drain.tools.DrainModItemTier;

import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
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
	
	
	public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> 
		new SwordItem(DrainModItemTier.RUBY, 2, -2.4F, new Item.Properties().group(Drain.TAB))
	);
	public static final RegistryObject<PickaxeItem> RUBY_PICK = ITEMS.register("ruby_pick", () -> 
		new PickaxeItem(DrainModItemTier.RUBY, 1, -3.0F, new Item.Properties().group(Drain.TAB))
	);
	public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> 
		new HoeItem(DrainModItemTier.RUBY, 0, -3.0F, new Item.Properties().group(Drain.TAB))
	);
	public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> 
		new ShovelItem(DrainModItemTier.RUBY, 1, -3.0F, new Item.Properties().group(Drain.TAB))
	);
	public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> 
		new AxeItem(DrainModItemTier.RUBY, 4, -3.0F, new Item.Properties().group(Drain.TAB))
	);
	
	// Blocks
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
	public static final RegistryObject<Block> STALL = BLOCKS.register("stall", Stall::new);

	// Blocks Items
	public static final RegistryObject<Item> RUBY_BLOCK_ITEM =ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
	public static final RegistryObject<Item> RUBY_ORE_ITEM =ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
	public static final RegistryObject<Item> STALL_ITEM =ITEMS.register("stall", () -> new BlockItemBase(STALL.get()));

	

	

}
