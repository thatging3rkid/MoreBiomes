package com.canadianwurbokid.morebiomes.biome;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerBiomeEdge;
import net.minecraft.world.gen.layer.GenLayerZoom;

public class WorldTypeModded extends WorldType{
	
	public WorldTypeModded(int par1, String name){
		super(name);
	}
	
	 public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer)
	    {
	        GenLayer ret = new ModdedGenLayerBiome(200L, parentLayer, this);
	        ret = GenLayerZoom.magnify(1000L, ret, 2);
	        ret = new GenLayerBiomeEdge(1000L, ret);
	        return ret;
	    }
}
