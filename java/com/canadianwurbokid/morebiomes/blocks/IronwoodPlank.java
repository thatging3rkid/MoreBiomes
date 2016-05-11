package com.canadianwurbokid.morebiomes.blocks;

import com.canadianwurbokid.morebiomes.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

public class IronwoodPlank extends Block{

	protected IronwoodPlank(String unlocalizedName, Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(3.0F);
        this.setResistance(22.5F);
        this.setHarvestLevel("axe", 1);
        this.setStepSound(soundTypeWood);
		// TODO Auto-generated constructor stub
	}
	public int getFlammability(IBlockAccess world, int x, int y, int z, ForgeDirection face)
    {
        return 150;
    }
	public int getFireSpreadSpeed(IBlockAccess world, int x, int y, int z, ForgeDirection face)
    {
        return 50;
    }

}
