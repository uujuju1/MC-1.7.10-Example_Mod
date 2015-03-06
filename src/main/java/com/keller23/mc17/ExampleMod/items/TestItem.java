package com.keller23.mc17.ExampleMod.items;

import com.keller23.mc17.ExampleMod.creativetabs.CTabs;
import com.keller23.mc17.ExampleMod.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class TestItem extends Item {

    public String name = "testItem";

    public TestItem() {
        setUnlocalizedName(Constants.ModID + "_" + name);
        setCreativeTab(CTabs.tabBlocks);
        GameRegistry.registerItem(this, name);
    }
}
