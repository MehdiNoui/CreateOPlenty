package net.mehdinoui.createoplenty.data.recipes;

import biomesoplenty.api.block.BOPBlocks;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.api.data.recipe.MillingRecipeGen;
import net.mehdinoui.createoplenty.CreateOPlenty;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

public class COPMillingRecipes extends MillingRecipeGen {
    public COPMillingRecipes(PackOutput output) {
        super(output, CreateOPlenty.MOD_ID);
        // Flesh Block
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "flesh_block_milling"),
                b -> b.require(BOPBlocks.FLESH)
                        .duration(200)
                        .output(Items.ROTTEN_FLESH, 4)
                        .output(0.25f, Items.BONE_MEAL, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "porous_flesh_milling"),
                b -> b.require(BOPBlocks.POROUS_FLESH)
                        .duration(200)
                        .output(Items.ROTTEN_FLESH, 4)
                        .output(0.25f, Items.BONE_MEAL, 1)
        );
        // Thermal Calcite
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "thermal_calcite_milling"),
                b -> b.require(BOPBlocks.THERMAL_CALCITE)
                        .duration(250)
                        .output(0.75f,Items.BONE_MEAL, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "thermal_calcite_vent_milling"),
                b -> b.require(BOPBlocks.THERMAL_CALCITE_VENT)
                        .duration(250)
                        .output(0.75f,Items.BONE_MEAL, 1)
        );
    }
    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.MILLING;
    }
}

