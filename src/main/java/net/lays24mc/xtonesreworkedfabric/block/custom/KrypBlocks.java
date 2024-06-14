package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class KrypBlocks {

    public static final Block KrypBlock = registerBlock("kryp_block_0", new XBlock());
    public static final Block KrypBlock1 = registerBlock("kryp_block_1", new XBlock());
    public static final Block KrypBlock2 = registerBlock("kryp_block_2", new XBlock());
    public static final Block KrypBlock3 = registerBlock("kryp_block_3", new XBlock());
    public static final Block KrypBlock4 = registerBlock("kryp_block_4", new XBlock());
    public static final Block KrypBlock5 = registerBlock("kryp_block_5", new XBlock());
    public static final Block KrypBlock6 = registerBlock("kryp_block_6", new XBlock());
    public static final Block KrypBlock7 = registerBlock("kryp_block_7", new XBlock());
    public static final Block KrypBlock8 = registerBlock("kryp_block_8", new XBlock());
    public static final Block KrypBlock9 = registerBlock("kryp_block_9", new XBlock());
    public static final Block KrypBlock10 = registerBlock("kryp_block_10", new XBlock());
    public static final Block KrypBlock11 = registerBlock("kryp_block_11", new XBlock());
    public static final Block KrypBlock12 = registerBlock("kryp_block_12", new XBlock());
    public static final Block KrypBlock13 = registerBlock("kryp_block_13", new XBlock());
    public static final Block KrypBlock14 = registerBlock("kryp_block_14", new XBlock());
    public static final Block KrypBlock15 = registerBlock("kryp_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering KrypBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
