package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class LaveBlocks {

    public static final Block LaveBlock = registerBlock("lave_block_0", new XBlock());
    public static final Block LaveBlock1 = registerBlock("lave_block_1", new XBlock());
    public static final Block LaveBlock2 = registerBlock("lave_block_2", new XBlock());
    public static final Block LaveBlock3 = registerBlock("lave_block_3", new XBlock());
    public static final Block LaveBlock4 = registerBlock("lave_block_4", new XBlock());
    public static final Block LaveBlock5 = registerBlock("lave_block_5", new XBlock());
    public static final Block LaveBlock6 = registerBlock("lave_block_6", new XBlock());
    public static final Block LaveBlock7 = registerBlock("lave_block_7", new XBlock());
    public static final Block LaveBlock8 = registerBlock("lave_block_8", new XBlock());
    public static final Block LaveBlock9 = registerBlock("lave_block_9", new XBlock());
    public static final Block LaveBlock10 = registerBlock("lave_block_10", new XBlock());
    public static final Block LaveBlock11 = registerBlock("lave_block_11", new XBlock());
    public static final Block LaveBlock12 = registerBlock("lave_block_12", new XBlock());
    public static final Block LaveBlock13 = registerBlock("lave_block_13", new XBlock());
    public static final Block LaveBlock14 = registerBlock("lave_block_14", new XBlock());
    public static final Block LaveBlock15 = registerBlock("lave_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering LaveBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
