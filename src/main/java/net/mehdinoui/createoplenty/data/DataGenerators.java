package net.mehdinoui.createoplenty.data;

import net.mehdinoui.createoplenty.CreateOPlenty;
import net.mehdinoui.createoplenty.data.recipes.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = CreateOPlenty.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
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
                new COPBasicRecipes(packOutput, lookupProvider));
        // Compacting Recipes
        generator.addProvider(event.includeServer(),
                new COPCompactingRecipes(packOutput, lookupProvider));
        // Crushing Recipes
        generator.addProvider(event.includeServer(),
                new COPCrushingRecipes(packOutput, lookupProvider));
        // Milling Recipes
        generator.addProvider(event.includeServer(),
                new COPMillingRecipes(packOutput, lookupProvider));
        // Mixing Recipes
        generator.addProvider(event.includeServer(),
                new COPMixingRecipes(packOutput, lookupProvider));
    }
}
