package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZechBlocks {

    public static final Block ZechBlock = registerBlock("zech_block_0", new XBlock());
    public static final Block ZechBlock1 = registerBlock("zech_block_1", new XBlock());
    public static final Block ZechBlock2 = registerBlock("zech_block_2", new XBlock());
    public static final Block ZechBlock3 = registerBlock("zech_block_3", new XBlock());
    public static final Block ZechBlock4 = registerBlock("zech_block_4", new XBlock());
    public static final Block ZechBlock5 = registerBlock("zech_block_5", new XBlock());
    public static final Block ZechBlock6 = registerBlock("zech_block_6", new XBlock());
    public static final Block ZechBlock7 = registerBlock("zech_block_7", new XBlock());
    public static final Block ZechBlock8 = registerBlock("zech_block_8", new XBlock());
    public static final Block ZechBlock9 = registerBlock("zech_block_9", new XBlock());
    public static final Block ZechBlock10 = registerBlock("zech_block_10", new XBlock());
    public static final Block ZechBlock11 = registerBlock("zech_block_11", new XBlock());
    public static final Block ZechBlock12 = registerBlock("zech_block_12", new XBlock());
    public static final Block ZechBlock13 = registerBlock("zech_block_13", new XBlock());
    public static final Block ZechBlock14 = registerBlock("zech_block_14", new XBlock());
    public static final Block ZechBlock15 = registerBlock("zech_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering ZechBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
