package com.canadianwurbokid.morebiomes.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static ToolMaterial IRONWOODTOOLS = EnumHelper.addToolMaterial("IRONWOOD_TOOLS", 2, 59, 6.0F, 2.0F, 5);
	public static ArmorMaterial IRONWOODARMOR = EnumHelper.addArmorMaterial("IRONWOOD_ARMOR", 5, new int[]{2,6,5,2}, 5);
	public static Item ironwoodPickaxe;
	public static Item ironwoodAxe;
	public static Item ironwoodSpade;
	public static Item ironwoodHoe;
	public static Item ironwoodSword;
	public static Item ironwoodHelmet;
	public static Item ironwoodChestplate;
	public static Item ironwoodLeggings;
	public static Item ironwoodBoots;
	
	public static final void init() {
		
		GameRegistry.registerItem(ironwoodPickaxe = new IronwoodPickaxe("ironwood_pickaxe", IRONWOODTOOLS), "ironwood_pickaxe");
		GameRegistry.registerItem(ironwoodAxe = new IronwoodAxe("ironwood_axe", IRONWOODTOOLS), "ironwood_axe");
		GameRegistry.registerItem(ironwoodSpade = new IronwoodSpade("ironwood_spade", IRONWOODTOOLS), "ironwood_spade");
		GameRegistry.registerItem(ironwoodHoe = new IronwoodHoe("ironwood_hoe", IRONWOODTOOLS), "ironwood_hoe");
		GameRegistry.registerItem(ironwoodSword = new IronwoodSword("ironwood_sword", IRONWOODTOOLS), "ironwood_sword");
		//GameRegistry.registerItem(ironwoodHelmet = new IronwoodArmor("ironwood_helmet", IRONWOODARMOR, "ironwood", 0), "ironwood_helmet"); //0 for helmet
		//GameRegistry.registerItem(ironwoodChestplate = new IronwoodArmor("ironwood_chestplate", IRONWOODARMOR, "ironwood", 1), "ironwood_chestplate"); // 1 for chestplate
		//GameRegistry.registerItem(ironwoodLeggings = new IronwoodArmor("ironwood_leggings", IRONWOODARMOR, "ironwood", 2), "ironwood_leggings"); // 2 for leggings
		//GameRegistry.registerItem(ironwoodBoots = new IronwoodArmor("ironwood_boots", IRONWOODARMOR, "ironwood", 3), "ironwood_boots"); // 3 for boots
	}
	
}
