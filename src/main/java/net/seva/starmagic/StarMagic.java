package net.seva.starmagic;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StarMagic implements ModInitializer {
	public static final String MOD_ID = "starmagic";
	public static final Logger LOGGER = LoggerFactory.getLogger("starmagic");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}