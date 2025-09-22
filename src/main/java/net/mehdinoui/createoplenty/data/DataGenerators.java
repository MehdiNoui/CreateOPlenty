package net.mehdinoui.createoplenty.data;

import net.mehdinoui.createoplenty.CreateOPlenty;
import net.mehdinoui.createoplenty.data.recipes.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = CreateOPlenty.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        // Simple Item Model
        generator.addProvider(event.includeClient(),
                new ItemModelProvider(packOutput, existingFileHelper));
        // Basic Recipes
        generator.addProvider(event.includeClient(),
                new COPBasicRecipes(packOutput));
        // Compacting Recipes
        generator.addProvider(event.includeServer(),
                new COPCompactingRecipes(packOutput));
        // Crushing Recipes
        generator.addProvider(event.includeServer(),
                new COPCrushingRecipes(packOutput));
        // Milling Recipes
        generator.addProvider(event.includeServer(),
                new COPMillingRecipes(packOutput));
        // Mixing Recipes
        generator.addProvider(event.includeServer(),
                new COPMixingRecipes(packOutput));
    }
}
