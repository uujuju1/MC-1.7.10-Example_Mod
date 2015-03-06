package com.keller23.mc.Example1710.tileentities;

import net.minecraft.tileentity.TileEntity;

public class TileEntitySmasher extends TileEntity {

    private int tick = 0;
    public static String name = "tileEntitySmasher";

    /*@Override
    public void updateEntity() {
        // this is called every tick
        if(!worldObj.isRemote){
            tick++;
            if (tick == 100) {
                worldObj.setWorldTime(1000);
                tick = 0;
            }
        }
    }*/


}
