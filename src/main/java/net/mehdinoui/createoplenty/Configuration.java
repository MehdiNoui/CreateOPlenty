package net.mehdinoui.createoplenty;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Configuration {
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec CONFIG;

    // Configurable values
    public static final ModConfigSpec.BooleanValue ENABLE_SANDPAPERS;

    static {
        BUILDER.push("Settings");

        ENABLE_SANDPAPERS = BUILDER
                .comment("Should This Mod Add Missing BOP Sand Papers?")
                .define("enableOrangeSandPaper", true);

        BUILDER.pop();
        CONFIG = BUILDER.build();
    }
}