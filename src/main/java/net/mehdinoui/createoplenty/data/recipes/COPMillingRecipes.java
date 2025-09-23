package net.mehdinoui.createoplenty.data.recipes;

import biomesoplenty.api.block.BOPBlocks;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.mehdinoui.createoplenty.CreateOPlenty;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

public class COPMillingRecipes extends ProcessingRecipeGen {
    public COPMillingRecipes(PackOutput output) {
        super(output);
        // Sandstone -> sand
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "black_sandstone_milling"),
                b -> b.require(BOPBlocks.BLACK_SANDSTONE)
                        .duration(150)
                        .output(BOPBlocks.BLACK_SAND, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "orange_sandstone_milling"),
                b -> b.require(BOPBlocks.ORANGE_SANDSTONE)
                        .duration(150)
                        .output(BOPBlocks.ORANGE_SAND, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "white_sandstone_milling"),
                b -> b.require(BOPBlocks.WHITE_SANDSTONE)
                        .duration(150)
                        .output(BOPBlocks.WHITE_SAND, 1)
        );
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
        // Flowers
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "white_petals_milling"),
                b -> b.require(BOPBlocks.WHITE_PETALS)
                        .duration(50)
                        .output(Items.WHITE_DYE, 2)
                        .output(0.2f,Items.LIME_DYE, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "icy_iris_milling"),
                b -> b.require(BOPBlocks.ICY_IRIS)
                        .duration(50)
                        .output(Items.LIGHT_BLUE_DYE, 2)
                        .output(0.2f,Items.LIGHT_BLUE_DYE, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "end_bloom_milling"),
                b -> b.require(BOPBlocks.ENDBLOOM)
                        .duration(50)
                        .output(Items.LIGHT_GRAY_DYE, 2)
                        .output(0.1f,Items.ORANGE_DYE, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "waterlily_milling"),
                b -> b.require(BOPBlocks.WATERLILY)
                        .duration(50)
                        .output(Items.RED_DYE, 2)
                        .output(0.2f,Items.LIME_DYE, 1)
                        .output(0.1F,Items.PINK_DYE, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "cattail_milling"),
                b -> b.require(BOPBlocks.CATTAIL)
                        .duration(50)
                        .output(Items.BROWN_DYE, 2)
                        .output(0.2f,Items.GREEN_DYE, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "white_lavender_milling"),
                b -> b.require(BOPBlocks.WHITE_LAVENDER)
                        .duration(50)
                        .output(Items.WHITE_DYE, 2)
                        .output(0.2f,Items.GREEN_DYE, 1)
        );
        // Tall Flowers
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "tall_white_lavender_milling"),
                b -> b.require(BOPBlocks.TALL_WHITE_LAVENDER)
                        .duration(100)
                        .output(Items.WHITE_DYE, 3)
                        .output(0.25f,Items.WHITE_DYE, 2)
                        .output(0.05f,Items.GREEN_DYE, 2)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "tall_lavender_milling"),
                b -> b.require(BOPBlocks.TALL_LAVENDER)
                        .duration(100)
                        .output(Items.PURPLE_DYE, 3)
                        .output(0.25f,Items.PURPLE_DYE, 2)
                        .output(0.05f,Items.GREEN_DYE, 2)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "goldenrod_milling"),
                b -> b.require(BOPBlocks.GOLDENROD)
                        .duration(100)
                        .output(Items.YELLOW_DYE, 3)
                        .output(0.25f,Items.YELLOW_DYE, 2)
                        .output(0.05f,Items.LIME_DYE, 2)
        );
    }
    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.MILLING;
    }
}

