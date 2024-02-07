package net.notruru.personaladdition.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.notruru.personaladdition.PersonalAddition;
import net.notruru.personaladdition.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup Personal_Addition = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PersonalAddition.MOD_ID,"ideas" ),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ideas"))
                    .icon(() -> new ItemStack(ModItems.Cooked_Egg)).entries((displayContext, entries) -> {
                        entries.add(ModItems.Diamond_Nugget);
                        entries.add(ModItems.Copper_Nugget);

                        entries.add(ModItems.Cooked_Egg);
                        entries.add(ModItems.Honeyed_Apple);
                        entries.add(ModItems.Toasted_Bread);
                        entries.add(ModItems.Apple_pie);

                        entries.add(ModBlocks.Paper_Block);
                    }).build());

    public static void registerItemGroups() {
        PersonalAddition.LOGGER.info("Registering Item Group for " + PersonalAddition.MOD_ID);
    }
}
