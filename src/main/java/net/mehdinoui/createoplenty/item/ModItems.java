package net.mehdinoui.createoplenty.item;

import com.simibubi.create.content.equipment.sandPaper.SandPaperItem;
import net.mehdinoui.createoplenty.CreateOPlenty;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public final static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateOPlenty.MOD_ID);

    public static final RegistryObject<Item> BLACK_SAND_PAPER = ITEMS.register(
            "black_sand_paper",
            () -> new SandPaperItem(new Item.Properties())
    );
    public static final RegistryObject<Item> ORANGE_SAND_PAPER = ITEMS.register(
            "orange_sand_paper",
            () -> new SandPaperItem(new Item.Properties())
    );
    public static final RegistryObject<Item> WHITE_SAND_PAPER = ITEMS.register(
            "orange_sand_paper",
            () -> new SandPaperItem(new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
