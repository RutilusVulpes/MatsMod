package com.majorgrunt.drain.tools;

import com.google.common.base.Supplier;
import com.majorgrunt.drain.utils.RegistryHandler;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum DrainModItemTier implements IItemTier {
	
	RUBY(3,800,7.0F, 3.0F, 12, () -> {
		return Ingredient.fromItems(RegistryHandler.RUBY_SWORD.get());
	});
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float damage;
	private final int enchantability;
	private final Supplier<Ingredient> repairMaterial;
	
	DrainModItemTier(int harvestLevel,int maxUses,float efficiency,float damage,int enchantability, Supplier<Ingredient> repairMaterial){
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.damage = damage;
		this.repairMaterial = repairMaterial;
		this.enchantability = enchantability; 
	}
	@Override
	public int getMaxUses() {

		return maxUses;
	}

	@Override
	public float getEfficiency() {
		// TODO Auto-generated method stub
		return efficiency;
	}

	@Override
	public float getAttackDamage() {
		// TODO Auto-generated method stub
		return damage;
	}

	@Override
	public int getHarvestLevel() {
		// TODO Auto-generated method stub
		return harvestLevel;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return repairMaterial.get();
	}

}
