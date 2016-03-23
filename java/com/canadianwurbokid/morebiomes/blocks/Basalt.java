package com.canadianwurbokid.morebiomes.blocks;

import com.canadianwurbokid.morebiomes.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class Basalt extends Block { 

	public IIcon[] icons = new IIcon[6];
	
    protected Basalt(String unlocalizedName, Material material) 
    { 
        super(material);
        this.setBlockName(unlocalizedName);
        //this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypeStone);
    }
    
    @Override
    public void registerBlockIcons(IIconRegister reg) {
        for (int i = 0; i < 6; i ++) {
        	if (i == 0){
        		this.icons[i] = reg.registerIcon(Main.MODID + ":BasaltBottom");
        	}
        	else if (i == 1){
        		this.icons[i] = reg.registerIcon(Main.MODID + ":BasaltTop");
        	}
        	else{
        		this.icons[i] = reg.registerIcon(Main.MODID + ":BasaltSide");
        	}
        }
    }
    
    @Override
    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }

}
