package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class LairBlocks {

    public static final Block LairBlock = registerBlock("lair_block_0", new XBlock());
    public static final Block LairBlock1 = registerBlock("lair_block_1", new XBlock());
    public static final Block LairBlock2 = registerBlock("lair_block_2", new XBlock());
    public static final Block LairBlock3 = registerBlock("lair_block_3", new XBlock());
    public static final Block LairBlock4 = registerBlock("lair_block_4", new XBlock());
    public static final Block LairBlock5 = registerBlock("lair_block_5", new XBlock());
    public static final Block LairBlock6 = registerBlock("lair_block_6", new XBlock());
    public static final Block LairBlock7 = registerBlock("lair_block_7", new XBlock());
    public static final Block LairBlock8 = registerBlock("lair_block_8", new XBlock());
    public static final Block LairBlock9 = registerBlock("lair_block_9", new XBlock());
    public static final Block LairBlock10 = registerBlock("lair_block_10", new XBlock());
    public static final Block LairBlock11 = registerBlock("lair_block_11", new XBlock());
    public static final Block LairBlock12 = registerBlock("lair_block_12", new XBlock());
    public static final Block LairBlock13 = registerBlock("lair_block_13", new XBlock());
    public static final Block LairBlock14 = registerBlock("lair_block_14", new XBlock());
    public static final Block LairBlock15 = registerBlock("lair_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering LairBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
