package net.mcjamweasel.moarconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mcjamweasel.moarconcrete.ModBlockGroups;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {


    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


//Creates the recipes for each block, one set per colour.
//Stone cutting for stairs, slabs, walls, bricks, panels.
//Crafting table for all.
    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

                //Create stairs recipes
                for (ModBlockGroups.MCBlock coloredBlock : ModBlockGroups.MC_STAIRS) {
                    offerStonecuttingRecipe(
                            RecipeCategory.BUILDING_BLOCKS,
                            coloredBlock.customBlock(),
                            coloredBlock.vanillaSource()
                    );

                    createShaped(RecipeCategory.BUILDING_BLOCKS, coloredBlock.customBlock(), 4)
                            .pattern("C  ")
                            .pattern("CC ")
                            .pattern("CCC")
                            .input('C', Ingredient.ofItems(coloredBlock.vanillaSource()))
                            .criterion(hasItem(coloredBlock.vanillaSource()), conditionsFromItem(coloredBlock.vanillaSource()))
                            .offerTo(exporter);
                }


                //Create Slab recipes
                for (List<ModBlockGroups.MCBlock> group : ModBlockGroups.mcSlabDropGroup) {
                    for (ModBlockGroups.MCBlock coloredBlock : group) {
                        offerStonecuttingRecipe(
                            RecipeCategory.BUILDING_BLOCKS,
                            coloredBlock.customBlock(),
                            coloredBlock.vanillaSource(),
                            2);

                        offerSlabRecipe(
                            RecipeCategory.BUILDING_BLOCKS,
                            coloredBlock.customBlock(),
                            coloredBlock.vanillaSource());
                    }
                }


                //Create wall recipes
                for (ModBlockGroups.MCBlock coloredBlock : ModBlockGroups.MC_WALL) {
                    offerWallRecipe(
                            RecipeCategory.BUILDING_BLOCKS,
                            coloredBlock.customBlock(),
                            coloredBlock.vanillaSource());

                    offerStonecuttingRecipe(
                            RecipeCategory.BUILDING_BLOCKS,
                            coloredBlock.customBlock(),
                            coloredBlock.vanillaSource());
                }


                //Create fence recipes
                for (ModBlockGroups.MCBlock coloredBlock : ModBlockGroups.MC_FENCE) {
                    createShaped(RecipeCategory.BUILDING_BLOCKS, coloredBlock.customBlock(), 3)
                            .pattern("CIC")
                            .pattern("CIC")
                            .pattern("   ")
                            .input('C', Ingredient.ofItems(coloredBlock.vanillaSource()))
                            .input('I', Ingredient.ofItems(Items.IRON_BARS))
                            .criterion(hasItem(coloredBlock.vanillaSource()), conditionsFromItem(coloredBlock.vanillaSource()))
                            .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                            .offerTo(exporter);
                }


                //Create fence gate recipes
                for (ModBlockGroups.MCBlock coloredBlock : ModBlockGroups.MC_GATE) {
                    createShaped(RecipeCategory.BUILDING_BLOCKS, coloredBlock.customBlock(), 1)
                            .pattern("ICI")
                            .pattern("ICI")
                            .pattern("   ")
                            .input('C', Ingredient.ofItems(coloredBlock.vanillaSource()))
                            .input('I', Ingredient.ofItems(Items.IRON_BARS))
                            .criterion(hasItem(coloredBlock.vanillaSource()), conditionsFromItem(coloredBlock.vanillaSource()))
                            .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                            .offerTo(exporter);
                }


                //Create button recipes
                for (ModBlockGroups.MCBlock coloredBlock : ModBlockGroups.MC_BUTTON) {
                    createShapeless(RecipeCategory.REDSTONE, coloredBlock.customBlock(), 1)
                            .input(coloredBlock.vanillaSource())
                            .group("concrete_buttons")
                            .criterion(hasItem(coloredBlock.vanillaSource()), conditionsFromItem(coloredBlock.vanillaSource()))
                            .offerTo(exporter);
                }

                //Create panel recipes
                for (ModBlockGroups.MCBlock coloredBlock : ModBlockGroups.MC_PANEL) {
                    offerStainedGlassPaneRecipe(coloredBlock.customBlock(), coloredBlock.vanillaSource());

                    offerStonecuttingRecipe(
                            RecipeCategory.BUILDING_BLOCKS,
                            coloredBlock.customBlock(),
                            coloredBlock.vanillaSource(),
                            4);
                }

                //Create bricks recipes
                for (ModBlockGroups.MCBlock coloredBlock : ModBlockGroups.MC_BRICKS) {
                    offerStonecuttingRecipe(
                            RecipeCategory.BUILDING_BLOCKS,
                            coloredBlock.customBlock(),
                            coloredBlock.vanillaSource());

                    createShaped(RecipeCategory.BUILDING_BLOCKS, coloredBlock.customBlock(), 4)
                            .pattern("CC ")
                            .pattern("CC ")
                            .pattern("   ")
                            .input('C', Ingredient.ofItems(coloredBlock.vanillaSource()))
                            .criterion(hasItem(coloredBlock.vanillaSource()), conditionsFromItem(coloredBlock.vanillaSource()))
                            .offerTo(exporter);
                }
            }
        };
    }


    @Override
    public String getName() {
            return "MoarConcrete Recipes";
        }
}
