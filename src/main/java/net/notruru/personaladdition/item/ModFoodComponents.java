package net.notruru.personaladdition.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent Cooked_Egg = new FoodComponent.Builder().hunger(4).saturationModifier(0.23f).build();
    public static final FoodComponent Honeyed_Apple = new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build();
    public static final FoodComponent Toasted_Bread = new FoodComponent.Builder().hunger(6).saturationModifier(0.65f).build();
    public static final FoodComponent Apple_pie = new FoodComponent.Builder().hunger(9).saturationModifier(0.4f).build();
}
