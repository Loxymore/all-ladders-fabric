package net.loxymore.all_ladders;

import net.fabricmc.api.ModInitializer;

import net.loxymore.all_ladders.block.ModBlocks;
import net.loxymore.all_ladders.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllLadders implements ModInitializer {
	public static final String MOD_ID = "all-ladders";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}