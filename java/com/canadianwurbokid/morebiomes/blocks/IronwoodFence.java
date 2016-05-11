package com.canadianwurbokid.morebiomes.blocks;

import com.canadianwurbokid.morebiomes.Main;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

public class IronwoodFence extends BlockFence {

	public IronwoodFence() {
		super(Main.MODID + ":IronwoodPlank", Material.wood);
		// TODO Auto-generated constructor stub
		this.setHarvestLevel("axe", 1);
		this.setBlockName("IronwoodFence");
	}

}
