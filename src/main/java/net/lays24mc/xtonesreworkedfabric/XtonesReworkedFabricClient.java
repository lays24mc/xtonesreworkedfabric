package net.lays24mc.xtonesreworkedfabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.lays24mc.xtonesreworkedfabric.block.custom.GlaxxBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.XGlass;
import net.minecraft.client.render.RenderLayer;

public class XtonesReworkedFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        /*Make GlaxxBlocks "transparent"*/
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock1, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock2, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock3, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock4, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock5, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock6, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock7, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock8, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock9, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock10, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock11, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock12, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock13, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock14, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlaxxBlocks.GlaxxBlock15, RenderLayer.getTranslucent());

    }
}
