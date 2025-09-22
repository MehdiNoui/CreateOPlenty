package net.mehdinoui.createoplenty.data.recipes;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import com.simibubi.create.foundation.recipe.IRecipeTypeInfo;
import net.mehdinoui.createoplenty.item.COPItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class COPBasicRecipes extends RecipeProvider {
    public COPBasicRecipes(PackOutput output) {
        super(output);
    }
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> client) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COPItems.BLACK_SAND_PAPER.get())
                .requires(Items.PAPER)
                .requires(BOPBlocks.BLACK_SAND.asItem())
                .unlockedBy("has_paper", has(Items.PAPER))
                .save(client, new ResourceLocation("createoplenty", "black_sand_paper"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COPItems.ORANGE_SAND_PAPER.get())
                .requires(Items.PAPER)
                .requires(BOPBlocks.ORANGE_SAND.asItem())
                .unlockedBy("has_paper", has(Items.PAPER))
                .save(client, new ResourceLocation("createoplenty", "orange_sand_paper"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COPItems.WHITE_SAND_PAPER.get())
                .requires(Items.PAPER)
                .requires(BOPBlocks.WHITE_SAND.asItem())
                .unlockedBy("has_paper", has(Items.PAPER))
                .save(client, new ResourceLocation("createoplenty", "white_sand_paper"));

    }
}
