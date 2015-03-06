package com.keller23.mc17.ExampleMod.blocks;

import com.keller23.mc17.ExampleMod.ExampleMod;
import com.keller23.mc17.ExampleMod.creativetabs.CTabs;
import com.keller23.mc17.ExampleMod.gui.GUIs;
import com.keller23.mc17.ExampleMod.tileentities.TileEntitySmasher;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Smasher extends Block implements ITileEntityProvider {

    public static String name = "smasher";
    private String privateName = name;

    public Smasher(){
        super(Material.rock);
        setBlockName(privateName);
        setCreativeTab(CTabs.tabBlocks);
        GameRegistry.registerBlock(this, privateName);
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntitySmasher();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if(world.isRemote){
            if(world.getTileEntity(x,y,z) != null)
                player.openGui(ExampleMod.instance, GUIs.SMASHER.ordinal(), world, x,y,z);
            return true;
        }
        return true;
    }
}
