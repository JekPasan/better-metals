package com.charliebudgie.better.metals;

import com.charliebudgie.better.metals.registry.ModBlocks;
import com.charliebudgie.better.metals.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.impl.biome.modification.BiomeSelectionContextImpl;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class BetterMetals implements ModInitializer {
    public static final String MODID = "btr";

    public static final ItemGroup ITEMGROUP = FabricItemGroupBuilder.create(
            new Identifier(MODID, "general")).icon(() -> new ItemStack(ModItems.TIN))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModItems.TIN));
                stacks.add(new ItemStack(ModItems.RAW_TIN));
                stacks.add(new ItemStack(ModBlocks.TIN_BLOCK));
                stacks.add(new ItemStack(ModBlocks.TIN_ORE));
                stacks.add(new ItemStack(ModItems.BRONZE));
            })
            .build();

    private static ConfiguredFeature<?, ?> TIN_ORE_GENERATION = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.TIN_ORE.getDefaultState(),
                    6
            ))
            .range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(27), YOffset.fixed(64))))
            .spreadHorizontally()
            .repeat(10);

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();

        RegistryKey<ConfiguredFeature<?, ?>> tinOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MODID, "tin_ore_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, tinOreOverworld.getValue(), TIN_ORE_GENERATION);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, tinOreOverworld);
    }
}
