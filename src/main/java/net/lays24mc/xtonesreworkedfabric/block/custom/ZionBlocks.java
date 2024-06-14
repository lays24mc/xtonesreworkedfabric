package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZionBlocks {

    public static final Block ZionBlock = registerBlock("zion_block_0", new XBlock());
    public static final Block ZionBlock1 = registerBlock("zion_block_1", new XBlock());
    public static final Block ZionBlock2 = registerBlock("zion_block_2", new XBlock());
    public static final Block ZionBlock3 = registerBlock("zion_block_3", new XBlock());
    public static final Block ZionBlock4 = registerBlock("zion_block_4", new XBlock());
    public static final Block ZionBlock5 = registerBlock("zion_block_5", new XBlock());
    public static final Block ZionBlock6 = registerBlock("zion_block_6", new XBlock());
    public static final Block ZionBlock7 = registerBlock("zion_block_7", new XBlock());
    public static final Block ZionBlock8 = registerBlock("zion_block_8", new XBlock());
    public static final Block ZionBlock9 = registerBlock("zion_block_9", new XBlock());
    public static final Block ZionBlock10 = registerBlock("zion_block_10", new XBlock());
    public static final Block ZionBlock11 = registerBlock("zion_block_11", new XBlock());
    public static final Block ZionBlock12 = registerBlock("zion_block_12", new XBlock());
    public static final Block ZionBlock13 = registerBlock("zion_block_13", new XBlock());
    public static final Block ZionBlock14 = registerBlock("zion_block_14", new XBlock());
    public static final Block ZionBlock15 = registerBlock("zion_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering ZionBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
