package com.charliebudgie.better.metals.registry;

import com.charliebudgie.better.metals.BetterMetals;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Register {
    public static void register(Registry registry, String name, Item item) {
        Registry.register(registry, new Identifier(BetterMetals.MODID, name), item);
    }
}
