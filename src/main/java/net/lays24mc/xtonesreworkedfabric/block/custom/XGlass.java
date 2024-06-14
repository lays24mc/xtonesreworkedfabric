package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.TransparentBlock;
import net.minecraft.sound.BlockSoundGroup;

public class XGlass extends TransparentBlock {

    public XGlass(){
        super(
                AbstractBlock.Settings.create().strength(0.3f).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()
                );
    }
}
