package net.mehdinoui.createoplenty.datagen;

import net.mehdinoui.createoplenty.CreateOPlenty;
import net.mehdinoui.createoplenty.item.COPItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
    public ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateOPlenty.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(COPItems.BLACK_SAND_PAPER);
        simpleItem(COPItems.ORANGE_SAND_PAPER);
        simpleItem(COPItems.WHITE_SAND_PAPER);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CreateOPlenty.MOD_ID,"item/" + item.getId().getPath()));
    }
}