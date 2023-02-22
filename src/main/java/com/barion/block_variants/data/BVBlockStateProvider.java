package com.barion.block_variants.data;

import com.ametrinstudios.ametrin.datagen.ExtendedBlockStateProvider;
import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVUtil;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.ametrinstudios.ametrin.datagen.DataProviderExtensions.isLog;

public class BVBlockStateProvider extends ExtendedBlockStateProvider {
    public BVBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, BlockVariants.ModID, existingFileHelper);
    }

    {
        blockStateProviderRules.add((block, name, texture)->{
           if(!name.contains("chiseled_quartz")) {return false;}
           if(block instanceof StairBlock){
               stairsBlock((StairBlock) block, modBlockLoc("chiseled_quartz_block"), modBlockLoc("chiseled_quartz_block_top"), modBlockLoc("chiseled_quartz_block_top"));
           }else if(block instanceof SlabBlock){
               slabBlock((SlabBlock) block, modBlockLoc("chiseled_quartz_block"), modBlockLoc("chiseled_quartz_block"), modBlockLoc("chiseled_quartz_block_top"), modBlockLoc("chiseled_quartz_block_top"));
           }else if(block instanceof WallBlock){
               wallBlock((WallBlock) block, modBlockLoc("chiseled_quartz_block"));
           }else {
               return false;
           }
           return true;
        });
        blockStateProviderRules.add((block, name, texture)->{
            if(!(name.contains("smooth_stone") && block instanceof StairBlock)) {return false;}
            stairsBlock((StairBlock) block, modBlockLoc("smooth_stone_slab_side"), modBlockLoc("smooth_stone"), modBlockLoc("smooth_stone"));
            return true;
        });
        blockStateProviderRules.add((block, name, texture)->{
            if(!(BVUtil.isCutSandstone(name) && block instanceof StairBlock)) {return false;}
            ResourceLocation topTexture = modBlockLoc(texture.replace("cut_", "").replace("stairs", "top"));
            stairsBlock((StairBlock) block, modBlockLoc(texture.replace("_stairs", "")), topTexture, topTexture);
            return true;
        });
        blockStateProviderRules.add((block, name, texture)->{
            if(!BVUtil.isBasalt(name)) {return false;}
            if(block instanceof StairBlock){
                ResourceLocation top = modBlockLoc(texture.replace("stairs", "top"));
                stairsBlock((StairBlock) block, modBlockLoc(texture.replace("stairs", "side")), top, top);
            }else if(block instanceof SlabBlock){
                ResourceLocation top = modBlockLoc(texture.replace("slab", "top"));
                slabBlock((SlabBlock) block, modBlockLoc(texture.replace("_slab", "")), modBlockLoc(texture.replace("slab", "side")), top, top);
            }else if(block instanceof WallBlock){
                wallBlock((WallBlock) block, modBlockLoc(texture.replace("wall", "side")));
            }else {
                return false;
            }
            return true;
        });
        blockStateProviderRules.add((block, name, texture)->{
            if(!isLog(name)) {return false;}
            if(block instanceof StairBlock){
                ResourceLocation top = modBlockLoc(texture.replace("stairs", "top"));
                stairsBlock((StairBlock) block, modBlockLoc(texture.replace("_stairs", "")), top, top);
            }else if(block instanceof SlabBlock){
                ResourceLocation top = modBlockLoc(texture.replace("slab", "top"));
                slabBlock((SlabBlock) block, modBlockLoc(texture.replace("_slab", "")), modBlockLoc(texture.replace("_slab", "")), top, top);
            }else {
                return false;
            }
            return true;
        });
        blockStateProviderRules.add((block, name, texture)->{
            if(block != BVBlocks.QuartzWall.get()) {return false;}
            wallBlock((WallBlock) block, modBlockLoc(texture.replace("_wall", "_block_top")));
            return true;
        });
        blockStateProviderRules.add((block, name, texture)->{
            if(block != BVBlocks.SmoothQuartzWall.get()) {return false;}
            wallBlock((WallBlock) block, modBlockLoc(texture.replace("_wall", "_block_bottom").replace("smooth_", "")));
            return true;
        });
        blockStateProviderRules.add((block, name, texture)->{
            if(block != BVBlocks.Purpur_Wall.get()) {return false;}
            wallBlock((WallBlock) block, modBlockLoc(texture.replace("wall", "block")));
            return true;
        });
    }

    @Override
    protected void registerStatesAndModels() {
        runProviderRules(BVBlocks.BlockRegistry);
    }

    @Override
    protected String getTexture(String name) {
        if(name.contains("wood")) {name = name.replace("wood", "log");}
        if(name.contains("hyphae")) {name = name.replace("hyphae", "stem");}
        return name;
    }

    @Override
    protected ResourceLocation modBlockLoc(String key) {return mcLoc("block/" + key);}
}