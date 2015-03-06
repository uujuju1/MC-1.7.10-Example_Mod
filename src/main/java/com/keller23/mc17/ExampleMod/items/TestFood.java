package com.keller23.mc17.ExampleMod.items;

import com.keller23.mc17.ExampleMod.creativetabs.CTabs;
import com.keller23.mc17.ExampleMod.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;

public class TestFood extends ItemFood {

    public String name = "testFood";

    public TestFood(int heal, float saturation, boolean wolfMeat){
        super(heal, saturation, wolfMeat);
        setUnlocalizedName(Constants.ModID + "_" + name);
        setCreativeTab(CTabs.tabBlocks);
        setTextureName(Constants.ModID + ":" + name);
        GameRegistry.registerItem(this, name);
    }
}
