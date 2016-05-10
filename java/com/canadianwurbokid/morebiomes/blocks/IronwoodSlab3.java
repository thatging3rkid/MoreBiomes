package com.canadianwurbokid.morebiomes.blocks;

import java.util.List;
import java.util.Random;

import com.canadianwurbokid.morebiomes.Main;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IronwoodSlab3 extends BlockSlab
{
public static final String[] woodType = { "ironWood" };

public IronwoodSlab3(int par1, boolean par2)
{
super(par2, Material.wood);
this.setLightOpacity(0);
this.setBlockName("IronwoodSlab");
this.setBlockTextureName(Main.MODID + ":IronwoodPlank");
}

public void registerIcons(IIconRegister par1IconRegister)
{
this.blockIcon = par1IconRegister.registerIcon(Main.MODID + ":IronwoodPlank");
}

public Item getItemDropped(int par1, Random par2Random, int par3)
{
return Item.getItemFromBlock(ModBlocks.IronwoodSlab);
}

public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
{
if(par1World.getBlock(par2, par3 - 1, par4) == ModBlocks.IronwoodSlab)
{
par1World.setBlock(par2, par3, par4, Blocks.air);
par1World.setBlock(par2, par3 - 1, par4, ModBlocks.DoubleIronwoodSlab);
}
if(par1World.getBlock(par2, par3 + 1, par4) == ModBlocks.IronwoodSlab)
{
par1World.setBlock(par2, par3, par4, Blocks.air);
par1World.setBlock(par2, par3 + 1, par4, ModBlocks.DoubleIronwoodSlab);
}
}

protected ItemStack createStackedBlock(int par1)
{
return new ItemStack(ModBlocks.IronwoodSlab, 2, par1 & 7);
}

public String getFullSlabName(int par1)
{
if ((par1 < 0) || (par1 >= woodType.length))
{
par1 = 0;
}

return super.getUnlocalizedName() + "." + woodType[par1];
}

public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List)
{
if (par1 != Item.getItemFromBlock(ModBlocks.DoubleIronwoodSlab))
{
par3List.add(new ItemStack(par1, 1, 0));
}
}

@Override
public String func_150002_b(int p_150002_1_) {
	// TODO Auto-generated method stub
	return super.getUnlocalizedName();
}

}