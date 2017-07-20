package com.example.examplemod;

import com.example.examplemod.items.FirstItem;

/**
 * Created by DestinyPlayer on 20.07.2017.
 */
public class ModItems {
    public static FirstItem firstItem;

    public static void init() {
        firstItem = new FirstItem();
    }
}
