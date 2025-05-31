package net.mcjamweasel.moarconcrete;

import net.mcjamweasel.moarconcrete.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.ArrayList;
import java.util.List;

public class ModBlockGroups {

    //Creates a data structure to map Moar Concrete blocks to their vanilla parent.
    public record MCBlock(Block customBlock, Block vanillaSource, Block textureBlock) {}


    //For each block type, create a List containing each Block
    public static final List<MCBlock> MC_STAIRS = List.of(
            new MCBlock(ModBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE, null),
            new MCBlock(ModBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE, null),
            new MCBlock(ModBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE, null),
            new MCBlock(ModBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE, null),
            new MCBlock(ModBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE, null),
            new MCBlock(ModBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE, null),
            new MCBlock(ModBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE, null),
            new MCBlock(ModBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE, null),
            new MCBlock(ModBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE, null),
            new MCBlock(ModBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE, null)
    );

    public static final List<MCBlock> MC_WALL = List.of(
            new MCBlock(ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE, null),
            new MCBlock(ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE, null),
            new MCBlock(ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE, null),
            new MCBlock(ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE, null),
            new MCBlock(ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE, null),
            new MCBlock(ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE, null),
            new MCBlock(ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE, null),
            new MCBlock(ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE, null),
            new MCBlock(ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE, null),
            new MCBlock(ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE, null)
    );

    public static final List<MCBlock> MC_SLAB = List.of(
            new MCBlock(ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE, null),
            new MCBlock(ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE, null),
            new MCBlock(ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE, null),
            new MCBlock(ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE, null),
            new MCBlock(ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE, null),
            new MCBlock(ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE, null),
            new MCBlock(ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE, null),
            new MCBlock(ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE, null),
            new MCBlock(ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE, null),
            new MCBlock(ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE, null)
    );

    public static final List<MCBlock> MC_FENCE = List.of(
            new MCBlock(ModBlocks.WHITE_CONCRETE_FENCE, Blocks.WHITE_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE, Blocks.LIGHT_GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.GRAY_CONCRETE_FENCE, Blocks.GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.BLACK_CONCRETE_FENCE, Blocks.BLACK_CONCRETE, null),
            new MCBlock(ModBlocks.BROWN_CONCRETE_FENCE, Blocks.BROWN_CONCRETE, null),
            new MCBlock(ModBlocks.RED_CONCRETE_FENCE, Blocks.RED_CONCRETE, null),
            new MCBlock(ModBlocks.ORANGE_CONCRETE_FENCE, Blocks.ORANGE_CONCRETE, null),
            new MCBlock(ModBlocks.YELLOW_CONCRETE_FENCE, Blocks.YELLOW_CONCRETE, null),
            new MCBlock(ModBlocks.LIME_CONCRETE_FENCE, Blocks.LIME_CONCRETE, null),
            new MCBlock(ModBlocks.GREEN_CONCRETE_FENCE, Blocks.GREEN_CONCRETE, null),
            new MCBlock(ModBlocks.CYAN_CONCRETE_FENCE, Blocks.CYAN_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE, Blocks.LIGHT_BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.BLUE_CONCRETE_FENCE, Blocks.BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.PURPLE_CONCRETE_FENCE, Blocks.PURPLE_CONCRETE, null),
            new MCBlock(ModBlocks.MAGENTA_CONCRETE_FENCE, Blocks.MAGENTA_CONCRETE, null),
            new MCBlock(ModBlocks.PINK_CONCRETE_FENCE, Blocks.PINK_CONCRETE, null)
    );

