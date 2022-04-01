package com.barion.block_variants;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class BVUtil {
    public static boolean shouldAppendS(String name) {return ((name.contains("brick") && !name.contains("bricks") || (name.contains("tile") && !name.contains("tiles"))));}
    public static boolean isBasalt(String name) {return (name.contains("basalt") && !name.contains("smooth"));}
    public static boolean isWood(String name) {return (name.contains("wood") || name.contains("hyphae"));}
    public static boolean isLog(String name) {return (name.contains("log") || name.contains("stem"));}
    public static boolean isCutSandstone(String name) {return (name.contains("cut") && name.contains("sandstone"));}

    public static void cry(BlockState state, Level level, BlockPos pos, Random random) {
        Blocks.CRYING_OBSIDIAN.animateTick(state, level, pos, random);
        /*if (random.nextInt(5) == 0) {
            Direction direction = Direction.getRandom(random);
            if (direction != Direction.UP) {
                BlockPos blockpos = pos.relative(direction);
                BlockState blockstate = level.getBlockState(blockpos);
                if (!state.canOcclude() || !blockstate.isFaceSturdy(level, blockpos, direction.getOpposite())) {
                    double d0 = direction.getStepX() == 0 ? random.nextDouble() : 0.5D + (double)direction.getStepX() * 0.6D;
                    double d1 = direction.getStepY() == 0 ? random.nextDouble() : 0.5D + (double)direction.getStepY() * 0.6D;
                    double d2 = direction.getStepZ() == 0 ? random.nextDouble() : 0.5D + (double)direction.getStepZ() * 0.6D;
                    level.addParticle(ParticleTypes.DRIPPING_OBSIDIAN_TEAR, (double)pos.getX() + d0, (double)pos.getY() + d1, (double)pos.getZ() + d2, 0.0D, 0.0D, 0.0D);
                }
            }
        }*/
    }
}