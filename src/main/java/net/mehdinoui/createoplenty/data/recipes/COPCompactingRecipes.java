package net.mehdinoui.createoplenty.data.recipes;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.block.BOPFluids;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import com.simibubi.create.foundation.recipe.IRecipeTypeInfo;
import net.mehdinoui.createoplenty.CreateOPlenty;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;

public class COPCompactingRecipes extends ProcessingRecipeGen {
    public COPCompactingRecipes(PackOutput output) {
        super(output);
        // Thermal Calcite
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "thermal_calcite_to_diorite"),
                b -> b
                        .require(Items.FLINT).require(Items.FLINT)
                        .require(BOPBlocks.THERMAL_CALCITE)
                        .require(Fluids.LAVA,100)
                        .output(Blocks.DIORITE)
        );
        // Flesh Block
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "flesh_block_compact"),
                b -> b
                        .require(Items.ROTTEN_FLESH).require(Items.ROTTEN_FLESH).require(Items.ROTTEN_FLESH).require(Items.ROTTEN_FLESH)
                        .require(BOPFluids.BLOOD, 100)
                        .output(BOPBlocks.FLESH)
        );
    }
    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.COMPACTING;
    }
}
