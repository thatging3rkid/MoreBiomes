package com.canadianwurbokid.morebiomes.biome;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;

import com.canadianwurbokid.morebiomes.Main;
import com.canadianwurbokid.morebiomes.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenMegaPineTree;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ModdedSaplings extends BlockSapling
{
    public static final String[] saplingTypes = new String[] {"Ironwood"};
    private static final IIcon[] iconLength = new IIcon[saplingTypes.length];

    public ModdedSaplings()
    {
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World world, int x, int y, int z, Random rand)
    {
        if (!world.isRemote)
        {
            super.updateTick(world, x, y, z, rand);

            if (world.getBlockLightValue(x, y + 1, z) >= 9 && rand.nextInt(7) == 0)
            {
                this.func_149879_c(world, x, y, z, rand);
            }
        }
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        meta &= 7;
        return iconLength[MathHelper.clamp_int(meta, 0, 5)];
    }
//MarkorGetMarked
    public void func_149879_c(World world, int x, int y, int z, Random rand)
    {
        int l = world.getBlockMetadata(x, y, z);

        if ((l & 8) == 0)
        {
        	world.setBlockMetadataWithNotify(x, y, z, l | 8, 4);
        }
        else
        {
            this.func_149878_d(world, x, y, z, rand);
        }
    }

    //growTree
    public void func_149878_d(World world, int x, int y, int z, Random rand)
    {
        if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, rand, x, y, z)) return;
        int l = world.getBlockMetadata(x, y, z) & 7;
        Object object = rand.nextInt(10) == 0 ? new WorldGenBigTree(true) : new WorldGenTrees(true);
        int i1 = 0;
        int j1 = 0;
        boolean flag = false;

        switch (l)
        {
            case 0:
            	object = new WorldGenIronwoodTree(ModBlocks.IronwoodLog, ModBlocks.IronwoodLeaves, 0, 0, false, 10, 15, false);
            	break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
            	break;
            default:
                break;
        }

        Block block = Blocks.air;

        if (flag)
        {
        	world.setBlock(x + i1, y, z + j1, block, 0, 4);
        	world.setBlock(x + i1 + 1, y, z + j1, block, 0, 4);
        	world.setBlock(x + i1, y, z + j1 + 1, block, 0, 4);
        	world.setBlock(x + i1 + 1, y, z + j1 + 1, block, 0, 4);
        }
        else
        {
        	world.setBlock(x, y, z, block, 0, 4);
        }

        if (!((WorldGenerator)object).generate(world, rand, x + i1, y, z + j1))
        {
            if (flag)
            {
            	world.setBlock(x + i1, y, z + j1, this, l, 4);
            	world.setBlock(x + i1 + 1, y, z + j1, this, l, 4);
            	world.setBlock(x + i1, y, z + j1 + 1, this, l, 4);
            	world.setBlock(x + i1 + 1, y, z + j1 + 1, this, l, 4);
            }
            else
            {
            	world.setBlock(x, y, z, this, l, 4);
            }
        }
    }
    //isSameSapling
    public boolean func_149880_a(World world, int x, int y, int z, int par1)
    {
        return world.getBlock(x, y, z) == this && (world.getBlockMetadata(x, y, z) & 7) == par1;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int p_149692_1_)
    {
        return MathHelper.clamp_int(p_149692_1_ & 7, 0, 5);
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List list)
    {
       for (int i = 0; i < saplingTypes.length; i++)
       {
    	   list.add(new ItemStack(item, 1, i));
       }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        for (int i = 0; i < iconLength.length; ++i)
        {
            iconLength[i] = iconRegister.registerIcon(Main.MODID + ":IronwoodSapling");
        }
    }
    
    public boolean func_149851_a(World p_149851_1_, int p_149851_2_, int p_149851_3_, int p_149851_4_, boolean p_149851_5_)
    {
        return true;
    }

    public boolean func_149852_a(World p_149852_1_, Random p_149852_2_, int p_149852_3_, int p_149852_4_, int p_149852_5_)
    {
        return (double)p_149852_1_.rand.nextFloat() < 0.45D;
    }

    public void func_149853_b(World p_149853_1_, Random p_149853_2_, int p_149853_3_, int p_149853_4_, int p_149853_5_)
    {
        this.func_149879_c(p_149853_1_, p_149853_3_, p_149853_4_, p_149853_5_, p_149853_2_);
    }
}