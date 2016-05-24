package com.canadianwurbokid.morebiomes;

import com.canadianwurbokid.morebiomes.CommonProxy;
import com.canadianwurbokid.morebiomes.Main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)

public class Main {

	public static final String MODID = "morebiomes";
	public static final String MODNAME = "MoreBiomes";
	public static final String VERSION = "1.0.0";
	
	@Instance
	public static Main instance = new Main();
	
	@SidedProxy(clientSide="com.canadianwurbokid.morebiomes.ClientProxy", serverSide="com.canadianwurbokid.morebiomes.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e){
		proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		proxy.postInit(e);

	}
}
