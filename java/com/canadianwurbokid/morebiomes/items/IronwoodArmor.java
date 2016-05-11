package com.canadianwurbokid.morebiomes.items;

import com.canadianwurbokid.morebiomes.Main;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class IronwoodArmor extends ItemArmor {

	public String textureName;

	public IronwoodArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
	    super(material, 0, type);
	    this.textureName = textureName;
	    this.setUnlocalizedName(unlocalizedName);
	    this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return Main.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

}
