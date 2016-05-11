package com.canadianwurbokid.morebiomes.blocks;

import com.canadianwurbokid.morebiomes.Main;
import com.canadianwurbokid.morebiomes.items.IronwoodSlab2;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {

	public static Block IronwoodLog = new IronwoodLog("IronwoodLog", Material.wood);
	public static Block IronwoodLeaves = new IronwoodLeaves("IronwoodLeaves");
	public static Block Basalt = new Basalt("Basalt", Material.rock);
	public static Block IronwoodSapling = new IronwoodSapling(100127);
	public static Block IronwoodPlank = new IronwoodPlank("IronwoodPlank", Material.wood);
	public static BlockSlab IronwoodSlab = (BlockSlab) new IronwoodSlab3(0, false).setHardness(3.0F).setResistance(22.5F).setStepSound(Block.soundTypeWood).setBlockName("IronwoodSlab").setCreativeTab(CreativeTabs.tabBlock);
	public static BlockSlab DoubleIronwoodSlab = (BlockSlab) new IronwoodSlab3(1, true).setHardness(3.0F).setResistance(22.5F).setStepSound(Block.soundTypeWood).setBlockName("IronwoodSlab");
	public static Block IronwoodStairs = new IronwoodStairs(100128).setLightOpacity(0).setBlockName("IronwoodStairs");
	//public static Block IronwoodFence = new IronwoodFence();
	
	public static final void init() {

		GameRegistry.registerBlock(IronwoodLog, "IronwoodLog");
		GameRegistry.registerBlock(IronwoodLeaves, "IronwoodLeaves");
		GameRegistry.registerBlock(Basalt, "Basalt");
		GameRegistry.registerBlock(IronwoodSapling, "IronwoodSapling");
		GameRegistry.registerBlock(IronwoodPlank, "IronwoodPlank");
		//GameRegistry.registerBlock(IronwoodSlab = new IronwoodSlab("IronwoodSlab", false, Material.wood), "IronwoodSlab").setCreativeTab(CreativeTabs.tabBlock);
		//GameRegistry.registerBlock(DoubleIronwoodSlab = new IronwoodSlab("IronwoodSlab", true, Material.wood), "DoubleIronwoodSlab");
		GameRegistry.registerBlock(IronwoodSlab, IronwoodSlab2.class, "IronwoodSlab");
		GameRegistry.registerBlock(DoubleIronwoodSlab, IronwoodSlab2.class, "DoubleIronwoodSlab");
		GameRegistry.registerBlock(IronwoodStairs, "IronwoodStairs");
		//GameRegistry.registerBlock(IronwoodFence, "IronwoodFence");
		
    }
}
