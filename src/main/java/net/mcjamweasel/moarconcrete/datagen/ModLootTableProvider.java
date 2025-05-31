package net.mcjamweasel.moarconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mcjamweasel.moarconcrete.ModBlockGroups;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

    //Normal block drops for all blocks
        //For each block group in the array:
        for (List<ModBlockGroups.MCBlock> group : ModBlockGroups.mcGroups) {
            //For each Block in the group
            for (ModBlockGroups.MCBlock block : group) {
                //Add drop
                addDrop(block.customBlock());
            }
        }


    //Slab drops for slab blocks
        // For each block group in the array:
        for (List<ModBlockGroups.MCBlock> group : ModBlockGroups.mcSlabDropGroup) {
            //For each Block in the group
            for (ModBlockGroups.MCBlock block : group) {
                //Add drop
                addDrop(block.customBlock(), slabDrops(block.customBlock()));
            }
        }
    }
}
