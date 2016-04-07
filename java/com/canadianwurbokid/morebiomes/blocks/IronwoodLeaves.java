package com.canadianwurbokid.morebiomes.blocks;

import java.util.Random;

import com.canadianwurbokid.morebiomes.Main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
public class IronwoodLeaves extends BlockLeaves
{
	private static int blockID;
public IronwoodLeaves(String unlocalizedName)
{
super();
this.setCreativeTab(CreativeTabs.tabDecorations);
this.setStepSound(soundTypeGrass);
this.setHardness(0.2F);
this.setBlockName(unlocalizedName);
this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
}

public boolean isOpaqueCube()
{
return false;
}
/**
* Returns the ID of the items to drop on destruction.
*/
/*public int idDropped(int par1, Random par2Random, int par3)
{
return this.blockID;
}*/
/**
* Returns the quantity of items to drop on block destruction.
*/
public int quantityDropped(Random par1Random)
{
return 1;
}

public void registerBlockIcons(IIconRegister par1IconRegister)
{
this.blockIcon = par1IconRegister.registerIcon("morebiomes:IronwoodLeaves");
}

@Override
public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
	// TODO Auto-generated method stub
	return this.blockIcon;
}

@Override
public String[] func_150125_e() {
	// TODO Auto-generated method stub
	return null;
}
public static int getID()
{
	return blockID;
}
}