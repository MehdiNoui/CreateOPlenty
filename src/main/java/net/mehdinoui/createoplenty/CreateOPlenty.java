package net.mehdinoui.createoplenty;

import net.mehdinoui.createoplenty.block.COPBlocks;
import net.mehdinoui.createoplenty.creativeTab.COPCreativeTab;
import net.mehdinoui.createoplenty.item.COPItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(CreateOPlenty.MOD_ID)
public class CreateOPlenty

{
    public static final String MOD_ID = "createoplenty";
    public CreateOPlenty(IEventBus modEventBus) {
        COPCreativeTab.register(modEventBus);
        COPItems.register(modEventBus);
        COPBlocks.register(modEventBus);
    }
}
