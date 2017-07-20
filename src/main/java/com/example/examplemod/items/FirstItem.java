package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by DestinyPlayer on 20.07.2017.
 */
public class FirstItem extends Item {
    public FirstItem() {
        setRegistryName("firstItem");
        setUnlocalizedName(ExampleMod.MODID + ".firstitem");
        GameRegistry.register(this);
    }
}
