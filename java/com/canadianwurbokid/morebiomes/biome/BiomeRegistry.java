package com.canadianwurbokid.morebiomes.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {

	public static void Main()
	{
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeVolcanic;
	public static BiomeGenBase biomeIronwoodForest;
	
	public static void initializeBiome()
	{
		biomeVolcanic = new BiomeGenVolcanic(100).setBiomeName("Volcanic");
		biomeIronwoodForest = new BiomeGenIronwoodForest(101).setBiomeName("Ironwood Forest");
	}
	
	public static void registerBiome()
	{
		BiomeDictionary.registerBiomeType(biomeVolcanic, Type.FOREST);
		BiomeManager.addSpawnBiome(biomeVolcanic);
		
		BiomeDictionary.registerBiomeType(biomeIronwoodForest, Type.FOREST);
		BiomeManager.addSpawnBiome(biomeIronwoodForest);
	}
}