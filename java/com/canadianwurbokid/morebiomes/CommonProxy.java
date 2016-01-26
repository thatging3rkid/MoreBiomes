package com.canadianwurbokid.morebiomes;



import com.canadianwurbokid.morebiomes.biome.BiomeRegistry;
import com.canadianwurbokid.morebiomes.biome.WorldTypeModded;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.world.WorldType;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e){
		BiomeRegistry.Main();
	}
	
	public void init(FMLInitializationEvent e){
		
	}
	
	public void postInit(FMLPostInitializationEvent e){
		WorldType MOREBIOMES = new WorldTypeModded(100, "MoreBiomes");
	}
}
