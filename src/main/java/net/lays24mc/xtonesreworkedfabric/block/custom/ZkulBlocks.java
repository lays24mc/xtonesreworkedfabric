package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZkulBlocks {

    public static final Block ZkulBlock = registerBlock("zkul_block_0", new XBlock());
    public static final Block ZkulBlock1 = registerBlock("zkul_block_1", new XBlock());
    public static final Block ZkulBlock2 = registerBlock("zkul_block_2", new XBlock());
    public static final Block ZkulBlock3 = registerBlock("zkul_block_3", new XBlock());
    public static final Block ZkulBlock4 = registerBlock("zkul_block_4", new XBlock());
    public static final Block ZkulBlock5 = registerBlock("zkul_block_5", new XBlock());
    public static final Block ZkulBlock6 = registerBlock("zkul_block_6", new XBlock());
    public static final Block ZkulBlock7 = registerBlock("zkul_block_7", new XBlock());
    public static final Block ZkulBlock8 = registerBlock("zkul_block_8", new XBlock());
    public static final Block ZkulBlock9 = registerBlock("zkul_block_9", new XBlock());
    public static final Block ZkulBlock10 = registerBlock("zkul_block_10", new XBlock());
    public static final Block ZkulBlock11 = registerBlock("zkul_block_11", new XBlock());
    public static final Block ZkulBlock12 = registerBlock("zkul_block_12", new XBlock());
    public static final Block ZkulBlock13 = registerBlock("zkul_block_13", new XBlock());
    public static final Block ZkulBlock14 = registerBlock("zkul_block_14", new XBlock());
    public static final Block ZkulBlock15 = registerBlock("zkul_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering ZkulBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