    public static final List<MCBlock> MC_GATE = List.of(
            new MCBlock(ModBlocks.WHITE_CONCRETE_GATE, Blocks.WHITE_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_GRAY_CONCRETE_GATE, Blocks.LIGHT_GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.GRAY_CONCRETE_GATE, Blocks.GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.BLACK_CONCRETE_GATE, Blocks.BLACK_CONCRETE, null),
            new MCBlock(ModBlocks.BROWN_CONCRETE_GATE, Blocks.BROWN_CONCRETE, null),
            new MCBlock(ModBlocks.RED_CONCRETE_GATE, Blocks.RED_CONCRETE, null),
            new MCBlock(ModBlocks.ORANGE_CONCRETE_GATE, Blocks.ORANGE_CONCRETE, null),
            new MCBlock(ModBlocks.YELLOW_CONCRETE_GATE, Blocks.YELLOW_CONCRETE, null),
            new MCBlock(ModBlocks.LIME_CONCRETE_GATE, Blocks.LIME_CONCRETE, null),
            new MCBlock(ModBlocks.GREEN_CONCRETE_GATE, Blocks.GREEN_CONCRETE, null),
            new MCBlock(ModBlocks.CYAN_CONCRETE_GATE, Blocks.CYAN_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_BLUE_CONCRETE_GATE, Blocks.LIGHT_BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.BLUE_CONCRETE_GATE, Blocks.BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.PURPLE_CONCRETE_GATE, Blocks.PURPLE_CONCRETE, null),
            new MCBlock(ModBlocks.MAGENTA_CONCRETE_GATE, Blocks.MAGENTA_CONCRETE, null),
            new MCBlock(ModBlocks.PINK_CONCRETE_GATE, Blocks.PINK_CONCRETE, null)
    );

    public static final List<MCBlock> MC_BUTTON = List.of(
            new MCBlock(ModBlocks.WHITE_CONCRETE_BUTTON, Blocks.WHITE_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, Blocks.LIGHT_GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.GRAY_CONCRETE_BUTTON, Blocks.GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.BLACK_CONCRETE_BUTTON, Blocks.BLACK_CONCRETE, null),
            new MCBlock(ModBlocks.BROWN_CONCRETE_BUTTON, Blocks.BROWN_CONCRETE, null),
            new MCBlock(ModBlocks.RED_CONCRETE_BUTTON, Blocks.RED_CONCRETE, null),
            new MCBlock(ModBlocks.ORANGE_CONCRETE_BUTTON, Blocks.ORANGE_CONCRETE, null),
            new MCBlock(ModBlocks.YELLOW_CONCRETE_BUTTON, Blocks.YELLOW_CONCRETE, null),
            new MCBlock(ModBlocks.LIME_CONCRETE_BUTTON, Blocks.LIME_CONCRETE, null),
            new MCBlock(ModBlocks.GREEN_CONCRETE_BUTTON, Blocks.GREEN_CONCRETE, null),
            new MCBlock(ModBlocks.CYAN_CONCRETE_BUTTON, Blocks.CYAN_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, Blocks.LIGHT_BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.BLUE_CONCRETE_BUTTON, Blocks.BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.PURPLE_CONCRETE_BUTTON, Blocks.PURPLE_CONCRETE, null),
            new MCBlock(ModBlocks.MAGENTA_CONCRETE_BUTTON, Blocks.MAGENTA_CONCRETE, null),
            new MCBlock(ModBlocks.PINK_CONCRETE_BUTTON, Blocks.PINK_CONCRETE, null)
    );

    public static final List<MCBlock> MC_PANEL = List.of(
            new MCBlock(ModBlocks.WHITE_CONCRETE_PANEL, Blocks.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.LIGHT_GRAY_CONCRETE_PANEL, Blocks.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.GRAY_CONCRETE_PANEL, Blocks.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.BLACK_CONCRETE_PANEL, Blocks.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.BROWN_CONCRETE_PANEL, Blocks.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.RED_CONCRETE_PANEL, Blocks.RED_CONCRETE, ModBlocks.RED_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.ORANGE_CONCRETE_PANEL, Blocks.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.YELLOW_CONCRETE_PANEL, Blocks.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.LIME_CONCRETE_PANEL, Blocks.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.GREEN_CONCRETE_PANEL, Blocks.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.CYAN_CONCRETE_PANEL, Blocks.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.LIGHT_BLUE_CONCRETE_PANEL, Blocks.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.BLUE_CONCRETE_PANEL, Blocks.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.PURPLE_CONCRETE_PANEL, Blocks.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.MAGENTA_CONCRETE_PANEL, Blocks.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_TEXTURE),
            new MCBlock(ModBlocks.PINK_CONCRETE_PANEL, Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_TEXTURE)
    );

