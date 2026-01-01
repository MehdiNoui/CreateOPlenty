package net.mehdinoui.createoplenty.data.recipes;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import com.simibubi.create.api.data.recipe.MixingRecipeGen;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import net.mehdinoui.createoplenty.CreateOPlenty;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class COPMixingRecipes extends MixingRecipeGen {
    public COPMixingRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateOPlenty.MOD_ID);
        // Thermal Calcite
        create(
                ResourceLocation.fromNamespaceAndPath(CreateOPlenty.MOD_ID,"thermal_calcite_from_heat"),
                b -> b.require(Blocks.CALCITE)
                        .requiresHeat(HeatCondition.HEATED)
                        .output(BOPBlocks.THERMAL_CALCITE, 1)
        );
        // Rose Quartz
        create(
                ResourceLocation.fromNamespaceAndPath(CreateOPlenty.MOD_ID, "rose_quartz_from_chunk"),
                b -> b
                        .require(BOPItems.ROSE_QUARTZ_CHUNK)
                        .require(BOPItems.ROSE_QUARTZ_CHUNK)
                        .requiresHeat(HeatCondition.HEATED)
                        .output(BuiltInRegistries.ITEM.get(
                                ResourceLocation.fromNamespaceAndPath("create", "rose_quartz")
                        ))
        );
    }
}
