package com.canadianwurbokid.morebiomes.items;
import com.canadianwurbokid.morebiomes.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;
public class IronwoodSlab2 extends ItemSlab
{
    public IronwoodSlab2(Block block)
    {
	    super(block, (BlockSlab)ModBlocks.IronwoodSlab, (BlockSlab)ModBlocks.DoubleIronwoodSlab, false);
	    this.setMaxDamage(0);
	    this.setHasSubtypes(true);
    }
}