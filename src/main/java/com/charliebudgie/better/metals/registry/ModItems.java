package com.charliebudgie.better.metals.registry;

import com.charliebudgie.better.metals.BetterMetals;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item TIN = new Item(new Item.Settings().group(BetterMetals.ITEMGROUP));
    public static final Item RAW_TIN = new Item(new Item.Settings().group(BetterMetals.ITEMGROUP));
    public static final BlockItem TIN_BLOCK = new BlockItem(ModBlocks.TIN_BLOCK, new Item.Settings().group(BetterMetals.ITEMGROUP));
    public static final BlockItem TIN_ORE = new BlockItem(ModBlocks.TIN_ORE, new Item.Settings().group(BetterMetals.ITEMGROUP));

    public static final Item BRONZE = new Item(new Item.Settings().group(BetterMetals.ITEMGROUP));
    public static ToolItem BRONZE_SWORD = new SwordItem(
            BronzeToolMaterial.INSTANCE,
            4,
            -1.6f,
            new Item.Settings().group(ItemGroup.COMBAT)
    );

    public static void registerItems() {
//        Registry.register(Registry.ITEM, new Identifier(BetterMetals.MODID, "tin"), TIN);
//
//        Registry.register(Registry.ITEM, new Identifier(BetterMetals.MODID, "tin_block"), TIN_BLOCK);
//        Registry.register(Registry.ITEM, new Identifier(BetterMetals.MODID, "tin_ore"), TIN_ORE);
        Register.register(Registry.ITEM, "tin", TIN);
        Register.register(Registry.ITEM, "raw_tin", RAW_TIN);
        Register.register(Registry.ITEM, "tin_block", TIN_BLOCK);
        Register.register(Registry.ITEM, "tin_ore", TIN_ORE);
        Register.register(Registry.ITEM, "bronze", BRONZE);
        Register.register(Registry.ITEM, "bronze_sword", BRONZE_SWORD);
    }
}
