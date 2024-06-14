package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class VectBlocks {

    public static final Block VectBlock = registerBlock("vect_block_0", new XBlock());
    public static final Block VectBlock1 = registerBlock("vect_block_1", new XBlock());
    public static final Block VectBlock2 = registerBlock("vect_block_2", new XBlock());
    public static final Block VectBlock3 = registerBlock("vect_block_3", new XBlock());
    public static final Block VectBlock4 = registerBlock("vect_block_4", new XBlock());
    public static final Block VectBlock5 = registerBlock("vect_block_5", new XBlock());
    public static final Block VectBlock6 = registerBlock("vect_block_6", new XBlock());
    public static final Block VectBlock7 = registerBlock("vect_block_7", new XBlock());
    public static final Block VectBlock8 = registerBlock("vect_block_8", new XBlock());
    public static final Block VectBlock9 = registerBlock("vect_block_9", new XBlock());
    public static final Block VectBlock10 = registerBlock("vect_block_10", new XBlock());
    public static final Block VectBlock11 = registerBlock("vect_block_11", new XBlock());
    public static final Block VectBlock12 = registerBlock("vect_block_12", new XBlock());
    public static final Block VectBlock13 = registerBlock("vect_block_13", new XBlock());
    public static final Block VectBlock14 = registerBlock("vect_block_14", new XBlock());
    public static final Block VectBlock15 = registerBlock("vect_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering VectBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
