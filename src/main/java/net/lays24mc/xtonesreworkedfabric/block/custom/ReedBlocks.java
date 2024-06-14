package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ReedBlocks {

    public static final Block ReedBlock = registerBlock("reed_block_0", new XBlock());
    public static final Block ReedBlock1 = registerBlock("reed_block_1", new XBlock());
    public static final Block ReedBlock2 = registerBlock("reed_block_2", new XBlock());
    public static final Block ReedBlock3 = registerBlock("reed_block_3", new XBlock());
    public static final Block ReedBlock4 = registerBlock("reed_block_4", new XBlock());
    public static final Block ReedBlock5 = registerBlock("reed_block_5", new XBlock());
    public static final Block ReedBlock6 = registerBlock("reed_block_6", new XBlock());
    public static final Block ReedBlock7 = registerBlock("reed_block_7", new XBlock());
    public static final Block ReedBlock8 = registerBlock("reed_block_8", new XBlock());
    public static final Block ReedBlock9 = registerBlock("reed_block_9", new XBlock());
    public static final Block ReedBlock10 = registerBlock("reed_block_10", new XBlock());
    public static final Block ReedBlock11 = registerBlock("reed_block_11", new XBlock());
    public static final Block ReedBlock12 = registerBlock("reed_block_12", new XBlock());
    public static final Block ReedBlock13 = registerBlock("reed_block_13", new XBlock());
    public static final Block ReedBlock14 = registerBlock("reed_block_14", new XBlock());
    public static final Block ReedBlock15 = registerBlock("reed_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering ReedBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
