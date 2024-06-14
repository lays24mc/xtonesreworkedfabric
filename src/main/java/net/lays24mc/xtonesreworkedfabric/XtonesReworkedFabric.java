package net.lays24mc.xtonesreworkedfabric;

import net.fabricmc.api.ModInitializer;

import net.lays24mc.xtonesreworkedfabric.block.ModBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.*;
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
		BittBlocks.registerModBlocks();
		CrayBlocks.registerModBlocks();
		FortBlocks.registerModBlocks();
		GlaxxBlocks.registerModBlocks();
		IszmBlocks.registerModBlocks();
		JeltBlocks.registerModBlocks();
		KorpBlocks.registerModBlocks();
		KrypBlocks.registerModBlocks();
		LairBlocks.registerModBlocks();
		LaveBlocks.registerModBlocks();
		MintBlocks.registerModBlocks();
		MystBlocks.registerModBlocks();
		RedsBlocks.registerModBlocks();
		ReedBlocks.registerModBlocks();
		RoenBlocks.registerModBlocks();
		SolsBlocks.registerModBlocks();
		SyncBlocks.registerModBlocks();
		TankBlocks.registerModBlocks();
		VectBlocks.registerModBlocks();
		VenaBlocks.registerModBlocks();
		ZaneBlocks.registerModBlocks();
		ZechBlocks.registerModBlocks();
		ZestBlocks.registerModBlocks();
		ZetaBlocks.registerModBlocks();
		ZionBlocks.registerModBlocks();
		ZkulBlocks.registerModBlocks();
		ZoeaBlocks.registerModBlocks();
		ZomeBlocks.registerModBlocks();
		ZoneBlocks.registerModBlocks();
		ZorgBlocks.registerModBlocks();
		ZtylBlocks.registerModBlocks();
		ZythBlocks.registerModBlocks();

	}
}