package net.mehdinoui.createoplenty;

import net.minecraftforge.common.ForgeConfigSpec;

public class Configuration {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec CONFIG;

    // Configurable values
    public static final ForgeConfigSpec.BooleanValue ENABLE_OPTION;

    static {
        BUILDER.push("Settings");

        ENABLE_OPTION = BUILDER
                .comment("Enable OPTION")
                .define("enableOPTION", true);

        BUILDER.pop();
        CONFIG = BUILDER.build();
    }
}