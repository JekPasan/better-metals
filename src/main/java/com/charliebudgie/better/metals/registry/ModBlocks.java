package com.charliebudgie.better.metals.registry;

import com.charliebudgie.better.metals.BetterMetals;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block TIN_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3f, 20f)
            .sounds(BlockSoundGroup.METAL));

    public static final Block TIN_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3f, 20f)
            .sounds(BlockSoundGroup.STONE));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(BetterMetals.MODID, "tin_block"), TIN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(BetterMetals.MODID, "tin_ore"), TIN_ORE);
    }
}
