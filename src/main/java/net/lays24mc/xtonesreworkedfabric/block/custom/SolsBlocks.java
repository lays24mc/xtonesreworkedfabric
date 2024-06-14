package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SolsBlocks {

    public static final Block SolsBlock = registerBlock("sols_block_0", new XBlock());
    public static final Block SolsBlock1 = registerBlock("sols_block_1", new XBlock());
    public static final Block SolsBlock2 = registerBlock("sols_block_2", new XBlock());
    public static final Block SolsBlock3 = registerBlock("sols_block_3", new XBlock());
    public static final Block SolsBlock4 = registerBlock("sols_block_4", new XBlock());
    public static final Block SolsBlock5 = registerBlock("sols_block_5", new XBlock());
    public static final Block SolsBlock6 = registerBlock("sols_block_6", new XBlock());
    public static final Block SolsBlock7 = registerBlock("sols_block_7", new XBlock());
    public static final Block SolsBlock8 = registerBlock("sols_block_8", new XBlock());
    public static final Block SolsBlock9 = registerBlock("sols_block_9", new XBlock());
    public static final Block SolsBlock10 = registerBlock("sols_block_10", new XBlock());
    public static final Block SolsBlock11 = registerBlock("sols_block_11", new XBlock());
    public static final Block SolsBlock12 = registerBlock("sols_block_12", new XBlock());
    public static final Block SolsBlock13 = registerBlock("sols_block_13", new XBlock());
    public static final Block SolsBlock14 = registerBlock("sols_block_14", new XBlock());
    public static final Block SolsBlock15 = registerBlock("sols_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering SolsBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
