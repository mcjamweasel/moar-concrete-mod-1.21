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
import net.minecraft.util.Identifier;

public class ModBlocks {

    //Stairs functions.
    //Add one per colour.
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));

    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));


    //Slab functions.
    //Add one per colour.
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));

    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));

    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));

    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));

    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));

    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));

    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));

    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));

    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));

    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));

    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));

    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));

    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));

    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));


    //Wall functions.
    //Add one per colour.
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));

    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));

    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));

    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));

    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));

    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));

    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));

    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));

    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));

    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));

    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));

    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));

    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));

    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));

    
    //Registry methods
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoarConcrete.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(MoarConcrete.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    //Add an entry for each block to add the item.
    private static void addBLockToGroup(FabricItemGroupEntries entries){

        entries.add(WHITE_CONCRETE_STAIRS);
        entries.add(WHITE_CONCRETE_SLAB);
        entries.add(WHITE_CONCRETE_WALL);

        entries.add(LIGHT_GRAY_CONCRETE_STAIRS);
        entries.add(LIGHT_GRAY_CONCRETE_SLAB);
        entries.add(LIGHT_GRAY_CONCRETE_WALL);

        entries.add(GRAY_CONCRETE_STAIRS);
        entries.add(GRAY_CONCRETE_SLAB);
        entries.add(GRAY_CONCRETE_WALL);

        entries.add(BLACK_CONCRETE_STAIRS);
        entries.add(BLACK_CONCRETE_SLAB);
        entries.add(BLACK_CONCRETE_WALL);

        entries.add(BROWN_CONCRETE_STAIRS);
        entries.add(BROWN_CONCRETE_SLAB);
        entries.add(BROWN_CONCRETE_WALL);

        entries.add(RED_CONCRETE_STAIRS);
        entries.add(RED_CONCRETE_SLAB);
        entries.add(RED_CONCRETE_WALL);

        entries.add(ORANGE_CONCRETE_STAIRS);
        entries.add(ORANGE_CONCRETE_SLAB);
        entries.add(ORANGE_CONCRETE_WALL);

        entries.add(YELLOW_CONCRETE_STAIRS);
        entries.add(YELLOW_CONCRETE_SLAB);
        entries.add(YELLOW_CONCRETE_WALL);

        entries.add(LIME_CONCRETE_STAIRS);
        entries.add(LIME_CONCRETE_SLAB);
        entries.add(LIME_CONCRETE_WALL);

        entries.add(GREEN_CONCRETE_STAIRS);
        entries.add(GREEN_CONCRETE_SLAB);
        entries.add(GREEN_CONCRETE_WALL);

        entries.add(CYAN_CONCRETE_STAIRS);
        entries.add(CYAN_CONCRETE_SLAB);
        entries.add(CYAN_CONCRETE_WALL);

        entries.add(LIGHT_BLUE_CONCRETE_STAIRS);
        entries.add(LIGHT_BLUE_CONCRETE_SLAB);
        entries.add(LIGHT_BLUE_CONCRETE_WALL);

        entries.add(BLUE_CONCRETE_STAIRS);
        entries.add(BLUE_CONCRETE_SLAB);
        entries.add(BLUE_CONCRETE_WALL);

        entries.add(PURPLE_CONCRETE_STAIRS);
        entries.add(PURPLE_CONCRETE_SLAB);
        entries.add(PURPLE_CONCRETE_WALL);

        entries.add(MAGENTA_CONCRETE_STAIRS);
        entries.add(MAGENTA_CONCRETE_SLAB);
        entries.add(MAGENTA_CONCRETE_WALL);

        entries.add(PINK_CONCRETE_STAIRS);
        entries.add(PINK_CONCRETE_SLAB);
        entries.add(PINK_CONCRETE_WALL);

    }


    public static void registerModBlocks(){
        MoarConcrete.LOGGER.info("Registering ModBlocks for " + MoarConcrete.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModBlocks::addBLockToGroup);
    }


}
