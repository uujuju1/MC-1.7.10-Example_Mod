package com.keller23.mc17.ExampleMod.proxy;

import com.keller23.mc17.ExampleMod.tileentities.TileEntitySmasher;
import cpw.mods.fml.common.registry.GameRegistry;


public class CommonProxy {

    public void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntitySmasher.class,TileEntitySmasher.name);
    }
}
