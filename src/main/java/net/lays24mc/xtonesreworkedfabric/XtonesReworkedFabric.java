package net.lays24mc.xtonesreworkedfabric;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.lays24mc.xtonesreworkedfabric.block.ModBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.AgonBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.AzurBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.BittBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.CrayBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.FortBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.GlaxxBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.IszmBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.JeltBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.KorpBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.KrypBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.LairBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.LaveBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.MintBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.MystBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.RedsBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.ReedBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.RoenBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.SolsBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.SyncBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.TankBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.VectBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.VenaBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.ZaneBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.ZechBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.ZestBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.ZetaBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.ZionBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.ZkulBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.ZoeaBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.ZomeBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.ZoneBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.ZorgBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.ZtylBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.ZythBlocks;
import net.lays24mc.xtonesreworkedfabric.item.XtonesBlocksGroups;

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