package com.barion.block_variants;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class BVTags {
    public class Blocks{
        public static final Tags.IOptionalNamedTag<Block> WoodenWalls = forge("wooden_wall");

        private static Tags.IOptionalNamedTag<Block> forge(String path){
            return BlockTags.createOptional(new ResourceLocation("forge", path));
        }
        private static Tags.IOptionalNamedTag<Block> mod(String path){
            return BlockTags.createOptional(new ResourceLocation(BlockVariants.Mod_ID, path));
        }
    }

    public static final class Items{
        public static final Tags.IOptionalNamedTag<Item> WoodenWalls = forge("wooden_wall");

        private static Tags.IOptionalNamedTag<Item> forge(String path){
            return ItemTags.createOptional(new ResourceLocation("forge", path));
        }
        private static Tags.IOptionalNamedTag<Item> mod(String path){
            return ItemTags.createOptional(new ResourceLocation(BlockVariants.Mod_ID, path));
        }
    }
}
