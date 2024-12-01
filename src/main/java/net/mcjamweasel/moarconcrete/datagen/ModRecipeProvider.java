package net.mcjamweasel.moarconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mcjamweasel.moarconcrete.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {


    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


//Creates the recipes for each block, one set per colour.
//Stone cutting for stairs, slabs, walls, bricks.
//Crafting table for all.
    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

                //White
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.WHITE_CONCRETE))
                        .criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.WHITE_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.WHITE_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.WHITE_CONCRETE_BUTTON, 1)
                        .input(Blocks.WHITE_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_BRICKS, Blocks.WHITE_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.WHITE_CONCRETE))
                        .criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_BRICK_SLABS, Blocks.WHITE_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_BRICK_SLABS, Blocks.WHITE_CONCRETE);


                //Light Gray
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE))
                        .criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE), conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE), conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE), conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, 1)
                        .input(Blocks.LIGHT_GRAY_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE), conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS, Blocks.LIGHT_GRAY_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE))
                        .criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE), conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_BRICK_SLABS, Blocks.LIGHT_GRAY_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_BRICK_SLABS, Blocks.LIGHT_GRAY_CONCRETE);


                //Gray
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.GRAY_CONCRETE))
                        .criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.GRAY_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.GRAY_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.GRAY_CONCRETE_BUTTON, 1)
                        .input(Blocks.GRAY_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_BRICKS, Blocks.GRAY_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.GRAY_CONCRETE))
                        .criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_BRICK_SLABS, Blocks.GRAY_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_BRICK_SLABS, Blocks.GRAY_CONCRETE);


                //Black
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.BLACK_CONCRETE))
                        .criterion(hasItem(Blocks.BLACK_CONCRETE), conditionsFromItem(Blocks.BLACK_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.BLACK_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.BLACK_CONCRETE), conditionsFromItem(Blocks.BLACK_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.BLACK_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.BLACK_CONCRETE), conditionsFromItem(Blocks.BLACK_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.BLACK_CONCRETE_BUTTON, 1)
                        .input(Blocks.BLACK_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.BLACK_CONCRETE), conditionsFromItem(Blocks.BLACK_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_BRICKS, Blocks.BLACK_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.BLACK_CONCRETE))
                        .criterion(hasItem(Blocks.BLACK_CONCRETE), conditionsFromItem(Blocks.BLACK_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_BRICK_SLABS, Blocks.BLACK_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_BRICK_SLABS, Blocks.BLACK_CONCRETE);


                //Brown
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.BROWN_CONCRETE))
                        .criterion(hasItem(Blocks.BROWN_CONCRETE), conditionsFromItem(Blocks.BROWN_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.BROWN_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.BROWN_CONCRETE), conditionsFromItem(Blocks.BROWN_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.BROWN_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.BROWN_CONCRETE), conditionsFromItem(Blocks.BROWN_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.BROWN_CONCRETE_BUTTON, 1)
                        .input(Blocks.BROWN_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.BROWN_CONCRETE), conditionsFromItem(Blocks.BROWN_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_BRICKS, Blocks.BROWN_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.BROWN_CONCRETE))
                        .criterion(hasItem(Blocks.BROWN_CONCRETE), conditionsFromItem(Blocks.BROWN_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_BRICK_SLABS, Blocks.BROWN_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_BRICK_SLABS, Blocks.BROWN_CONCRETE);

                
                //Red
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.RED_CONCRETE))
                        .criterion(hasItem(Blocks.RED_CONCRETE), conditionsFromItem(Blocks.RED_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.RED_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.RED_CONCRETE), conditionsFromItem(Blocks.RED_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.RED_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.RED_CONCRETE), conditionsFromItem(Blocks.RED_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.RED_CONCRETE_BUTTON, 1)
                        .input(Blocks.RED_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.RED_CONCRETE), conditionsFromItem(Blocks.RED_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_BRICKS, Blocks.RED_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.RED_CONCRETE))
                        .criterion(hasItem(Blocks.RED_CONCRETE), conditionsFromItem(Blocks.RED_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_BRICK_SLABS, Blocks.RED_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_BRICK_SLABS, Blocks.RED_CONCRETE);
                
                
                //Orange
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.ORANGE_CONCRETE))
                        .criterion(hasItem(Blocks.ORANGE_CONCRETE), conditionsFromItem(Blocks.ORANGE_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.ORANGE_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.ORANGE_CONCRETE), conditionsFromItem(Blocks.ORANGE_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.ORANGE_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.ORANGE_CONCRETE), conditionsFromItem(Blocks.ORANGE_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.ORANGE_CONCRETE_BUTTON, 1)
                        .input(Blocks.ORANGE_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.ORANGE_CONCRETE), conditionsFromItem(Blocks.ORANGE_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_BRICKS, Blocks.ORANGE_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.ORANGE_CONCRETE))
                        .criterion(hasItem(Blocks.ORANGE_CONCRETE), conditionsFromItem(Blocks.ORANGE_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_BRICK_SLABS, Blocks.ORANGE_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_BRICK_SLABS, Blocks.ORANGE_CONCRETE);

                
                //Yellow
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.YELLOW_CONCRETE))
                        .criterion(hasItem(Blocks.YELLOW_CONCRETE), conditionsFromItem(Blocks.YELLOW_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.YELLOW_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.YELLOW_CONCRETE), conditionsFromItem(Blocks.YELLOW_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.YELLOW_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.YELLOW_CONCRETE), conditionsFromItem(Blocks.YELLOW_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.YELLOW_CONCRETE_BUTTON, 1)
                        .input(Blocks.YELLOW_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.YELLOW_CONCRETE), conditionsFromItem(Blocks.YELLOW_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_BRICKS, Blocks.YELLOW_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.YELLOW_CONCRETE))
                        .criterion(hasItem(Blocks.YELLOW_CONCRETE), conditionsFromItem(Blocks.YELLOW_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_BRICK_SLABS, Blocks.YELLOW_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_BRICK_SLABS, Blocks.YELLOW_CONCRETE);

                
                //Lime
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.LIME_CONCRETE))
                        .criterion(hasItem(Blocks.LIME_CONCRETE), conditionsFromItem(Blocks.LIME_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.LIME_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.LIME_CONCRETE), conditionsFromItem(Blocks.LIME_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.LIME_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.LIME_CONCRETE), conditionsFromItem(Blocks.LIME_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.LIME_CONCRETE_BUTTON, 1)
                        .input(Blocks.LIME_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.LIME_CONCRETE), conditionsFromItem(Blocks.LIME_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_BRICKS, Blocks.LIME_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.LIME_CONCRETE))
                        .criterion(hasItem(Blocks.LIME_CONCRETE), conditionsFromItem(Blocks.LIME_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_BRICK_SLABS, Blocks.LIME_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_BRICK_SLABS, Blocks.LIME_CONCRETE);

                
                //Green
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.GREEN_CONCRETE))
                        .criterion(hasItem(Blocks.GREEN_CONCRETE), conditionsFromItem(Blocks.GREEN_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.GREEN_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.GREEN_CONCRETE), conditionsFromItem(Blocks.GREEN_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.GREEN_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.GREEN_CONCRETE), conditionsFromItem(Blocks.GREEN_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.GREEN_CONCRETE_BUTTON, 1)
                        .input(Blocks.GREEN_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.GREEN_CONCRETE), conditionsFromItem(Blocks.GREEN_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_BRICKS, Blocks.GREEN_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.GREEN_CONCRETE))
                        .criterion(hasItem(Blocks.GREEN_CONCRETE), conditionsFromItem(Blocks.GREEN_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_BRICK_SLABS, Blocks.GREEN_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_BRICK_SLABS, Blocks.GREEN_CONCRETE);

                
                //Cyan
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.CYAN_CONCRETE))
                        .criterion(hasItem(Blocks.CYAN_CONCRETE), conditionsFromItem(Blocks.CYAN_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.CYAN_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.CYAN_CONCRETE), conditionsFromItem(Blocks.CYAN_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.CYAN_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.CYAN_CONCRETE), conditionsFromItem(Blocks.CYAN_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.CYAN_CONCRETE_BUTTON, 1)
                        .input(Blocks.CYAN_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.CYAN_CONCRETE), conditionsFromItem(Blocks.CYAN_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_BRICKS, Blocks.CYAN_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.CYAN_CONCRETE))
                        .criterion(hasItem(Blocks.CYAN_CONCRETE), conditionsFromItem(Blocks.CYAN_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_BRICK_SLABS, Blocks.CYAN_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_BRICK_SLABS, Blocks.CYAN_CONCRETE);

                
                //Light Blue
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE))
                        .criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE), conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE), conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE), conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, 1)
                        .input(Blocks.LIGHT_BLUE_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE), conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS, Blocks.LIGHT_BLUE_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE))
                        .criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE), conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_BRICK_SLABS, Blocks.LIGHT_BLUE_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_BRICK_SLABS, Blocks.LIGHT_BLUE_CONCRETE);
                

                //Blue
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.BLUE_CONCRETE))
                        .criterion(hasItem(Blocks.BLUE_CONCRETE), conditionsFromItem(Blocks.BLUE_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.BLUE_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.BLUE_CONCRETE), conditionsFromItem(Blocks.BLUE_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.BLUE_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.BLUE_CONCRETE), conditionsFromItem(Blocks.BLUE_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.BLUE_CONCRETE_BUTTON, 1)
                        .input(Blocks.BLUE_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.BLUE_CONCRETE), conditionsFromItem(Blocks.BLUE_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_BRICKS, Blocks.BLUE_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.BLUE_CONCRETE))
                        .criterion(hasItem(Blocks.BLUE_CONCRETE), conditionsFromItem(Blocks.BLUE_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_BRICK_SLABS, Blocks.BLUE_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_BRICK_SLABS, Blocks.BLUE_CONCRETE);
                

                //Purple
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.PURPLE_CONCRETE))
                        .criterion(hasItem(Blocks.PURPLE_CONCRETE), conditionsFromItem(Blocks.PURPLE_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.PURPLE_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.PURPLE_CONCRETE), conditionsFromItem(Blocks.PURPLE_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.PURPLE_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.PURPLE_CONCRETE), conditionsFromItem(Blocks.PURPLE_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.PURPLE_CONCRETE_BUTTON, 1)
                        .input(Blocks.PURPLE_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.PURPLE_CONCRETE), conditionsFromItem(Blocks.PURPLE_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_BRICKS, Blocks.PURPLE_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.PURPLE_CONCRETE))
                        .criterion(hasItem(Blocks.PURPLE_CONCRETE), conditionsFromItem(Blocks.PURPLE_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_BRICK_SLABS, Blocks.PURPLE_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_BRICK_SLABS, Blocks.PURPLE_CONCRETE);
                

                //Magenta
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.MAGENTA_CONCRETE))
                        .criterion(hasItem(Blocks.MAGENTA_CONCRETE), conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.MAGENTA_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.MAGENTA_CONCRETE), conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.MAGENTA_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.MAGENTA_CONCRETE), conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.MAGENTA_CONCRETE_BUTTON, 1)
                        .input(Blocks.MAGENTA_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.MAGENTA_CONCRETE), conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_BRICKS, Blocks.MAGENTA_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.MAGENTA_CONCRETE))
                        .criterion(hasItem(Blocks.MAGENTA_CONCRETE), conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_BRICK_SLABS, Blocks.MAGENTA_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_BRICK_SLABS, Blocks.MAGENTA_CONCRETE);

                
                //Pink
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_STAIRS, 4)
                        .pattern("C  ")
                        .pattern("CC ")
                        .pattern("CCC")
                        .input('C', Ingredient.ofItems(Blocks.PINK_CONCRETE))
                        .criterion(hasItem(Blocks.PINK_CONCRETE), conditionsFromItem(Blocks.PINK_CONCRETE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_FENCE, 3)
                        .pattern("CIC")
                        .pattern("CIC")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.PINK_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.PINK_CONCRETE), conditionsFromItem(Blocks.PINK_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_GATE, 1)
                        .pattern("ICI")
                        .pattern("ICI")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.PINK_CONCRETE))
                        .input('I', Ingredient.ofItems(Items.IRON_BARS))
                        .criterion(hasItem(Blocks.PINK_CONCRETE), conditionsFromItem(Blocks.PINK_CONCRETE))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.PINK_CONCRETE_BUTTON, 1)
                        .input(Blocks.PINK_CONCRETE)
                        .group("concrete_buttons")
                        .criterion(hasItem(Blocks.PINK_CONCRETE), conditionsFromItem(Blocks.PINK_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_BRICKS, Blocks.PINK_CONCRETE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_BRICKS, 4)
                        .pattern("CC ")
                        .pattern("CC ")
                        .pattern("   ")
                        .input('C', Ingredient.ofItems(Blocks.PINK_CONCRETE))
                        .criterion(hasItem(Blocks.PINK_CONCRETE), conditionsFromItem(Blocks.PINK_CONCRETE))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_BRICK_SLABS, Blocks.PINK_CONCRETE, 2);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_BRICK_SLABS, Blocks.PINK_CONCRETE);
            }
        };
    }

    @Override
    public String getName() {
            return "MoarConcrete Recipes";
        }

/*
//Function to create stair recipes for concrete. Makes the recipe builder code less complex.
    public static void concreteStairRecipe (RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(input))
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }


//Function to create fence recipes for concrete. Makes the recipe builder code less complex.
    public static void concreteFenceRecipe (RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(input))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                .offerTo(exporter);
    }


//Function to create fence gate recipes for concrete. Makes the recipe builder code less complex.
    public static void concreteGateRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(input))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                .offerTo(exporter);
    }


//Function to create button recipes for concrete. Makes the recipe builder code less complex.
    public static void concreteButtonRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 1)
                .input(input)
                .group("concrete_buttons")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }*/
}