    public static final List<MCBlock> MC_BRICKS = List.of(
            new MCBlock(ModBlocks.WHITE_CONCRETE_BRICKS, Blocks.WHITE_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS, Blocks.LIGHT_GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.GRAY_CONCRETE_BRICKS, Blocks.GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.BLACK_CONCRETE_BRICKS, Blocks.BLACK_CONCRETE, null),
            new MCBlock(ModBlocks.BROWN_CONCRETE_BRICKS, Blocks.BROWN_CONCRETE, null),
            new MCBlock(ModBlocks.RED_CONCRETE_BRICKS, Blocks.RED_CONCRETE, null),
            new MCBlock(ModBlocks.ORANGE_CONCRETE_BRICKS, Blocks.ORANGE_CONCRETE, null),
            new MCBlock(ModBlocks.YELLOW_CONCRETE_BRICKS, Blocks.YELLOW_CONCRETE, null),
            new MCBlock(ModBlocks.LIME_CONCRETE_BRICKS, Blocks.LIME_CONCRETE, null),
            new MCBlock(ModBlocks.GREEN_CONCRETE_BRICKS, Blocks.GREEN_CONCRETE, null),
            new MCBlock(ModBlocks.CYAN_CONCRETE_BRICKS, Blocks.CYAN_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS, Blocks.LIGHT_BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.BLUE_CONCRETE_BRICKS, Blocks.BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.PURPLE_CONCRETE_BRICKS, Blocks.PURPLE_CONCRETE, null),
            new MCBlock(ModBlocks.MAGENTA_CONCRETE_BRICKS, Blocks.MAGENTA_CONCRETE, null),
            new MCBlock(ModBlocks.PINK_CONCRETE_BRICKS, Blocks.PINK_CONCRETE, null)
    );

    public static final List<MCBlock> MC_BRICK_SLAB = List.of(
            new MCBlock(ModBlocks.WHITE_CONCRETE_BRICK_SLAB, Blocks.WHITE_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_GRAY_CONCRETE_BRICK_SLAB, Blocks.LIGHT_GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.GRAY_CONCRETE_BRICK_SLAB, Blocks.GRAY_CONCRETE, null),
            new MCBlock(ModBlocks.BLACK_CONCRETE_BRICK_SLAB, Blocks.BLACK_CONCRETE, null),
            new MCBlock(ModBlocks.BROWN_CONCRETE_BRICK_SLAB, Blocks.BROWN_CONCRETE, null),
            new MCBlock(ModBlocks.RED_CONCRETE_BRICK_SLAB, Blocks.RED_CONCRETE, null),
            new MCBlock(ModBlocks.ORANGE_CONCRETE_BRICK_SLAB, Blocks.ORANGE_CONCRETE, null),
            new MCBlock(ModBlocks.YELLOW_CONCRETE_BRICK_SLAB, Blocks.YELLOW_CONCRETE, null),
            new MCBlock(ModBlocks.LIME_CONCRETE_BRICK_SLAB, Blocks.LIME_CONCRETE, null),
            new MCBlock(ModBlocks.GREEN_CONCRETE_BRICK_SLAB, Blocks.GREEN_CONCRETE, null),
            new MCBlock(ModBlocks.CYAN_CONCRETE_BRICK_SLAB, Blocks.CYAN_CONCRETE, null),
            new MCBlock(ModBlocks.LIGHT_BLUE_CONCRETE_BRICK_SLAB, Blocks.LIGHT_BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.BLUE_CONCRETE_BRICK_SLAB, Blocks.BLUE_CONCRETE, null),
            new MCBlock(ModBlocks.PURPLE_CONCRETE_BRICK_SLAB, Blocks.PURPLE_CONCRETE, null),
            new MCBlock(ModBlocks.MAGENTA_CONCRETE_BRICK_SLAB, Blocks.MAGENTA_CONCRETE, null),
            new MCBlock(ModBlocks.PINK_CONCRETE_BRICK_SLAB, Blocks.PINK_CONCRETE, null)
    );


    public static final List<List<MCBlock>> mcGroups = new ArrayList<>();

    static {
        mcGroups.add(MC_STAIRS);
        mcGroups.add(MC_SLAB);
        mcGroups.add(MC_WALL);
        mcGroups.add(MC_BRICKS);
        mcGroups.add(MC_BRICK_SLAB);
        mcGroups.add(MC_BUTTON);
        mcGroups.add(MC_FENCE);
        mcGroups.add(MC_GATE);
        mcGroups.add(MC_PANEL);        
    }

    
    public static final List<List<MCBlock>> mcSlabDropGroup = new ArrayList<>();

    static {
        mcSlabDropGroup.add(MC_SLAB);
        mcSlabDropGroup.add(MC_BRICK_SLAB);
    }

}
