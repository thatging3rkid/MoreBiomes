package com.canadianwurbokid.morebiomes;



import com.canadianwurbokid.morebiomes.biome.BiomeRegistry;
import com.canadianwurbokid.morebiomes.biome.WorldTypeModded;
import com.canadianwurbokid.morebiomes.blocks.IronwoodLog;
import com.canadianwurbokid.morebiomes.blocks.ModBlocks;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.world.WorldType;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e){
		BiomeRegistry.Main();
		ModBlocks.init();
	}
	
	public void init(FMLInitializationEvent e){
		
	}
	
	public void postInit(FMLPostInitializationEvent e){
		WorldType MOREBIOMES = new WorldTypeModded(100, "MoreBiomes");
	}
}
