package net.thephantompig791.ricecakes;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ricecakes implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("ricecakes");

	@Override
	public void onInitialize() {
		LOGGER.info("\"You're not funny, Chris.\" -Dylan, 2022");
	}
}