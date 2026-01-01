package net.mehdinoui.createoplenty.item;

import com.simibubi.create.content.equipment.sandPaper.SandPaperItem;
import net.mehdinoui.createoplenty.CreateOPlenty;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class COPItems {
    public final static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(BuiltInRegistries.ITEM, CreateOPlenty.MOD_ID);

    public static final DeferredHolder<Item, Item> BLACK_SAND_PAPER = ITEMS.register(
            "black_sand_paper",
            () -> new SandPaperItem(new Item.Properties())
    );
    public static final DeferredHolder<Item, Item> ORANGE_SAND_PAPER = ITEMS.register(
            "orange_sand_paper",
            () -> new SandPaperItem(new Item.Properties())
    );
    public static final DeferredHolder<Item, Item> WHITE_SAND_PAPER = ITEMS.register(
            "white_sand_paper",
            () -> new SandPaperItem(new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
