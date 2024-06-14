package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class IszmBlocks {

    public static final Block IszmBlock = registerBlock("iszm_block_0", new XBlock());
    public static final Block IszmBlock1 = registerBlock("iszm_block_1", new XBlock());
    public static final Block IszmBlock2 = registerBlock("iszm_block_2", new XBlock());
    public static final Block IszmBlock3 = registerBlock("iszm_block_3", new XBlock());
    public static final Block IszmBlock4 = registerBlock("iszm_block_4", new XBlock());
    public static final Block IszmBlock5 = registerBlock("iszm_block_5", new XBlock());
    public static final Block IszmBlock6 = registerBlock("iszm_block_6", new XBlock());
    public static final Block IszmBlock7 = registerBlock("iszm_block_7", new XBlock());
    public static final Block IszmBlock8 = registerBlock("iszm_block_8", new XBlock());
    public static final Block IszmBlock9 = registerBlock("iszm_block_9", new XBlock());
    public static final Block IszmBlock10 = registerBlock("iszm_block_10", new XBlock());
    public static final Block IszmBlock11 = registerBlock("iszm_block_11", new XBlock());
    public static final Block IszmBlock12 = registerBlock("iszm_block_12", new XBlock());
    public static final Block IszmBlock13 = registerBlock("iszm_block_13", new XBlock());
    public static final Block IszmBlock14 = registerBlock("iszm_block_14", new XBlock());
    public static final Block IszmBlock15 = registerBlock("iszm_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering IszmBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
