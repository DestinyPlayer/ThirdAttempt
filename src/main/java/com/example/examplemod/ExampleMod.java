package com.example.examplemod;

import com.example.examplemod.proxy.ClientProxy;
import com.example.examplemod.proxy.CommonProxy;
import com.example.examplemod.proxy.ServerProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Pre Initialization
        System.out.println("ExampleMod - Pre initialization Started");
        CommonProxy.preInit(event);
        ServerProxy.preInit(event);
        ClientProxy.preInit(event);
        System.out.println("Pre initialization complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Initialization
        System.out.println("ExampleMod - Initialization Started");
        CommonProxy.init(event);
        ServerProxy.init(event);
        ClientProxy.init(event);
        System.out.println("Initialization complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //Post Initialization
        System.out.println("ExampleMod - Post initialization Started");
        CommonProxy.postInit(event);
        ServerProxy.postInit(event);
        ClientProxy.postInit(event);
        System.out.println("Post initialization complete");
    }
}
