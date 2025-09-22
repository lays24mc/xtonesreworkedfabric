package net.lays24mc.xtonesreworkedfabric.block;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.lays24mc.xtonesreworkedfabric.block.custom.FlatLamp;
import net.lays24mc.xtonesreworkedfabric.block.custom.ModBlockRegistryFactory;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {

    /*Add blocks*/

    public static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID,  name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name)))));
//        RegistryKey<Item> itemKey = keyOfItem(name);
//        BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
//        Registry.register(Registries.ITEM, itemKey, blockItem);
    }

//    private static RegistryKey<Block> keyOfBlock(String name) {
//        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name));
//    }
//
//    private static RegistryKey<Item> keyOfItem(String name) {
//        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name));
//    }

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering Blocks for " + XtonesReworkedFabric.MOD_ID);

    }
    public static final Block XTBlock = registerBlock("xtone_tile",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID,"xtone_tile")))
                    .strength(6f)
                    .requiresTool()));

  //  public static final FlatLamp FLAT_LAMP = registerFlatlampBlock("flat_lamp", new FlatLamp(AbstractBlock.Settings.create().strength(2f).requiresTool()));
}
