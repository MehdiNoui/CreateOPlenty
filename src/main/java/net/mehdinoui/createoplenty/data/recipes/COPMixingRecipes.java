package net.mehdinoui.createoplenty.data.recipes;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.mehdinoui.createoplenty.CreateOPlenty;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;

public class COPMixingRecipes extends ProcessingRecipeGen {
    public COPMixingRecipes(PackOutput output) {
        super(output);
        // Thermal Calcite
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID,"thermal_calcite_from_heat"),
                b -> b.require(Blocks.CALCITE)
                        .requiresHeat(HeatCondition.HEATED)
                        .output(BOPBlocks.THERMAL_CALCITE, 1)
        );
        // Rose Quartz
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "rose_quartz_from_chunk"),
                b -> b
                        .require(BOPItems.ROSE_QUARTZ_CHUNK)
                        .require(BOPItems.ROSE_QUARTZ_CHUNK)
                        .requiresHeat(HeatCondition.HEATED)
                        .output(BuiltInRegistries.ITEM.get(
                                new ResourceLocation("create", "rose_quartz")
                        ))
        );
    }
    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.MIXING;
    }
}
