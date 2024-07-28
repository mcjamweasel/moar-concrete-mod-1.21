package net.mcjamweasel.moarconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mcjamweasel.moarconcrete.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool bluePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);
        bluePool.stairs(ModBlocks.BLUE_CONCRETE_STAIRS);
        bluePool.slab(ModBlocks.BLUE_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool lightBluePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        lightBluePool.stairs(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        lightBluePool.slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool redPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        redPool.stairs(ModBlocks.RED_CONCRETE_STAIRS);
        redPool.slab(ModBlocks.RED_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool whitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        whitePool.stairs(ModBlocks.WHITE_CONCRETE_STAIRS);
        whitePool.slab(ModBlocks.WHITE_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool orangePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        orangePool.stairs(ModBlocks.ORANGE_CONCRETE_STAIRS);
        orangePool.slab(ModBlocks.ORANGE_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool magentaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        magentaPool.stairs(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        magentaPool.slab(ModBlocks.MAGENTA_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool limePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        limePool.stairs(ModBlocks.LIME_CONCRETE_STAIRS);
        limePool.slab(ModBlocks.LIME_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool yellowPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        yellowPool.stairs(ModBlocks.YELLOW_CONCRETE_STAIRS);
        yellowPool.slab(ModBlocks.YELLOW_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool pinkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);
        pinkPool.stairs(ModBlocks.PINK_CONCRETE_STAIRS);
        pinkPool.slab(ModBlocks.PINK_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool grayPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        grayPool.stairs(ModBlocks.GRAY_CONCRETE_STAIRS);
        grayPool.slab(ModBlocks.GRAY_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool lightGrayPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        lightGrayPool.stairs(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        lightGrayPool.slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool cyanPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        cyanPool.stairs(ModBlocks.CYAN_CONCRETE_STAIRS);
        cyanPool.slab(ModBlocks.CYAN_CONCRETE_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

}
