package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZestBlocks {

    public static final Block ZestBlock = registerBlock("zest_block_0", new XBlock());
    public static final Block ZestBlock1 = registerBlock("zest_block_1", new XBlock());
    public static final Block ZestBlock2 = registerBlock("zest_block_2", new XBlock());
    public static final Block ZestBlock3 = registerBlock("zest_block_3", new XBlock());
    public static final Block ZestBlock4 = registerBlock("zest_block_4", new XBlock());
    public static final Block ZestBlock5 = registerBlock("zest_block_5", new XBlock());
    public static final Block ZestBlock6 = registerBlock("zest_block_6", new XBlock());
    public static final Block ZestBlock7 = registerBlock("zest_block_7", new XBlock());
    public static final Block ZestBlock8 = registerBlock("zest_block_8", new XBlock());
    public static final Block ZestBlock9 = registerBlock("zest_block_9", new XBlock());
    public static final Block ZestBlock10 = registerBlock("zest_block_10", new XBlock());
    public static final Block ZestBlock11 = registerBlock("zest_block_11", new XBlock());
    public static final Block ZestBlock12 = registerBlock("zest_block_12", new XBlock());
    public static final Block ZestBlock13 = registerBlock("zest_block_13", new XBlock());
    public static final Block ZestBlock14 = registerBlock("zest_block_14", new XBlock());
    public static final Block ZestBlock15 = registerBlock("zest_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering ZestBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
