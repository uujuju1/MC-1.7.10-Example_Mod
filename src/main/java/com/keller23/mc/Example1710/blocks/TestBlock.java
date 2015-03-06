package com.keller23.mc.Example1710.blocks;

import com.keller23.mc.Example1710.creativetabs.CTabs;
import com.keller23.mc.Example1710.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class TestBlock extends Block {

    private String name = "testBlock";

    private IIcon[] icons = new IIcon[6];

    public TestBlock(){
        super(Material.rock);
        setBlockName(Constants.ModID + "_" + name); // ModID_BlockName
        setCreativeTab(CTabs.tabBlocks);
        GameRegistry.registerBlock(this, name);
        //setBlockTextureName(Constants.ModID + ":" + name); // not used so we can have diff texts per side
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        for (int i = 0; i < icons.length; i++) {
            icons[i] = iconRegister.registerIcon(Constants.ModID + ":" + name + i);
        }
    }

    @Override // allows us to set side sensitive textures
    public IIcon getIcon(int side, int meta) {
        return icons[side];
    }
}
