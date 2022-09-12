package net.thephantompig791.ricecakes;

import net.fabricmc.api.ModInitializer;
import net.thephantompig791.ricecakes.blocks.ModBlocks;
import net.thephantompig791.ricecakes.items.ModItems;
import net.thephantompig791.ricecakes.painting.ModPaintings;
import net.thephantompig791.ricecakes.util.ModLootTablesModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ricecakes implements ModInitializer {
	public static final String MOD_ID = "ricecakes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("\"You're not funny, Chris.\" -Dylan, 2022");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModPaintings.registerPaintings();
		ModLootTablesModifiers.modifyLootTables();
	}
}