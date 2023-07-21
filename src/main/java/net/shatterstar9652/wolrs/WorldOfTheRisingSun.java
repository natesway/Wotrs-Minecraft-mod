package net.shatterstar9652.wolrs;

import net.fabricmc.api.ModInitializer;

import net.shatterstar9652.wolrs.block.ModBlocks;
import net.shatterstar9652.wolrs.item.ModItemGroups;
import net.shatterstar9652.wolrs.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorldOfTheRisingSun implements ModInitializer {
	public static final String MOD_ID =  "world-of-the-rising-sun";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}