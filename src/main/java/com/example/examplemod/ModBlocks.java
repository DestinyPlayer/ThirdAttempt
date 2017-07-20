package com.example.examplemod;

import com.example.examplemod.blocks.FirstBlock;

/**
 * Created by DestinyPlayer on 20.07.2017.
 */
public class ModBlocks {
    public static FirstBlock firstBlock;
    public static void init() {
        firstBlock = new FirstBlock();
    }
}
