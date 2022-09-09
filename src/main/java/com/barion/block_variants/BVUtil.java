package com.barion.block_variants;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class BVUtil {
    public static boolean isBasalt(String name) {return (name.contains("basalt") && !name.contains("smooth"));}
    public static boolean shouldAppendBlock(String name) {return (name.contains("purpur"));}
    public static boolean isCutSandstone(String name) {return (name.contains("cut") && name.contains("sandstone"));}

    public static String getBlockName(Block block) {return Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();}

    public static void cry(BlockState state, Level level, BlockPos pos, RandomSource random) {
        Blocks.CRYING_OBSIDIAN.animateTick(state, level, pos, random);
    }
}