package net.mehdinoui.createoplenty;

import net.minecraftforge.common.ForgeConfigSpec;

public class Configuration {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec CONFIG;

    // Configurable values
    public static final ForgeConfigSpec.BooleanValue ENABLE_SANDPAPERS;

    static {
        BUILDER.push("Settings");

        ENABLE_SANDPAPERS = BUILDER
                .comment("Should This Mod Add Missing BOP Sand Papers?")
                .define("enableOrangeSandPaper", true);

        BUILDER.pop();
        CONFIG = BUILDER.build();
    }
}