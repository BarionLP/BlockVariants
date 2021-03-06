package com.barion.block_variants.data;

import com.barion.block_variants.BVTags;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

@SuppressWarnings("unchecked")
public class BVItemTagsProvider extends ItemTagsProvider {
    public BVItemTagsProvider(DataGenerator generator, BlockTagsProvider provider, ExistingFileHelper fileHelper) {
        super(generator, provider, BlockVariants.ModID, fileHelper);
    }

    @Override
    protected void addTags() {
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        copy(BVTags.Blocks.WoodenWalls, BVTags.Items.WoodenWalls);
        copy(BlockTags.FENCES, ItemTags.FENCES);

        copy(BlockTags.NON_FLAMMABLE_WOOD, ItemTags.NON_FLAMMABLE_WOOD);
        tag(BVTags.Items.StoneCrafting).addTags(ItemTags.STONE_CRAFTING_MATERIALS, Tags.Items.STONE);

        tag(ItemTags.STAIRS).addTag(ItemTags.WOODEN_STAIRS);
        tag(ItemTags.SLABS).addTag(ItemTags.WOODEN_SLABS);
        //tag(ItemTags.WALLS).addTag(BVTags.Items.WoodenWalls);
    }
}