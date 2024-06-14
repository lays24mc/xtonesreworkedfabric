package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MystBlocks {

    public static final Block MystBlock = registerBlock("myst_block_0", new XBlock());
    public static final Block MystBlock1 = registerBlock("myst_block_1", new XBlock());
    public static final Block MystBlock2 = registerBlock("myst_block_2", new XBlock());
    public static final Block MystBlock3 = registerBlock("myst_block_3", new XBlock());
    public static final Block MystBlock4 = registerBlock("myst_block_4", new XBlock());
    public static final Block MystBlock5 = registerBlock("myst_block_5", new XBlock());
    public static final Block MystBlock6 = registerBlock("myst_block_6", new XBlock());
    public static final Block MystBlock7 = registerBlock("myst_block_7", new XBlock());
    public static final Block MystBlock8 = registerBlock("myst_block_8", new XBlock());
    public static final Block MystBlock9 = registerBlock("myst_block_9", new XBlock());
    public static final Block MystBlock10 = registerBlock("myst_block_10", new XBlock());
    public static final Block MystBlock11 = registerBlock("myst_block_11", new XBlock());
    public static final Block MystBlock12 = registerBlock("myst_block_12", new XBlock());
    public static final Block MystBlock13 = registerBlock("myst_block_13", new XBlock());
    public static final Block MystBlock14 = registerBlock("myst_block_14", new XBlock());
    public static final Block MystBlock15 = registerBlock("myst_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering MystBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
