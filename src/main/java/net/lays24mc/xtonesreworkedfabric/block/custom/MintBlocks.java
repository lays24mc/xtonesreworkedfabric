package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MintBlocks {

    public static final Block MintBlock = registerBlock("mint_block_0", new XBlock());
    public static final Block MintBlock1 = registerBlock("mint_block_1", new XBlock());
    public static final Block MintBlock2 = registerBlock("mint_block_2", new XBlock());
    public static final Block MintBlock3 = registerBlock("mint_block_3", new XBlock());
    public static final Block MintBlock4 = registerBlock("mint_block_4", new XBlock());
    public static final Block MintBlock5 = registerBlock("mint_block_5", new XBlock());
    public static final Block MintBlock6 = registerBlock("mint_block_6", new XBlock());
    public static final Block MintBlock7 = registerBlock("mint_block_7", new XBlock());
    public static final Block MintBlock8 = registerBlock("mint_block_8", new XBlock());
    public static final Block MintBlock9 = registerBlock("mint_block_9", new XBlock());
    public static final Block MintBlock10 = registerBlock("mint_block_10", new XBlock());
    public static final Block MintBlock11 = registerBlock("mint_block_11", new XBlock());
    public static final Block MintBlock12 = registerBlock("mint_block_12", new XBlock());
    public static final Block MintBlock13 = registerBlock("mint_block_13", new XBlock());
    public static final Block MintBlock14 = registerBlock("mint_block_14", new XBlock());
    public static final Block MintBlock15 = registerBlock("mint_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering MintBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
