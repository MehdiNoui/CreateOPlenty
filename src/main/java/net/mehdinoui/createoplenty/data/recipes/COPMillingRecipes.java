package net.mehdinoui.createoplenty.data.recipes;

import biomesoplenty.api.block.BOPBlocks;
import com.simibubi.create.api.data.recipe.MillingRecipeGen;
import net.mehdinoui.createoplenty.CreateOPlenty;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class COPMillingRecipes extends MillingRecipeGen {
    public COPMillingRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateOPlenty.MOD_ID);
        // Flesh Block
        create(
                ResourceLocation.fromNamespaceAndPath(CreateOPlenty.MOD_ID, "flesh_block_milling"),
                b -> b.require(BOPBlocks.FLESH)
                        .duration(200)
                        .output(Items.ROTTEN_FLESH, 4)
                        .output(0.25f, Items.BONE_MEAL, 1)
        );
        create(
                ResourceLocation.fromNamespaceAndPath(CreateOPlenty.MOD_ID, "porous_flesh_milling"),
                b -> b.require(BOPBlocks.POROUS_FLESH)
                        .duration(200)
                        .output(Items.ROTTEN_FLESH, 4)
                        .output(0.25f, Items.BONE_MEAL, 1)
        );
        // Thermal Calcite
        create(
                ResourceLocation.fromNamespaceAndPath(CreateOPlenty.MOD_ID, "thermal_calcite_milling"),
                b -> b.require(BOPBlocks.THERMAL_CALCITE)
                        .duration(250)
                        .output(0.75f,Items.BONE_MEAL, 1)
        );
        create(
                ResourceLocation.fromNamespaceAndPath(CreateOPlenty.MOD_ID, "thermal_calcite_vent_milling"),
                b -> b.require(BOPBlocks.THERMAL_CALCITE_VENT)
                        .duration(250)
                        .output(0.75f,Items.BONE_MEAL, 1)
        );
    }
}

