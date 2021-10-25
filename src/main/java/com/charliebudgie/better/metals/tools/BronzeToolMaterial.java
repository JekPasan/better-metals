package com.charliebudgie.better.metals.tools;

import com.charliebudgie.better.metals.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BronzeToolMaterial implements ToolMaterial {
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
        return 2f;
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
