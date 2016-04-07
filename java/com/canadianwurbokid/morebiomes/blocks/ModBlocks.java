package com.canadianwurbokid.morebiomes.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static Block IronwoodLog;
	public static Block IronwoodLeaves;
	public static Block Basalt;
	public static Block IronwoodSapling;
	
	public static final void init() {

		GameRegistry.registerBlock(IronwoodLog = new IronwoodLog("IronwoodLog", Material.wood), "IronwoodLog");
		GameRegistry.registerBlock(IronwoodLeaves = new IronwoodLeaves("IronwoodLeaves"), "IronwoodLeaves");
		GameRegistry.registerBlock(Basalt = new Basalt("Basalt", Material.rock), "Basalt");
		GameRegistry.registerBlock(IronwoodSapling = new IronwoodSapling(100127), "IronwoodSapling");
    }
}
