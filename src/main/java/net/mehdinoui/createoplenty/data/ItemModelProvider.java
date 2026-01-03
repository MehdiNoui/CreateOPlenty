package net.mehdinoui.createoplenty.data;

import net.mehdinoui.createoplenty.CreateOPlenty;
import net.mehdinoui.createoplenty.item.COPItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ItemModelProvider extends net.neoforged.neoforge.client.model.generators.ItemModelProvider {
    public ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateOPlenty.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(COPItems.BLACK_SAND_PAPER);
        simpleItem(COPItems.ORANGE_SAND_PAPER);
        simpleItem(COPItems.WHITE_SAND_PAPER);
    }

    private ItemModelBuilder simpleItem(DeferredHolder<Item, Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(CreateOPlenty.MOD_ID,"item/" + item.getId().getPath()));
    }
}