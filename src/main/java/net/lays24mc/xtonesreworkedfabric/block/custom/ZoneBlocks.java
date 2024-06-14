package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZoneBlocks {

    public static final Block ZoneBlock = registerBlock("zone_block_0", new XBlock());
    public static final Block ZoneBlock1 = registerBlock("zone_block_1", new XBlock());
    public static final Block ZoneBlock2 = registerBlock("zone_block_2", new XBlock());
    public static final Block ZoneBlock3 = registerBlock("zone_block_3", new XBlock());
    public static final Block ZoneBlock4 = registerBlock("zone_block_4", new XBlock());
    public static final Block ZoneBlock5 = registerBlock("zone_block_5", new XBlock());
    public static final Block ZoneBlock6 = registerBlock("zone_block_6", new XBlock());
    public static final Block ZoneBlock7 = registerBlock("zone_block_7", new XBlock());
    public static final Block ZoneBlock8 = registerBlock("zone_block_8", new XBlock());
    public static final Block ZoneBlock9 = registerBlock("zone_block_9", new XBlock());
    public static final Block ZoneBlock10 = registerBlock("zone_block_10", new XBlock());
    public static final Block ZoneBlock11 = registerBlock("zone_block_11", new XBlock());
    public static final Block ZoneBlock12 = registerBlock("zone_block_12", new XBlock());
    public static final Block ZoneBlock13 = registerBlock("zone_block_13", new XBlock());
    public static final Block ZoneBlock14 = registerBlock("zone_block_14", new XBlock());
    public static final Block ZoneBlock15 = registerBlock("zone_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering ZoneBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
