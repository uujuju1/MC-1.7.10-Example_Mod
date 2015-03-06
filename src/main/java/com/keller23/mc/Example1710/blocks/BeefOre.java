package com.keller23.mc.Example1710.blocks;

import com.keller23.mc.Example1710.creativetabs.CTabs;
import com.keller23.mc.Example1710.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BeefOre extends Block {

    public static String name = "beefOre";

    public BeefOre(){
        super(Material.rock);
        setCreativeTab(CTabs.tabBlocks);
        setBlockName(Constants.ModID + "_" + name);
        setHardness(3.0F);
        GameRegistry.registerBlock(this, name);

    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random rnd, int p_149650_3_) {
        return Items.beef; // will return this upon breaking ore
    }
}
