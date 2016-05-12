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
		GameRegistry.addRecipe(new ItemStack(ModBlocks.IronwoodSlab, 6), "###", '#', ModBlocks.IronwoodPlank);
		GameRegistry.addRecipe(new ItemStack(Blocks.trapdoor, 2), "###", "###", '#', ModBlocks.IronwoodPlank);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.IronwoodStairs, 4), "  #", " ##", "###", '#', ModBlocks.IronwoodPlank);
		GameRegistry.addRecipe(new ItemStack(Blocks.bookshelf), "###", "III", "###", '#', ModBlocks.IronwoodPlank, 'I', Items.book);
		GameRegistry.addRecipe(new ItemStack(Blocks.chest), "###", "# #", "###", '#', ModBlocks.IronwoodPlank);
		GameRegistry.addRecipe(new ItemStack(Items.boat), "# #", "###", '#', ModBlocks.IronwoodPlank);
		GameRegistry.addRecipe(new ItemStack(Blocks.wooden_pressure_plate), "##", '#', ModBlocks.IronwoodPlank);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_button), new Object[] {ModBlocks.IronwoodPlank});
		GameRegistry.addRecipe(new ItemStack(Items.wooden_door), "##", "##", "##", '#', ModBlocks.IronwoodPlank);
		GameRegistry.addRecipe(new ItemStack(Blocks.piston), "###", "I$I", "I&I", '#', ModBlocks.IronwoodPlank, 'I', Blocks.cobblestone, '$', Items.iron_ingot, '&', Items.redstone);
		GameRegistry.addRecipe(new ItemStack(Blocks.noteblock), "###", "#I#", "###", '#', ModBlocks.IronwoodPlank, 'I', Items.redstone);
		GameRegistry.addRecipe(new ItemStack(Blocks.jukebox), "###", "#I#", "###", '#', ModBlocks.IronwoodPlank, 'I', Items.diamond);
		GameRegistry.addRecipe(new ItemStack(Blocks.tripwire_hook), "I", "$", "#", '#', ModBlocks.IronwoodPlank, 'I', Items.iron_ingot, '$', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Blocks.daylight_detector), "III", "$$$", "###", '#', ModBlocks.IronwoodSlab, 'I', Blocks.glass, '$', Items.quartz);
		GameRegistry.addRecipe(new ItemStack(Blocks.fence_gate), "I#I", "I#I", '#', ModBlocks.IronwoodPlank, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Items.bed), "III", "###", '#', ModBlocks.IronwoodPlank, 'I', Blocks.wool);
		GameRegistry.addRecipe(new ItemStack(Items.sign), "###", "###", " I ", '#', ModBlocks.IronwoodPlank, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Items.bowl), "# #", " # ", '#', ModBlocks.IronwoodPlank);
		//GameRegistry.addRecipe(new ItemStack(ModItems.ironwoodBoots), "# #", "# #", '#', ModBlocks.IronwoodPlank);
		//GameRegistry.addRecipe(new ItemStack(ModItems.ironwoodChestplate), "# #", "###", "###", '#', ModBlocks.IronwoodPlank);
		//GameRegistry.addRecipe(new ItemStack(ModItems.ironwoodHelmet), "###", "# #", '#', ModBlocks.IronwoodPlank);
		//GameRegistry.addRecipe(new ItemStack(ModItems.ironwoodLeggings), "###", "# #", "# #", '#', ModBlocks.IronwoodPlank);

		
	}
	
}
