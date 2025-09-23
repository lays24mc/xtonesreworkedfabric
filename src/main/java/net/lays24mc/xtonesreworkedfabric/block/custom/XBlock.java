package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class XBlock extends Block {

    public XBlock(String name){
        super(
                AbstractBlock.Settings.create()
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name)))
                        .strength(6f, 6.0f)
                        .requiresTool()
        );
    }
}
