package com.canadianwurbokid.morebiomes.biome;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenIronwoodForest extends BiomeGenBase{

	public BiomeGenIronwoodForest(int id){
		
	super(id);
	
	this.topBlock = Blocks.brick_block;
	this.fillerBlock = Blocks.dirt;
	
	this.theBiomeDecorator.generateLakes = true;
	}
	
	//public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
	//{
	//	return (WorldGenerator)(par1Random.nextInt(5) == 0 ? this.BiomeGenForest : (par1Random.nextInt(10) == 0 ? this.WorldGenIronwoodTree : this.worldGeneratorTrees));
	//}
}
