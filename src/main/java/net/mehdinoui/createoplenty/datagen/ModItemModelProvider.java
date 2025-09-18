package net.mehdinoui.createoplenty.datagen;

import net.mehdinoui.createoplenty.CreateOPlenty;
import net.mehdinoui.createoplenty.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateOPlenty.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BLACK_SAND_PAPER);
        simpleItem(ModItems.ORANGE_SAND_PAPER);
        simpleItem(ModItems.WHITE_SAND_PAPER);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CreateOPlenty.MOD_ID,"item/" + item.getId().getPath()));
    }
}