package net.mehdinoui.createoplenty.data.recipes;

import biomesoplenty.api.item.BOPItems;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import com.simibubi.create.AllRecipeTypes;
import net.mehdinoui.createoplenty.Configuration;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import biomesoplenty.api.block.BOPBlocks;
import net.mehdinoui.createoplenty.CreateOPlenty;

public class COPCrushingRecipes extends ProcessingRecipeGen {
    public COPCrushingRecipes(PackOutput output) {
        super(output);
        // Sandstone -> sand
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "black_sandstone_crushing"),
                b -> b.require(BOPBlocks.BLACK_SANDSTONE)
                        .duration(350)
                        .output(BOPBlocks.BLACK_SAND, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "orange_sandstone_crushing"),
                b -> b.require(BOPBlocks.ORANGE_SANDSTONE)
                        .duration(350)
                        .output(BOPBlocks.ORANGE_SAND, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "white_sandstone_crushing"),
                b -> b.require(BOPBlocks.WHITE_SANDSTONE)
                        .duration(350)
                        .output(BOPBlocks.WHITE_SAND, 1)
        );
        // Flesh Block
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "flesh_block_crushing"),
                b -> b.require(BOPBlocks.FLESH)
                        .duration(350)
                        .output(Items.ROTTEN_FLESH, 2)
                        .output(0.25f,Items.BONE_MEAL,1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "porous_flesh_crushing"),
                b -> b.require(BOPBlocks.POROUS_FLESH)
                        .duration(350)
                        .output(Items.ROTTEN_FLESH, 2)
                        .output(0.25f,Items.BONE_MEAL,1)
        );
        // Rose Quartz
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "rose_quartz_block_crushing"),
                b -> b.require(BOPBlocks.ROSE_QUARTZ_BLOCK)
                        .duration(350)
                        .output(BOPItems.ROSE_QUARTZ_CHUNK, 3)
                        .output(0.5f,BOPItems.ROSE_QUARTZ_CHUNK,1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "rose_quartz_cluster_crushing"),
                b -> b.require(BOPBlocks.ROSE_QUARTZ_CLUSTER)
                        .duration(350)
                        .output(BOPItems.ROSE_QUARTZ_CHUNK, 7)
                        .output(0.5f,BOPItems.ROSE_QUARTZ_CHUNK,1)
        );
        // Thermal Calcite
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "thermal_calcite_crushing"),
                b -> b.require(BOPBlocks.THERMAL_CALCITE)
                        .duration(350)
                        .output(0.75f,Items.BONE_MEAL, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "thermal_calcite_vent_crushing"),
                b -> b.require(BOPBlocks.THERMAL_CALCITE_VENT)
                        .duration(350)
                        .output(0.75f,Items.BONE_MEAL, 1)
        );
        // Brimstone
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "brimstone_crushing"),
                b -> b.require(BOPBlocks.BRIMSTONE)
                        .duration(350)
                        .output(0.75f, BuiltInRegistries.ITEM.get(
                                new ResourceLocation("create", "cinder_flour")
                        ), 1)
                        .output(0.2f,Items.GOLD_NUGGET, 1)
                        .output(0.1f,Items.GUNPOWDER, 1)
        );
        // Flowers
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "white_petals_crushing"),
                b -> b.require(BOPBlocks.WHITE_PETALS)
                        .duration(350)
                        .output(Items.WHITE_DYE, 2)
                        .output(0.2f,Items.LIME_DYE, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "icy_iris_crushing"),
                b -> b.require(BOPBlocks.ICY_IRIS)
                        .duration(350)
                        .output(Items.LIGHT_BLUE_DYE, 2)
                        .output(0.2f,Items.LIGHT_BLUE_DYE, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "end_bloom_crushing"),
                b -> b.require(BOPBlocks.ENDBLOOM)
                        .duration(350)
                        .output(Items.LIGHT_GRAY_DYE, 2)
                        .output(0.1f,Items.ORANGE_DYE, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "waterlily_crushing"),
                b -> b.require(BOPBlocks.WATERLILY)
                        .duration(350)
                        .output(Items.RED_DYE, 2)
                        .output(0.2f,Items.LIME_DYE, 1)
                        .output(0.1F,Items.PINK_DYE, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "cattail_crushing"),
                b -> b.require(BOPBlocks.CATTAIL)
                        .duration(350)
                        .output(Items.BROWN_DYE, 2)
                        .output(0.2f,Items.GREEN_DYE, 1)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "white_lavender_crushing"),
                b -> b.require(BOPBlocks.WHITE_LAVENDER)
                        .duration(350)
                        .output(Items.WHITE_DYE, 2)
                        .output(0.2f,Items.GREEN_DYE, 1)
        );
        // Tall Flowers
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "tall_white_lavender_crushing"),
                b -> b.require(BOPBlocks.TALL_WHITE_LAVENDER)
                        .duration(350)
                        .output(Items.WHITE_DYE, 3)
                        .output(0.25f,Items.WHITE_DYE, 2)
                        .output(0.05f,Items.GREEN_DYE, 2)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "tall_lavender_crushing"),
                b -> b.require(BOPBlocks.TALL_LAVENDER)
                        .duration(350)
                        .output(Items.PURPLE_DYE, 3)
                        .output(0.25f,Items.PURPLE_DYE, 2)
                        .output(0.05f,Items.GREEN_DYE, 2)
        );
        create(
                new ResourceLocation(CreateOPlenty.MOD_ID, "goldenrod_crushing"),
                b -> b.require(BOPBlocks.GOLDENROD)
                        .duration(350)
                        .output(Items.YELLOW_DYE, 3)
                        .output(0.25f,Items.YELLOW_DYE, 2)
                        .output(0.05f,Items.LIME_DYE, 2)
        );
    }
    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.CRUSHING;
    }
}
