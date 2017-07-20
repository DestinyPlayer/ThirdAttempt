package com.example.examplemod.proxy;

import com.example.examplemod.Config;
import com.example.examplemod.ModBlocks;
import com.example.examplemod.ModItems;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

/**
 * Created by DestinyPlayer on 20.07.2017.
 */
public class CommonProxy {
    public static Configuration config;
    public void preInit(FMLPreInitializationEvent e) {
    //Config
        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "exampleMod.cfg"));
        Config.readConfig();

     //Blocks
        ModBlocks.init();
        ModItems.init();
    }
    public void init(FMLInitializationEvent e) {

    }
    public void postInit(FMLPostInitializationEvent e) {
    //Config
        if(config.hasChanged()) {
            config.save();
        }
    }
}