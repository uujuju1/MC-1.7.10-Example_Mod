package com.keller23.mc17.ExampleMod.creativetabs;

import com.keller23.mc17.ExampleMod.ExampleMod;
import com.keller23.mc17.ExampleMod.items.ModItems;
import com.keller23.mc17.ExampleMod.lib.Constants;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CTabs {


    public static void init(){
        ExampleMod.tabBlocks = new CreativeTabs("tabKeller") {
            @Override
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return ModItems.testFood;
            }
        };
    }

}
