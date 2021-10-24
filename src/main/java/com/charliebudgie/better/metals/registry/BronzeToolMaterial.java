package com.charliebudgie.better.metals.registry;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BronzeToolMaterial implements ToolMaterial {
    public static final BronzeToolMaterial INSTANCE = new BronzeToolMaterial();

    @Override
    public int getDurability() {
        return 190;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6f;
    }

    @Override
    public float getAttackDamage() {
        return 3f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.BRONZE);
    }
}
