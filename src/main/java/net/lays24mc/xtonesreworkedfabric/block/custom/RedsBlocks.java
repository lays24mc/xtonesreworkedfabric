package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RedsBlocks {

    public static final Block RedsBlock = registerBlock("reds_block_0", new XBlock());
    public static final Block RedsBlock1 = registerBlock("reds_block_1", new XBlock());
    public static final Block RedsBlock2 = registerBlock("reds_block_2", new XBlock());
    public static final Block RedsBlock3 = registerBlock("reds_block_3", new XBlock());
    public static final Block RedsBlock4 = registerBlock("reds_block_4", new XBlock());
    public static final Block RedsBlock5 = registerBlock("reds_block_5", new XBlock());
    public static final Block RedsBlock6 = registerBlock("reds_block_6", new XBlock());
    public static final Block RedsBlock7 = registerBlock("reds_block_7", new XBlock());
    public static final Block RedsBlock8 = registerBlock("reds_block_8", new XBlock());
    public static final Block RedsBlock9 = registerBlock("reds_block_9", new XBlock());
    public static final Block RedsBlock10 = registerBlock("reds_block_10", new XBlock());
    public static final Block RedsBlock11 = registerBlock("reds_block_11", new XBlock());
    public static final Block RedsBlock12 = registerBlock("reds_block_12", new XBlock());
    public static final Block RedsBlock13 = registerBlock("reds_block_13", new XBlock());
    public static final Block RedsBlock14 = registerBlock("reds_block_14", new XBlock());
    public static final Block RedsBlock15 = registerBlock("reds_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering RedsBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
