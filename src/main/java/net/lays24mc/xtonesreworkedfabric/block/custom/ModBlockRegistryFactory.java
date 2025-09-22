package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlockRegistryFactory {

	public static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name), block);
    }

	private static void registerBlockItem(String name, Block block){
		Registry.register(Registries.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID,name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name)))));
    }

//	private static RegistryKey<Block> keyOfBlock(String name) {
//		return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name));
//	}
//
//	private static RegistryKey<Item> keyOfItem(String name) {
//		return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(XtonesReworkedFabric.MOD_ID, name));
//	}

    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering Blocks for " + XtonesReworkedFabric.MOD_ID);

    }

}