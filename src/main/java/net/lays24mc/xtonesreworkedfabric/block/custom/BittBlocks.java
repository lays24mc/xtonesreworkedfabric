package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BittBlocks {

    public static final Block BittBlock = registerBlock("bitt_block_0", new XBlock());
    public static final Block BittBlock1 = registerBlock("bitt_block_1", new XBlock());
    public static final Block BittBlock2 = registerBlock("bitt_block_2", new XBlock());
    public static final Block BittBlock3 = registerBlock("bitt_block_3", new XBlock());
    public static final Block BittBlock4 = registerBlock("bitt_block_4", new XBlock());
    public static final Block BittBlock5 = registerBlock("bitt_block_5", new XBlock());
    public static final Block BittBlock6 = registerBlock("bitt_block_6", new XBlock());
    public static final Block BittBlock7 = registerBlock("bitt_block_7", new XBlock());
    public static final Block BittBlock8 = registerBlock("bitt_block_8", new XBlock());
    public static final Block BittBlock9 = registerBlock("bitt_block_9", new XBlock());
    public static final Block BittBlock10 = registerBlock("bitt_block_10", new XBlock());
    public static final Block BittBlock11 = registerBlock("bitt_block_11", new XBlock());
    public static final Block BittBlock12 = registerBlock("bitt_block_12", new XBlock());
    public static final Block BittBlock13 = registerBlock("bitt_block_13", new XBlock());
    public static final Block BittBlock14 = registerBlock("bitt_block_14", new XBlock());
    public static final Block BittBlock15 = registerBlock("bitt_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering BittBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
