package com.keller23.mc.Example1710.blocks;

import net.minecraft.block.Block;

public final class ModBlocks {

    public static Block testBlock;
    public static Block multiBlock;
    public static Block smasher;
    public static Block steakOre;
    public static Block beefOre;

    //public static Block flimFlamBlock; // mine this block to get flim flam potion effect


    public static void init() {
        testBlock = new TestBlock();
        multiBlock = new MultiBlock();
        smasher = new Smasher();
        steakOre = new SteakOre();
        beefOre = new BeefOre();

        //flimFlamBlock = new flimFlamBlock();
    }
}
