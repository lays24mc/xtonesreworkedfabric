package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZomeBlocks {

    public static final Block ZomeBlock = registerBlock("zome_block_0", new XBlock());
    public static final Block ZomeBlock1 = registerBlock("zome_block_1", new XBlock());
    public static final Block ZomeBlock2 = registerBlock("zome_block_2", new XBlock());
    public static final Block ZomeBlock3 = registerBlock("zome_block_3", new XBlock());
    public static final Block ZomeBlock4 = registerBlock("zome_block_4", new XBlock());
    public static final Block ZomeBlock5 = registerBlock("zome_block_5", new XBlock());
    public static final Block ZomeBlock6 = registerBlock("zome_block_6", new XBlock());
    public static final Block ZomeBlock7 = registerBlock("zome_block_7", new XBlock());
    public static final Block ZomeBlock8 = registerBlock("zome_block_8", new XBlock());
    public static final Block ZomeBlock9 = registerBlock("zome_block_9", new XBlock());
    public static final Block ZomeBlock10 = registerBlock("zome_block_10", new XBlock());
    public static final Block ZomeBlock11 = registerBlock("zome_block_11", new XBlock());
    public static final Block ZomeBlock12 = registerBlock("zome_block_12", new XBlock());
    public static final Block ZomeBlock13 = registerBlock("zome_block_13", new XBlock());
    public static final Block ZomeBlock14 = registerBlock("zome_block_14", new XBlock());
    public static final Block ZomeBlock15 = registerBlock("zome_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering ZomeBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
