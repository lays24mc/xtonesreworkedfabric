package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RoenBlocks {

    public static final Block RoenBlock = registerBlock("roen_block_0", new XBlock());
    public static final Block RoenBlock1 = registerBlock("roen_block_1", new XBlock());
    public static final Block RoenBlock2 = registerBlock("roen_block_2", new XBlock());
    public static final Block RoenBlock3 = registerBlock("roen_block_3", new XBlock());
    public static final Block RoenBlock4 = registerBlock("roen_block_4", new XBlock());
    public static final Block RoenBlock5 = registerBlock("roen_block_5", new XBlock());
    public static final Block RoenBlock6 = registerBlock("roen_block_6", new XBlock());
    public static final Block RoenBlock7 = registerBlock("roen_block_7", new XBlock());
    public static final Block RoenBlock8 = registerBlock("roen_block_8", new XBlock());
    public static final Block RoenBlock9 = registerBlock("roen_block_9", new XBlock());
    public static final Block RoenBlock10 = registerBlock("roen_block_10", new XBlock());
    public static final Block RoenBlock11 = registerBlock("roen_block_11", new XBlock());
    public static final Block RoenBlock12 = registerBlock("roen_block_12", new XBlock());
    public static final Block RoenBlock13 = registerBlock("roen_block_13", new XBlock());
    public static final Block RoenBlock14 = registerBlock("roen_block_14", new XBlock());
    public static final Block RoenBlock15 = registerBlock("roen_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering RoenBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
