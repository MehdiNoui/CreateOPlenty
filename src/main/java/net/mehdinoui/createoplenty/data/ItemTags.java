package net.mehdinoui.createoplenty.data;

import net.mehdinoui.createoplenty.CreateOPlenty;
import net.mehdinoui.createoplenty.item.COPItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ItemTags extends ItemTagsProvider {
    public ItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, blockTagProvider, CreateOPlenty.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("create", "sandpaper")))
                .add(COPItems.BLACK_SAND_PAPER.get())
                .add(COPItems.ORANGE_SAND_PAPER.get())
                .add(COPItems.WHITE_SAND_PAPER.get());
    }
}
