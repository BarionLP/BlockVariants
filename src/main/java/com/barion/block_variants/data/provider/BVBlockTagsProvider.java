package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedBlockTagsProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBlocks;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static com.ametrinstudios.ametrin.data.DataProviderExtensions.isWooden;

public final class BVBlockTagsProvider extends ExtendedBlockTagsProvider {
    public BVBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper fileHelper){
        super(output, lookupProvider, BlockVariants.MOD_ID, fileHelper);
    }

    {
        blockTagProviderRules.add((block, name)->{
            if(block instanceof WallBlock && (isWooden(name) || name.contains("bamboo_block"))){
                tag(BVTags.Blocks.WOODEN_WALLS).add(block);
            }
        });

        blockTagProviderRules.add((block, name)->{
            if(name.contains("bamboo_block")){
                if(block instanceof StairBlock){
                    tag(BlockTags.WOODEN_STAIRS).add(block);
                }
                if(block instanceof SlabBlock){
                    tag(BlockTags.WOODEN_SLABS).add(block);
                }
                if(block instanceof FenceBlock){
                    tag(BlockTags.WOODEN_FENCES).add(block);
                }
                // Fence gate not necessary
            }
        });
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider holderLookup){
        runRules(BVBlocks.REGISTER);

        {tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                BVBlocks.SMOOTH_STONE_STAIRS.get(),
                BVBlocks.CUT_SANDSTONE_STAIRS.get(),
                BVBlocks.CUT_RED_SANDSTONE_STAIRS.get(),
                BVBlocks.QUARTZ_BRICK_STAIRS.get(),
                BVBlocks.SMOOTH_STONE_STAIRS.get(),
                BVBlocks.CHISELED_QUARTZ_BLOCK_STAIRS.get(),
                BVBlocks.NETHERRACK_STAIRS.get(),
                BVBlocks.END_STONE_STAIRS.get(),
                BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(),
                BVBlocks.BASALT_STAIRS.get(),
                BVBlocks.POLISHED_BASALT_STAIRS.get(),
                BVBlocks.TERRACOTTA_STAIRS.get(),
                BVBlocks.WHITE_TERRACOTTA_STAIRS.get(),
                BVBlocks.ORANGE_TERRACOTTA_STAIRS.get(),
                BVBlocks.MAGENTA_TERRACOTTA_STAIRS.get(),
                BVBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(),
                BVBlocks.YELLOW_TERRACOTTA_STAIRS.get(),
                BVBlocks.LIME_TERRACOTTA_STAIRS.get(),
                BVBlocks.PINK_TERRACOTTA_STAIRS.get(),
                BVBlocks.GRAY_TERRACOTTA_STAIRS.get(),
                BVBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(),
                BVBlocks.CYAN_TERRACOTTA_STAIRS.get(),
                BVBlocks.PURPLE_TERRACOTTA_STAIRS.get(),
                BVBlocks.BLUE_TERRACOTTA_STAIRS.get(),
                BVBlocks.BROWN_TERRACOTTA_STAIRS.get(),
                BVBlocks.GREEN_TERRACOTTA_STAIRS.get(),
                BVBlocks.RED_TERRACOTTA_STAIRS.get(),
                BVBlocks.BLACK_TERRACOTTA_STAIRS.get(),
                BVBlocks.DRIPSTONE_BLOCK_STAIRS.get(),
                BVBlocks.AMETHYST_BLOCK_STAIRS.get(),
                BVBlocks.CRACKED_STONE_BRICK_STAIRS.get(),

                BVBlocks.QUARTZ_BRICK_SLAB.get(),
                BVBlocks.CHISELED_QUARTZ_BLOCK_SLAB.get(),
                BVBlocks.NETHERRACK_SLAB.get(),
                BVBlocks.END_STONE_SLAB.get(),
                BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(),
                BVBlocks.BASALT_SLAB.get(),
                BVBlocks.POLISHED_BASALT_SLAB.get(),
                BVBlocks.TERRACOTTA_SLAB.get(),
                BVBlocks.WHITE_TERRACOTTA_SLAB.get(),
                BVBlocks.ORANGE_TERRACOTTA_SLAB.get(),
                BVBlocks.MAGENTA_TERRACOTTA_SLAB.get(),
                BVBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(),
                BVBlocks.YELLOW_TERRACOTTA_SLAB.get(),
                BVBlocks.LIME_TERRACOTTA_SLAB.get(),
                BVBlocks.PINK_TERRACOTTA_SLAB.get(),
                BVBlocks.GRAY_TERRACOTTA_SLAB.get(),
                BVBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(),
                BVBlocks.CYAN_TERRACOTTA_SLAB.get(),
                BVBlocks.PURPLE_TERRACOTTA_SLAB.get(),
                BVBlocks.BLUE_TERRACOTTA_SLAB.get(),
                BVBlocks.BROWN_TERRACOTTA_SLAB.get(),
                BVBlocks.GREEN_TERRACOTTA_SLAB.get(),
                BVBlocks.RED_TERRACOTTA_SLAB.get(),
                BVBlocks.BLACK_TERRACOTTA_SLAB.get(),
                BVBlocks.DRIPSTONE_BLOCK_SLAB.get(),
                BVBlocks.AMETHYST_BLOCK_SLAB.get(),
                BVBlocks.CRACKED_STONE_BRICK_SLAB.get(),

                BVBlocks.POLISHED_DIORITE_WALL.get(),
                BVBlocks.POLISHED_GRANITE_WALL.get(),
                BVBlocks.POLISHED_ANDESITE_WALL.get(),
                BVBlocks.STONE_WALL.get(),
                BVBlocks.SMOOTH_STONE_WALL.get(),
                BVBlocks.CUT_SANDSTONE_WALL.get(),
                BVBlocks.CUT_RED_SANDSTONE_WALL.get(),
                BVBlocks.QUARTZ_WALL.get(),
                BVBlocks.QUARTZ_BRICK_WALL.get(),
                BVBlocks.SMOOTH_QUARTZ_WALL.get(),
                BVBlocks.CHISELED_QUARTZ_BLOCK_WALL.get(),
                BVBlocks.PRISMARINE_BRICK_WALL.get(),
                BVBlocks.DARK_PRISMARINE_WALL.get(),
                BVBlocks.NETHERRACK_WALL.get(),
                BVBlocks.END_STONE_WALL.get(),
                BVBlocks.PURPUR_WALL.get(),
                BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(),
                BVBlocks.BASALT_WALL.get(),
                BVBlocks.POLISHED_BASALT_WALL.get(),
                BVBlocks.TERRACOTTA_WALL.get(),
                BVBlocks.WHITE_TERRACOTTA_WALL.get(),
                BVBlocks.ORANGE_TERRACOTTA_WALL.get(),
                BVBlocks.MAGENTA_TERRACOTTA_WALL.get(),
                BVBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(),
                BVBlocks.YELLOW_TERRACOTTA_WALL.get(),
                BVBlocks.LIME_TERRACOTTA_WALL.get(),
                BVBlocks.PINK_TERRACOTTA_WALL.get(),
                BVBlocks.GRAY_TERRACOTTA_WALL.get(),
                BVBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(),
                BVBlocks.CYAN_TERRACOTTA_WALL.get(),
                BVBlocks.PURPLE_TERRACOTTA_WALL.get(),
                BVBlocks.BLUE_TERRACOTTA_WALL.get(),
                BVBlocks.BROWN_TERRACOTTA_WALL.get(),
                BVBlocks.GREEN_TERRACOTTA_WALL.get(),
                BVBlocks.RED_TERRACOTTA_WALL.get(),
                BVBlocks.BLACK_TERRACOTTA_WALL.get(),
                BVBlocks.DRIPSTONE_BLOCK_WALL.get(),
                BVBlocks.AMETHYST_BLOCK_WALL.get(),
                BVBlocks.CRACKED_STONE_BRICK_WALL.get(),

                BVBlocks.CALCITE_STAIRS.get(),
                BVBlocks.CALCITE_SLAB.get(),
                BVBlocks.CALCITE_WALL.get(),
                BVBlocks.SMOOTH_BASALT_STAIRS.get(),
                BVBlocks.SMOOTH_BASALT_SLAB.get(),
                BVBlocks.SMOOTH_BASALT_WALL.get(),

                BVBlocks.DEEPSLATE_STAIRS.get(),
                BVBlocks.DEEPSLATE_SLAB.get(),
                BVBlocks.DEEPSLATE_WALL.get(),
                BVBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(),
                BVBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(),
                BVBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(),
                BVBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(),
                BVBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(),
                BVBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(),

                BVBlocks.NETHER_BRICK_FENCE_GATE.get(),
                BVBlocks.CRACKED_NETHER_BRICK_STAIRS.get(),
                BVBlocks.CRACKED_NETHER_BRICK_SLAB.get(),
                BVBlocks.CRACKED_NETHER_BRICK_WALL.get(),
                BVBlocks.CRACKED_NETHER_BRICK_FENCE.get(),
                BVBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.get(),
                BVBlocks.RED_NETHER_BRICK_FENCE.get(),
                BVBlocks.RED_NETHER_BRICK_FENCE_GATE.get(),

                BVBlocks.OBSIDIAN_STAIRS.get(),
                BVBlocks.OBSIDIAN_SLAB.get(),
                BVBlocks.OBSIDIAN_WALL.get(),
                BVBlocks.CRYING_OBSIDIAN_STAIRS.get(),
                BVBlocks.CRYING_OBSIDIAN_SLAB.get(),
                BVBlocks.CRYING_OBSIDIAN_WALL.get(),

                BVBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.LIME_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.PINK_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.RED_GLAZED_TERRACOTTA_WALL.get(),
                BVBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get(),
                BVBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(),
                BVBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get(),

                BVBlocks.PACKED_MUD_STAIRS.get(),
                BVBlocks.PACKED_MUD_SLAB.get(),
                BVBlocks.PACKED_MUD_WALL.get()
        );} // needs Pickaxe

        {tag(BlockTags.MINEABLE_WITH_AXE).add(
                BVBlocks.OAK_LOG_STAIRS.get(),
                BVBlocks.OAK_LOG_SLAB.get(),
                BVBlocks.SPRUCE_LOG_STAIRS.get(),
                BVBlocks.SPRUCE_LOG_SLAB.get(),
                BVBlocks.BIRCH_LOG_STAIRS.get(),
                BVBlocks.BIRCH_LOG_SLAB.get(),
                BVBlocks.JUNGLE_LOG_STAIRS.get(),
                BVBlocks.JUNGLE_LOG_SLAB.get(),
                BVBlocks.ACACIA_LOG_STAIRS.get(),
                BVBlocks.ACACIA_LOG_SLAB.get(),
                BVBlocks.DARK_OAK_LOG_STAIRS.get(),
                BVBlocks.DARK_OAK_LOG_SLAB.get(),
                BVBlocks.MANGROVE_LOG_STAIRS.get(),
                BVBlocks.MANGROVE_LOG_SLAB.get(),
                BVBlocks.CHERRY_LOG_STAIRS.get(),
                BVBlocks.CHERRY_LOG_SLAB.get(),

                BVBlocks.STRIPPED_OAK_LOG_STAIRS.get(),
                BVBlocks.STRIPPED_OAK_LOG_SLAB.get(),
                BVBlocks.STRIPPED_SPRUCE_LOG_STAIRS.get(),
                BVBlocks.STRIPPED_SPRUCE_LOG_SLAB.get(),
                BVBlocks.STRIPPED_BIRCH_LOG_STAIRS.get(),
                BVBlocks.STRIPPED_BIRCH_LOG_SLAB.get(),
                BVBlocks.STRIPPED_JUNGLE_LOG_STAIRS.get(),
                BVBlocks.STRIPPED_JUNGLE_LOG_SLAB.get(),
                BVBlocks.STRIPPED_ACACIA_LOG_STAIRS.get(),
                BVBlocks.STRIPPED_ACACIA_LOG_SLAB.get(),
                BVBlocks.STRIPPED_DARK_OAK_LOG_STAIRS.get(),
                BVBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get(),
                BVBlocks.STRIPPED_MANGROVE_LOG_STAIRS.get(),
                BVBlocks.STRIPPED_MANGROVE_LOG_SLAB.get(),
                BVBlocks.STRIPPED_CHERRY_LOG_STAIRS.get(),
                BVBlocks.STRIPPED_CHERRY_LOG_SLAB.get(),

                BVBlocks.CRIMSON_STEM_STAIRS.get(),
                BVBlocks.CRIMSON_STEM_SLAB.get(),
                BVBlocks.WARPED_STEM_STAIRS.get(),
                BVBlocks.WARPED_STEM_SLAB.get(),
                BVBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get(),
                BVBlocks.STRIPPED_CRIMSON_STEM_SLAB.get(),
                BVBlocks.STRIPPED_WARPED_STEM_STAIRS.get(),
                BVBlocks.STRIPPED_WARPED_STEM_SLAB.get(),

                BVBlocks.OAK_WOOD_STAIRS.get(),
                BVBlocks.OAK_WOOD_SLAB.get(),
                BVBlocks.OAK_WOOD_WALL.get(),
                BVBlocks.OAK_WOOD_FENCE.get(),
                BVBlocks.OAK_WOOD_FENCE_GATE.get(),
                BVBlocks.SPRUCE_WOOD_STAIRS.get(),
                BVBlocks.SPRUCE_WOOD_SLAB.get(),
                BVBlocks.SPRUCE_WOOD_WALL.get(),
                BVBlocks.SPRUCE_WOOD_FENCE.get(),
                BVBlocks.SPRUCE_WOOD_FENCE_GATE.get(),
                BVBlocks.BIRCH_WOOD_STAIRS.get(),
                BVBlocks.BIRCH_WOOD_SLAB.get(),
                BVBlocks.BIRCH_WOOD_WALL.get(),
                BVBlocks.BIRCH_WOOD_FENCE.get(),
                BVBlocks.BIRCH_WOOD_FENCE_GATE.get(),
                BVBlocks.JUNGLE_WOOD_STAIRS.get(),
                BVBlocks.JUNGLE_WOOD_SLAB.get(),
                BVBlocks.JUNGLE_WOOD_WALL.get(),
                BVBlocks.JUNGLE_WOOD_FENCE.get(),
                BVBlocks.JUNGLE_WOOD_FENCE_GATE.get(),
                BVBlocks.ACACIA_WOOD_STAIRS.get(),
                BVBlocks.ACACIA_WOOD_SLAB.get(),
                BVBlocks.ACACIA_WOOD_WALL.get(),
                BVBlocks.ACACIA_WOOD_FENCE.get(),
                BVBlocks.ACACIA_WOOD_FENCE_GATE.get(),
                BVBlocks.DARK_OAK_WOOD_STAIRS.get(),
                BVBlocks.DARK_OAK_WOOD_SLAB.get(),
                BVBlocks.DARK_OAK_WOOD_WALL.get(),
                BVBlocks.DARK_OAK_WOOD_FENCE.get(),
                BVBlocks.DARK_OAK_WOOD_FENCE_GATE.get(),
                BVBlocks.MANGROVE_WOOD_STAIRS.get(),
                BVBlocks.MANGROVE_WOOD_SLAB.get(),
                BVBlocks.MANGROVE_WOOD_WALL.get(),
                BVBlocks.MANGROVE_WOOD_FENCE.get(),
                BVBlocks.MANGROVE_WOOD_FENCE_GATE.get(),
                BVBlocks.CHERRY_WOOD_STAIRS.get(),
                BVBlocks.CHERRY_WOOD_SLAB.get(),
                BVBlocks.CHERRY_WOOD_WALL.get(),
                BVBlocks.CHERRY_WOOD_FENCE.get(),
                BVBlocks.CHERRY_WOOD_FENCE_GATE.get(),
                BVBlocks.BAMBOO_BLOCK_STAIRS.get(),
                BVBlocks.BAMBOO_BLOCK_SLAB.get(),
                BVBlocks.BAMBOO_BLOCK_WALL.get(),
                BVBlocks.BAMBOO_BLOCK_FENCE.get(),
                BVBlocks.BAMBOO_BLOCK_FENCE_GATE.get(),

                BVBlocks.STRIPPED_OAK_WOOD_STAIRS.get(),
                BVBlocks.STRIPPED_OAK_WOOD_SLAB.get(),
                BVBlocks.STRIPPED_OAK_WOOD_WALL.get(),
                BVBlocks.STRIPPED_OAK_WOOD_FENCE.get(),
                BVBlocks.STRIPPED_OAK_WOOD_FENCE_GATE.get(),
                BVBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(),
                BVBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(),
                BVBlocks.STRIPPED_SPRUCE_WOOD_WALL.get(),
                BVBlocks.STRIPPED_SPRUCE_WOOD_FENCE.get(),
                BVBlocks.STRIPPED_SPRUCE_WOOD_FENCE_GATE.get(),
                BVBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(),
                BVBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(),
                BVBlocks.STRIPPED_BIRCH_WOOD_WALL.get(),
                BVBlocks.STRIPPED_BIRCH_WOOD_FENCE.get(),
                BVBlocks.STRIPPED_BIRCH_WOOD_FENCE_GATE.get(),
                BVBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(),
                BVBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(),
                BVBlocks.STRIPPED_JUNGLE_WOOD_WALL.get(),
                BVBlocks.STRIPPED_JUNGLE_WOOD_FENCE.get(),
                BVBlocks.STRIPPED_JUNGLE_WOOD_FENCE_GATE.get(),
                BVBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(),
                BVBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(),
                BVBlocks.STRIPPED_ACACIA_WOOD_WALL.get(),
                BVBlocks.STRIPPED_ACACIA_WOOD_FENCE.get(),
                BVBlocks.STRIPPED_ACACIA_WOOD_FENCE_GATE.get(),
                BVBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(),
                BVBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(),
                BVBlocks.STRIPPED_DARK_OAK_WOOD_WALL.get(),
                BVBlocks.STRIPPED_DARK_OAK_WOOD_FENCE.get(),
                BVBlocks.STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get(),
                BVBlocks.STRIPPED_MANGROVE_WOOD_STAIRS.get(),
                BVBlocks.STRIPPED_MANGROVE_WOOD_SLAB.get(),
                BVBlocks.STRIPPED_MANGROVE_WOOD_WALL.get(),
                BVBlocks.STRIPPED_MANGROVE_WOOD_FENCE.get(),
                BVBlocks.STRIPPED_MANGROVE_WOOD_FENCE_GATE.get(),
                BVBlocks.STRIPPED_CHERRY_WOOD_STAIRS.get(),
                BVBlocks.STRIPPED_CHERRY_WOOD_SLAB.get(),
                BVBlocks.STRIPPED_CHERRY_WOOD_WALL.get(),
                BVBlocks.STRIPPED_CHERRY_WOOD_FENCE.get(),
                BVBlocks.STRIPPED_CHERRY_WOOD_FENCE_GATE.get(),
                BVBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get(),
                BVBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get(),
                BVBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get(),
                BVBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get(),
                BVBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get(),

                BVBlocks.CRIMSON_HYPHAE_STAIRS.get(),
                BVBlocks.CRIMSON_HYPHAE_SLAB.get(),
                BVBlocks.CRIMSON_HYPHAE_WALL.get(),
                BVBlocks.CRIMSON_HYPHAE_FENCE.get(),
                BVBlocks.CRIMSON_HYPHAE_FENCE_GATE.get(),
                BVBlocks.WARPED_HYPHAE_STAIRS.get(),
                BVBlocks.WARPED_HYPHAE_SLAB.get(),
                BVBlocks.WARPED_HYPHAE_WALL.get(),
                BVBlocks.WARPED_HYPHAE_FENCE.get(),
                BVBlocks.WARPED_HYPHAE_FENCE_GATE.get(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.get(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.get(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_WALL.get(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_FENCE.get(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.get()
        );} // needs Axe

        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                BVBlocks.OBSIDIAN_STAIRS.get(),
                BVBlocks.OBSIDIAN_SLAB.get(),
                BVBlocks.OBSIDIAN_WALL.get(),
                BVBlocks.CRYING_OBSIDIAN_STAIRS.get(),
                BVBlocks.CRYING_OBSIDIAN_SLAB.get(),
                BVBlocks.CRYING_OBSIDIAN_WALL.get()
        );
    }
}