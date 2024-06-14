package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class VenaBlocks {

    public static final Block VenaBlock = registerBlock("vena_block_0", new XBlock());
    public static final Block VenaBlock1 = registerBlock("vena_block_1", new XBlock());
    public static final Block VenaBlock2 = registerBlock("vena_block_2", new XBlock());
    public static final Block VenaBlock3 = registerBlock("vena_block_3", new XBlock());
    public static final Block VenaBlock4 = registerBlock("vena_block_4", new XBlock());
    public static final Block VenaBlock5 = registerBlock("vena_block_5", new XBlock());
    public static final Block VenaBlock6 = registerBlock("vena_block_6", new XBlock());
    public static final Block VenaBlock7 = registerBlock("vena_block_7", new XBlock());
    public static final Block VenaBlock8 = registerBlock("vena_block_8", new XBlock());
    public static final Block VenaBlock9 = registerBlock("vena_block_9", new XBlock());
    public static final Block VenaBlock10 = registerBlock("vena_block_10", new XBlock());
    public static final Block VenaBlock11 = registerBlock("vena_block_11", new XBlock());
    public static final Block VenaBlock12 = registerBlock("vena_block_12", new XBlock());
    public static final Block VenaBlock13 = registerBlock("vena_block_13", new XBlock());
    public static final Block VenaBlock14 = registerBlock("vena_block_14", new XBlock());
    public static final Block VenaBlock15 = registerBlock("vena_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering VenaBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
