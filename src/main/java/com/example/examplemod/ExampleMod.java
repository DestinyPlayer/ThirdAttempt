package com.example.examplemod;

import com.example.examplemod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/**
 * Created by DestinyPlayer on 20.07.2017.
 */

@Mod(modid = ExampleMod.MODID, name = ExampleMod.MODNAME, version = ExampleMod.VERSION)

public class ExampleMod {
    public static final String MODID   = "examplemod";
    public static final String MODNAME = "Example Mod";
    public static final String VERSION = "0.1";

    @SidedProxy(clientSide = "com.example.examplemod.proxy.ClientProxy",serverSide = "com.example.examplemod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static ExampleMod instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        System.out.println("ExampleMod - PreInitialization started");
        proxy.preInit(event);
        System.out.println("ExampleMod - PreInitialization finished");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        System.out.println("ExampleMod - Initialization started");
        proxy.init(e);
        System.out.println("ExampleMod - Initialization started");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        System.out.println("ExampleMod - PostInitialization started");
        proxy.postInit(e);
        System.out.println("ExampleMod - PostInitialization started");
        if(Config.shouldIBoop)
        {
            System.out.println("ExampleMod - Get booped! *boop*");
        }
    }


}