package net.freedinner.display.init;

import net.minecraftforge.common.ForgeConfigSpec;

public class DisplayConfig {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec CONFIG;

	public static final ForgeConfigSpec.BooleanValue TOOLTIP;
	public static final ForgeConfigSpec.BooleanValue DISPLAY;
	public static final ForgeConfigSpec.BooleanValue SNEAK;
	public static final ForgeConfigSpec.IntValue ROTATION;
	
	static {
		BUILDER.push("Features");
		TOOLTIP = BUILDER.comment("Should placeable tooltips be enabled?").define("Tooltips", true);
		DISPLAY = BUILDER.comment("Should the item display tooltip be enabled?").define("Display-Tooltip", true);
		SNEAK = BUILDER.comment("Should sneak-place be required?").define("Sneak-Place", true);
		ROTATION = BUILDER.comment("The rotation of the item display.").defineInRange("Display-Rotation", 45, 5, 90);
		BUILDER.pop();
		CONFIG = BUILDER.build();
	}
}