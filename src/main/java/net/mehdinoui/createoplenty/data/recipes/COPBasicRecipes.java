package net.mehdinoui.createoplenty.data.recipes;

import biomesoplenty.api.block.BOPBlocks;
import net.mehdinoui.createoplenty.item.COPItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class COPBasicRecipes extends RecipeProvider {
    public COPBasicRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }
    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COPItems.BLACK_SAND_PAPER.get())
                .requires(Items.PAPER)
                .requires(BOPBlocks.BLACK_SAND.asItem())
                .unlockedBy("has_paper", has(Items.PAPER))
                .save(output, ResourceLocation.fromNamespaceAndPath("createoplenty", "black_sand_paper"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COPItems.ORANGE_SAND_PAPER.get())
                .requires(Items.PAPER)
                .requires(BOPBlocks.ORANGE_SAND.asItem())
                .unlockedBy("has_paper", has(Items.PAPER))
                .save(output, ResourceLocation.fromNamespaceAndPath("createoplenty", "orange_sand_paper"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COPItems.WHITE_SAND_PAPER.get())
                .requires(Items.PAPER)
                .requires(BOPBlocks.WHITE_SAND.asItem())
                .unlockedBy("has_paper", has(Items.PAPER))
                .save(output, ResourceLocation.fromNamespaceAndPath("createoplenty", "white_sand_paper"));

    }
}
