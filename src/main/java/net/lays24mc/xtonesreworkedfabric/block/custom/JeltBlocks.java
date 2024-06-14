package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class JeltBlocks {

    public static final Block JeltBlock = registerBlock("jelt_block_0", new XBlock());
    public static final Block JeltBlock1 = registerBlock("jelt_block_1", new XBlock());
    public static final Block JeltBlock2 = registerBlock("jelt_block_2", new XBlock());
    public static final Block JeltBlock3 = registerBlock("jelt_block_3", new XBlock());
    public static final Block JeltBlock4 = registerBlock("jelt_block_4", new XBlock());
    public static final Block JeltBlock5 = registerBlock("jelt_block_5", new XBlock());
    public static final Block JeltBlock6 = registerBlock("jelt_block_6", new XBlock());
    public static final Block JeltBlock7 = registerBlock("jelt_block_7", new XBlock());
    public static final Block JeltBlock8 = registerBlock("jelt_block_8", new XBlock());
    public static final Block JeltBlock9 = registerBlock("jelt_block_9", new XBlock());
    public static final Block JeltBlock10 = registerBlock("jelt_block_10", new XBlock());
    public static final Block JeltBlock11 = registerBlock("jelt_block_11", new XBlock());
    public static final Block JeltBlock12 = registerBlock("jelt_block_12", new XBlock());
    public static final Block JeltBlock13 = registerBlock("jelt_block_13", new XBlock());
    public static final Block JeltBlock14 = registerBlock("jelt_block_14", new XBlock());
    public static final Block JeltBlock15 = registerBlock("jelt_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering JeltBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
