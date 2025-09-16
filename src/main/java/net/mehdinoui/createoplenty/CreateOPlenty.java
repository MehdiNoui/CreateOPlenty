package net.mehdinoui.createoplenty;

import com.mojang.logging.LogUtils;
import net.mehdinoui.createoplenty.block.ModBlocks;
import net.mehdinoui.createoplenty.creativeTab.ModCreativeModeTabs;
import net.mehdinoui.createoplenty.item.ModItems;
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
    private static final Logger LOGGER = LogUtils.getLogger();

    public CreateOPlenty() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Configuration.CONFIG);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
