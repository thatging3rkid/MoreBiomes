package com.canadianwurbokid.morebiomes.blocks;

import java.util.List;
import java.util.Random;

import com.canadianwurbokid.morebiomes.Main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class IronwoodSlab extends BlockSlab {

	public IronwoodSlab(String unlocalizedName, boolean wholeBlock, Material material) {
		super(wholeBlock, material);
		// TODO Auto-generated constructor stub
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":IronwoodPlank");
        //this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(3.0F);
        this.setResistance(2.3F);
        this.setHarvestLevel("axe", 1);
        this.setStepSound(soundTypeWood);
	}

	@Override
	public String func_150002_b(int p_150002_1_) {
		// TODO Auto-generated method stub
		return super.getUnlocalizedName();
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return Item.getItemFromBlock(ModBlocks.IronwoodSlab);
	}

	public int getFlammability(IBlockAccess world, int x, int y, int z, ForgeDirection face)
    {
        return 150;
    }
	public int getFireSpreadSpeed(IBlockAccess world, int x, int y, int z, ForgeDirection face)
    {
        return 50;
    }
	protected ItemStack createStackedBlock(int p_149644_1_)
    {
        return new ItemStack(Item.getItemFromBlock(ModBlocks.IronwoodSlab), 2, p_149644_1_ & 7);
    }
	@Override
	public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_)
    {
		//p_149743_6_.add(ModBlocks.IronwoodSlab);
		this.setBlockBoundsBasedOnState(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_);
        super.addCollisionBoxesToList(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);
    }
	/*
	public void onBlockPlaced(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
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
	*/
	public void getSubBlocks(Block par1, CreativeTabs par2CreativeTabs, List par3List)
	{
	if (par1 != ModBlocks.DoubleIronwoodSlab)
	{
	par3List.add(new ItemStack(par1, 1, 0));
	}
	}
	/*
	@Override
	public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int meta){
		if(world.getBlock(x, y - 1, z) == ModBlocks.IronwoodSlab)
		{
		world.setBlock(x, y, z, Blocks.air);
		world.setBlock(x, y - 1, z, ModBlocks.DoubleIronwoodSlab);
		}
		if(world.getBlock(x, y + 1, z) == ModBlocks.IronwoodSlab)
		{
		world.setBlock(x, y, z, Blocks.air);
		world.setBlock(x, y + 1, z, ModBlocks.DoubleIronwoodSlab);
		}
		return super.onBlockPlaced(world, x, y, z, side, hitX, hitY, hitZ, meta);
		/*     What the super.onBlockPlaced does:
		 *     if(wholeBlock){
		 *         return meta;
		 *     }
		 *     else{
		 *         if(side != 0 && (side == 1 || (double)hitY <= 0.5D)){
		 *             return meta;
		 *         }
		 *         else{
		 *             return meta | 8;
		 *         }
		 *     }
		 */
	//}
	
	@Override
	public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int meta)
	{
		int thingy =  this.field_150004_a ? meta : (side != 0 && (side == 1 || (double)hitY <= 0.5D) ? meta : meta + 4);
		if(world.getBlock(x, y-1, z) == ModBlocks.IronwoodSlab)
		{
			if(world.getBlockMetadata(x, y-1, z) < 4)
			{
				world.setBlock(x, y-1, z, ModBlocks.DoubleIronwoodSlab);
				thingy = 15;
			}
		}
		else
		{
			if(world.getBlock(x, y+1, z) == ModBlocks.IronwoodSlab)
			{
				if(world.getBlockMetadata(x, y+1, z) >= 4)
				{
					world.setBlock(x, y+1, z, ModBlocks.DoubleIronwoodSlab);
					thingy = 15;
				}
			}
		}
		return thingy;
	}
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
    {
		//World world = (World)p_149719_1_;
        if (this.field_150004_a)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        else
        {
            boolean flag = (p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_) & 8) != 0;

            if (flag)
            {
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
                //p_149719_1_.setBlock(p_149719_2_, p_149719_3_, p_149719_4_, Blocks.air);
            }
            else
            {
            	if(p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_) >= 4)
            	{
            		this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            	}
            	else
            	{
            		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            	}
            }
        }
    }
	
	public void setBlockBoundsBasedOnState(World p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
    {
		//World world = (World)p_149719_1_;
        if (this.field_150004_a)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        else
        {
            boolean flag = (p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_) & 8) != 0;

            if (flag)
            {
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
                p_149719_1_.setBlock(p_149719_2_, p_149719_3_, p_149719_4_, Blocks.air);
            }
            else
            {
            	if(p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_) >= 4)
            	{
            		this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            	}
            	else
            	{
            		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            	}
            }
        }
    }
	/*public void updateTick(World world, int x, int y, int z, Random p_149674_5_)
	{
		if(!world.isRemote && world.getBlockMetadata(x, y, z) >= 8)
		{
			world.setBlock(x, y, z, Blocks.air);
		}
	}*/
}
