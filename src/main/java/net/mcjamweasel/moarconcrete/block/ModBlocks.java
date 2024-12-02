package net.mcjamweasel.moarconcrete.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mcjamweasel.moarconcrete.MoarConcrete;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {

//Stairs functions.
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "white_concrete_stairs")))));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_gray_concrete_stairs")))));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "gray_concrete_stairs")))));

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "black_concrete_stairs")))));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "brown_concrete_stairs")))));

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.RED_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "red_concrete_stairs")))));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "orange_concrete_stairs")))));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "yellow_concrete_stairs")))));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "lime_concrete_stairs")))));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "green_concrete_stairs")))));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "cyan_concrete_stairs")))));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_blue_concrete_stairs")))));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "blue_concrete_stairs")))));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "purple_concrete_stairs")))));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "magenta_concrete_stairs")))));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "pink_concrete_stairs")))));


//Slab functions.
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "white_concrete_slab")))));

    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_gray_concrete_slab")))));

    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "gray_concrete_slab")))));

    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "black_concrete_slab")))));

    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "brown_concrete_slab")))));

    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "red_concrete_slab")))));

    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "orange_concrete_slab")))));

    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "yellow_concrete_slab")))));

    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "lime_concrete_slab")))));

    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "green_concrete_slab")))));

    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "cyan_concrete_slab")))));

    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_blue_concrete_slab")))));

    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "blue_concrete_slab")))));

    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "purple_concrete_slab")))));

    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "magenta_concrete_slab")))));

    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "pink_concrete_slab")))));


//Wall functions.
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
        new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "white_concrete_wall")))));

    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_gray_concrete_wall")))));

    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "gray_concrete_wall")))));

    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "black_concrete_wall")))));

    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "brown_concrete_wall")))));

    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "red_concrete_wall")))));

    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "orange_concrete_wall")))));

    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "yellow_concrete_wall")))));

    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "lime_concrete_wall")))));

    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "green_concrete_wall")))));

    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "cyan_concrete_wall")))));

    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_blue_concrete_wall")))));

    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "blue_concrete_wall")))));

    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "purple_concrete_wall")))));

    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "magenta_concrete_wall")))));

    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "pink_concrete_wall")))));


