package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZetaBlocks {

    public static final Block ZetaBlock = registerBlock("zeta_block_0", new XBlock());
    public static final Block ZetaBlock1 = registerBlock("zeta_block_1", new XBlock());
    public static final Block ZetaBlock2 = registerBlock("zeta_block_2", new XBlock());
    public static final Block ZetaBlock3 = registerBlock("zeta_block_3", new XBlock());
    public static final Block ZetaBlock4 = registerBlock("zeta_block_4", new XBlock());
    public static final Block ZetaBlock5 = registerBlock("zeta_block_5", new XBlock());
    public static final Block ZetaBlock6 = registerBlock("zeta_block_6", new XBlock());
    public static final Block ZetaBlock7 = registerBlock("zeta_block_7", new XBlock());
    public static final Block ZetaBlock8 = registerBlock("zeta_block_8", new XBlock());
    public static final Block ZetaBlock9 = registerBlock("zeta_block_9", new XBlock());
    public static final Block ZetaBlock10 = registerBlock("zeta_block_10", new XBlock());
    public static final Block ZetaBlock11 = registerBlock("zeta_block_11", new XBlock());
    public static final Block ZetaBlock12 = registerBlock("zeta_block_12", new XBlock());
    public static final Block ZetaBlock13 = registerBlock("zeta_block_13", new XBlock());
    public static final Block ZetaBlock14 = registerBlock("zeta_block_14", new XBlock());
    public static final Block ZetaBlock15 = registerBlock("zeta_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering ZetaBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
