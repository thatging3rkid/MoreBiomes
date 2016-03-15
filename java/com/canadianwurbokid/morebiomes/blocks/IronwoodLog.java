package com.canadianwurbokid.morebiomes.blocks;

import java.util.Random;

import com.canadianwurbokid.morebiomes.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class IronwoodLog extends Block{

	public static final String[] woodType = new String[] {"Ironwood"};
	@SideOnly(Side.CLIENT)
	private IIcon iconLogTop;
	@SideOnly(Side.CLIENT)
	private IIcon iconLogBottom;
	private int blockID;

	public IronwoodLog(String unlocalizedName, Material material)
	{
	super(material);
	this.setCreativeTab(CreativeTabs.tabBlock);
	this.setStepSound(soundTypeWood);
	this.setHardness(2.0F);
	this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
	this.setBlockName(unlocalizedName);
	}

	/**
	* Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
	*/
	public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
	{
	int j1 = par9 & 3;
	byte b0 = 0;
	switch (par5)
	{
	case 0:
	case 1:
	b0 = 0;
	break;
	case 2:
	case 3:
	b0 = 8;
	break;
	case 4:
	case 5:
	b0 = 4;
	}
	return j1 | b0;
	}

	/**
	* Returns the ID of the items to drop on destruction.
	*/
	public int idDropped(int par1, Random par2Random, int par3)
	{
	return this.blockID;
	}
	/**
	* Returns the quantity of items to drop on block destruction.
	*/
	public int quantityDropped(Random par1Random)
	{
	return 1;
	}

	/** gets the icon **/
	public IIcon getIcon(int par1, int par2)
	{
	return par1 == 1 ? this.iconLogTop : (par1 == 0 ? this.iconLogBottom : this.blockIcon);
	}

	@SideOnly(Side.CLIENT)
	/** Register Icons for this block used in method above **/
	public void registerIcons(IIconRegister par1IconRegister)
	{
	/** change the "Ironwood:LogSide,LogTop to your texture names **/
	this.blockIcon = par1IconRegister.registerIcon("morebiomes:IronwoodLogSide");
	this.iconLogTop = par1IconRegister.registerIcon("morebiomes:IronwoodLogTop");
	this.iconLogBottom = par1IconRegister.registerIcon("morebiomes:IronwoodLogTop");
	}

	public boolean canSustainLeaves(World world, int x, int y, int z)
	{
	return true;
	}

	public boolean isWood(World world, int x, int y, int z)
	{
	return true;
	}
}
