package com.canadianwurbokid.morebiomes.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static ToolMaterial IRONWOOD = EnumHelper.addToolMaterial("IRONWOOD", 2, 59, 6.0F, 2.0F, 5);
	public static Item ironwoodPickaxe;
	public static Item ironwoodAxe;
	public static Item ironwoodSpade;
	public static Item ironwoodHoe;
	public static Item ironwoodSword;
	
	public static final void init() {
		
		GameRegistry.registerItem(ironwoodPickaxe = new IronwoodPickaxe("ironwood_pickaxe", IRONWOOD), "ironwood_pickaxe");
		GameRegistry.registerItem(ironwoodAxe = new IronwoodAxe("ironwood_axe", IRONWOOD), "ironwood_axe");
		GameRegistry.registerItem(ironwoodSpade = new IronwoodSpade("ironwood_spade", IRONWOOD), "ironwood_spade");
		GameRegistry.registerItem(ironwoodHoe = new IronwoodHoe("ironwood_hoe", IRONWOOD), "ironwood_hoe");
		GameRegistry.registerItem(ironwoodSword = new IronwoodSword("ironwood_sword", IRONWOOD), "ironwood_sword");
		
	}
	
}
