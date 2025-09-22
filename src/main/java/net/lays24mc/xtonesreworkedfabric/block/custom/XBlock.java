package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class XBlock extends Block {
    public XBlock(){
        super(
                AbstractBlock.Settings.create()
                        .strength(1.5f, 6.0f)
                        .requiresTool()
        );
    }
}
