package net.mehdinoui.createoplenty.creativeTab;

import net.mehdinoui.createoplenty.Configuration;
import net.mehdinoui.createoplenty.CreateOPlenty;

import net.mehdinoui.createoplenty.item.COPItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class COPCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateOPlenty.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATEOPLENTY_TAB = CREATIVE_MODE_TABS.register("createoplenty_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(Items.IRON_AXE))
                    .title(Component.translatable("creativetab.createoplenty_tab"))
                    .displayItems((pParameters, pOutput) ->{
                        if(Configuration.ENABLE_SANDPAPERS.get()){
                            pOutput.accept(COPItems.BLACK_SAND_PAPER.get());
                            pOutput.accept(COPItems.ORANGE_SAND_PAPER.get());
                            pOutput.accept(COPItems.WHITE_SAND_PAPER.get());
                        }
                    }
                    ).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
