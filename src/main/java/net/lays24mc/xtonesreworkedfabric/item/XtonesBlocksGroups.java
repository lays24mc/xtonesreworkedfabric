package net.lays24mc.xtonesreworkedfabric.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lays24mc.xtonesreworkedfabric.XtonesReworkedFabric;
import net.lays24mc.xtonesreworkedfabric.block.ModBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.AgonBlocks;
import net.lays24mc.xtonesreworkedfabric.block.custom.AzurBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class XtonesBlocksGroups {

    public static final ItemGroup xtonesreworkedfabric_group = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(XtonesReworkedFabric.MOD_ID, "xtonestab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.xtonesreworkedfabric"))
                    .icon(() -> new ItemStack(ModBlocks.XTBlock)).entries((displayContext, entries) -> {
                        /*Entries in creative tab*/
                        // items
//                        entries.add(ModItems.RUBY);

                        // blocks

                        entries.add(ModBlocks.XTBlock);

                        entries.add(AgonBlocks.AgonBlock);
                        entries.add(AgonBlocks.AgonBlock1);
                        entries.add(AgonBlocks.AgonBlock2);
                        entries.add(AgonBlocks.AgonBlock3);
                        entries.add(AgonBlocks.AgonBlock4);
                        entries.add(AgonBlocks.AgonBlock5);
                        entries.add(AgonBlocks.AgonBlock6);
                        entries.add(AgonBlocks.AgonBlock7);
                        entries.add(AgonBlocks.AgonBlock8);
                        entries.add(AgonBlocks.AgonBlock9);
                        entries.add(AgonBlocks.AgonBlock10);
                        entries.add(AgonBlocks.AgonBlock11);
                        entries.add(AgonBlocks.AgonBlock12);
                        entries.add(AgonBlocks.AgonBlock13);
                        entries.add(AgonBlocks.AgonBlock14);
                        entries.add(AgonBlocks.AgonBlock15);

                        entries.add(AzurBlocks.AzurBlock);
                        entries.add(AzurBlocks.AzurBlock1);
                        entries.add(AzurBlocks.AzurBlock2);
                        entries.add(AzurBlocks.AzurBlock3);
                        entries.add(AzurBlocks.AzurBlock4);
                        entries.add(AzurBlocks.AzurBlock5);
                        entries.add(AzurBlocks.AzurBlock6);
                        entries.add(AzurBlocks.AzurBlock7);
                        entries.add(AzurBlocks.AzurBlock8);
                        entries.add(AzurBlocks.AzurBlock9);
                        entries.add(AzurBlocks.AzurBlock10);
                        entries.add(AzurBlocks.AzurBlock11);
                        entries.add(AzurBlocks.AzurBlock12);
                        entries.add(AzurBlocks.AzurBlock13);
                        entries.add(AzurBlocks.AzurBlock14);
                        entries.add(AzurBlocks.AzurBlock15);

                    }).build());
    
    public static void registerItemGroup(){
        XtonesReworkedFabric.LOGGER.info("Registering item group for " + XtonesReworkedFabric.MOD_ID);
    }
}
