package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CrayBlocks {

    public static final Block CrayBlock = registerBlock("cray_block_0", new XBlock());
    public static final Block CrayBlock1 = registerBlock("cray_block_1", new XBlock());
    public static final Block CrayBlock2 = registerBlock("cray_block_2", new XBlock());
    public static final Block CrayBlock3 = registerBlock("cray_block_3", new XBlock());
    public static final Block CrayBlock4 = registerBlock("cray_block_4", new XBlock());
    public static final Block CrayBlock5 = registerBlock("cray_block_5", new XBlock());
    public static final Block CrayBlock6 = registerBlock("cray_block_6", new XBlock());
    public static final Block CrayBlock7 = registerBlock("cray_block_7", new XBlock());
    public static final Block CrayBlock8 = registerBlock("cray_block_8", new XBlock());
    public static final Block CrayBlock9 = registerBlock("cray_block_9", new XBlock());
    public static final Block CrayBlock10 = registerBlock("cray_block_10", new XBlock());
    public static final Block CrayBlock11 = registerBlock("cray_block_11", new XBlock());
    public static final Block CrayBlock12 = registerBlock("cray_block_12", new XBlock());
    public static final Block CrayBlock13 = registerBlock("cray_block_13", new XBlock());
    public static final Block CrayBlock14 = registerBlock("cray_block_14", new XBlock());
    public static final Block CrayBlock15 = registerBlock("cray_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering CrayBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
