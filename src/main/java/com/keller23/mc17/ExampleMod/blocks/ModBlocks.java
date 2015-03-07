package com.keller23.mc17.ExampleMod.blocks;

import com.keller23.mc17.ExampleMod.ExampleMod;
import net.minecraft.block.Block;

public final class ModBlocks {

    public static Block testBlock;
    public static Block multiBlock;
    public static Block smasher;
    public static Block steakOre;
    public static Block beefOre;

    //public static Block flimFlamBlock; // mine this block to get flim flam potion effect


    public static void init() {
        testBlock = new TestBlock(ExampleMod.tabBlocks);
        multiBlock = new MultiBlock(ExampleMod.tabBlocks);
        smasher = new Smasher(ExampleMod.tabBlocks);
        steakOre = new SteakOre(ExampleMod.tabBlocks);
        beefOre = new BeefOre(ExampleMod.tabBlocks);

        //flimFlamBlock = new flimFlamBlock();
    }
}
