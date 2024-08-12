package net.mcjamweasel.moarconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mcjamweasel.moarconcrete.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProviderBACKUP extends FabricRecipeProvider {


    public ModRecipeProviderBACKUP(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


//Creates the recipes for each block, one set per colour.
//Stone cutting for stairs, slabs, walls.
//Crafting table for all.
    @Override
    public void generate(RecipeExporter exporter) {
    //Blue
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.BLUE_CONCRETE))
                .criterion(hasItem(Items.BLUE_CONCRETE), conditionsFromItem(Items.BLUE_CONCRETE))
                .offerTo(exporter, "blue_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.BLUE_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.BLUE_CONCRETE), conditionsFromItem(Items.BLUE_CONCRETE))
                .offerTo(exporter, "blue_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.BLUE_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.BLUE_CONCRETE), conditionsFromItem(Items.BLUE_CONCRETE))
                .offerTo(exporter, "blue_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.BLUE_CONCRETE_BUTTON, Items.BLUE_CONCRETE);

    //Light Blue
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.LIGHT_BLUE_CONCRETE))
                .criterion(hasItem(Items.LIGHT_BLUE_CONCRETE), conditionsFromItem(Items.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter, "light_blue_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.LIGHT_BLUE_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.LIGHT_BLUE_CONCRETE), conditionsFromItem(Items.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter, "light_blue_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.LIGHT_BLUE_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.LIGHT_BLUE_CONCRETE), conditionsFromItem(Items.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter, "light_blue_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, Items.LIGHT_BLUE_CONCRETE);

    //Red
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.RED_CONCRETE))
                .criterion(hasItem(Items.RED_CONCRETE), conditionsFromItem(Items.RED_CONCRETE))
                .offerTo(exporter, "red_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.RED_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.RED_CONCRETE), conditionsFromItem(Items.RED_CONCRETE))
                .offerTo(exporter, "red_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.RED_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.RED_CONCRETE), conditionsFromItem(Items.RED_CONCRETE))
                .offerTo(exporter, "red_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.RED_CONCRETE_BUTTON, Items.RED_CONCRETE);

    //White
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.WHITE_CONCRETE))
                .criterion(hasItem(Items.WHITE_CONCRETE), conditionsFromItem(Items.WHITE_CONCRETE))
                .offerTo(exporter, "white_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.WHITE_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.WHITE_CONCRETE), conditionsFromItem(Items.WHITE_CONCRETE))
                .offerTo(exporter, "white_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.WHITE_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.WHITE_CONCRETE), conditionsFromItem(Items.WHITE_CONCRETE))
                .offerTo(exporter, "white_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.WHITE_CONCRETE_BUTTON, Items.WHITE_CONCRETE);

    //Orange
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.ORANGE_CONCRETE))
                .criterion(hasItem(Items.ORANGE_CONCRETE), conditionsFromItem(Items.ORANGE_CONCRETE))
                .offerTo(exporter, "orange_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.ORANGE_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.ORANGE_CONCRETE), conditionsFromItem(Items.ORANGE_CONCRETE))
                .offerTo(exporter, "orange_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.ORANGE_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.ORANGE_CONCRETE), conditionsFromItem(Items.ORANGE_CONCRETE))
                .offerTo(exporter, "orange_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.ORANGE_CONCRETE_BUTTON, Items.ORANGE_CONCRETE);

    //Magenta
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.MAGENTA_CONCRETE))
                .criterion(hasItem(Items.MAGENTA_CONCRETE), conditionsFromItem(Items.MAGENTA_CONCRETE))
                .offerTo(exporter, "magenta_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.MAGENTA_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.MAGENTA_CONCRETE), conditionsFromItem(Items.MAGENTA_CONCRETE))
                .offerTo(exporter, "magenta_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.MAGENTA_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.MAGENTA_CONCRETE), conditionsFromItem(Items.MAGENTA_CONCRETE))
                .offerTo(exporter, "magenta_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.MAGENTA_CONCRETE_BUTTON, Items.MAGENTA_CONCRETE);

    //Lime
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.LIME_CONCRETE))
                .criterion(hasItem(Items.LIME_CONCRETE), conditionsFromItem(Items.LIME_CONCRETE))
                .offerTo(exporter, "lime_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.LIME_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.LIME_CONCRETE), conditionsFromItem(Items.LIME_CONCRETE))
                .offerTo(exporter, "lime_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.LIME_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.LIME_CONCRETE), conditionsFromItem(Items.LIME_CONCRETE))
                .offerTo(exporter, "lime_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.LIME_CONCRETE_BUTTON, Items.LIME_CONCRETE);

    //Yellow
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.YELLOW_CONCRETE))
                .criterion(hasItem(Items.YELLOW_CONCRETE), conditionsFromItem(Items.YELLOW_CONCRETE))
                .offerTo(exporter, "yellow_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.YELLOW_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.YELLOW_CONCRETE), conditionsFromItem(Items.YELLOW_CONCRETE))
                .offerTo(exporter, "yellow_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.YELLOW_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.YELLOW_CONCRETE), conditionsFromItem(Items.YELLOW_CONCRETE))
                .offerTo(exporter, "yellow_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.YELLOW_CONCRETE_BUTTON, Items.YELLOW_CONCRETE);

    //Pink
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.PINK_CONCRETE))
                .criterion(hasItem(Items.PINK_CONCRETE), conditionsFromItem(Items.PINK_CONCRETE))
                .offerTo(exporter, "pink_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.PINK_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.PINK_CONCRETE), conditionsFromItem(Items.PINK_CONCRETE))
                .offerTo(exporter, "pink_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.PINK_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.PINK_CONCRETE), conditionsFromItem(Items.PINK_CONCRETE))
                .offerTo(exporter, "pink_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.PINK_CONCRETE_BUTTON, Items.PINK_CONCRETE);

    //Gray
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.GRAY_CONCRETE))
                .criterion(hasItem(Items.GRAY_CONCRETE), conditionsFromItem(Items.GRAY_CONCRETE))
                .offerTo(exporter, "gray_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.GRAY_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.GRAY_CONCRETE), conditionsFromItem(Items.GRAY_CONCRETE))
                .offerTo(exporter, "gray_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.GRAY_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.GRAY_CONCRETE), conditionsFromItem(Items.GRAY_CONCRETE))
                .offerTo(exporter, "gray_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.GRAY_CONCRETE_BUTTON, Items.GRAY_CONCRETE);

    //Light Gray
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.LIGHT_GRAY_CONCRETE))
                .criterion(hasItem(Items.LIGHT_GRAY_CONCRETE), conditionsFromItem(Items.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter, "light_gray_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.LIGHT_GRAY_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.LIGHT_GRAY_CONCRETE), conditionsFromItem(Items.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter, "light_gray_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.LIGHT_GRAY_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.LIGHT_GRAY_CONCRETE), conditionsFromItem(Items.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter, "light_gray_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, Items.LIGHT_GRAY_CONCRETE);

    //Cyan
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.CYAN_CONCRETE))
                .criterion(hasItem(Items.CYAN_CONCRETE), conditionsFromItem(Items.CYAN_CONCRETE))
                .offerTo(exporter, "cyan_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.CYAN_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.CYAN_CONCRETE), conditionsFromItem(Items.CYAN_CONCRETE))
                .offerTo(exporter, "cyan_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.CYAN_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.CYAN_CONCRETE), conditionsFromItem(Items.CYAN_CONCRETE))
                .offerTo(exporter, "cyan_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.CYAN_CONCRETE_BUTTON, Items.CYAN_CONCRETE);

    //Purple
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.PURPLE_CONCRETE))
                .criterion(hasItem(Items.PURPLE_CONCRETE), conditionsFromItem(Items.PURPLE_CONCRETE))
                .offerTo(exporter, "purple_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.PURPLE_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.PURPLE_CONCRETE), conditionsFromItem(Items.PURPLE_CONCRETE))
                .offerTo(exporter, "purple_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.PURPLE_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.PURPLE_CONCRETE), conditionsFromItem(Items.PURPLE_CONCRETE))
                .offerTo(exporter, "purple_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.PURPLE_CONCRETE_BUTTON, Items.PURPLE_CONCRETE);

    //Brown
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.BROWN_CONCRETE))
                .criterion(hasItem(Items.BROWN_CONCRETE), conditionsFromItem(Items.BROWN_CONCRETE))
                .offerTo(exporter, "brown_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.BROWN_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.BROWN_CONCRETE), conditionsFromItem(Items.BROWN_CONCRETE))
                .offerTo(exporter, "brown_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.BROWN_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.BROWN_CONCRETE), conditionsFromItem(Items.BROWN_CONCRETE))
                .offerTo(exporter, "brown_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.BROWN_CONCRETE_BUTTON, Items.BROWN_CONCRETE);

    //Green
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.GREEN_CONCRETE))
                .criterion(hasItem(Items.GREEN_CONCRETE), conditionsFromItem(Items.GREEN_CONCRETE))
                .offerTo(exporter, "green_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.GREEN_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.GREEN_CONCRETE), conditionsFromItem(Items.GREEN_CONCRETE))
                .offerTo(exporter, "green_concrete_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.GREEN_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.GREEN_CONCRETE), conditionsFromItem(Items.GREEN_CONCRETE))
                .offerTo(exporter, "green_concrete_gate");
        concreteButtonRecipe(exporter, ModBlocks.GREEN_CONCRETE_BUTTON, Items.GREEN_CONCRETE);

    //Black
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', Ingredient.ofItems(Items.BLACK_CONCRETE))
                .criterion(hasItem(Items.BLACK_CONCRETE), conditionsFromItem(Items.BLACK_CONCRETE))
                .offerTo(exporter, "black_concrete_stairs");
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_FENCE, 3)
                .pattern("CIC")
                .pattern("CIC")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.BLACK_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.BLACK_CONCRETE), conditionsFromItem(Items.BLACK_CONCRETE))
                .offerTo(exporter, "black_concrete_fence");
        /*ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_GATE, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(Items.BLACK_CONCRETE))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(Items.BLACK_CONCRETE), conditionsFromItem(Items.BLACK_CONCRETE))
                .offerTo(exporter, "black_concrete_gate");
        */
        concreteButtonRecipe(exporter, ModBlocks.BLACK_CONCRETE_BUTTON, Items.BLACK_CONCRETE);

        concreteGateRecipe(exporter, ModBlocks.BLACK_CONCRETE_GATE, Items.BLACK_CONCRETE);

    }


//Function to create button recipes for concrete. Makes the recipe builder code less complex.
    public static void concreteButtonRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 1)
                .input(input)
                .group("concrete_buttons")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, convertBetween(output, input));
    }


    public static void concreteGateRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("ICI")
                .pattern("ICI")
                .pattern("   ")
                .input('C', Ingredient.ofItems(input))
                .input('I', Ingredient.ofItems(Items.IRON_BARS))
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, convertBetween(output, input));
    }
}
