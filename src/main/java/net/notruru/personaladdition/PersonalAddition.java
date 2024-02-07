package net.notruru.personaladdition;

import net.fabricmc.api.ModInitializer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonalAddition implements ModInitializer {
	public static final String MOD_ID = "personaladdition";
	public static final Logger LOGGER = LoggerFactory.getLogger("personaladdition");

	@Override
	public void onInitialize() {


		LOGGER.info("Starting a new project!");
	}
}