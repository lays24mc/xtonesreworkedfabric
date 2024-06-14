package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SyncBlocks {

    public static final Block SyncBlock = registerBlock("sync_block_0", new XBlock());
    public static final Block SyncBlock1 = registerBlock("sync_block_1", new XBlock());
    public static final Block SyncBlock2 = registerBlock("sync_block_2", new XBlock());
    public static final Block SyncBlock3 = registerBlock("sync_block_3", new XBlock());
    public static final Block SyncBlock4 = registerBlock("sync_block_4", new XBlock());
    public static final Block SyncBlock5 = registerBlock("sync_block_5", new XBlock());
    public static final Block SyncBlock6 = registerBlock("sync_block_6", new XBlock());
    public static final Block SyncBlock7 = registerBlock("sync_block_7", new XBlock());
    public static final Block SyncBlock8 = registerBlock("sync_block_8", new XBlock());
    public static final Block SyncBlock9 = registerBlock("sync_block_9", new XBlock());
    public static final Block SyncBlock10 = registerBlock("sync_block_10", new XBlock());
    public static final Block SyncBlock11 = registerBlock("sync_block_11", new XBlock());
    public static final Block SyncBlock12 = registerBlock("sync_block_12", new XBlock());
    public static final Block SyncBlock13 = registerBlock("sync_block_13", new XBlock());
    public static final Block SyncBlock14 = registerBlock("sync_block_14", new XBlock());
    public static final Block SyncBlock15 = registerBlock("sync_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering SyncBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
