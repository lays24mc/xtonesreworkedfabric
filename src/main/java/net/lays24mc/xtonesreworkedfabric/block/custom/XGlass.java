package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.TransparentBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class XGlass extends TransparentBlock {

    public XGlass(String name){
        super(
                AbstractBlock.Settings.create()
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(XtonesReworkedFabric.MOD_ID, name)))
                        .strength(0.3f)
                        .requiresTool()
                        .sounds(BlockSoundGroup.GLASS)
                        .nonOpaque()
        );
    }
}
