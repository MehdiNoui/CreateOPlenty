package net.mehdinoui.createoplenty.data.recipes;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.block.BOPFluids;
import com.simibubi.create.api.data.recipe.CompactingRecipeGen;
import net.mehdinoui.createoplenty.CreateOPlenty;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluids;

import java.util.concurrent.CompletableFuture;

public class COPCompactingRecipes extends CompactingRecipeGen {
    public COPCompactingRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateOPlenty.MOD_ID);
        // Black Sand
        create(
                ResourceLocation.fromNamespaceAndPath(CreateOPlenty.MOD_ID, "black_sand_to_scorchia"),
                b -> b
                        .require(Items.FLINT).require(Items.FLINT)
                        .require(BOPBlocks.BLACK_SAND)
                        .require(Fluids.LAVA,100)
                        .output(BuiltInRegistries.BLOCK.get(
                                ResourceLocation.fromNamespaceAndPath("create", "scorchia")
                        ))
        );
        // White Sand
        create(
                ResourceLocation.fromNamespaceAndPath(CreateOPlenty.MOD_ID, "white_sand_to_diorite"),
                b -> b
                        .require(Items.FLINT).require(Items.FLINT)
                        .require(BOPBlocks.WHITE_SAND)
                        .require(Fluids.LAVA,100)
                        .output(Blocks.DIORITE)
        );
        // Flesh Block
        create(
                ResourceLocation.fromNamespaceAndPath(CreateOPlenty.MOD_ID, "flesh_block_compact"),
                b -> b
                        .require(Items.ROTTEN_FLESH).require(Items.ROTTEN_FLESH).require(Items.ROTTEN_FLESH).require(Items.ROTTEN_FLESH)
                        .require((FlowingFluid) BOPFluids.BLOOD, 100)
                        .output(BOPBlocks.FLESH)
        );
    }
}
