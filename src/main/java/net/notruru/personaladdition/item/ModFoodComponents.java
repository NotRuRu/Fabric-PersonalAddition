package net.notruru.personaladdition.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent Cooked_Egg = new FoodComponent.Builder().hunger(4).saturationModifier(0.16f).build();
    public static final FoodComponent Honeyed_Apple = new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build();
    public static final FoodComponent Toasted_Bread = new FoodComponent.Builder().hunger(5).saturationModifier(0.69f).build();
    public static final FoodComponent Apple_pie = new FoodComponent.Builder().hunger(10).saturationModifier(0.5f).build();
}
