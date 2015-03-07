package com.keller23.mc17.ExampleMod;


import com.keller23.mc17.ExampleMod.blocks.ModBlocks;
import com.keller23.mc17.ExampleMod.gui.GuiHandler;
import com.keller23.mc17.ExampleMod.items.ModItems;
import com.keller23.mc17.ExampleMod.creativetabs.CTabs;
import com.keller23.mc17.ExampleMod.lib.Constants;
import com.keller23.mc17.ExampleMod.proxy.CommonProxy;
import com.keller23.mc17.ExampleMod.worldgen.TestWorldGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = Constants.ModID, name = Constants.ModName, version = Constants.Version)
public class ExampleMod {

    @Mod.Instance(Constants.ModID)
    public static ExampleMod instance;

    @SidedProxy(clientSide = Constants.CLIENT_PROXY, serverSide = Constants.COMMON_PROXY)
    public static CommonProxy proxy;

    public static CreativeTabs tabBlocks;

    @Mod.EventHandler // blocks, items, worldgen
    public void preInit(FMLPreInitializationEvent event){
        CTabs.init();
        ModBlocks.init();
        ModItems.init();
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
