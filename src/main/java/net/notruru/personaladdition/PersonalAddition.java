package net.notruru.personaladdition;

import net.fabricmc.api.ModInitializer;

import net.notruru.personaladdition.block.ModBlocks;
import net.notruru.personaladdition.item.ModItemGroups;
import net.notruru.personaladdition.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonalAddition implements ModInitializer {
	public static final String MOD_ID = "personaladdition";
	public static final Logger LOGGER = LoggerFactory.getLogger("personaladdition");

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


		LOGGER.info("Hello Fabric world!");
	}
}