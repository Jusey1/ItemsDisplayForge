package net.freedinner.display.init;

import net.minecraftforge.common.ForgeConfigSpec;

public class DisplayConfig {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec CONFIG;

	public static final ForgeConfigSpec.BooleanValue TOOLTIP;
	public static final ForgeConfigSpec.BooleanValue SNEAK;
	
	static {
		BUILDER.push("Features");
		TOOLTIP = BUILDER.comment("Should tooltips be enabled?").define("Tooltips", true);
		SNEAK = BUILDER.comment("Should sneak-place be required?").define("Sneak-Place", false);
		BUILDER.pop();
		CONFIG = BUILDER.build();
	}
}