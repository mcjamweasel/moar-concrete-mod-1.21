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
        entries.add(RED_CONCRETE_STAIRS);
        entries.add(RED_CONCRETE_SLAB);
        entries.add(WHITE_CONCRETE_STAIRS);
        entries.add(WHITE_CONCRETE_SLAB);
        entries.add(ORANGE_CONCRETE_STAIRS);
        entries.add(ORANGE_CONCRETE_SLAB);
        entries.add(MAGENTA_CONCRETE_STAIRS);
        entries.add(MAGENTA_CONCRETE_SLAB);
    }


    public static void registerModBlocks(){
        MoarConcrete.LOGGER.info("Registering ModBlocks for " + MoarConcrete.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModBlocks::addBLockToGroup);
    }


}
