package com.keller23.mc.Example1710.creativetabs;

import com.keller23.mc.Example1710.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;

public class CTabs {

    public static CreativeTabs tabBlocks;
    private static String tabBlocksName = Constants.ModName;
    //public static CreativeTabs tabItems;
    //public static CreativeTabs tabTools;

    public static void init(){
        tabBlocks = new CreativeTabBlocks(tabBlocksName);
    }
}
