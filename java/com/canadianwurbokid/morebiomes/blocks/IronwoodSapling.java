/*package com.canadianwurbokid.morebiomes.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class IronwoodSapling extends BlockFlower {
	
	protected IronwoodSapling(int i, int j) {
		super(i);
		float f = 0.4F;
		setBlockBounds(0.5F-f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F - f);
	}
	
	protected boolean canThisPlantGrowOnThisBlock(int i) {
		return i == Block.getIdFromBlock(Blocks.grass);
	}
	
	public void updateTick(World world, int i, int j, int k, Random random){
		
		super.updateTick(world, i, j, k, random);
		
		if(world.getBlockLightValue(i, j + 1, k) >= 9 && random.nextInt(7) == 0) {
			int l = world.getBlockMetadata(i, j, k);
			if((l & 8) == 0) {
				world.setBlockMetadataWithNotify(i, j, k, l | 8, 1);
			}
			else {
				growTree(world, i, j, k, random);
			}
		}
		
	}
	
}*/
