package com.keller23.mc.Example1710.items;

import com.keller23.mc.Example1710.creativetabs.CTabs;
import com.keller23.mc.Example1710.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TestItem extends Item {

    public String name = "testItem";

    public TestItem() {
        setUnlocalizedName(Constants.ModID + "_" + name);
        setCreativeTab(CTabs.tabBlocks);
        GameRegistry.registerItem(this, name);
    }
}
