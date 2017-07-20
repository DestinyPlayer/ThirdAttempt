package com.example.examplemod;


import com.example.examplemod.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

/**
 * Created by DestinyPlayer on 20.07.2017.
 */
public class Config {
    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_BLOCKS  = "blocks";

//Parameters
    public static Boolean shouldIBoop = false;

    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
            initBlockConfig(cfg);
        } catch (Exception e1) {
            ExampleMod.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General Configuration");
        shouldIBoop = cfg.getBoolean("boop",CATEGORY_GENERAL,shouldIBoop,"Set this to true if you want to get booped");
    }
    private static void initBlockConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_BLOCKS,"Block Configuration");
    }
}
