package com.barion.block_variants;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class BVUtil {
    public static boolean isBasalt(String name) {return (name.contains("basalt") && !name.contains("smooth"));}
    public static boolean shouldAppendBlock(String name) {return (name.contains("purpur"));}
    public static boolean isCutSandstone(String name) {return (name.contains("cut") && name.contains("sandstone"));}

    public static String getBlockName(Block block) {return Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();}
}