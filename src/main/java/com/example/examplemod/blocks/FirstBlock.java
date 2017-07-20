package com.example.examplemod.blocks;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by DestinyPlayer on 20.07.2017.
 */
public class FirstBlock extends Block {
    public FirstBlock() {
        super(Material.ROCK);
        setUnlocalizedName(ExampleMod.MODID + ".firstblock");     // Used for localization (en_US.lang)
        setRegistryName("firstblock");        // The unique name (within your mod) that identifies this block
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }
}
