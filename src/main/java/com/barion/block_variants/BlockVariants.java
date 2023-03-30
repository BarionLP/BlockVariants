package com.barion.block_variants;

import com.ametrinstudios.ametrin.data.provider.CustomLootTableProvider;
import com.barion.block_variants.data.provider.*;
import com.barion.block_variants.data.provider.loot_table.BVBlockLootSubProvider;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(BlockVariants.ModID)
public class BlockVariants{
    public static final String ModID = "block_variants";
    public static final Logger Logger = LogUtils.getLogger();

    public BlockVariants() {
        var modBus = FMLJavaModLoadingContext.get().getModEventBus();

        BVBlocks.BLOCK_REGISTER.register(modBus);
        BVBlocks.ITEM_REGISTER.register(modBus);
        modBus.addListener(BlockVariants::buildCreativeModeTabs);
        modBus.addListener(BlockVariants::gatherData);
    }

    private static void buildCreativeModeTabs(CreativeModeTabEvent.BuildContents event){
        if(event.getTab() != CreativeModeTabs.BUILDING_BLOCKS) { return; }
        BVBlocks.BLOCK_REGISTER.getEntries().forEach((o)-> event.accept(o.get()));
    }

    private static void gatherData(GatherDataEvent event){
        var generator = event.getGenerator();
        var output = generator.getPackOutput();
        var existingFileHelper = event.getExistingFileHelper();
        var lookup = event.getLookupProvider();

        var runClient = event.includeClient();
        var runServer = event.includeServer();

        generator.addProvider(runServer, new BVBlockStateProvider(output, existingFileHelper));
        generator.addProvider(runServer, new BVItemModelProvider(output, existingFileHelper));
        BVBlockTagsProvider blockTags = new BVBlockTagsProvider(output, lookup, existingFileHelper);
        generator.addProvider(runServer, blockTags);
        generator.addProvider(runServer, new BVItemTagsProvider(output, lookup, blockTags.contentsGetter(), existingFileHelper));
        generator.addProvider(runServer, new BVRecipeProvider(output));
        var lootTableProvider = CustomLootTableProvider.Builder().AddBlockProvider(BVBlockLootSubProvider::new).Build(output);
        generator.addProvider(runServer, lootTableProvider);
    }
}