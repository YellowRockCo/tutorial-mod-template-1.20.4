package net.panderson.tutorialmod.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent Chocolate_Bar = new FoodComponent.Builder().hunger(4).saturationModifier(.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200), 0.50f).snack().build();
}
