package com.canadianwurbokid.morebiomes.crafting;

import com.canadianwurbokid.morebiomes.blocks.ModBlocks;
import com.canadianwurbokid.morebiomes.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCrafting {

	public static final void init(){
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.IronwoodPlank, 4), new Object[] {ModBlocks.IronwoodLog});
		GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table), "##", "##", '#', ModBlocks.IronwoodPlank);
		GameRegistry.addSmelting(ModBlocks.IronwoodLog, new ItemStack(Items.coal, 1, 1), 0.7F);
		GameRegistry.addRecipe(new ItemStack(Items.stick), "#", "#", '#', ModBlocks.IronwoodPlank);
		GameRegistry.addRecipe(new ItemStack(ModItems.ironwoodAxe), "##", "#I", " I", '#', ModBlocks.IronwoodPlank, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModItems.ironwoodHoe), "##", " I", " I", '#', ModBlocks.IronwoodPlank, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModItems.ironwoodPickaxe), "###", " I ", " I ", '#', ModBlocks.IronwoodPlank, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModItems.ironwoodSpade), "#", "I", "I", '#', ModBlocks.IronwoodPlank, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModItems.ironwoodSword), "#", "#", "I", '#', ModBlocks.IronwoodPlank, 'I', Items.stick);
		
	}
	
}
