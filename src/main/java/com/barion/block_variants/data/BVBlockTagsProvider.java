package com.barion.block_variants.data;

import com.ametrinstudios.ametrin.datagen.ExtendedBlockTagsProvider;
import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVTags;
import com.barion.block_variants.BlockVariants;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

import static com.ametrinstudios.ametrin.datagen.DataProviderExtensions.isWooden;

public class BVBlockTagsProvider extends ExtendedBlockTagsProvider {
    public BVBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper fileHelper){
        super(output, lookupProvider, BlockVariants.ModID, fileHelper);
    }

    {
        blockTagProviderRules.add((block, name)->{
            if(block instanceof WallBlock && isWooden(name)){
                tag(BVTags.Blocks.WoodenWalls).add(block);
            }
        });
    }

    @Override
    protected void addTags(HolderLookup.Provider holderLookup){
        runRules(BVBlocks.BlockRegistry);

        {tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                BVBlocks.SmoothStoneStairs.get(),
                BVBlocks.CutSandstoneStairs.get(),
                BVBlocks.CutRedSandstoneStairs.get(),
                BVBlocks.QuartzBrickStairs.get(),
                BVBlocks.SmoothStoneStairs.get(),
                BVBlocks.ChiseledQuartzBlockStairs.get(),
                BVBlocks.NetherrackStairs.get(),
                BVBlocks.EndStoneStairs.get(),
                BVBlocks.CrackedPolishedBlackstoneBrickStairs.get(),
                BVBlocks.Basalt_Stairs.get(),
                BVBlocks.Polished_Basalt_Stairs.get(),
                BVBlocks.Terracotta_Stairs.get(),
                BVBlocks.White_Terracotta_Stairs.get(),
                BVBlocks.Orange_Terracotta_Stairs.get(),
                BVBlocks.Magenta_Terracotta_Stairs.get(),
                BVBlocks.Light_Blue_Terracotta_Stairs.get(),
                BVBlocks.Yellow_Terracotta_Stairs.get(),
                BVBlocks.Lime_Terracotta_Stairs.get(),
                BVBlocks.Pink_Terracotta_Stairs.get(),
                BVBlocks.Gray_Terracotta_Stairs.get(),
                BVBlocks.Light_Gray_Terracotta_Stairs.get(),
                BVBlocks.Cyan_Terracotta_Stairs.get(),
                BVBlocks.Purple_Terracotta_Stairs.get(),
                BVBlocks.Blue_Terracotta_Stairs.get(),
                BVBlocks.Brown_Terracotta_Stairs.get(),
                BVBlocks.Green_Terracotta_Stairs.get(),
                BVBlocks.Red_Terracotta_Stairs.get(),
                BVBlocks.Black_Terracotta_Stairs.get(),
                BVBlocks.Dripstone_Block_Stairs.get(),
                BVBlocks.Amethyst_Block_Stairs.get(),
                BVBlocks.Cracked_Stone_Brick_Stairs.get(),

                BVBlocks.QuartzBrickSlab.get(),
                BVBlocks.Chiseled_Quartz_Block_Slab.get(),
                BVBlocks.Netherrack_Slab.get(),
                BVBlocks.End_Stone_Slab.get(),
                BVBlocks.Cracked_Polished_Blackstone_Brick_Slab.get(),
                BVBlocks.Basalt_Slab.get(),
                BVBlocks.Polished_Basalt_Slab.get(),
                BVBlocks.Terracotta_Slab.get(),
                BVBlocks.White_Terracotta_Slab.get(),
                BVBlocks.Orange_Terracotta_Slab.get(),
                BVBlocks.Magenta_Terracotta_Slab.get(),
                BVBlocks.Light_Blue_Terracotta_Slab.get(),
                BVBlocks.Yellow_Terracotta_Slab.get(),
                BVBlocks.Lime_Terracotta_Slab.get(),
                BVBlocks.Pink_Terracotta_Slab.get(),
                BVBlocks.Gray_Terracotta_Slab.get(),
                BVBlocks.Light_Gray_Terracotta_Slab.get(),
                BVBlocks.Cyan_Terracotta_Slab.get(),
                BVBlocks.Purple_Terracotta_Slab.get(),
                BVBlocks.Blue_Terracotta_Slab.get(),
                BVBlocks.Brown_Terracotta_Slab.get(),
                BVBlocks.Green_Terracotta_Slab.get(),
                BVBlocks.Red_Terracotta_Slab.get(),
                BVBlocks.Black_Terracotta_Slab.get(),
                BVBlocks.Dripstone_Block_Slab.get(),
                BVBlocks.Amethyst_Block_Slab.get(),
                BVBlocks.Cracked_Stone_Brick_Slab.get(),

                BVBlocks.PolishedDioriteWall.get(),
                BVBlocks.PolishedGraniteWall.get(),
                BVBlocks.PolishedAndesiteWall.get(),
                BVBlocks.StoneWall.get(),
                BVBlocks.SmoothStoneWall.get(),
                BVBlocks.CutSandstoneWall.get(),
                BVBlocks.CutRedSandstoneWall.get(),
                BVBlocks.QuartzWall.get(),
                BVBlocks.QuartzBrickWall.get(),
                BVBlocks.SmoothQuartzWall.get(),
                BVBlocks.Chiseled_Quartz_Block_Wall.get(),
                BVBlocks.Prismarine_Brick_Wall.get(),
                BVBlocks.Dark_Prismarine_Wall.get(),
                BVBlocks.Netherrack_Wall.get(),
                BVBlocks.End_Stone_Wall.get(),
                BVBlocks.Purpur_Wall.get(),
                BVBlocks.Cracked_Polished_Blackstone_Brick_Wall.get(),
                BVBlocks.Basalt_Wall.get(),
                BVBlocks.Polished_Basalt_Wall.get(),
                BVBlocks.Terracotta_Wall.get(),
                BVBlocks.White_Terracotta_Wall.get(),
                BVBlocks.Orange_Terracotta_Wall.get(),
                BVBlocks.Magenta_Terracotta_Wall.get(),
                BVBlocks.Light_Blue_Terracotta_Wall.get(),
                BVBlocks.Yellow_Terracotta_Wall.get(),
                BVBlocks.Lime_Terracotta_Wall.get(),
                BVBlocks.Pink_Terracotta_Wall.get(),
                BVBlocks.Gray_Terracotta_Wall.get(),
                BVBlocks.Light_Gray_Terracotta_Wall.get(),
                BVBlocks.Cyan_Terracotta_Wall.get(),
                BVBlocks.Purple_Terracotta_Wall.get(),
                BVBlocks.Blue_Terracotta_Wall.get(),
                BVBlocks.Brown_Terracotta_Wall.get(),
                BVBlocks.Green_Terracotta_Wall.get(),
                BVBlocks.Red_Terracotta_Wall.get(),
                BVBlocks.Black_Terracotta_Wall.get(),
                BVBlocks.Dripstone_Block_Wall.get(),
                BVBlocks.Amethyst_Block_Wall.get(),
                BVBlocks.Cracked_Stone_Brick_Wall.get(),

                BVBlocks.Calcite_Stairs.get(),
                BVBlocks.Calcite_Slab.get(),
                BVBlocks.Calcite_Wall.get(),
                BVBlocks.Smooth_Basalt_Stairs.get(),
                BVBlocks.Smooth_Basalt_Slab.get(),
                BVBlocks.Smooth_Basalt_Wall.get(),
                BVBlocks.Tuff_Stairs.get(),
                BVBlocks.Tuff_Slab.get(),
                BVBlocks.Tuff_Wall.get(),

                BVBlocks.Deepslate_Stairs.get(),
                BVBlocks.Deepslate_Slab.get(),
                BVBlocks.Deepslate_Wall.get(),
                BVBlocks.Cracked_Deepslate_Brick_Stairs.get(),
                BVBlocks.Cracked_Deepslate_Brick_Slab.get(),
                BVBlocks.Cracked_Deepslate_Brick_Wall.get(),
                BVBlocks.Cracked_Deepslate_Tile_Stairs.get(),
                BVBlocks.Cracked_Deepslate_Tile_Slab.get(),
                BVBlocks.Cracked_Deepslate_Tile_Wall.get(),

                BVBlocks.Nether_Brick_Fence_Gate.get(),
                BVBlocks.Cracked_Nether_Brick_Stairs.get(),
                BVBlocks.Cracked_Nether_Brick_Slab.get(),
                BVBlocks.Cracked_Nether_Brick_Wall.get(),
                BVBlocks.Cracked_Nether_Brick_Fence.get(),
                BVBlocks.Cracked_Nether_Brick_Fence_Gate.get(),
                BVBlocks.Red_Nether_Brick_Fence.get(),
                BVBlocks.Red_Nether_Brick_Fence_Gate.get(),

                BVBlocks.Obsidian_Stairs.get(),
                BVBlocks.Obsidian_Slab.get(),
                BVBlocks.Obsidian_Wall.get(),
                BVBlocks.Crying_Obsidian_Stairs.get(),
                BVBlocks.Crying_Obsidian_Slab.get(),
                BVBlocks.Crying_Obsidian_Wall.get(),

                BVBlocks.White_Glazed_Terracotta_Stairs.get(),
                BVBlocks.White_Glazed_Terracotta_Slab.get(),
                BVBlocks.White_Glazed_Terracotta_Wall.get(),
                BVBlocks.Orange_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Orange_Glazed_Terracotta_Slab.get(),
                BVBlocks.Orange_Glazed_Terracotta_Wall.get(),
                BVBlocks.Magenta_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Magenta_Glazed_Terracotta_Slab.get(),
                BVBlocks.Magenta_Glazed_Terracotta_Wall.get(),
                BVBlocks.Light_Blue_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Light_Blue_Glazed_Terracotta_Slab.get(),
                BVBlocks.Light_Blue_Glazed_Terracotta_Wall.get(),
                BVBlocks.Yellow_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Yellow_Glazed_Terracotta_Slab.get(),
                BVBlocks.Yellow_Glazed_Terracotta_Wall.get(),
                BVBlocks.Lime_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Lime_Glazed_Terracotta_Slab.get(),
                BVBlocks.Lime_Glazed_Terracotta_Wall.get(),
                BVBlocks.Pink_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Pink_Glazed_Terracotta_Slab.get(),
                BVBlocks.Pink_Glazed_Terracotta_Wall.get(),
                BVBlocks.Gray_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Gray_Glazed_Terracotta_Slab.get(),
                BVBlocks.Gray_Glazed_Terracotta_Wall.get(),
                BVBlocks.Light_Gray_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Light_Gray_Glazed_Terracotta_Slab.get(),
                BVBlocks.Light_Gray_Glazed_Terracotta_Wall.get(),
                BVBlocks.Cyan_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Cyan_Glazed_Terracotta_Slab.get(),
                BVBlocks.Cyan_Glazed_Terracotta_Wall.get(),
                BVBlocks.Purple_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Purple_Glazed_Terracotta_Slab.get(),
                BVBlocks.Purple_Glazed_Terracotta_Wall.get(),
                BVBlocks.Blue_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Blue_Glazed_Terracotta_Slab.get(),
                BVBlocks.Blue_Glazed_Terracotta_Wall.get(),
                BVBlocks.Brown_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Brown_Glazed_Terracotta_Slab.get(),
                BVBlocks.Brown_Glazed_Terracotta_Wall.get(),
                BVBlocks.Green_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Green_Glazed_Terracotta_Slab.get(),
                BVBlocks.Green_Glazed_Terracotta_Wall.get(),
                BVBlocks.Red_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Red_Glazed_Terracotta_Slab.get(),
                BVBlocks.Red_Glazed_Terracotta_Wall.get(),
                BVBlocks.Black_Glazed_Terracotta_Stairs.get(),
                BVBlocks.Black_Glazed_Terracotta_Slab.get(),
                BVBlocks.Black_Glazed_Terracotta_Wall.get(),

                BVBlocks.PackedMudStairs.get(),
                BVBlocks.PackedMudSlab.get(),
                BVBlocks.PackedMudWall.get()
        );} // needs Pickaxe

        {tag(BlockTags.MINEABLE_WITH_AXE).add(
                BVBlocks.Oak_Log_Stairs.get(),
                BVBlocks.Oak_Log_Slab.get(),
                BVBlocks.Spruce_Log_Stairs.get(),
                BVBlocks.Spruce_Log_Slab.get(),
                BVBlocks.Birch_Log_Stairs.get(),
                BVBlocks.Birch_Log_Slab.get(),
                BVBlocks.Jungle_Log_Stairs.get(),
                BVBlocks.Jungle_Log_Slab.get(),
                BVBlocks.Acacia_Log_Stairs.get(),
                BVBlocks.Acacia_Log_Slab.get(),
                BVBlocks.Dark_Oak_Log_Stairs.get(),
                BVBlocks.Dark_Oak_Log_Slab.get(),
                BVBlocks.Mangrove_Log_Stairs.get(),
                BVBlocks.Mangrove_Log_Slab.get(),

                BVBlocks.Stripped_Oak_Log_Stairs.get(),
                BVBlocks.Stripped_Oak_Log_Slab.get(),
                BVBlocks.Stripped_Spruce_Log_Stairs.get(),
                BVBlocks.Stripped_Spruce_Log_Slab.get(),
                BVBlocks.Stripped_Birch_Log_Stairs.get(),
                BVBlocks.Stripped_Birch_Log_Slab.get(),
                BVBlocks.Stripped_Jungle_Log_Stairs.get(),
                BVBlocks.Stripped_Jungle_Log_Slab.get(),
                BVBlocks.Stripped_Acacia_Log_Stairs.get(),
                BVBlocks.Stripped_Acacia_Log_Slab.get(),
                BVBlocks.Stripped_Dark_Oak_Log_Stairs.get(),
                BVBlocks.Stripped_Dark_Oak_Log_Slab.get(),
                BVBlocks.Stripped_Mangrove_Log_Stairs.get(),
                BVBlocks.Stripped_Mangrove_Log_Slab.get(),

                BVBlocks.Crimson_Stem_Stairs.get(),
                BVBlocks.Crimson_Stem_Slab.get(),
                BVBlocks.Warped_Stem_Stairs.get(),
                BVBlocks.Warped_Stem_Slab.get(),
                BVBlocks.Stripped_Crimson_Stem_Stairs.get(),
                BVBlocks.Stripped_Crimson_Stem_Slab.get(),
                BVBlocks.Stripped_Warped_Stem_Stairs.get(),
                BVBlocks.Stripped_Warped_Stem_Slab.get(),

                BVBlocks.Oak_Wood_Stairs.get(),
                BVBlocks.Oak_Wood_Slab.get(),
                BVBlocks.Oak_Wood_Wall.get(),
                BVBlocks.Oak_Wood_Fence.get(),
                BVBlocks.Oak_Wood_FenceGate.get(),
                BVBlocks.Spruce_Wood_Stairs.get(),
                BVBlocks.Spruce_Wood_Slab.get(),
                BVBlocks.Spruce_Wood_Wall.get(),
                BVBlocks.Spruce_Wood_Fence.get(),
                BVBlocks.Spruce_Wood_FenceGate.get(),
                BVBlocks.Birch_Wood_Stairs.get(),
                BVBlocks.Birch_Wood_Slab.get(),
                BVBlocks.Birch_Wood_Wall.get(),
                BVBlocks.Birch_Wood_Fence.get(),
                BVBlocks.Birch_Wood_FenceGate.get(),
                BVBlocks.Jungle_Wood_Stairs.get(),
                BVBlocks.Jungle_Wood_Slab.get(),
                BVBlocks.Jungle_Wood_Wall.get(),
                BVBlocks.Jungle_Wood_Fence.get(),
                BVBlocks.Jungle_Wood_FenceGate.get(),
                BVBlocks.Acacia_Wood_Stairs.get(),
                BVBlocks.Acacia_Wood_Slab.get(),
                BVBlocks.Acacia_Wood_Wall.get(),
                BVBlocks.Acacia_Wood_Fence.get(),
                BVBlocks.Acacia_Wood_FenceGate.get(),
                BVBlocks.Dark_Oak_Wood_Stairs.get(),
                BVBlocks.Dark_Oak_Wood_Slab.get(),
                BVBlocks.Dark_Oak_Wood_Wall.get(),
                BVBlocks.Dark_Oak_Wood_Fence.get(),
                BVBlocks.Dark_Oak_Wood_FenceGate.get(),
                BVBlocks.Mangrove_Wood_Stairs.get(),
                BVBlocks.Mangrove_Wood_Slab.get(),
                BVBlocks.Mangrove_Wood_Wall.get(),
                BVBlocks.Mangrove_Wood_Fence.get(),
                BVBlocks.Mangrove_Wood_FenceGate.get(),

                BVBlocks.Stripped_Oak_Wood_Stairs.get(),
                BVBlocks.Stripped_Oak_Wood_Slab.get(),
                BVBlocks.Stripped_Oak_Wood_Wall.get(),
                BVBlocks.Stripped_Oak_Wood_Fence.get(),
                BVBlocks.Stripped_Oak_Wood_FenceGate.get(),
                BVBlocks.Stripped_Spruce_Wood_Stairs.get(),
                BVBlocks.Stripped_Spruce_Wood_Slab.get(),
                BVBlocks.Stripped_Spruce_Wood_Wall.get(),
                BVBlocks.Stripped_Spruce_Wood_Fence.get(),
                BVBlocks.Stripped_Spruce_Wood_FenceGate.get(),
                BVBlocks.Stripped_Birch_Wood_Stairs.get(),
                BVBlocks.Stripped_Birch_Wood_Slab.get(),
                BVBlocks.Stripped_Birch_Wood_Wall.get(),
                BVBlocks.Stripped_Birch_Wood_Fence.get(),
                BVBlocks.Stripped_Birch_Wood_FenceGate.get(),
                BVBlocks.Stripped_Jungle_Wood_Stairs.get(),
                BVBlocks.Stripped_Jungle_Wood_Slab.get(),
                BVBlocks.Stripped_Jungle_Wood_Wall.get(),
                BVBlocks.Stripped_Jungle_Wood_Fence.get(),
                BVBlocks.Stripped_Jungle_Wood_FenceGate.get(),
                BVBlocks.Stripped_Acacia_Wood_Stairs.get(),
                BVBlocks.Stripped_Acacia_Wood_Slab.get(),
                BVBlocks.Stripped_Acacia_Wood_Wall.get(),
                BVBlocks.Stripped_Acacia_Wood_Fence.get(),
                BVBlocks.Stripped_Acacia_Wood_FenceGate.get(),
                BVBlocks.Stripped_Dark_Oak_Wood_Stairs.get(),
                BVBlocks.Stripped_Dark_Oak_Wood_Slab.get(),
                BVBlocks.Stripped_Dark_Oak_Wood_Wall.get(),
                BVBlocks.Stripped_Dark_Oak_Wood_Fence.get(),
                BVBlocks.Stripped_Dark_Oak_Wood_FenceGate.get(),
                BVBlocks.Stripped_Mangrove_Wood_Stairs.get(),
                BVBlocks.Stripped_Mangrove_Wood_Slab.get(),
                BVBlocks.Stripped_Mangrove_Wood_Wall.get(),
                BVBlocks.Stripped_Mangrove_Wood_Fence.get(),
                BVBlocks.Stripped_Mangrove_Wood_FenceGate.get(),

                BVBlocks.Crimson_Hyphae_Stairs.get(),
                BVBlocks.Crimson_Hyphae_Slab.get(),
                BVBlocks.Crimson_Hyphae_Wall.get(),
                BVBlocks.Crimson_Hyphae_Fence.get(),
                BVBlocks.Crimson_Hyphae_FenceGate.get(),
                BVBlocks.Warped_Hyphae_Stairs.get(),
                BVBlocks.Warped_Hyphae_Slab.get(),
                BVBlocks.Warped_Hyphae_Wall.get(),
                BVBlocks.Warped_Hyphae_Fence.get(),
                BVBlocks.Warped_Hyphae_FenceGate.get(),
                BVBlocks.Stripped_Crimson_Hyphae_Stairs.get(),
                BVBlocks.Stripped_Crimson_Hyphae_Slab.get(),
                BVBlocks.Stripped_Crimson_Hyphae_Wall.get(),
                BVBlocks.Stripped_Crimson_Hyphae_Fence.get(),
                BVBlocks.Stripped_Crimson_Hyphae_FenceGate.get(),
                BVBlocks.Stripped_Warped_Hyphae_Stairs.get(),
                BVBlocks.Stripped_Warped_Hyphae_Slab.get(),
                BVBlocks.Stripped_Warped_Hyphae_Wall.get(),
                BVBlocks.Stripped_Warped_Hyphae_Fence.get(),
                BVBlocks.Stripped_Warped_Hyphae_FenceGate.get()
        );} // needs Axe

        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                BVBlocks.Obsidian_Stairs.get(),
                BVBlocks.Obsidian_Slab.get(),
                BVBlocks.Obsidian_Wall.get(),
                BVBlocks.Crying_Obsidian_Stairs.get(),
                BVBlocks.Crying_Obsidian_Slab.get(),
                BVBlocks.Crying_Obsidian_Wall.get()
        );
    }
}