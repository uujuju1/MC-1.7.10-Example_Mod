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

public class SteakOre extends Block {

    public static String name = "steakOre";

    public SteakOre(){
        super(Material.rock);
        setCreativeTab(CTabs.tabBlocks);
        setBlockName(Constants.ModID + "_" + name);
        GameRegistry.registerBlock(this, name);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random rnd, int p_149650_3_) {
        return Items.cooked_beef; // will return steak upon breaking ore
    }
}
