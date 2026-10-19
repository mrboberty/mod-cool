/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.equinox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.equinox.entity.SunkisserEntity;
import net.mcreator.equinox.entity.LightProjectileEntity;
import net.mcreator.equinox.entity.LightPatronEntity;
import net.mcreator.equinox.entity.FlorevoreEntity;
import net.mcreator.equinox.entity.DarkProjectileEntity;
import net.mcreator.equinox.EquinoxMod;

@EventBusSubscriber
public class EquinoxModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, EquinoxMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<LightProjectileEntity>> LIGHT_PROJECTILE = register("light_projectile",
			EntityType.Builder.<LightProjectileEntity>of(LightProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkProjectileEntity>> DARK_PROJECTILE = register("dark_projectile",
			EntityType.Builder.<DarkProjectileEntity>of(DarkProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SunkisserEntity>> SUNKISSER = register("sunkisser",
			EntityType.Builder.<SunkisserEntity>of(SunkisserEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.2f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlorevoreEntity>> FLOREVORE = register("florevore",
			EntityType.Builder.<FlorevoreEntity>of(FlorevoreEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<LightPatronEntity>> LIGHT_PATRON = register("light_patron",
			EntityType.Builder.<LightPatronEntity>of(LightPatronEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		SunkisserEntity.init(event);
		FlorevoreEntity.init(event);
		LightPatronEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SUNKISSER.get(), SunkisserEntity.createAttributes().build());
		event.put(FLOREVORE.get(), FlorevoreEntity.createAttributes().build());
		event.put(LIGHT_PATRON.get(), LightPatronEntity.createAttributes().build());
	}
}