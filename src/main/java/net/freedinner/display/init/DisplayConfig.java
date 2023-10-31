package net.freedinner.display.init;

import net.minecraftforge.common.ForgeConfigSpec;

public class DisplayConfig {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec CONFIG;

	public static final ForgeConfigSpec.BooleanValue TOOLTIP;
	
	static {
		BUILDER.push("Features");
		TOOLTIP = BUILDER.comment("Should tooltips be enabled?").define("Tooltips", true);
		BUILDER.pop();
		CONFIG = BUILDER.build();
	}
}