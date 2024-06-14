package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

public class XBlock extends Block {
    public XBlock(){
        super(
                AbstractBlock.Settings.create().strength(1.5f, 6.0f).requiresTool()
        );
    }
}
