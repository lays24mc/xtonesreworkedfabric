package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZythBlocks {

    public static final Block ZythBlock = registerBlock("zyth_block_0", new XBlock());
    public static final Block ZythBlock1 = registerBlock("zyth_block_1", new XBlock());
    public static final Block ZythBlock2 = registerBlock("zyth_block_2", new XBlock());
    public static final Block ZythBlock3 = registerBlock("zyth_block_3", new XBlock());
    public static final Block ZythBlock4 = registerBlock("zyth_block_4", new XBlock());
    public static final Block ZythBlock5 = registerBlock("zyth_block_5", new XBlock());
    public static final Block ZythBlock6 = registerBlock("zyth_block_6", new XBlock());
    public static final Block ZythBlock7 = registerBlock("zyth_block_7", new XBlock());
    public static final Block ZythBlock8 = registerBlock("zyth_block_8", new XBlock());
    public static final Block ZythBlock9 = registerBlock("zyth_block_9", new XBlock());
    public static final Block ZythBlock10 = registerBlock("zyth_block_10", new XBlock());
    public static final Block ZythBlock11 = registerBlock("zyth_block_11", new XBlock());
    public static final Block ZythBlock12 = registerBlock("zyth_block_12", new XBlock());
    public static final Block ZythBlock13 = registerBlock("zyth_block_13", new XBlock());
    public static final Block ZythBlock14 = registerBlock("zyth_block_14", new XBlock());
    public static final Block ZythBlock15 = registerBlock("zyth_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering ZythBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
