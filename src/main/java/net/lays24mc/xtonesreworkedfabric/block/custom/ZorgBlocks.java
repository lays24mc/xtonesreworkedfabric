package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZorgBlocks {

    public static final Block ZorgBlock = registerBlock("zorg_block_0", new XBlock());
    public static final Block ZorgBlock1 = registerBlock("zorg_block_1", new XBlock());
    public static final Block ZorgBlock2 = registerBlock("zorg_block_2", new XBlock());
    public static final Block ZorgBlock3 = registerBlock("zorg_block_3", new XBlock());
    public static final Block ZorgBlock4 = registerBlock("zorg_block_4", new XBlock());
    public static final Block ZorgBlock5 = registerBlock("zorg_block_5", new XBlock());
    public static final Block ZorgBlock6 = registerBlock("zorg_block_6", new XBlock());
    public static final Block ZorgBlock7 = registerBlock("zorg_block_7", new XBlock());
    public static final Block ZorgBlock8 = registerBlock("zorg_block_8", new XBlock());
    public static final Block ZorgBlock9 = registerBlock("zorg_block_9", new XBlock());
    public static final Block ZorgBlock10 = registerBlock("zorg_block_10", new XBlock());
    public static final Block ZorgBlock11 = registerBlock("zorg_block_11", new XBlock());
    public static final Block ZorgBlock12 = registerBlock("zorg_block_12", new XBlock());
    public static final Block ZorgBlock13 = registerBlock("zorg_block_13", new XBlock());
    public static final Block ZorgBlock14 = registerBlock("zorg_block_14", new XBlock());
    public static final Block ZorgBlock15 = registerBlock("zorg_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering ZorgBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
