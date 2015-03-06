package com.keller23.mc.Example1710.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMultiBlock extends ItemBlock {

    public ItemBlockMultiBlock(Block block){
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        String name;
        switch(itemStack.getItemDamage()){
            case 0: name = "firstMeta"; break;
            case 1: name = "secondMeta"; break;
            case 2: name = "thirdMeta"; break;
            default: name = "Unknown"; break;
        }
        return getUnlocalizedName() + "." + name;
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }
}
