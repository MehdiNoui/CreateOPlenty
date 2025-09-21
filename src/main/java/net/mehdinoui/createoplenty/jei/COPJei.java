package net.mehdinoui.createoplenty.jei;

import com.simibubi.create.content.equipment.sandPaper.SandPaperPolishingRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import net.mehdinoui.createoplenty.item.COPItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

@JeiPlugin
public class COPJei implements IModPlugin {
    private static final ResourceLocation ID = new ResourceLocation("createoplenty", "jei_plugin");

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        // Create’s Sandpaper Polishing recipe type
        mezz.jei.api.recipe.RecipeType<SandPaperPolishingRecipe> type =
                new mezz.jei.api.recipe.RecipeType<>(
                        new ResourceLocation("create", "sandpaper_polishing"),
                        SandPaperPolishingRecipe.class
                );

        // Register your sand paper as a catalyst for that category
        registration.addRecipeCatalyst(
                new ItemStack(COPItems.BLACK_SAND_PAPER.get()),
                type
        );
        registration.addRecipeCatalyst(
                new ItemStack(COPItems.ORANGE_SAND_PAPER.get()),
                type
        );
        registration.addRecipeCatalyst(
                new ItemStack(COPItems.WHITE_SAND_PAPER.get()),
                type
        );
    }
}
