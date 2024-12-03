package net.mcjamweasel.moarconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mcjamweasel.moarconcrete.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.WHITE_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLACK_CONCRETE_STAIRS);
        addDrop(ModBlocks.BROWN_CONCRETE_STAIRS);
        addDrop(ModBlocks.RED_CONCRETE_STAIRS);
        addDrop(ModBlocks.ORANGE_CONCRETE_STAIRS);
        addDrop(ModBlocks.YELLOW_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIME_CONCRETE_STAIRS);
        addDrop(ModBlocks.GREEN_CONCRETE_STAIRS);
        addDrop(ModBlocks.CYAN_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.PURPLE_CONCRETE_STAIRS);
        addDrop(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        addDrop(ModBlocks.PINK_CONCRETE_STAIRS);

        addDrop(ModBlocks.WHITE_CONCRETE_SLAB, slabDrops(ModBlocks.WHITE_CONCRETE_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        addDrop(ModBlocks.GRAY_CONCRETE_SLAB, slabDrops(ModBlocks.GRAY_CONCRETE_SLAB));
        addDrop(ModBlocks.BLACK_CONCRETE_SLAB, slabDrops(ModBlocks.BLACK_CONCRETE_SLAB));
        addDrop(ModBlocks.BROWN_CONCRETE_SLAB, slabDrops(ModBlocks.BROWN_CONCRETE_SLAB));
        addDrop(ModBlocks.RED_CONCRETE_SLAB, slabDrops(ModBlocks.RED_CONCRETE_SLAB));
        addDrop(ModBlocks.ORANGE_CONCRETE_SLAB, slabDrops(ModBlocks.ORANGE_CONCRETE_SLAB));
        addDrop(ModBlocks.YELLOW_CONCRETE_SLAB, slabDrops(ModBlocks.YELLOW_CONCRETE_SLAB));
        addDrop(ModBlocks.LIME_CONCRETE_SLAB, slabDrops(ModBlocks.LIME_CONCRETE_SLAB));
        addDrop(ModBlocks.GREEN_CONCRETE_SLAB, slabDrops(ModBlocks.GREEN_CONCRETE_SLAB));
        addDrop(ModBlocks.CYAN_CONCRETE_SLAB, slabDrops(ModBlocks.CYAN_CONCRETE_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        addDrop(ModBlocks.BLUE_CONCRETE_SLAB, slabDrops(ModBlocks.BLUE_CONCRETE_SLAB));
        addDrop(ModBlocks.PURPLE_CONCRETE_SLAB, slabDrops(ModBlocks.PURPLE_CONCRETE_SLAB));
        addDrop(ModBlocks.MAGENTA_CONCRETE_SLAB, slabDrops(ModBlocks.MAGENTA_CONCRETE_SLAB));
        addDrop(ModBlocks.PINK_CONCRETE_SLAB, slabDrops(ModBlocks.PINK_CONCRETE_SLAB));

        addDrop(ModBlocks.WHITE_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.WHITE_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.LIGHT_GRAY_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.GRAY_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.GRAY_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.BLACK_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.BLACK_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.BROWN_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.BROWN_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.RED_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.RED_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.ORANGE_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.ORANGE_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.YELLOW_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.YELLOW_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.LIME_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.LIME_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.GREEN_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.GREEN_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.CYAN_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.CYAN_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.LIGHT_BLUE_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.BLUE_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.BLUE_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.PURPLE_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.PURPLE_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.MAGENTA_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.MAGENTA_CONCRETE_BRICK_SLABS));
        addDrop(ModBlocks.PINK_CONCRETE_BRICK_SLABS, slabDrops(ModBlocks.PINK_CONCRETE_BRICK_SLABS));

        addDrop(ModBlocks.WHITE_CONCRETE_WALL);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);
        addDrop(ModBlocks.GRAY_CONCRETE_WALL);
        addDrop(ModBlocks.BLACK_CONCRETE_WALL);
        addDrop(ModBlocks.BROWN_CONCRETE_WALL);
        addDrop(ModBlocks.RED_CONCRETE_WALL);
        addDrop(ModBlocks.ORANGE_CONCRETE_WALL);
        addDrop(ModBlocks.YELLOW_CONCRETE_WALL);
        addDrop(ModBlocks.LIME_CONCRETE_WALL);
        addDrop(ModBlocks.GREEN_CONCRETE_WALL);
        addDrop(ModBlocks.CYAN_CONCRETE_WALL);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
        addDrop(ModBlocks.BLUE_CONCRETE_WALL);
        addDrop(ModBlocks.PURPLE_CONCRETE_WALL);
        addDrop(ModBlocks.MAGENTA_CONCRETE_WALL);
        addDrop(ModBlocks.PINK_CONCRETE_WALL);

        addDrop(ModBlocks.WHITE_CONCRETE_FENCE);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE);
        addDrop(ModBlocks.GRAY_CONCRETE_FENCE);
        addDrop(ModBlocks.BLACK_CONCRETE_FENCE);
        addDrop(ModBlocks.BROWN_CONCRETE_FENCE);
        addDrop(ModBlocks.RED_CONCRETE_FENCE);
        addDrop(ModBlocks.ORANGE_CONCRETE_FENCE);
        addDrop(ModBlocks.YELLOW_CONCRETE_FENCE);
        addDrop(ModBlocks.LIME_CONCRETE_FENCE);
        addDrop(ModBlocks.GREEN_CONCRETE_FENCE);
        addDrop(ModBlocks.CYAN_CONCRETE_FENCE);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE);
        addDrop(ModBlocks.BLUE_CONCRETE_FENCE);
        addDrop(ModBlocks.PURPLE_CONCRETE_FENCE);
        addDrop(ModBlocks.MAGENTA_CONCRETE_FENCE);
        addDrop(ModBlocks.PINK_CONCRETE_FENCE);

        addDrop(ModBlocks.WHITE_CONCRETE_GATE);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_GATE);
        addDrop(ModBlocks.GRAY_CONCRETE_GATE);
        addDrop(ModBlocks.BLACK_CONCRETE_GATE);
        addDrop(ModBlocks.BROWN_CONCRETE_GATE);
        addDrop(ModBlocks.RED_CONCRETE_GATE);
        addDrop(ModBlocks.ORANGE_CONCRETE_GATE);
        addDrop(ModBlocks.YELLOW_CONCRETE_GATE);
        addDrop(ModBlocks.LIME_CONCRETE_GATE);
        addDrop(ModBlocks.GREEN_CONCRETE_GATE);
        addDrop(ModBlocks.CYAN_CONCRETE_GATE);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_GATE);
        addDrop(ModBlocks.BLUE_CONCRETE_GATE);
        addDrop(ModBlocks.PURPLE_CONCRETE_GATE);
        addDrop(ModBlocks.MAGENTA_CONCRETE_GATE);
        addDrop(ModBlocks.PINK_CONCRETE_GATE);
        
        addDrop(ModBlocks.WHITE_CONCRETE_BUTTON);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON);
        addDrop(ModBlocks.GRAY_CONCRETE_BUTTON);
        addDrop(ModBlocks.BLACK_CONCRETE_BUTTON);
        addDrop(ModBlocks.BROWN_CONCRETE_BUTTON);
        addDrop(ModBlocks.RED_CONCRETE_BUTTON);
        addDrop(ModBlocks.ORANGE_CONCRETE_BUTTON);
        addDrop(ModBlocks.YELLOW_CONCRETE_BUTTON);
        addDrop(ModBlocks.LIME_CONCRETE_BUTTON);
        addDrop(ModBlocks.GREEN_CONCRETE_BUTTON);
        addDrop(ModBlocks.CYAN_CONCRETE_BUTTON);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON);
        addDrop(ModBlocks.BLUE_CONCRETE_BUTTON);
        addDrop(ModBlocks.PURPLE_CONCRETE_BUTTON);
        addDrop(ModBlocks.MAGENTA_CONCRETE_BUTTON);
        addDrop(ModBlocks.PINK_CONCRETE_BUTTON);

        addDrop(ModBlocks.WHITE_CONCRETE_BRICKS);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS);
        addDrop(ModBlocks.GRAY_CONCRETE_BRICKS);
        addDrop(ModBlocks.BLACK_CONCRETE_BRICKS);
        addDrop(ModBlocks.BROWN_CONCRETE_BRICKS);
        addDrop(ModBlocks.RED_CONCRETE_BRICKS);
        addDrop(ModBlocks.ORANGE_CONCRETE_BRICKS);
        addDrop(ModBlocks.YELLOW_CONCRETE_BRICKS);
        addDrop(ModBlocks.LIME_CONCRETE_BRICKS);
        addDrop(ModBlocks.GREEN_CONCRETE_BRICKS);
        addDrop(ModBlocks.CYAN_CONCRETE_BRICKS);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS);
        addDrop(ModBlocks.BLUE_CONCRETE_BRICKS);
        addDrop(ModBlocks.PURPLE_CONCRETE_BRICKS);
        addDrop(ModBlocks.MAGENTA_CONCRETE_BRICKS);
        addDrop(ModBlocks.PINK_CONCRETE_BRICKS);

        addDrop(ModBlocks.WHITE_CONCRETE_PANEL);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_PANEL);
        addDrop(ModBlocks.GRAY_CONCRETE_PANEL);
        addDrop(ModBlocks.BLACK_CONCRETE_PANEL);
        addDrop(ModBlocks.BROWN_CONCRETE_PANEL);
        addDrop(ModBlocks.RED_CONCRETE_PANEL);
        addDrop(ModBlocks.ORANGE_CONCRETE_PANEL);
        addDrop(ModBlocks.YELLOW_CONCRETE_PANEL);
        addDrop(ModBlocks.LIME_CONCRETE_PANEL);
        addDrop(ModBlocks.GREEN_CONCRETE_PANEL);
        addDrop(ModBlocks.CYAN_CONCRETE_PANEL);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_PANEL);
        addDrop(ModBlocks.BLUE_CONCRETE_PANEL);
        addDrop(ModBlocks.PURPLE_CONCRETE_PANEL);
        addDrop(ModBlocks.MAGENTA_CONCRETE_PANEL);
        addDrop(ModBlocks.PINK_CONCRETE_PANEL);

    }
}
