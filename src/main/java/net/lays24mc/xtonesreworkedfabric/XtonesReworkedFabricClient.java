package net.lays24mc.xtonesreworkedfabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.lays24mc.xtonesreworkedfabric.block.ModBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.GlaxxBlocks;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.RenderLayer;

public class XtonesReworkedFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        /*Make GlaxxBlocks "transparent"*/
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock1, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock2, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock3, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock4, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock5, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock6, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock7, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock8, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock9, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock10, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock11, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock12, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock13, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock14, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(GlaxxBlocks.GlaxxBlock15, BlockRenderLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(ModBlocks.FLAT_LAMP, BlockRenderLayer.CUTOUT);

    }
}
