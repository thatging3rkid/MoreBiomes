package com.canadianwurbokid.morebiomes.blocks;

import java.util.Random;

import com.canadianwurbokid.morebiomes.Main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.Facing;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
public class IronwoodLeaves extends BlockLeaves
{
	private static int blockID;
	private boolean field_149996_a = false;
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
@Override
public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
{
	Block sapling = ModBlocks.IronwoodSapling;
    return Item.getItemFromBlock(sapling);
}
public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
{
	
}
public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
{
    Block block = p_149646_1_.getBlock(p_149646_2_, p_149646_3_, p_149646_4_);

    if (this == ModBlocks.IronwoodLeaves)
    {
        if (p_149646_1_.getBlockMetadata(p_149646_2_, p_149646_3_, p_149646_4_) != p_149646_1_.getBlockMetadata(p_149646_2_ - Facing.offsetsXForSide[p_149646_5_], p_149646_3_ - Facing.offsetsYForSide[p_149646_5_], p_149646_4_ - Facing.offsetsZForSide[p_149646_5_]))
        {
            return true;
        }

        if (block == this)
        {
            return true;
        }
    }

    return !this.field_149996_a && block == this ? false : super.shouldSideBeRendered(p_149646_1_, p_149646_2_, p_149646_3_, p_149646_4_, p_149646_5_);
}
public int getFlammability(IBlockAccess world, int x, int y, int z, ForgeDirection face)
{
    return 300;
}
public int getFireSpreadSpeed(IBlockAccess world, int x, int y, int z, ForgeDirection face)
{
    return 50;
}
}