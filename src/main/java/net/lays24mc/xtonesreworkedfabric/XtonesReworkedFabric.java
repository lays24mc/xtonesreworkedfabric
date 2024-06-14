package net.lays24mc.xtonesreworkedfabric;

import net.fabricmc.api.ModInitializer;

import net.lays24mc.xtonesreworkedfabric.block.ModBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.AgonBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.AzurBlocks;
import net.lays24mc.xtonesreworkedfabric.item.ModItems;
import net.lays24mc.xtonesreworkedfabric.item.XtonesBlocksGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XtonesReworkedFabric implements ModInitializer {

	public static final String MOD_ID = "xtonesreworkedfabric";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		XtonesBlocksGroups.registerItemGroup();

//		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		AgonBlocks.registerModBlocks();
		AzurBlocks.registerModBlocks();
	}
}