/*package com.canadianwurbokid.morebiomes.blocks;

import java.util.List;
import java.util.Random;

import com.canadianwurbokid.morebiomes.Main;
import com.canadianwurbokid.morebiomes.biome.WorldGenIronwoodTree;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

public class IronwoodSapling extends BlockFlower
{
private int blockID;
/** change the name to your sapling name **/
/*public static final String[] WOOD_TYPES = new String[] {"Ironwood"};
private IIcon saplingTexture;
public IronwoodSapling(int i)
{
super(i);
float var3 = 0.4F;
this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
this.setCreativeTab(CreativeTabs.tabDecorations);
this.setBlockName("IronwoodSapling");
}
/**
* Ticks the block if it's been scheduled
*/
/*public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
{
if (!par1World.isRemote)
{
super.updateTick(par1World, par2, par3, par4, par5Random);
if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9 && par5Random.nextInt(7) == 0)
{
this.func_96477_c(par1World, par2, par3, par4, par5Random);
}
}
}
public void func_96477_c(World par1World, int par2, int par3, int par4, Random par5Random)
{
int l = par1World.getBlockMetadata(par2, par3, par4);
/** change this block to your custom grass block **/
/*if ((l & 8) == 2)
{
par1World.setBlockMetadataWithNotify(par2, par3, par4, l | 8, 4);
}
else
{
this.growTree(par1World, par2, par3, par4, par5Random);
}
}
/**
* Attempts to grow a sapling into a tree
*/
/*public void growTree(World par1World, int par2, int par3, int par4, Random par5Random)
{
if (!TerrainGen.saplingGrowTree(par1World, par5Random, par2, par3, par4)) return;
int l = par1World.getBlockMetadata(par2, par3, par4) & 3;
Object object = null;
int i1 = 0;
int j1 = 0;
boolean flag = false;
if (l == 1)
{
object = new WorldGenTaiga2(true);
}
else if (l == 2)
{
object = new WorldGenForest(true, true);
}
else if (l == 3)
{
for (i1 = 0; i1 >= -1; --i1)
{
for (j1 = 0; j1 >= -1; --j1)
{
if (this.isSameSapling(par1World, par2 + i1, par3, par4 + j1, 3) && this.isSameSapling(par1World, par2 + i1 + 1, par3, par4 + j1, 3) && this.isSameSapling(par1World, par2 + i1, par3, par4 + j1 + 1, 3) && this.isSameSapling(par1World, par2 + i1 + 1, par3, par4 + j1 + 1, 3))
{
/** Change this to your WorldGenNAMETree **/
/*object = new WorldGenIronwoodTree(true, 10 + par5Random.nextInt(20), 3, 3, false);
flag = true;
break;
}
}
if (object != null)
{
break;
}
}
if (object == null)
{
j1 = 0;
i1 = 0;
/** Change this to your WorldGenNAMETree **/
/*object = new WorldGenIronwoodTree(true, 4 + par5Random.nextInt(7), 3, 3, false);
}
}
else
{
/** Change this to your WorldGenNAMETree **/
/*object = new WorldGenIronwoodTree(true); // Changed //
if (par5Random.nextInt(10) == 0)
{
object = new WorldGenBigTree(true);
}
}
if (flag)
{
par1World.setBlock(par2 + i1, par3, par4 + j1, ModBlocks.IronwoodLog, 0, 4);
par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, ModBlocks.IronwoodLog, 0, 4);
par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, ModBlocks.IronwoodLog, 0, 4);
par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, ModBlocks.IronwoodLog, 0, 4);
}
else
{
par1World.setBlock(par2, par3, par4, ModBlocks.IronwoodLog, 0, 4);
}
if (!((WorldGenerator)object).generate(par1World, par5Random, par2 + i1, par3, par4 + j1))
{
if (flag)
{
par1World.setBlock(par2 + i1, par3, par4 + j1, ModBlocks.IronwoodLeaves, l, 4);
par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, ModBlocks.IronwoodLeaves, l, 4);
par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, ModBlocks.IronwoodLeaves, l, 4);
par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, ModBlocks.IronwoodLeaves, l, 4);
}
else
{
par1World.setBlock(par2, par3, par4, ModBlocks.IronwoodLeaves, l, 4);
}
}
}
/**
* Determines if the same sapling is present at the given location.
*/
/*public boolean isSameSapling(World par1World, int par2, int par3, int par4, int par5)
{
return par1World.getBlock(par2, par3, par4) == this && (par1World.getBlockMetadata(par2, par3, par4) & 3) == par5;
}
/**
* Gets passed in the blockID of the block below and supposed to return true if its allowed to grow on the type of
* blockID passed in. Args: blockID
*/
/*protected boolean canThisPlantGrowOnThisBlockID(Block par1)
{
/** Change this to your custom grass **/
/*return par1 == Blocks.grass || par1 == Blocks.dirt;
}
@Override
public void registerBlockIcons(IIconRegister registry)
{
    saplingTexture = registry.registerIcon(Main.MODID + ":IronwoodSapling");
}
@Override
public IIcon getIcon(int blah1, int blah2)
{
	return saplingTexture;
}
@Override
public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
{
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
}

}*/
