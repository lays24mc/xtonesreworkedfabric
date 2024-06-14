package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TankBlocks {

    public static final Block TankBlock = registerBlock("tank_block_0", new XBlock());
    public static final Block TankBlock1 = registerBlock("tank_block_1", new XBlock());
    public static final Block TankBlock2 = registerBlock("tank_block_2", new XBlock());
    public static final Block TankBlock3 = registerBlock("tank_block_3", new XBlock());
    public static final Block TankBlock4 = registerBlock("tank_block_4", new XBlock());
    public static final Block TankBlock5 = registerBlock("tank_block_5", new XBlock());
    public static final Block TankBlock6 = registerBlock("tank_block_6", new XBlock());
    public static final Block TankBlock7 = registerBlock("tank_block_7", new XBlock());
    public static final Block TankBlock8 = registerBlock("tank_block_8", new XBlock());
    public static final Block TankBlock9 = registerBlock("tank_block_9", new XBlock());
    public static final Block TankBlock10 = registerBlock("tank_block_10", new XBlock());
    public static final Block TankBlock11 = registerBlock("tank_block_11", new XBlock());
    public static final Block TankBlock12 = registerBlock("tank_block_12", new XBlock());
    public static final Block TankBlock13 = registerBlock("tank_block_13", new XBlock());
    public static final Block TankBlock14 = registerBlock("tank_block_14", new XBlock());
    public static final Block TankBlock15 = registerBlock("tank_block_15", new XBlock());

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering TankBlocks for " + XtonesReworkedFabric.MOD_ID);

    }
}
