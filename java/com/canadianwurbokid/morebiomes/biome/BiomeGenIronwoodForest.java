package com.canadianwurbokid.morebiomes.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenIronwoodForest extends BiomeGenBase{

	public BiomeGenIronwoodForest(int id){
		
	super(id);
	
	this.topBlock = Blocks.brick_block;
	this.fillerBlock = Blocks.dirt;
	
	this.theBiomeDecorator.generateLakes = true;
	}
}
