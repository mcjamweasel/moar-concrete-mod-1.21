package net.mcjamweasel.moarconcrete.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mcjamweasel.moarconcrete.MoarConcrete;
import net.mcjamweasel.moarconcrete.ModBlockGroups;
import net.mcjamweasel.moarconcrete.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItemGroups {

        public static final ItemGroup MOAR_CONCRETE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
                Identifier.of(MoarConcrete.MOD_ID, "moar_concrete_block"),
                FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.CYAN_CONCRETE_STAIRS))
                    .displayName(Text.translatable("itemgroup.moarconcrete.blocks_group"))
                        .entries((displayContext, entries) -> {
                            for (List<ModBlockGroups.MCBlock> group : ModBlockGroups.mcGroups) {
                                for (ModBlockGroups.MCBlock block : group) {
                                    entries.add(block.customBlock());
                                }
                            }
                        }
        ).build());


    public static void registerItemGroups(){
        MoarConcrete.LOGGER.info("Registering Item Groups for " + MoarConcrete.MOD_ID);
    }
}
