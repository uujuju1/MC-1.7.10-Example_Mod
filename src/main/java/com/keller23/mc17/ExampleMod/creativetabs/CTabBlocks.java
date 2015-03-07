package com.keller23.mc17.ExampleMod.creativetabs;

import com.keller23.mc17.ExampleMod.blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CTabBlocks extends CreativeTabs {
    public CTabBlocks(String tabBlocksName) {
        super(tabBlocksName);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(ModBlocks.steakOre);
    }
}
