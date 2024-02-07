package net.notruru.personaladdition.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.notruru.personaladdition.PersonalAddition;

public class ModItems {
    public static final Item Cooked_Egg = registerItem("cooked_egg",
            new Item(new FabricItemSettings().food(ModFoodComponents.Cooked_Egg)));
    public static final Item Honeyed_Apple = registerItem("honeyed_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.Honeyed_Apple)));
    public static final Item Toasted_Bread = registerItem("toasted_bread",
            new Item(new FabricItemSettings().food(ModFoodComponents.Toasted_Bread)));
    public static final Item Apple_pie = registerItem("apple_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.Apple_pie)));
    public static final Item Diamond_Nugget = registerItem("diamond_nugget",
            new Item(new FabricItemSettings()));
    public static final Item Copper_Nugget = registerItem("copper_nugget",
            new Item(new FabricItemSettings()));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PersonalAddition.MOD_ID,name), item);
    }

    public static void registerModItems() {
        PersonalAddition.LOGGER.info("Registering Mod Items for" + PersonalAddition.MOD_ID);

    }
}
