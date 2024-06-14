package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GlaxxBlocks{

    public static final Block GlaxxBlock = registerBlock("glaxx_block_0", new XGlass());
    public static final Block GlaxxBlock1 = registerBlock("glaxx_block_1", new XGlass());
    public static final Block GlaxxBlock2 = registerBlock("glaxx_block_2", new XGlass());
    public static final Block GlaxxBlock3 = registerBlock("glaxx_block_3", new XGlass());
    public static final Block GlaxxBlock4 = registerBlock("glaxx_block_4", new XGlass());
    public static final Block GlaxxBlock5 = registerBlock("glaxx_block_5", new XGlass());
    public static final Block GlaxxBlock6 = registerBlock("glaxx_block_6", new XGlass());
    public static final Block GlaxxBlock7 = registerBlock("glaxx_block_7", new XGlass());
    public static final Block GlaxxBlock8 = registerBlock("glaxx_block_8", new XGlass());
    public static final Block GlaxxBlock9 = registerBlock("glaxx_block_9", new XGlass());
    public static final Block GlaxxBlock10 = registerBlock("glaxx_block_10", new XGlass());
    public static final Block GlaxxBlock11 = registerBlock("glaxx_block_11", new XGlass());
    public static final Block GlaxxBlock12 = registerBlock("glaxx_block_12", new XGlass());
    public static final Block GlaxxBlock13 = registerBlock("glaxx_block_13", new XGlass());
    public static final Block GlaxxBlock14 = registerBlock("glaxx_block_14", new XGlass());
    public static final Block GlaxxBlock15 = registerBlock("glaxx_block_15", new XGlass());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering GlaxxBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