//Fence & Gate functions.
    public static final Block WHITE_CONCRETE_FENCE = registerBlock("white_concrete_fence",
        new FenceBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "white_concrete_fence")))));
    public static final Block WHITE_CONCRETE_GATE = registerBlock("white_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "white_concrete_gate")))));

    public static final Block LIGHT_GRAY_CONCRETE_FENCE = registerBlock("light_gray_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_gray_concrete_fence")))));
    public static final Block LIGHT_GRAY_CONCRETE_GATE = registerBlock("light_gray_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_gray_concrete_gate")))));

    public static final Block GRAY_CONCRETE_FENCE = registerBlock("gray_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "gray_concrete_fence")))));
    public static final Block GRAY_CONCRETE_GATE = registerBlock("gray_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "gray_concrete_gate")))));

    public static final Block BLACK_CONCRETE_FENCE = registerBlock("black_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "black_concrete_fence")))));
    public static final Block BLACK_CONCRETE_GATE = registerBlock("black_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "black_concrete_gate")))));

    public static final Block BROWN_CONCRETE_FENCE = registerBlock("brown_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "brown_concrete_fence")))));
    public static final Block BROWN_CONCRETE_GATE = registerBlock("brown_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "brown_concrete_gate")))));

    public static final Block RED_CONCRETE_FENCE = registerBlock("red_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "red_concrete_fence")))));
    public static final Block RED_CONCRETE_GATE = registerBlock("red_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "red_concrete_gate")))));

    public static final Block ORANGE_CONCRETE_FENCE = registerBlock("orange_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "orange_concrete_fence")))));
    public static final Block ORANGE_CONCRETE_GATE = registerBlock("orange_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "orange_concrete_gate")))));

    public static final Block YELLOW_CONCRETE_FENCE = registerBlock("yellow_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "yellow_concrete_fence")))));
    public static final Block YELLOW_CONCRETE_GATE = registerBlock("yellow_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "yellow_concrete_gate")))));

    public static final Block LIME_CONCRETE_FENCE = registerBlock("lime_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "lime_concrete_fence")))));
    public static final Block LIME_CONCRETE_GATE = registerBlock("lime_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "lime_concrete_gate")))));

    public static final Block GREEN_CONCRETE_FENCE = registerBlock("green_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "green_concrete_fence")))));
    public static final Block GREEN_CONCRETE_GATE = registerBlock("green_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "green_concrete_gate")))));

    public static final Block CYAN_CONCRETE_FENCE = registerBlock("cyan_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "cyan_concrete_fence")))));
    public static final Block CYAN_CONCRETE_GATE = registerBlock("cyan_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "cyan_concrete_gate")))));

    public static final Block LIGHT_BLUE_CONCRETE_FENCE = registerBlock("light_blue_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_blue_concrete_fence")))));
    public static final Block LIGHT_BLUE_CONCRETE_GATE = registerBlock("light_blue_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_blue_concrete_gate")))));

    public static final Block BLUE_CONCRETE_FENCE = registerBlock("blue_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "blue_concrete_fence")))));
    public static final Block BLUE_CONCRETE_GATE = registerBlock("blue_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "blue_concrete_gate")))));

    public static final Block PURPLE_CONCRETE_FENCE = registerBlock("purple_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "purple_concrete_fence")))));
    public static final Block PURPLE_CONCRETE_GATE = registerBlock("purple_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "purple_concrete_gate")))));

    public static final Block MAGENTA_CONCRETE_FENCE = registerBlock("magenta_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "magenta_concrete_fence")))));
    public static final Block MAGENTA_CONCRETE_GATE = registerBlock("magenta_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "magenta_concrete_gate")))));

    public static final Block PINK_CONCRETE_FENCE = registerBlock("pink_concrete_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "pink_concrete_fence")))));
    public static final Block PINK_CONCRETE_GATE = registerBlock("pink_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "pink_concrete_gate")))));

//Button functions
    public static final Block WHITE_CONCRETE_BUTTON = registerBlock("white_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "white_concrete_button")))));

    public static final Block LIGHT_GRAY_CONCRETE_BUTTON = registerBlock("light_gray_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_gray_concrete_button")))));

    public static final Block GRAY_CONCRETE_BUTTON = registerBlock("gray_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "gray_concrete_button")))));

    public static final Block BLACK_CONCRETE_BUTTON = registerBlock("black_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "black_concrete_button")))));

    public static final Block BROWN_CONCRETE_BUTTON = registerBlock("brown_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "brown_concrete_button")))));

    public static final Block RED_CONCRETE_BUTTON = registerBlock("red_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "red_concrete_button")))));

    public static final Block ORANGE_CONCRETE_BUTTON = registerBlock("orange_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "orange_concrete_button")))));

    public static final Block YELLOW_CONCRETE_BUTTON = registerBlock("yellow_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "yellow_concrete_button")))));

    public static final Block LIME_CONCRETE_BUTTON = registerBlock("lime_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "lime_concrete_button")))));

    public static final Block GREEN_CONCRETE_BUTTON = registerBlock("green_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "green_concrete_button")))));

    public static final Block CYAN_CONCRETE_BUTTON = registerBlock("cyan_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "cyan_concrete_button")))));

    public static final Block LIGHT_BLUE_CONCRETE_BUTTON = registerBlock("light_blue_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_blue_concrete_button")))));

    public static final Block BLUE_CONCRETE_BUTTON = registerBlock("blue_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "blue_concrete_button")))));

    public static final Block PURPLE_CONCRETE_BUTTON = registerBlock("purple_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "purple_concrete_button")))));

    public static final Block MAGENTA_CONCRETE_BUTTON = registerBlock("magenta_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "magenta_concrete_button")))));

    public static final Block PINK_CONCRETE_BUTTON = registerBlock("pink_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "pink_concrete_button")))));


//Bricks functions
    public static final Block WHITE_CONCRETE_BRICKS = registerBlock("white_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "white_concrete_bricks")))));

    public static final Block LIGHT_GRAY_CONCRETE_BRICKS = registerBlock("light_gray_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_gray_concrete_bricks")))));

    public static final Block GRAY_CONCRETE_BRICKS = registerBlock("gray_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "gray_concrete_bricks")))));

    public static final Block BLACK_CONCRETE_BRICKS = registerBlock("black_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "black_concrete_bricks")))));

    public static final Block BROWN_CONCRETE_BRICKS = registerBlock("brown_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "brown_concrete_bricks")))));

    public static final Block RED_CONCRETE_BRICKS = registerBlock("red_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "red_concrete_bricks")))));

    public static final Block ORANGE_CONCRETE_BRICKS = registerBlock("orange_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "orange_concrete_bricks")))));

    public static final Block YELLOW_CONCRETE_BRICKS = registerBlock("yellow_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "yellow_concrete_bricks")))));

    public static final Block LIME_CONCRETE_BRICKS = registerBlock("lime_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "lime_concrete_bricks")))));

    public static final Block GREEN_CONCRETE_BRICKS = registerBlock("green_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "green_concrete_bricks")))));

    public static final Block CYAN_CONCRETE_BRICKS = registerBlock("cyan_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "cyan_concrete_bricks")))));

    public static final Block LIGHT_BLUE_CONCRETE_BRICKS = registerBlock("light_blue_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_blue_concrete_bricks")))));

    public static final Block BLUE_CONCRETE_BRICKS = registerBlock("blue_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "blue_concrete_bricks")))));

    public static final Block PURPLE_CONCRETE_BRICKS = registerBlock("purple_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "purple_concrete_bricks")))));

    public static final Block MAGENTA_CONCRETE_BRICKS = registerBlock("magenta_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "magenta_concrete_bricks")))));

    public static final Block PINK_CONCRETE_BRICKS = registerBlock("pink_concrete_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "pink_concrete_bricks")))));


//Brick Slabs functions
    public static final Block WHITE_CONCRETE_BRICK_SLABS = registerBlock("white_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "white_concrete_brick_slabs")))));

    public static final Block LIGHT_GRAY_CONCRETE_BRICK_SLABS = registerBlock("light_gray_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_gray_concrete_brick_slabs")))));

    public static final Block GRAY_CONCRETE_BRICK_SLABS = registerBlock("gray_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "gray_concrete_brick_slabs")))));

    public static final Block BLACK_CONCRETE_BRICK_SLABS = registerBlock("black_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "black_concrete_brick_slabs")))));

    public static final Block BROWN_CONCRETE_BRICK_SLABS = registerBlock("brown_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "brown_concrete_brick_slabs")))));

    public static final Block RED_CONCRETE_BRICK_SLABS = registerBlock("red_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "red_concrete_brick_slabs")))));

    public static final Block ORANGE_CONCRETE_BRICK_SLABS = registerBlock("orange_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "orange_concrete_brick_slabs")))));

    public static final Block YELLOW_CONCRETE_BRICK_SLABS = registerBlock("yellow_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "yellow_concrete_brick_slabs")))));

    public static final Block LIME_CONCRETE_BRICK_SLABS = registerBlock("lime_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "lime_concrete_brick_slabs")))));

    public static final Block GREEN_CONCRETE_BRICK_SLABS = registerBlock("green_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "green_concrete_brick_slabs")))));

    public static final Block CYAN_CONCRETE_BRICK_SLABS = registerBlock("cyan_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "cyan_concrete_brick_slabs")))));

    public static final Block LIGHT_BLUE_CONCRETE_BRICK_SLABS = registerBlock("light_blue_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_blue_concrete_brick_slabs")))));

    public static final Block BLUE_CONCRETE_BRICK_SLABS = registerBlock("blue_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "blue_concrete_brick_slabs")))));

    public static final Block PURPLE_CONCRETE_BRICK_SLABS = registerBlock("purple_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "purple_concrete_brick_slabs")))));

    public static final Block MAGENTA_CONCRETE_BRICK_SLABS = registerBlock("magenta_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "magenta_concrete_brick_slabs")))));

    public static final Block PINK_CONCRETE_BRICK_SLABS = registerBlock("pink_concrete_brick_slabs",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "pink_concrete_brick_slabs")))));


//Panel functions. Need one helper and one panel for each colour. The helper sets the texture.
    //public static final Block WHITE_CONCRETE_PANEL = registerBlock("white_concrete_panel",
    //    new PaneBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "white_concrete_panel")))));

    public static final Block LIGHT_GRAY_CONCRETE_HELPER = registerBlock("light_gray_concrete_helper",
            new Block(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_gray_concrete_helper")))));

    public static final Block LIGHT_GRAY_CONCRETE_PANEL = registerBlock("light_gray_concrete_panel",
            new PaneBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "light_gray_concrete_panel")))));

    //public static final Block BLACK_CONCRETE_PANEL = registerBlock("black_concrete_panel",
    //        new PaneBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "black_concrete_panel")))));

    //public static final Block PINK_CONCRETE_PANEL = registerBlock("pink_concrete_panel",
    //        new PaneBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MoarConcrete.MOD_ID, "pink_concrete_panel")))));

//Registry methods
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoarConcrete.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(MoarConcrete.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoarConcrete.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }


//Add an entry for each block to add the block to the creative menu coloured blocks category.
    private static void addBLockToGroup(FabricItemGroupEntries entries){

        entries.add(WHITE_CONCRETE_STAIRS);
        entries.add(WHITE_CONCRETE_SLAB);
        entries.add(WHITE_CONCRETE_WALL);
        entries.add(WHITE_CONCRETE_FENCE);
        entries.add(WHITE_CONCRETE_GATE);
        entries.add(WHITE_CONCRETE_BRICKS);
        entries.add(WHITE_CONCRETE_BRICK_SLABS);
        //entries.add(WHITE_CONCRETE_PANEL);

        entries.add(LIGHT_GRAY_CONCRETE_STAIRS);
        entries.add(LIGHT_GRAY_CONCRETE_SLAB);
        entries.add(LIGHT_GRAY_CONCRETE_WALL);
        entries.add(LIGHT_GRAY_CONCRETE_FENCE);
        entries.add(LIGHT_GRAY_CONCRETE_GATE);
        entries.add(LIGHT_GRAY_CONCRETE_BRICKS);
        entries.add(LIGHT_GRAY_CONCRETE_BRICK_SLABS);
        entries.add(LIGHT_GRAY_CONCRETE_PANEL);
        entries.add(LIGHT_GRAY_CONCRETE_HELPER);

        entries.add(GRAY_CONCRETE_STAIRS);
        entries.add(GRAY_CONCRETE_SLAB);
        entries.add(GRAY_CONCRETE_WALL);
        entries.add(GRAY_CONCRETE_FENCE);
        entries.add(GRAY_CONCRETE_GATE);
        entries.add(GRAY_CONCRETE_BRICKS);
        entries.add(GRAY_CONCRETE_BRICK_SLABS);

        entries.add(BLACK_CONCRETE_STAIRS);
        entries.add(BLACK_CONCRETE_SLAB);
        entries.add(BLACK_CONCRETE_WALL);
        entries.add(BLACK_CONCRETE_FENCE);
        entries.add(BLACK_CONCRETE_GATE);
        entries.add(BLACK_CONCRETE_BRICKS);
        entries.add(BLACK_CONCRETE_BRICK_SLABS);
        //entries.add(BLACK_CONCRETE_PANEL);

        entries.add(BROWN_CONCRETE_STAIRS);
        entries.add(BROWN_CONCRETE_SLAB);
        entries.add(BROWN_CONCRETE_WALL);
        entries.add(BROWN_CONCRETE_FENCE);
        entries.add(BROWN_CONCRETE_GATE);
        entries.add(BROWN_CONCRETE_BRICKS);
        entries.add(BROWN_CONCRETE_BRICK_SLABS);

        entries.add(RED_CONCRETE_STAIRS);
        entries.add(RED_CONCRETE_SLAB);
        entries.add(RED_CONCRETE_WALL);
        entries.add(RED_CONCRETE_FENCE);
        entries.add(RED_CONCRETE_GATE);
        entries.add(RED_CONCRETE_BRICKS);
        entries.add(RED_CONCRETE_BRICK_SLABS);

        entries.add(ORANGE_CONCRETE_STAIRS);
        entries.add(ORANGE_CONCRETE_SLAB);
        entries.add(ORANGE_CONCRETE_WALL);
        entries.add(ORANGE_CONCRETE_FENCE);
        entries.add(ORANGE_CONCRETE_GATE);
        entries.add(ORANGE_CONCRETE_BRICKS);
        entries.add(ORANGE_CONCRETE_BRICK_SLABS);

        entries.add(YELLOW_CONCRETE_STAIRS);
        entries.add(YELLOW_CONCRETE_SLAB);
        entries.add(YELLOW_CONCRETE_WALL);
        entries.add(YELLOW_CONCRETE_FENCE);
        entries.add(YELLOW_CONCRETE_GATE);
        entries.add(YELLOW_CONCRETE_BRICKS);
        entries.add(YELLOW_CONCRETE_BRICK_SLABS);

        entries.add(LIME_CONCRETE_STAIRS);
        entries.add(LIME_CONCRETE_SLAB);
        entries.add(LIME_CONCRETE_WALL);
        entries.add(LIME_CONCRETE_FENCE);
        entries.add(LIME_CONCRETE_GATE);
        entries.add(LIME_CONCRETE_BRICKS);
        entries.add(LIME_CONCRETE_BRICK_SLABS);

        entries.add(GREEN_CONCRETE_STAIRS);
        entries.add(GREEN_CONCRETE_SLAB);
        entries.add(GREEN_CONCRETE_WALL);
        entries.add(GREEN_CONCRETE_FENCE);
        entries.add(GREEN_CONCRETE_GATE);
        entries.add(GREEN_CONCRETE_BRICKS);
        entries.add(GREEN_CONCRETE_BRICK_SLABS);

        entries.add(CYAN_CONCRETE_STAIRS);
        entries.add(CYAN_CONCRETE_SLAB);
        entries.add(CYAN_CONCRETE_WALL);
        entries.add(CYAN_CONCRETE_FENCE);
        entries.add(CYAN_CONCRETE_GATE);
        entries.add(CYAN_CONCRETE_BRICKS);
        entries.add(CYAN_CONCRETE_BRICK_SLABS);

        entries.add(LIGHT_BLUE_CONCRETE_STAIRS);
        entries.add(LIGHT_BLUE_CONCRETE_SLAB);
        entries.add(LIGHT_BLUE_CONCRETE_WALL);
        entries.add(LIGHT_BLUE_CONCRETE_FENCE);
        entries.add(LIGHT_BLUE_CONCRETE_GATE);
        entries.add(LIGHT_BLUE_CONCRETE_BRICKS);
        entries.add(LIGHT_BLUE_CONCRETE_BRICK_SLABS);

        entries.add(BLUE_CONCRETE_STAIRS);
        entries.add(BLUE_CONCRETE_SLAB);
        entries.add(BLUE_CONCRETE_WALL);
        entries.add(BLUE_CONCRETE_FENCE);
        entries.add(BLUE_CONCRETE_GATE);
        entries.add(BLUE_CONCRETE_BRICKS);
        entries.add(BLUE_CONCRETE_BRICK_SLABS);

        entries.add(PURPLE_CONCRETE_STAIRS);
        entries.add(PURPLE_CONCRETE_SLAB);
        entries.add(PURPLE_CONCRETE_WALL);
        entries.add(PURPLE_CONCRETE_FENCE);
        entries.add(PURPLE_CONCRETE_GATE);
        entries.add(PURPLE_CONCRETE_BRICKS);
        entries.add(PURPLE_CONCRETE_BRICK_SLABS);

        entries.add(MAGENTA_CONCRETE_STAIRS);
        entries.add(MAGENTA_CONCRETE_SLAB);
        entries.add(MAGENTA_CONCRETE_WALL);
        entries.add(MAGENTA_CONCRETE_GATE);
        entries.add(MAGENTA_CONCRETE_FENCE);
        entries.add(MAGENTA_CONCRETE_BRICKS);
        entries.add(MAGENTA_CONCRETE_BRICK_SLABS);

        entries.add(PINK_CONCRETE_STAIRS);
        entries.add(PINK_CONCRETE_SLAB);
        entries.add(PINK_CONCRETE_WALL);
        entries.add(PINK_CONCRETE_FENCE);
        entries.add(PINK_CONCRETE_GATE);
        entries.add(PINK_CONCRETE_BRICKS);
        entries.add(PINK_CONCRETE_BRICK_SLABS);

        //entries.add(PINK_CONCRETE_PANEL);
    }


//Add an entry for each block to add the block to the creative menu redstone blocks category.
    private static void addButtonToGroup(FabricItemGroupEntries entries){

    //Buttons
        entries.add(WHITE_CONCRETE_BUTTON);
        entries.add(LIGHT_GRAY_CONCRETE_BUTTON);
        entries.add(GRAY_CONCRETE_BUTTON);
        entries.add(BLACK_CONCRETE_BUTTON);
        entries.add(BROWN_CONCRETE_BUTTON);
        entries.add(RED_CONCRETE_BUTTON);
        entries.add(ORANGE_CONCRETE_BUTTON);
        entries.add(YELLOW_CONCRETE_BUTTON);
        entries.add(LIME_CONCRETE_BUTTON);
        entries.add(GREEN_CONCRETE_BUTTON);
        entries.add(CYAN_CONCRETE_BUTTON);
        entries.add(LIGHT_BLUE_CONCRETE_BUTTON);
        entries.add(BLUE_CONCRETE_BUTTON);
        entries.add(PURPLE_CONCRETE_BUTTON);
        entries.add(MAGENTA_CONCRETE_BUTTON);
        entries.add(PINK_CONCRETE_BUTTON);
    }


//Registers the blocks to the creative menus.
    public static void registerModBlocks(){
        MoarConcrete.LOGGER.info("Registering ModBlocks for " + MoarConcrete.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModBlocks::addBLockToGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModBlocks::addButtonToGroup);
    }
}
