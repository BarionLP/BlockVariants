package com.barion.block_variants.data;

import com.ametrinstudios.ametrin.datagen.ExtendedItemModelProvider;
import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVUtil;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.Objects;

import static com.ametrinstudios.ametrin.AmetrinUtil.shouldAppendS;
import static com.barion.block_variants.BVUtil.getBlockName;

public class BVItemModelProvider extends ExtendedItemModelProvider {
    public BVItemModelProvider(DataGenerator generator, ExistingFileHelper fileHelper){
        super(generator, BlockVariants.ModID, fileHelper);
    }

    @Override
    protected void registerModels() {
       blocks(BVBlocks.getAllBlocks());
    }

    protected  <B extends Block> void blocks(List<B> blocks){
        for(B block : blocks) {
            String textureName = getBlockName(block);
            String name = getBlockName(block);
            ResourceLocation texture;
            if(textureName.contains("wood")) {textureName = textureName.replace("wood", "log");}
            if(textureName.contains("hyphae")) {textureName = textureName.replace("hyphae", "stem");}

           if(block instanceof WallBlock){
               if(Objects.equals(textureName, "quartz_wall")) {texture = blockTexture(textureName.replace("_wall", "_block_top"));}
               else if(shouldAppendS(textureName)) {texture = blockTexture(textureName.replace("_wall", "s"));}
               else if(BVUtil.shouldAppendBlock(textureName)) {texture = blockTexture(textureName.replace("wall", "block"));}
               else if(Objects.equals(textureName, "smooth_quartz_wall")) {texture = blockTexture(textureName.replace("_wall", "_block_bottom").replace("smooth_", ""));}
               else if(BVUtil.isBasalt(textureName)) {texture = blockTexture(textureName.replace("wall", "side"));}
               else {texture = blockTexture(textureName.replace("_wall", ""));}
               wallInventory(name, texture);
           }else if(block instanceof FenceBlock) {
               if(shouldAppendS(textureName)) {texture = blockTexture(textureName.replace("_fence", "s"));}
               else {texture = blockTexture(textureName.replace("_fence", "_planks"));}
               fenceInventory(name, texture);
           }else if(block instanceof FenceGateBlock){
               if(shouldAppendS(textureName)) {texture = blockTexture(textureName.replace("_fence_gate", "s"));}
               else {texture = blockTexture(textureName.replace("_fence_gate", "_planks"));}
               fenceGate(name, texture);
           }else{
               withExistingParent(name, modBlockLoc(name));
           }
        }
    }

    protected ResourceLocation blockTexture(String texture) {return mcLoc("block/" + texture);}
}