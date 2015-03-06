package com.keller23.mc.Example1710.creativetabs;

import com.keller23.mc.Example1710.blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBlocks extends CreativeTabs {
    public CreativeTabBlocks(String tabBlocksName) {
        super(tabBlocksName);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(ModBlocks.steakOre);
    }
}
