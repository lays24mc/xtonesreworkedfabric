package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZtylBlocks {

    public static final Block ZtylBlock = registerBlock("ztyl_block_0", new XBlock());
    public static final Block ZtylBlock1 = registerBlock("ztyl_block_1", new XBlock());
    public static final Block ZtylBlock2 = registerBlock("ztyl_block_2", new XBlock());
    public static final Block ZtylBlock3 = registerBlock("ztyl_block_3", new XBlock());
    public static final Block ZtylBlock4 = registerBlock("ztyl_block_4", new XBlock());
    public static final Block ZtylBlock5 = registerBlock("ztyl_block_5", new XBlock());
    public static final Block ZtylBlock6 = registerBlock("ztyl_block_6", new XBlock());
    public static final Block ZtylBlock7 = registerBlock("ztyl_block_7", new XBlock());
    public static final Block ZtylBlock8 = registerBlock("ztyl_block_8", new XBlock());
    public static final Block ZtylBlock9 = registerBlock("ztyl_block_9", new XBlock());
    public static final Block ZtylBlock10 = registerBlock("ztyl_block_10", new XBlock());
    public static final Block ZtylBlock11 = registerBlock("ztyl_block_11", new XBlock());
    public static final Block ZtylBlock12 = registerBlock("ztyl_block_12", new XBlock());
    public static final Block ZtylBlock13 = registerBlock("ztyl_block_13", new XBlock());
    public static final Block ZtylBlock14 = registerBlock("ztyl_block_14", new XBlock());
    public static final Block ZtylBlock15 = registerBlock("ztyl_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering ZtylBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
