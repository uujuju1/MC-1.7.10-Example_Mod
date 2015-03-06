package com.keller23.mc.Example1710;


import com.keller23.mc.Example1710.blocks.ModBlocks;
import com.keller23.mc.Example1710.gui.GuiHandler;
import com.keller23.mc.Example1710.items.ModItems;
import com.keller23.mc.Example1710.creativetabs.CTabs;
import com.keller23.mc.Example1710.lib.Constants;
import com.keller23.mc.Example1710.proxy.CommonProxy;
import com.keller23.mc.Example1710.worldgen.TestWorldGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Constants.ModID, name = Constants.ModName, version = Constants.Version)
public class Example1710 {

    @Mod.Instance(Constants.ModID)
    public static Example1710 instance;

    @SidedProxy(clientSide = Constants.CLIENT_PROXY, serverSide = Constants.COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler // blocks, items, worldgen
    public void preInit(FMLPreInitializationEvent event){
        ModBlocks.init();
        ModItems.init();
        CTabs.init();
        GameRegistry.registerWorldGenerator(new TestWorldGen(), 10); // higher number, lower in the priority list
    }

    @Mod.EventHandler // events, tile entities
    public void init(FMLInitializationEvent event){
        proxy.registerTileEntities();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    }

    @Mod.EventHandler // addons to other mods
    public void postInit(FMLPostInitializationEvent event){
        //
    }
}
