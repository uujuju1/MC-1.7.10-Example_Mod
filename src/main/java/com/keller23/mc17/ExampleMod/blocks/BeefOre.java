package com.keller23.mc17.ExampleMod.blocks;

import com.keller23.mc17.ExampleMod.creativetabs.CTabs;
import com.keller23.mc17.ExampleMod.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BeefOre extends Block {

    public static String name = "beefOre";

    private Item drop;
    private int meta;
    private int least, most;

    public BeefOre(CreativeTabs creativeTabs){
        super(Material.rock);
        setCreativeTab(creativeTabs);
        setBlockName(Constants.ModID + "_" + name);
        setHardness(5.0F);
        setHarvestLevel("pickaxe", 2); // >= iron pick
        setResistance(10F);
        this.drop = Items.beef;
        this.meta = 0;
        this.least = 1;
        this.most = 32;
        GameRegistry.registerBlock(this, name);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random rnd, int p_149650_3_) {
        return this.drop; // will return this item upon breaking ore
    }

    @Override
    public int damageDropped(int meta) {
        return this.meta;
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random rand) {
        return fortune + (rand.nextInt(2)+1);
    }

    @Override
    public int quantityDropped(Random rand) {
        return rand.nextInt(3)+1;
    }
}
