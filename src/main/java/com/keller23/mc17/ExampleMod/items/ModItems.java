package com.keller23.mc17.ExampleMod.items;

import com.keller23.mc17.ExampleMod.ExampleMod;
import net.minecraft.item.Item;

public final class ModItems {

    public static Item testItem;
    public static Item testFood;

    public static void init() {
        testItem = new TestItem(ExampleMod.tabBlocks);
        testFood = new TestFood(ExampleMod.tabBlocks, 20, 0.9f, false);
    }
}
