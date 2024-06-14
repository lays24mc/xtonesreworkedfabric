package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AzurBlocks {

    public static final Block AzurBlock = registerBlock("azur_block_0", new XBlock());
    public static final Block AzurBlock1 = registerBlock("azur_block_1", new XBlock());
    public static final Block AzurBlock2 = registerBlock("azur_block_2", new XBlock());
    public static final Block AzurBlock3 = registerBlock("azur_block_3", new XBlock());
    public static final Block AzurBlock4 = registerBlock("azur_block_4", new XBlock());
    public static final Block AzurBlock5 = registerBlock("azur_block_5", new XBlock());
    public static final Block AzurBlock6 = registerBlock("azur_block_6", new XBlock());
    public static final Block AzurBlock7 = registerBlock("azur_block_7", new XBlock());
    public static final Block AzurBlock8 = registerBlock("azur_block_8", new XBlock());
    public static final Block AzurBlock9 = registerBlock("azur_block_9", new XBlock());
    public static final Block AzurBlock10 = registerBlock("azur_block_10", new XBlock());
    public static final Block AzurBlock11 = registerBlock("azur_block_11", new XBlock());
    public static final Block AzurBlock12 = registerBlock("azur_block_12", new XBlock());
    public static final Block AzurBlock13 = registerBlock("azur_block_13", new XBlock());
    public static final Block AzurBlock14 = registerBlock("azur_block_14", new XBlock());
    public static final Block AzurBlock15 = registerBlock("azur_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering AzurBlocks for " + XtonesReworkedFabric.MOD_ID);

    }

}
