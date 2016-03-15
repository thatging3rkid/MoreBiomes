package com.canadianwurbokid.morebiomes.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static Block IronwoodLog;
	
	public static final void init() {

		GameRegistry.registerBlock(IronwoodLog = new IronwoodLog("IronwoodLog", Material.wood), "IronwoodLog");
    }
}
