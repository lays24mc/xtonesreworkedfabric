package net.lays24mc.xtonesreworkedfabric.block;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.lays24mc.xtonesreworkedfabric.block.custom.FlatLamp;
import net.lays24mc.xtonesreworkedfabric.block.custom.ModBlockRegistryFactory;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks extends ModBlockRegistryFactory {

    /*Add blocks*/
    public static void registerModBlocks(){
        XtonesReworkedFabric.LOGGER.info("Registering Blocks for " + XtonesReworkedFabric.MOD_ID);

    }

    public static final FlatLamp FLAT_LAMP = registerFlatlampBlock("flat_lamp",
            new FlatLamp(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID,"flat_lamp")))
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()));

    public static final Block XTBlock = registerBlock("xtone_tile",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID,"xtone_tile")))
                    .strength(6f)
                    .requiresTool()));

}
