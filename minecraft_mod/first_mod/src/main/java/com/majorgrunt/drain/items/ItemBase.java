package com.majorgrunt.drain.items;

import com.majorgrunt.drain.Drain;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item{

	public ItemBase() {
		super(new Item.Properties().group(Drain.TAB));
	}

}
