package com.example.examplemod.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by DestinyPlayer on 20.07.2017.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        System.out.println("ExampleMod - Initializing models");
        //Models and such
    }

}