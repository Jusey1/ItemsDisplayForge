package net.freedinner.display.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.freedinner.display.entity.*;
import net.freedinner.display.DisplayMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DisplayMobs {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DisplayMod.MODID);
	public static final RegistryObject<EntityType<ItemDisplay>> DISPLAY = register("item_display", EntityType.Builder.<ItemDisplay>of(ItemDisplay::new, MobCategory.MISC).sized(0.45F, 0.75F));
	public static final RegistryObject<EntityType<ItemPillow>> WHITE_PILLOW = register("white_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> LG_PILLOW = register("light_gray_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> GRAY_PILLOW = register("gray_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> BLACK_PILLOW = register("black_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> RED_PILLOW = register("red_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> ORANGE_PILLOW = register("orange_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> YELLOW_PILLOW = register("yellow_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> LIME_PILLOW = register("lime_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> GREEN_PILLOW = register("green_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> LB_PILLOW = register("light_blue_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> CYAN_PILLOW = register("cyan_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> BLUE_PILLOW = register("blue_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> PURPLE_PILLOW = register("purple_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> MAGE_PILLOW = register("magenta_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> PINK_PILLOW = register("pink_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));
	public static final RegistryObject<EntityType<ItemPillow>> BROWN_PILLOW = register("brown_jewelry_pillow", EntityType.Builder.<ItemPillow>of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DISPLAY.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(WHITE_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(LG_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(GRAY_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(BLACK_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(RED_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(ORANGE_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(YELLOW_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(LIME_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(GREEN_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(LB_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(CYAN_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(BLUE_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(PURPLE_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(MAGE_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(PINK_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
		event.put(BROWN_PILLOW.get(), AbstractDisplayEntity.createAttributes().build());
	}
}