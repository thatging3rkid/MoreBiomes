package com.canadianwurbokid.morebiomes.blocks;

import com.canadianwurbokid.morebiomes.items.IronwoodSlab4;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {

	public static Block IronwoodLog;
	public static Block IronwoodLeaves;
	public static Block Basalt;
	public static Block IronwoodSapling;
	public static Block IronwoodPlank;
	public static BlockSlab IronwoodSlab = (BlockSlab) new IronwoodSlab3(0, false).setHardness(2.0F).setStepSound(Block.soundTypeWood).setBlockName("IronwoodSlab").setCreativeTab(CreativeTabs.tabBlock);
	public static BlockSlab DoubleIronwoodSlab = (BlockSlab) new IronwoodSlab3(1, true).setHardness(2.0F).setStepSound(Block.soundTypeWood).setBlockName("IronwoodSlab");
	
	public static final void init() {

		GameRegistry.registerBlock(IronwoodLog = new IronwoodLog("IronwoodLog", Material.wood), "IronwoodLog");
		GameRegistry.registerBlock(IronwoodLeaves = new IronwoodLeaves("IronwoodLeaves"), "IronwoodLeaves");
		GameRegistry.registerBlock(Basalt = new Basalt("Basalt", Material.rock), "Basalt");
		GameRegistry.registerBlock(IronwoodSapling = new IronwoodSapling(100127), "IronwoodSapling");
		GameRegistry.registerBlock(IronwoodPlank = new IronwoodPlank("IronwoodPlank", Material.wood), "IronwoodPlank");
		//GameRegistry.registerBlock(IronwoodSlab = new IronwoodSlab("IronwoodSlab", false, Material.wood), "IronwoodSlab").setCreativeTab(CreativeTabs.tabBlock);
		//GameRegistry.registerBlock(DoubleIronwoodSlab = new IronwoodSlab("IronwoodSlab", true, Material.wood), "DoubleIronwoodSlab");
		GameRegistry.registerBlock(IronwoodSlab, IronwoodSlab4.class, "IronwoodSlab");
		GameRegistry.registerBlock(DoubleIronwoodSlab, IronwoodSlab4.class, "DoubleIronwoodSlab");
		
    }
}
