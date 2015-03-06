package com.keller23.mc.Example1710.proxy;

import com.keller23.mc.Example1710.tileentities.TileEntitySmasher;
import cpw.mods.fml.common.registry.GameRegistry;


public class CommonProxy {

    public void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntitySmasher.class,TileEntitySmasher.name);
    }
}
