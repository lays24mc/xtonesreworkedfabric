package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FortBlocks {

    public static final Block FortBlock = registerBlock("fort_block_0", new XBlock());
    public static final Block FortBlock1 = registerBlock("fort_block_1", new XBlock());
    public static final Block FortBlock2 = registerBlock("fort_block_2", new XBlock());
    public static final Block FortBlock3 = registerBlock("fort_block_3", new XBlock());
    public static final Block FortBlock4 = registerBlock("fort_block_4", new XBlock());
    public static final Block FortBlock5 = registerBlock("fort_block_5", new XBlock());
    public static final Block FortBlock6 = registerBlock("fort_block_6", new XBlock());
    public static final Block FortBlock7 = registerBlock("fort_block_7", new XBlock());
    public static final Block FortBlock8 = registerBlock("fort_block_8", new XBlock());
    public static final Block FortBlock9 = registerBlock("fort_block_9", new XBlock());
    public static final Block FortBlock10 = registerBlock("fort_block_10", new XBlock());
    public static final Block FortBlock11 = registerBlock("fort_block_11", new XBlock());
    public static final Block FortBlock12 = registerBlock("fort_block_12", new XBlock());
    public static final Block FortBlock13 = registerBlock("fort_block_13", new XBlock());
    public static final Block FortBlock14 = registerBlock("fort_block_14", new XBlock());
    public static final Block FortBlock15 = registerBlock("fort_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering FortBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
