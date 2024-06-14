package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AgonBlocks {

    public static final Block AgonBlock = registerBlock("agon_block_0", new XBlock());
    public static final Block AgonBlock1 = registerBlock("agon_block_1", new XBlock());
    public static final Block AgonBlock2 = registerBlock("agon_block_2", new XBlock());
    public static final Block AgonBlock3 = registerBlock("agon_block_3", new XBlock());
    public static final Block AgonBlock4 = registerBlock("agon_block_4", new XBlock());
    public static final Block AgonBlock5 = registerBlock("agon_block_5", new XBlock());
    public static final Block AgonBlock6 = registerBlock("agon_block_6", new XBlock());
    public static final Block AgonBlock7 = registerBlock("agon_block_7", new XBlock());
    public static final Block AgonBlock8 = registerBlock("agon_block_8", new XBlock());
    public static final Block AgonBlock9 = registerBlock("agon_block_9", new XBlock());
    public static final Block AgonBlock10 = registerBlock("agon_block_10", new XBlock());
    public static final Block AgonBlock11 = registerBlock("agon_block_11", new XBlock());
    public static final Block AgonBlock12 = registerBlock("agon_block_12", new XBlock());
    public static final Block AgonBlock13 = registerBlock("agon_block_13", new XBlock());
    public static final Block AgonBlock14 = registerBlock("agon_block_14", new XBlock());
    public static final Block AgonBlock15 = registerBlock("agon_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering AgonBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
