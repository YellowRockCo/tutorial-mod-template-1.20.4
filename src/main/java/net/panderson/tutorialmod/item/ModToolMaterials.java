package net.panderson.tutorialmod.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    Rose_Gold(2, 300, 6.0f, 2.0f, 22,
            () -> Ingredient.ofItems(ModItems.Rose_Gold)),
    Prismatic_Metal(4, 2031, 9.0f, 4.0f, 22,
            () -> Ingredient.ofItems(ModItems.PRISMATIC_METAL));

    private final int mininglevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngrediant;

    ModToolMaterials(int mininglevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngrediant) {
        this.mininglevel = mininglevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngrediant = repairIngrediant;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.mininglevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngrediant.get();
    }
}
