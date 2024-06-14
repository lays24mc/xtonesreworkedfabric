package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class KorpBlocks {

    public static final Block KorpBlock = registerBlock("korp_block_0", new XBlock());
    public static final Block KorpBlock1 = registerBlock("korp_block_1", new XBlock());
    public static final Block KorpBlock2 = registerBlock("korp_block_2", new XBlock());
    public static final Block KorpBlock3 = registerBlock("korp_block_3", new XBlock());
    public static final Block KorpBlock4 = registerBlock("korp_block_4", new XBlock());
    public static final Block KorpBlock5 = registerBlock("korp_block_5", new XBlock());
    public static final Block KorpBlock6 = registerBlock("korp_block_6", new XBlock());
    public static final Block KorpBlock7 = registerBlock("korp_block_7", new XBlock());
    public static final Block KorpBlock8 = registerBlock("korp_block_8", new XBlock());
    public static final Block KorpBlock9 = registerBlock("korp_block_9", new XBlock());
    public static final Block KorpBlock10 = registerBlock("korp_block_10", new XBlock());
    public static final Block KorpBlock11 = registerBlock("korp_block_11", new XBlock());
    public static final Block KorpBlock12 = registerBlock("korp_block_12", new XBlock());
    public static final Block KorpBlock13 = registerBlock("korp_block_13", new XBlock());
    public static final Block KorpBlock14 = registerBlock("korp_block_14", new XBlock());
    public static final Block KorpBlock15 = registerBlock("korp_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering KorpBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
