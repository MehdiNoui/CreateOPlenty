package net.mehdinoui.createoplenty;

import com.mojang.logging.LogUtils;
import net.mehdinoui.createoplenty.block.COPBlocks;
import net.mehdinoui.createoplenty.creativeTab.COPCreativeTab;
import net.mehdinoui.createoplenty.item.COPItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CreateOPlenty.MOD_ID)
public class CreateOPlenty

{
    public static final String MOD_ID = "createoplenty";
    public CreateOPlenty() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        COPCreativeTab.register(modEventBus);
        COPItems.register(modEventBus);
        COPBlocks.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
