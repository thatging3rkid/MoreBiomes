package com.canadianwurbokid.morebiomes.items;

import com.canadianwurbokid.morebiomes.Main;

import net.minecraft.item.ItemSword;

public class IronwoodSword extends ItemSword {

	public IronwoodSword(String unlocalizedName, ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}

}
