package net.notruru.personaladdition.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.notruru.personaladdition.PersonalAddition;

public class ModBlocks {

    public static final Block Paper_Block = registerBlock("paper_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));





    private static void AddBlocksToIngredientTabItemGroup(FabricItemGroupEntries entries) {

        entries.add(Paper_Block);
    }



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PersonalAddition.MOD_ID,name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PersonalAddition.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void  registerModBlocks() {
        PersonalAddition.LOGGER.info("Registering ModBlocks for " + PersonalAddition.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::AddBlocksToIngredientTabItemGroup);
    }
}
