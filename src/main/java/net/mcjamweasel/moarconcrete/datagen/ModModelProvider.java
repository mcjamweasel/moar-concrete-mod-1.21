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
        bluePool.fence(ModBlocks.BLUE_CONCRETE_FENCE);
        bluePool.fenceGate(ModBlocks.BLUE_CONCRETE_GATE);

        BlockStateModelGenerator.BlockTexturePool lightBluePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        lightBluePool.stairs(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        lightBluePool.slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        lightBluePool.fence(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE);
        lightBluePool.fenceGate(ModBlocks.LIGHT_BLUE_CONCRETE_GATE);

        BlockStateModelGenerator.BlockTexturePool redPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        redPool.stairs(ModBlocks.RED_CONCRETE_STAIRS);
        redPool.slab(ModBlocks.RED_CONCRETE_SLAB);
        redPool.fence(ModBlocks.RED_CONCRETE_FENCE);
        redPool.fenceGate(ModBlocks.RED_CONCRETE_GATE);

        BlockStateModelGenerator.BlockTexturePool whitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        whitePool.stairs(ModBlocks.WHITE_CONCRETE_STAIRS);
        whitePool.slab(ModBlocks.WHITE_CONCRETE_SLAB);
        whitePool.fence(ModBlocks.WHITE_CONCRETE_FENCE);
        whitePool.fenceGate(ModBlocks.WHITE_CONCRETE_GATE);

        BlockStateModelGenerator.BlockTexturePool orangePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        orangePool.stairs(ModBlocks.ORANGE_CONCRETE_STAIRS);
        orangePool.slab(ModBlocks.ORANGE_CONCRETE_SLAB);
        orangePool.fence(ModBlocks.ORANGE_CONCRETE_FENCE);
        orangePool.fenceGate(ModBlocks.ORANGE_CONCRETE_GATE);

        BlockStateModelGenerator.BlockTexturePool magentaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        magentaPool.stairs(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        magentaPool.slab(ModBlocks.MAGENTA_CONCRETE_SLAB);
        magentaPool.fence(ModBlocks.MAGENTA_CONCRETE_FENCE);
        magentaPool.fenceGate(ModBlocks.MAGENTA_CONCRETE_GATE);

        BlockStateModelGenerator.BlockTexturePool limePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        limePool.stairs(ModBlocks.LIME_CONCRETE_STAIRS);
        limePool.slab(ModBlocks.LIME_CONCRETE_SLAB);
        limePool.fence(ModBlocks.LIME_CONCRETE_FENCE);
        limePool.fenceGate(ModBlocks.LIME_CONCRETE_GATE);

        BlockStateModelGenerator.BlockTexturePool yellowPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        yellowPool.stairs(ModBlocks.YELLOW_CONCRETE_STAIRS);
        yellowPool.slab(ModBlocks.YELLOW_CONCRETE_SLAB);
        yellowPool.fence(ModBlocks.YELLOW_CONCRETE_FENCE);
        yellowPool.fenceGate(ModBlocks.YELLOW_CONCRETE_GATE);

        BlockStateModelGenerator.BlockTexturePool pinkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);
        pinkPool.stairs(ModBlocks.PINK_CONCRETE_STAIRS);
        pinkPool.slab(ModBlocks.PINK_CONCRETE_SLAB);
        pinkPool.fence(ModBlocks.PINK_CONCRETE_FENCE);
        pinkPool.fenceGate(ModBlocks.PINK_CONCRETE_GATE);

        BlockStateModelGenerator.BlockTexturePool grayPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        grayPool.stairs(ModBlocks.GRAY_CONCRETE_STAIRS);
        grayPool.slab(ModBlocks.GRAY_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool lightGrayPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        lightGrayPool.stairs(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        lightGrayPool.slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool cyanPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        cyanPool.stairs(ModBlocks.CYAN_CONCRETE_STAIRS);
        cyanPool.slab(ModBlocks.CYAN_CONCRETE_SLAB);
        cyanPool.fence(ModBlocks.CYAN_CONCRETE_FENCE);
        cyanPool.fenceGate(ModBlocks.CYAN_CONCRETE_GATE);

        BlockStateModelGenerator.BlockTexturePool purplePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);
        purplePool.stairs(ModBlocks.PURPLE_CONCRETE_STAIRS);
        purplePool.slab(ModBlocks.PURPLE_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool brownPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);
        brownPool.stairs(ModBlocks.BROWN_CONCRETE_STAIRS);
        brownPool.slab(ModBlocks.BROWN_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool greenPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);
        greenPool.stairs(ModBlocks.GREEN_CONCRETE_STAIRS);
        greenPool.slab(ModBlocks.GREEN_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool blackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);
        blackPool.stairs(ModBlocks.BLACK_CONCRETE_STAIRS);
        blackPool.slab(ModBlocks.BLACK_CONCRETE_SLAB);


        redPool.wall(ModBlocks.RED_CONCRETE_WALL);
        bluePool.wall(ModBlocks.BLUE_CONCRETE_WALL);
        lightBluePool.wall(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
        whitePool.wall(ModBlocks.WHITE_CONCRETE_WALL);
        orangePool.wall(ModBlocks.ORANGE_CONCRETE_WALL);
        magentaPool.wall(ModBlocks.MAGENTA_CONCRETE_WALL);
        limePool.wall(ModBlocks.LIME_CONCRETE_WALL);
        yellowPool.wall(ModBlocks.YELLOW_CONCRETE_WALL);
        pinkPool.wall(ModBlocks.PINK_CONCRETE_WALL);
        grayPool.wall(ModBlocks.GRAY_CONCRETE_WALL);
        lightGrayPool.wall(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);
        cyanPool.wall(ModBlocks.CYAN_CONCRETE_WALL);
        purplePool.wall(ModBlocks.PURPLE_CONCRETE_WALL);
        brownPool.wall(ModBlocks.BROWN_CONCRETE_WALL);
        greenPool.wall(ModBlocks.GREEN_CONCRETE_WALL);
        blackPool.wall(ModBlocks.BLACK_CONCRETE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

}
