package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZaneBlocks {

    public static final Block ZaneBlock = registerBlock("zane_block_0", new XBlock());
    public static final Block ZaneBlock1 = registerBlock("zane_block_1", new XBlock());
    public static final Block ZaneBlock2 = registerBlock("zane_block_2", new XBlock());
    public static final Block ZaneBlock3 = registerBlock("zane_block_3", new XBlock());
    public static final Block ZaneBlock4 = registerBlock("zane_block_4", new XBlock());
    public static final Block ZaneBlock5 = registerBlock("zane_block_5", new XBlock());
    public static final Block ZaneBlock6 = registerBlock("zane_block_6", new XBlock());
    public static final Block ZaneBlock7 = registerBlock("zane_block_7", new XBlock());
    public static final Block ZaneBlock8 = registerBlock("zane_block_8", new XBlock());
    public static final Block ZaneBlock9 = registerBlock("zane_block_9", new XBlock());
    public static final Block ZaneBlock10 = registerBlock("zane_block_10", new XBlock());
    public static final Block ZaneBlock11 = registerBlock("zane_block_11", new XBlock());
    public static final Block ZaneBlock12 = registerBlock("zane_block_12", new XBlock());
    public static final Block ZaneBlock13 = registerBlock("zane_block_13", new XBlock());
    public static final Block ZaneBlock14 = registerBlock("zane_block_14", new XBlock());
    public static final Block ZaneBlock15 = registerBlock("zane_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering ZaneBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
