package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZoeaBlocks {

    public static final Block ZoeaBlock = registerBlock("zoea_block_0", new XBlock());
    public static final Block ZoeaBlock1 = registerBlock("zoea_block_1", new XBlock());
    public static final Block ZoeaBlock2 = registerBlock("zoea_block_2", new XBlock());
    public static final Block ZoeaBlock3 = registerBlock("zoea_block_3", new XBlock());
    public static final Block ZoeaBlock4 = registerBlock("zoea_block_4", new XBlock());
    public static final Block ZoeaBlock5 = registerBlock("zoea_block_5", new XBlock());
    public static final Block ZoeaBlock6 = registerBlock("zoea_block_6", new XBlock());
    public static final Block ZoeaBlock7 = registerBlock("zoea_block_7", new XBlock());
    public static final Block ZoeaBlock8 = registerBlock("zoea_block_8", new XBlock());
    public static final Block ZoeaBlock9 = registerBlock("zoea_block_9", new XBlock());
    public static final Block ZoeaBlock10 = registerBlock("zoea_block_10", new XBlock());
    public static final Block ZoeaBlock11 = registerBlock("zoea_block_11", new XBlock());
    public static final Block ZoeaBlock12 = registerBlock("zoea_block_12", new XBlock());
    public static final Block ZoeaBlock13 = registerBlock("zoea_block_13", new XBlock());
    public static final Block ZoeaBlock14 = registerBlock("zoea_block_14", new XBlock());
    public static final Block ZoeaBlock15 = registerBlock("zoea_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering ZoeaBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
