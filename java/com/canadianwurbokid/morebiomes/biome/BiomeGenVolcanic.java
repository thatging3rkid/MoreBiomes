package com.canadianwurbokid.morebiomes.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenVolcanic extends BiomeGenBase{

	public BiomeGenVolcanic(int id){
		
	super(id);
	
	this.topBlock = Blocks.obsidian;
	this.fillerBlock = Blocks.obsidian;
	
	this.theBiomeDecorator.generateLakes = false;
	}
}
